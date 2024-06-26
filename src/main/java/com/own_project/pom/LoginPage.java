package com.own_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="userName")
	private WebElement untbx;
	@FindBy(id="passWord")
	private WebElement pwtbx;
	@FindBy(xpath = "//input[@type='image']")
	private WebElement lgnbtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setlogin(String un,String pw)
	{
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgnbtn.click();
	}
}
