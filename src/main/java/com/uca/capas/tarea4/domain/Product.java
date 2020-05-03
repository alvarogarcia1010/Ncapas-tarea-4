package com.uca.capas.tarea4.domain;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Product {
	
	@Size(min=12, max=12, message = "El campo Codigo debe tener una longitud de 12 digitos.")
	@Digits(fraction = 0, integer = 12, message ="El campo Codigo debe ser un numero entero")
	String code;
	
	@NotEmpty(message = "El campo Nombre no puede estar vacio.")
	@Size(max=100, message = "El campo Nombre debe tener una longitud maxima de 100 caracteres.")
	String name;
	
	@NotEmpty(message = "El campo Marca no puede estar vacio.")
	@Size(max=100, message = "El campo Marca debe tener una longitud maxima de 100 caracteres.")
	String brand;
	
	@NotEmpty(message = "El campo Descripcion no puede estar vacio.")
	@Size(max=500, message = "El campo Descripcion debe tener una longitud maxima de 500 caracteres.")
	String remark;
	
	@Digits(fraction = 0, integer = 10, message ="El campo Codigo debe ser un numero entero")
	String inventory;
	
	@NotEmpty(message = "El campo Fecha de ingreso no puede estar vacio.")
	@Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])[\\/](0?[1-9]|1[012])[\\/]\\d{4}$", message="El formato del campo Fecha debe ser dd/mm/aaaa")
	String date;
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
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
	
	public String getInventory() {
		return inventory;
	}
	
	public void setInventory(String inventory) {
		this.inventory = inventory;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
}
