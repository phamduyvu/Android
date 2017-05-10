package com.PhamDuyVu.listview_arraylist_object;

public abstract class Employee {
	private String id;
	private String name;
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public abstract double TinhLuong();
	
	public String toString(){
		return "Mã nhân viên:  "+this.id+ "\nTên nhân viên:  "+this.name;
	}
}
