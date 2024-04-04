package com.ownproject.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.own_project.generic.BaseClass;
import com.own_project.generic.FileLib;
import com.own_project.pom.CapmignPage;

public class CreateCampaign extends BaseClass{
	CapmignPage c;
	FileLib f;
	int time=3000;
	@Test
	public void testtestCreatecampaign() throws InterruptedException, EncryptedDocumentException, IOException
	{
		f=new FileLib();
		c=new CapmignPage(driver);
		Thread.sleep(time);
		c.getcampaigntab().click();
		Thread.sleep(time);
		c.getNewcampaign().click();
		c.getCampaignname().sendKeys(f.getexceldata("zoho_crm2.0", 1, 1));
		Thread.sleep(time);
		c.getStartdate().sendKeys(f.getexceldata("zoho_crm2.0", 1, 2));
		Thread.sleep(time);
		c.getEnddate().sendKeys(f.getexceldata("zoho_crm2.0", 1, 6));
		Thread.sleep(time);
	}

}

