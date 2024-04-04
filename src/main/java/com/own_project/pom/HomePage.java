package com.own_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(xpath = "//a[text()='Logout [rashmi@dell.com]']")
private WebElement lgnbtn;


public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}




public void setLgnbtn() {
	 lgnbtn.click();
}

}
