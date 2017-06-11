package pages

import geb.Page

class CoinCapHomePage extends Page {
    static url = "https://coincap.io"
    static at = { title == "CoinCap.io" }
    static content = {
        bitcoinLink {$("a", text: "Bitcoin BTC")}
        ethereumLink {$("a", text: "Ethereum ETH")}
        price {$("div", class: "coin_market_info_price").text()}
    }
}