package com.etc.RentMarket.entity;

import java.io.Serializable;


/**
 * The persistent class for the goodstype database table.
 * 
 */
  
public class Goodstype implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private int typeId;

	private String typeName;

	private int typeparentId;

	public Goodstype() {
	}

	public int getTypeId() {
		return this.typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public int getTypeparentId() {
		return this.typeparentId;
	}

	public void setTypeparentId(int typeparentId) {
		this.typeparentId = typeparentId;
	}

}