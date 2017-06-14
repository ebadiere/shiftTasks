package specs

import geb.spock.GebSpec
import pages.CoinCapHomePage
import pages.ShapeShiftHomePage
import spock.lang.Stepwise

@Stepwise
class ShapeShiftHomePageSpec extends GebSpec {

    def coinCapPrice
    def shapeShiftPrice

    // Confirm that the shapeshift site's values are really the same and coming from coincap.io
    def "can compare the BTC price on CoinCap.io to the price on ShapeShift"(){
        when:
        to CoinCapHomePage
            waitFor{ bitcoinLink.displayed }
            bitcoinLink.click()
            coinCapPrice = price
        to ShapeShiftHomePage
            shapeShiftPrice = btcPrice
        then:
        println ("Compare, CoinCap: ${coinCapPrice}  ShapeShift Site: ${shapeShiftPrice}")
        // Asserts can go in here.
        // The price fluctuates faster than the browser can load the page so testing for exact match will sometimes fail,
        // but the comparison of dynamic data can be made here.  The coincap value also needs to be rounded to four
        // places after the decimal

    }

    // Confirm that the shapeshift site's values are really the same and coming from coincap.io
    def "can compare the ETH price on CoinCap.io to the price on ShapeShift"(){
        when:
        to CoinCapHomePage
        waitFor{ ethereumLink.displayed }
        ethereumLink.click()
        coinCapPrice = price
        to ShapeShiftHomePage
        shapeShiftPrice = ethPrice
        then:
        println ("Compare, CoinCap: ${coinCapPrice}  ShapeShift Site: ${shapeShiftPrice}")
        // Asserts can go in here.
        // The price fluctuates faster than the browser can load the page so testing for exact match will sometimes fail,
        // but the comparison of dynamic data can be made here.  The coincap value also needs to be rounded to four
        // places after the decimal

    }


    def "can buy ETH with BTC"() {
        when:
        to ShapeShiftHomePage

        waitFor{continueBtn.displayed}

        // bitcoin may already be displayed.
        if (!bitcoinChooseAssetToTrade.displayed){
            println ("Looking for bitcoin to select")

            deposit.click()
            waitFor{bitcoin.displayed}
            bitcoin.click()
            waitFor{withdraw.displayed}

        }

        // ether may already be displayed.
        if (!etherChooseAssetToTrade.displayed){
            println ("Looking for ether to select")

            withdraw.click()
            ether.click()

        }
        println("Enter test wallet addresses and continue processing transaction.")

        then:
        //asserts here
        println("Validate with asserts here")
    }


}