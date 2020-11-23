package Nyansapo.exchangeConnectivity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


public class Trade {
    @JsonProperty("SELL_LIMIT")
    public int sell_limit;
    @JsonProperty("LAST_TRADED_PRICE")
    public double last_traded_price;
    @JsonProperty("TICKER")
    public String ticker;
    @JsonProperty("ASK_PRICE")
    public double ask_price;
    @JsonProperty("BUY_LIMIT")
    public int buy_limit;
    @JsonProperty("MAX_PRICE_SHIFT")
    public double max_price_shift;
    @JsonProperty("BID_PRICE")
    public double bid_price;


    public Trade(int sell_limit, double last_traded_price, String ticker, double ask_price, int buy_limit, double max_price_shift, double bid_price) {
        this.sell_limit = sell_limit;
        this.last_traded_price = last_traded_price;
        this.ticker = ticker;
        this.ask_price = ask_price;
        this.buy_limit = buy_limit;
        this.max_price_shift = max_price_shift;
        this.bid_price = bid_price;
    }

    public Trade() {

    }

    public int getSell_limit() {
        return sell_limit;
    }

    public void setSell_limit(int sell_limit) {
        this.sell_limit = sell_limit;
    }

    public double getLast_traded_price() {
        return last_traded_price;
    }

    public void setLast_traded_price(double last_traded_price) {
        this.last_traded_price = last_traded_price;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getAsk_price() {
        return ask_price;
    }

    public void setAsk_price(double ask_price) {
        this.ask_price = ask_price;
    }

    public int getBuy_limit() {
        return buy_limit;
    }

    public void setBuy_limit(int buy_limit) {
        this.buy_limit = buy_limit;
    }

    public double getMax_price_shift() {
        return max_price_shift;
    }

    public void setMax_price_shift(double max_price_shift) {
        this.max_price_shift = max_price_shift;
    }

    public double getBid_price() {
        return bid_price;
    }

    public void setBid_price(double bid_price) {
        this.bid_price = bid_price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trade)) return false;
        Trade trade = (Trade) o;
        return getSell_limit() == trade.getSell_limit() &&
                Double.compare(trade.getLast_traded_price(), getLast_traded_price()) == 0 &&
                Double.compare(trade.getAsk_price(), getAsk_price()) == 0 &&
                getBuy_limit() == trade.getBuy_limit() &&
                Double.compare(trade.getMax_price_shift(), getMax_price_shift()) == 0 &&
                Double.compare(trade.getBid_price(), getBid_price()) == 0 &&
                getTicker().equals(trade.getTicker());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSell_limit(), getLast_traded_price(), getTicker(), getAsk_price(), getBuy_limit(), getMax_price_shift(), getBid_price());
    }

    @Override
    public String toString() {
        return "Trade{" +
                "sell_limit=" + sell_limit +
                ", last_traded_price=" + last_traded_price +
                ", ticker='" + ticker + '\'' +
                ", ask_price=" + ask_price +
                ", buy_limit=" + buy_limit +
                ", max_price_shift=" + max_price_shift +
                ", bid_price=" + bid_price +
                '}';
    }
}
