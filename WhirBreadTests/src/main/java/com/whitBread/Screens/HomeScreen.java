package com.whitBread.Screens;

import org.testng.AssertJUnit;
import java.util.List;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomeScreen extends Page {
	
	@AndroidFindBy(className="android.support.v7.app.ActionBar$Tab")
	List<MobileElement> category;
	
	@AndroidFindBy(className="android.widget.LinearLayout")
	List<MobileElement> cheese;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='Category 1']")
	public MobileElement categoryOne;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='Category 2']")
	public MobileElement categoryTwo;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='Category 3']")
	public MobileElement categoryThree;
	
	@AndroidFindBy(className="android.widget.ImageView")
	public MobileElement burgerMenu;
	
	@AndroidFindBy(id="com.support.android.designlibdemo:id/submenuarrow")
	public MobileElement subMenu;

	public HomeScreen(AppiumDriver<MobileElement> driver) {
		super(driver);
	}
	
	public void Categeory1IsDisplayed(int index){
		category.get(index).isDisplayed();
	}
	
	public void clickOnBurgerMenu(){
		burgerMenu.click();
	}
	
	public void selectSubMenu(){
		subMenu.click();
	}
	
	public void clickOnChees(int index){
		cheese.get(index).click();
	}
	
	public void verifyCategoriesIsDisplayed() {
		AssertJUnit.assertTrue("Category 1 is displayed", categoryOne.isDisplayed());
		AssertJUnit.assertTrue("Category 2 is displayed", categoryTwo.isDisplayed());
		AssertJUnit.assertTrue("Category 3 is displayed", categoryThree.isDisplayed());
	}
	
}
	
