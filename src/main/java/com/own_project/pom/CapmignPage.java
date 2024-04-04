package com.own_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CapmignPage {
	@FindBy(linkText = "Campaigns")
	private WebElement campaigntab;
	@FindBy(xpath = "//input[@value='New Campaign']")
	private WebElement newcampaign;
	@FindBy(name="property(Campaign Name)")
	private WebElement campaignname;
	@FindBy(name="property(Start Date)")
	private WebElement startdate;
	@FindBy(name="property(End Date)")
	private WebElement enddate;
	@FindBy(name="property(Expected Revenue)")
	private WebElement expectedrevenue;
	@FindBy(name="property(Budgeted Cost)")
	private WebElement budgetedcost;
	@FindBy(name="property(Actual Cost)")
	private WebElement actualcost;
	@FindBy(name="property(Expected Response)")
	private WebElement expectedresponse;
	@FindBy(name="property(Num sent)")
	private WebElement numsent;
	@FindBy(name="property(Type)")
	private WebElement type;
	@FindBy(name="property(Status)")
	private WebElement status;
	public CapmignPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement getcampaigntab()
	{
		return campaigntab;
	}
	public WebElement getNewcampaign() {
		return newcampaign;
	}
	public WebElement getCampaignname() {
		return campaignname;
	}
	public WebElement getStartdate() {
		return startdate;
	}
	public WebElement getEnddate() {
		return enddate;
	}
	public WebElement getExpectedrevenue() {
		return expectedrevenue;
	}
	public WebElement getBudgetedcost() {
		return budgetedcost;
	}
	public WebElement getActualcost() {
		return actualcost;
	}
	public WebElement getExpectedresponse() {
		return expectedresponse;
	}
	public WebElement getNumsent() {
		return numsent;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getStatus() {
		return status;
	}
}
