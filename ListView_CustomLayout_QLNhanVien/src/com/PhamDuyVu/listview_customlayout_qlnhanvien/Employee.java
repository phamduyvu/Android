package com.PhamDuyVu.listview_customlayout_qlnhanvien;

public class Employee {
	
	 private String id;
	 private String name;
	 private boolean gender;
	 
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
	 
	 public boolean isGender(){
		 return gender;
	 }
	 
	 public void setGender(boolean gender){
		 this.gender = gender;
	 }

	 public String toString(){
		 return this.id + " - " + this.name;
	 }

}
