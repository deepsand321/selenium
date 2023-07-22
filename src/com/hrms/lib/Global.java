package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	
	//std rule to provide TestData & Object related to whole application
	public WebDriver driver;
//TestData
	
	
	public String url="http://183.82.103.245/nareshit/login.php";
	public String un="nareshit";
	public String pw="nareshit";
	public String empfsname="Sndeep";
	public String emplastname="Kumar";
	public String empfsname1="Ram";
	public String emplastname1="Reddy";
	
	
	// Object
	public String txt_loginname="txtUserName";
	public String txt_loginpassword="txtPassword";
	public String loginbtn="Submit";
	public String logoutbtn="Logout";
	public String Addbtn="//input[@value='Add']";
	public String empinfoFrame="rightMenu";
	public String Empfirstname="txtEmpFirstName";
	public String Emplastname="txtEmpLastName";
	public String savebtn="//*[@id='btnEdit']";
	public String Empname="//a[@target='_self']";
	public String savebutton="EditMain";
	public String Editbtn="EditMain";
	
	
	
	
	
	

}
