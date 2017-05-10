package com.PhamDuyVu.listview_arraylist_object;

public class EmployeeFullTime extends Employee{
	public double TinhLuong() {
		return 500;
	}

	public String toString() {
		return super.toString()+ "\nLoại nhân viên: FullTime" +"\nMức lương: "+TinhLuong();
	}

}
