Feature: search hotels
Scenario: search ourbrands

Given intilize the browser
Then navigate to marioot website
Then click on ourbrands from topnavigation 
Then check jw marioot
Then close the browser

Scenario Outline: search hotels
Given intilize the browser
Then navigate to marioot website
Then click on find reserve
And click on destination and give <destination>
Then close the browser
Examples:
|destination|
|Chennai    |   

Scenario: bonway

Given intilize the browser
Then navigate to marioot website
Then click on bonvoy
Then close the browser




