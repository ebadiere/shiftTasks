In order to run this you will need java, 
maven (mvn), the chrome browser and the chromedriver
executable for your OS, in your PATH.

to run:
mvn verify

The following tests are in this suite.

1. A test to compare the BTC value on the shapeshift site with the BTC value
on the CoinCap site.  The request was to verify dynamic data.  The prices mostly match
however the page loads can take longer than the price updates.  For this reason it is metioned
in the comments and values printed out but not asserted.

2.  A standard use case where the user exchanges BTC for ETH.  Some kind of test
wallet would be needed to continue the transaction and validate.
