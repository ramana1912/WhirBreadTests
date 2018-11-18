package com.whitBread.Screens;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Page extends PageObject{

	public Page(AppiumDriver<MobileElement> driver) {
		super(driver);
	PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(60)),this);
	}
	

}
