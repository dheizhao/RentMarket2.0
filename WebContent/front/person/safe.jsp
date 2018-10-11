<%@ page contentType="text/html; charset=utf-8" language="java" import="java.sql.*"%>
<%if (session.getAttribute("user")==null){
	out.println("<script language='javascript'>alert('您还没有登录!');window.location.href='../HOME/login.jsp';</script>");
}%>
