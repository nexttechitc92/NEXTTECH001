package com.dell.qa.nexttechitc_Demo;

public class using_configur {

	public static void main(String[] args) {
		
		
		exal_configer con = new exal_configer("C:\\Users\\Owner\\Desktop\\Exls\\STUDENTINFO.xlsx");
		
		System.out.println(con.getData(0, 0, 0));
		System.out.println(con.getData(0, 0, 1));

	}

}
