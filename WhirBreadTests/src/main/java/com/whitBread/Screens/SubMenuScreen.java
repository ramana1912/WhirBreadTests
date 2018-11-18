package com.whitBread.Screens;

import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SubMenuScreen extends Page {
	
	@AndroidFindBy(id="com.support.android.designlibdemo:id/radio")
	public List<MobileElement> subMenulist;

	public SubMenuScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	public void selectNightAlways(int index) throws InterruptedException{
		subMenulist.get(index).click();
		Thread.sleep(3000);
	}


	

	
	

}
