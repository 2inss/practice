package com.own_project.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.own_project.pom.HomePage;
import com.own_project.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
	LoginPage l;
	FileLib f;
	HomePage h;
@BeforeClass
public void openbrowser()
{
	driver=new ChromeDriver();
	Reporter.log("open browser",true);
}

@BeforeMethod
public void login() throws IOException
{
	f=new FileLib();
	l=new LoginPage(driver);
	driver.get(f.getpropertydata("URL"));
	l.setlogin(f.getpropertydata("UN"), f.getpropertydata("PW"));
	Reporter.log("login",true);
}
@AfterMethod
public void logout()
{
	f=new FileLib();
	h=new HomePage(driver);
	h.setLgnbtn();
	Reporter.log("logout",true);	
}
@AfterClass
public void closebrowser()
{
	driver.close();
	Reporter.log("close the browser",true);
}

}
