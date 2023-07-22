package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.Genral;

public class TC002_AddNewEmp {
//	public static void main(String[] args) {
	@Test
	public void tc002(){
		DOMConfigurator.configure("log4j.xml");
		Genral obj1 = new Genral();
		obj1.openApplication();
		obj1.login();
		obj1.EnterempFrame();
		obj1.AddNewEmp();
		obj1.save();
        obj1.ExistempFrame();
		obj1.logout();
		obj1.closeAppication();

	}

}
