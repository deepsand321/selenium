package com.hrms.testscript;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.Genral;

public class TC001 {
//public static void main(String[] args) {
	@Test
	public void tc002() {
		DOMConfigurator.configure("logj.xml");
	Genral obj=new Genral();
	obj.openApplication();
	obj.login();
	obj.logout();
	obj.closeAppication();
	
}
}
