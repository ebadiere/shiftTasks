Task 1.

Used Java with maven because that's what I know right now.  I was going to use the Spring RestTemplate but found the RestAssured framework.  It was designed to test rest endpoints.  Ramping up on it was fairly easy, but what I like about it is the BDD descriptors of the tests.  The test results can be published from the CI system and made available to support for example.  It would illustrate how the endpoints are intented to be used.  Adding new tests is easy as well. 

Task 2.

This is not so trivial and not complete.  I found myself spending long iterations trying to implement simple steps in the web site navigation.  I checked in what I have and plan to continue working on it, but set it aside to get another task done.  I used the Geb/Spock framework because I like the out of the box support for the Page Object pattern.  

What makes development on the UI painful IMMHO is the browser launch and asynchronous interaction with the browser, when looking for elements.  On the app side, adding IDs to elements would make finding them much faster allowing the test developer to focus on dealing with the timing issues.  I used Geb to try and get results quickly but I must say in a production implementation I would recommend straight selenium-webdriver driven by perhaps cucumber type of solution.  

The chromedriver which is necessary to launch chrome on Mac OS and linux was included by gradle in project which may slowdow the initial clone. Apologies, but at least you have it if you want to run what is there.

Task 3.

The MyMath class code and test were straight forward for me.  I have not had much exposure to javascript up to now, however, again the BDD descriptors were similar to Ruby's RSpec which I have experience with.  What I did struggle with was setting up an initial runtime environment and how to run it from the command line and check it in to my github account for you to review.  I ended up using an existing project in github, removing the classes and test and using that.  Also I had to add an "export" in front of the class declaration to get it to work.  I am not sure why.
