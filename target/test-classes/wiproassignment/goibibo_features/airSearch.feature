Feature: Find the air availability and verify the review on goibibo project

Scenario Outline: perform the air search
	Given user launches the browser
	Then  user enters the url"<url>"
	Then  user verify the homepagetitle
	Then  user select the airtrip
	Then  user must provide the"<departure>"and"<destination>"
	Then  user must select the"<departureDate>"
	Then  user enter the passenger count"<pascount>"
	Then  user search the air availability

		
Examples: 
|url|departure|destination|departureDate|pascount|
|https://www.goibibo.com|Delhi|Bangalore|05/05/2021|1|