Feature:

@Test1
Scenario: To check if all the 3 categories of cheese are displayed.   
Given user launches the CheeseSquare app on device
Then user should see all the three categories displayed on the home page

@Test2
Scenario: To change the app to night mode always and check if all the 3 sections are displayed for the selected cheese  
Given user launches the CheeseSquare app on device
When user changes the mode to Night always mode
And user selects a cheese
Then user should see all the 3 sections for the selection made for the cheese

  