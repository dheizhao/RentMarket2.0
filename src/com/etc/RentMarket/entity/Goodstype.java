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

	public Goodstype(int typeId, String typeName, int typeparentId) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
		this.typeparentId = typeparentId;
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

	@Override
	public String toString() {
		return "Goodstype [typeId=" + typeId + ", typeName=" + typeName + ", typeparentId=" + typeparentId + "]";
	}
	

}