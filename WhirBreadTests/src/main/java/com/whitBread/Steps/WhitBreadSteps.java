package com.whitBread.Steps;

import com.whitBread.Screens.DescriptionScreen;
import com.whitBread.Screens.HomeScreen;
import com.whitBread.Screens.SubMenuScreen;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class WhitBreadSteps {

	protected AppiumDriver<MobileElement>driver;
	
	HomeScreen home;
	DescriptionScreen description;
	SubMenuScreen menu;
	
    public WhitBreadSteps(){
    	this.driver =Appiumprovider.getDriver();
    }
    
    @Given("^user launches the CheeseSquare app on device$")
    public void launchTheApp(){
    	System.out.println("The Application is been launched in the before class");
    }
    @Then("^user should see all the three categories displayed on the home page$")
    public void verifyCategeoryIsDisplayed() throws InterruptedException{
    	home = new HomeScreen(driver);
    	home.verifyCategoriesIsDisplayed();	 	
    }
    
    @Then("^user changes the mode to Night always mode$")
    public void userChangesNightModeAlways() throws InterruptedException{
    	home = new HomeScreen(driver);
    	home.clickOnBurgerMenu();
    	home.selectSubMenu();
    	menu = new SubMenuScreen(driver);
    	menu.selectNightAlways(2);
    }
    
    @Then("^user selects a cheese$")
    public void userSelectCheese(){
    	home = new HomeScreen(driver);
    	home.clickOnChees(1);
    }
    
    @Then("^user should see all the 3 sections for the selection made for the cheese$")
    public void userSeeSections(){
    	description = new DescriptionScreen(driver);
    	description.verifyTheSectionsDisplayedUnderCheese();
    }
    
    
}
