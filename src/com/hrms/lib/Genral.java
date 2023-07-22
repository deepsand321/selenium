package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;

public class Genral extends Global {
	//std rule : to provide All re-usable fun: related to whole application
	public void openApplication(){
		driver=new ChromeDriver();
		driver.get(url);
		System.out.println("Application Open");
		Reporter.log("Application opened");
		Log.info("Application opened");
		
		
	}
	public void closeAppication() {
		//driver.close();
		driver.quit();
		System.out.println("Application Close");
		Log.info("Application close");
	}
	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_loginpassword)).sendKeys(pw);
		driver.findElement(By.name(loginbtn)).click();
		Log.info("Login completed");
	}
	public void logout() {
		driver.findElement(By.linkText(logoutbtn)).click();
		Log.info("Logout completd");
	}
	public void EnterempFrame() {
		driver.switchTo().frame(empinfoFrame);
		Log.info("Enter into feame");
	}
	public void ExistempFrame() {
		driver.switchTo().defaultContent();
		Log.info("exsit from frame");
		
	}
	public void AddNewEmp() {
	
		driver.findElement(By.xpath(Addbtn)).click();
		driver.findElement(By.name(Empfirstname)).sendKeys(empfsname);
		driver.findElement(By.name(Emplastname)).sendKeys(emplastname);
Log.info("Add New Emp");
	}
	public void save() {
		driver.findElement(By.xpath(savebtn)).click();
		
	}
	public void EditEmp() {
driver.findElement(By.xpath(Empname)).click();
		driver.findElement(By.name(Editbtn)).click();
		driver.findElement(By.name(Empfirstname)).clear();
		driver.findElement(By.name(Emplastname)).clear();
		driver.findElement(By.name(Empfirstname)).sendKeys(empfsname1);
		driver.findElement(By.name(Emplastname)).sendKeys(emplastname1);
		driver.findElement(By.name(savebutton)).click();
		
		
	}
	

	
	
}
