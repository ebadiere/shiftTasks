Task 1.

Used Java with maven because that's what I know right now.  I was going to use the Spring RestTemplate but found the RestAssured framework.  It was designed to test rest endpoints.  Ramping up on it was fairly easy, but what I like about it is the BDD descriptors of the tests.  The test results can be published from the CI system and made available to support.  It would illustrate how the endpoints are intended to be used.  Adding new tests is easy as well. 

Task 2.

Updated.  There are now two test cases.  One to look for and test (in this case print) dynamic data from the shapeshift website.  The BTC price is compared to the price of BTC on coincap.  The price flucuates faster than the pages can load at times so any asserts would intermittently fail.

The second test is meant to run a BTC to ETH transaction.  It loads the two currencies and continues.  I would need test wallets to continue and validate.
 
The chromedriver which is necessary to launch chrome on Mac OS and linux, was included by gradle in project which may slowdow the initial "git clone". Apologies, but at least you have it if you want to run what is there.

Task 3.

The MyMath class code and test were straight forward for me.  I have not had much exposure to javascript up to now, however, again the BDD descriptors were similar to Ruby's RSpec which I have experience with.  What I did struggle with was setting up an initial runtime environment and how to run it from the command line to check it in to my github account for you to review.  I ended up using an existing project in github, removing the classes and tests that were there and using that.  Also I had to add an "export" in front of the class declaration to get it to work.  I am not sure why.
