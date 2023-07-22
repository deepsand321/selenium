package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.Genral;

public class ClassTC003EditEmp {
//	public static void main(String[] args) {
	@Test
	public void tc003() {
		DOMConfigurator.configure("log4j.xml");
		Genral obj2=new Genral();
		obj2.openApplication();
		obj2.login();
		obj2.EnterempFrame();
		obj2.EditEmp();
		//obj2.save();
		obj2.ExistempFrame();
		obj2.logout();
		obj2.closeAppication();
		System.out.println("EditEmp");

		
	}

}
