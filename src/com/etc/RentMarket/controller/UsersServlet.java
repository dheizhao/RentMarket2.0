package com.etc.RentMarket.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.etc.RentMarket.DBUtil.MD5Util;
import com.etc.RentMarket.entity.User;
import com.etc.RentMarket.service.UsersService;
import com.etc.RentMarket.service.impl.UsersServiceImpl;

/**
 * Servlet implementation class UsersServlet
 */
@WebServlet("/us.do")
public class UsersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String pwd;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UsersServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		UsersService us = new UsersServiceImpl();
		String userName = "";
		String userPwd = "";
		String reUserPwd = "";
		String data = "";
		String op = "";
		if (request.getParameter("op") != null) {
			op = request.getParameter("op");
		}
		
		// 用户注册
		if ("tip-username".equals(op)) {

			userName = request.getParameter("username");// 用户名

			// 先判断是否存在
			if (userName.equals("")) {
				data = "*请输入用户名";
				out.print(data);
			} else {
				List<User> list = us.getUserByUserName(userName);
				if (list.size() > 0) {
					data = "*用户名已存在";
					out.print(data);
				} else {
					data = "*用户名输入正确";
					out.print(data);
				}
			}
		}
		if ("tip-userpwd".equals(op)) {
			userPwd = request.getParameter("password");// 密码
			setPwd(userPwd);//传一个密码参数给set()
			if (userPwd != null) {
				if (userPwd.equals("")) {
					data = "*密码不能为空";
					out.print(data);
				} else {
					userPwd = MD5Util.getEncodeByMd5(userPwd);// MD5加密密码
					data = "*密码输入正确";
					out.print(data);
				}
			}
		}
		if ("tip-cuserpwd".equals(op)) {
			
			userPwd=getPwd();
			reUserPwd = request.getParameter("repassword");// 确认密码
			if (reUserPwd != null) {
				if (reUserPwd.equals("")) {
					data = "*密码不能为空";
					out.print(data);
				} else {
					if (userPwd != null) {
						if (userPwd.equals(reUserPwd)) {
							reUserPwd = MD5Util.getEncodeByMd5(reUserPwd);
							System.out.println(reUserPwd);
							data = "*密码匹配,请继续";
							out.print(data);
						} else {
							data = "*两次密码输入不一致";
							out.print(data);
						}
					}
				}
			}
		}
		if ("add".equals(op)) {

			userName = request.getParameter("username");// 用户名
			userPwd = MD5Util.getEncodeByMd5(request.getParameter("password"));// 密码
			reUserPwd = MD5Util.getEncodeByMd5(request.getParameter("repassword"));// 确认密码
			System.out.println(userName);
			// 添加用户
			User u = new User(userName, userPwd);
			boolean flag = us.addUsers(u);
			System.out.println("flag:" + flag);

			// 暂时不提示成功或者失败
			// 页面的跳转
			// request实现页面的跳转->转发
			request.getRequestDispatcher("front/login.jsp").forward(request, response);
		} else if ("login".equals(op)) {
			userName = request.getParameter("userName");
			userPwd = MD5Util.getEncodeByMd5((request.getParameter("userPwd")));
			User user = new User(userName, userPwd);

			// 查询数据库中是否存在此用户名
			List<User> list = us.getUserByUserName(userName);
			if (list.size() == 0) {
				out.print("<script>alert('用户名不存在，请先注册！');location.href='front/login.jsp'</script>");
			} else {
				// 如果用户名存在做密码验证
				String userPwd2 = list.get(0).getUserPwd();
				if (!(userPwd.equals(userPwd2))) {
					out.print("<script>alert('密码不正确,请重新登录！');location.href='front/login.jsp'</script>");
				} else {
					out.print("<script>alert('登录成功');location.href='front/index.jsp'</script>");
					request.getSession().setAttribute("user", user);
				}
			}
		}else if ("upload".equals(op)) {
			//接收userName
			String fileName = "";
			DiskFileItemFactory factory = new DiskFileItemFactory();

			// 得到一个文件上传处理的临时目录
			ServletContext servletContext = this.getServletConfig()
					.getServletContext();
			File repository = (File) servletContext
					.getAttribute("javax.servlet.context.tempdir");
			factory.setRepository(repository);

			// ServletFileUpload 核心对象来做文件的上传操作
			ServletFileUpload upload = new ServletFileUpload(factory);

			// 解析request对象
			try {
				List<FileItem> items = upload.parseRequest(request);

				// List的处理 可以使用foreach 也可以用迭代器
				// Process the uploaded items
				Iterator<FileItem> iter = items.iterator();
				while (iter.hasNext()) {
					// FileItem 一个fileItem理解为一个表单的元素对象
					// 按照之前的表单 两个item 文本框 文件域
					FileItem item = iter.next();

					// isFormField() 如果这个item是表单域（表达实际上就是 非文件上传的部分,非文件域）
					if (item.isFormField()) {

						String name = item.getFieldName();
						// 其实item.getString的方法有两个重载的方法
						// item.getString(arg0) ==>字符串参数就是一个编码格式的字符串
						String value = item.getString("utf-8");
						//接收表单中文本域的值
						if (name.equals("userName")) {
							userName = value;
						}
						
					} else {
						// 文件域的处理
						String fieldName = item.getFieldName();
						fileName = item.getName(); // 文件名
						String contentType = item.getContentType();
						boolean isInMemory = item.isInMemory();
						long sizeInBytes = item.getSize(); // 大小
						// path应该如何来赋值？ 这个文件上传之后的实际目录是哪里 ->还要将文件名写完整
						// 分析 实际上应该是 tomcat下的webapps/工程名/某个目录 暂时定为 imgs
						String path = "C:\\Users\\Administrator\\git\\RentMarket2.0\\WebContent\\avatar\\" + fileName;
						// 构建一个FIle对象出来
						File uploadedFile = new File(path);
						// write写 实际就是文件上传的具体动作
						item.write(uploadedFile);

					}
				}

			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			boolean flag = us.uploadUserImg(fileName, userName);
			if (flag) {
				request.getRequestDispatcher("front/user-info.jsp").forward(request, response);
			}
		}
		
		}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	/**
	 * 定义一个密码的设置和获取方法
	 * @param pwd	密码
	 */
	public void setPwd(String pwd) {
		this.pwd=pwd;
	}
	public String getPwd() {
		return this.pwd;
	}

}
