package specs

import geb.spock.GebSpec
import pages.ShapeShiftHomePage
import spock.lang.Stepwise

@Stepwise
class ShapeShiftHomePageSpec extends GebSpec {

    def "can buy eth with btc"() {
        when:
        to ShapeShiftHomePage

        //wait for page result to load and display continue button
        waitFor{continueBtn.displayed}

        waitFor{deposit.displayed}

        deposit.click()

        // bitcoin may already be displayed.  Must update to check first
        waitFor{bitcoin.displayed}

        bitcoin.click()

        waitFor{withdraw.displayed}

        withdraw.click()

        waitFor{ether.displayed}
        ether.click()

        continueBtn.click()
        nextAddress="0xe223767755677test"

        then: 'End'
        //asserts here

    }
}