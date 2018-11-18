package com.whitBread.Screens;

import org.testng.AssertJUnit;
import java.util.List;

import org.openqa.selenium.Dimension;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import static io.appium.java_client.touch.offset.PointOption.point;
import io.appium.java_client.touch.offset.PointOption;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class DescriptionScreen  extends Page{

	@AndroidFindBy(className="android.widget.ImageView")
	public MobileElement burgerMenu;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Info']")
	public MobileElement sectionInfoHeader;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Friends']")
	public MobileElement sectionFriendsHeader;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Related']")
	public MobileElement sectionRelatedHeader;
	
	@AndroidFindBy(className="android.widget.TextView")
	public List<MobileElement> sectionHeadings;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[contains(text(),'Category1')]")
	public MobileElement categoryOne;

	@AndroidFindBy(id="com.support.android.designlibdemo:id/submenuarrow")
	public MobileElement subMenu;


	public DescriptionScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	public void clickOnBurgerMenu(){
		burgerMenu.click();
	}
	
	public void selectSubMenu(){
		subMenu.click();
	}
	
	private void scrollUp() {
	    TouchAction touchAction = new TouchAction(driver);
	    touchAction.longPress(PointOption.point(683, 1853)).moveTo(PointOption.point(727, 1223)).release().perform();
	}

	public void verifyTheSectionsDisplayedUnderCheese() {
		scrollUp();
		String actual = sectionInfoHeader.getText();
		AssertJUnit.assertEquals("Info", actual);
		AssertJUnit.assertTrue("Info Section Header is displayed", sectionInfoHeader.isDisplayed());
		
		String actualSectionOne = sectionFriendsHeader.getText();
		AssertJUnit.assertEquals("Friends", actualSectionOne);
		AssertJUnit.assertTrue("Friends Section Header is displayed", sectionFriendsHeader.isDisplayed());
		
		String actualSectionTwo = sectionRelatedHeader.getText();
		AssertJUnit.assertEquals("Related", actualSectionTwo);
		AssertJUnit.assertTrue("Related Section Header is displayed", sectionRelatedHeader.isDisplayed());
		
	}



}
