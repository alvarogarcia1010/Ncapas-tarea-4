package com.uca.capas.tarea4.domain;

import javax.validation.constraints.Size;

public class Product {
	
	Integer code;
	
	@Size(min=1, max=100, message = "El campo Nombre debe tener una longitud entre 1 y 100 caracteres.")
	String name;
	
	@Size(min=1, max=100, message = "El campo Marca debe tener una longitud entre 1 y 100 caracteres.")
	String brand;
	
	@Size(min=1, max=500, message = "El campo Descripcion debe tener una longitud entre 1 y 500 caracteres.")
	String remark;
	
	Integer inventory;
	String date;
	
	public Integer getCode() {
		return code;
	}
	
	public void setCode(Integer code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	public Integer getInventory() {
		return inventory;
	}
	
	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
}
