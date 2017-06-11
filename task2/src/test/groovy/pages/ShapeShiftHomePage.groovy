package pages

import geb.Page
import org.openqa.selenium.By

class ShapeShiftHomePage extends Page {

    static url = "https://shapeshift.io/#/coins"
    static at = { title == "ShapeShift | Cryptocurrency Exchange | Simple Coin Conversion" }
    static content = {
        continueBtn { $(By.linkText("Continue"))}

        deposit {$("button", "ng-click": "open('input')")}
        withdraw {$("button", "ng-click": "open('output')")}

        bitcoin(required: false) {$("img", "ng-src": "https://shapeshift.io/images/coins/bitcoin.png")}
        btcPrice {$("div", "key": "BTC").text()}
        ether(required: false) {$("img", "ng-src": "https://shapeshift.io/images/coins/ether.png")}
        ethPrice {$("div", "key": "ETH").text()}

        bitcoinChooseAssetToTrade(required: false) {$("img", "src": "https://shapeshift.io/images/coins/bitcoin.png")}
        etherChooseAssetToTrade(required: false) {$("img", "src": "https://shapeshift.io/images/coins/ether.png")}

        nextAddress{$("input", class: "form-control.ng-pristine.ng-invalid.nginvalid-required.ng-touched")}
    }

}