package com.PhamDuyVu.listview_arraylist_object;

public class EmployeePartTime extends Employee{
	public double TinhLuong(){
		return 150;
	}
	
	public String toString(){
		return super.toString()+ "\nLoại nhân viên: PartTime" +"\nMức lương: "+TinhLuong();
	}
}
