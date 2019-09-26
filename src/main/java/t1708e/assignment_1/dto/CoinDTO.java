package t1708e.assignment_1.dto;

import t1708e.assignment_1.entity.Coin;

public class CoinDTO {
    public long coinId;
    public String name;
    public double baseAsset;
    public double quoteAsset;
    public double lastPrice;
    public double volumn24h;
    public long createdAt;
    public long updatedAt;
    public int status;

    public long marketId;
    public String marketName;

    public CoinDTO(Coin coin){
        this.coinId = coin.getCoinId();
        this.name = coin.getName();
        this.baseAsset = coin.getBaseAsset();
        this.quoteAsset = coin.getQuoteAsset();
        this.lastPrice = coin.getLastPrice();
        this.volumn24h = coin.getVolumn24h();
        this.createdAt = coin.getCreatedAt();
        this.updatedAt = coin.getUpdatedAt();
        this.marketId = coin.getMarket().getMarketId();
        this.marketName = coin.getMarket().getName();
    }

    public long getCoinId() {
        return coinId;
    }

    public void setCoinId(long coinId) {
        this.coinId = coinId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseAsset() {
        return baseAsset;
    }

    public void setBaseAsset(double baseAsset) {
        this.baseAsset = baseAsset;
    }

    public double getQuoteAsset() {
        return quoteAsset;
    }

    public void setQuoteAsset(double quoteAsset) {
        this.quoteAsset = quoteAsset;
    }

    public double getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(double lastPrice) {
        this.lastPrice = lastPrice;
    }

    public double getVolumn24h() {
        return volumn24h;
    }

    public void setVolumn24h(double volumn24h) {
        this.volumn24h = volumn24h;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public long getMarketId() {
        return marketId;
    }

    public void setMarketId(long marketId) {
        this.marketId = marketId;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }
}
