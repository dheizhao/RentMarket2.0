package com.etc.RentMarket.DBUtil;

import java.util.List;

public class MyData<T> {
	
	private List<T> data;

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "MyData [data=" + data + "]";
	}
	

}
