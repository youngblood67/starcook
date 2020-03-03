package org.cnam.starcook.sales.domain;

public class Article {
    private int id;
    private String ref;
    private String label;
    private Category category;
    private Double priceHT;
    private Double buyingPrice;
    private Promotion promotion;


    public Article() {
        this.id = 0;
        this.ref = "";
        this.label = "";
        this.category = null;
        this.priceHT = 0D;
        this.promotion = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Double getPriceHT() {
        return this.priceHT;
    }

    public void setPriceHT(Double priceHT) {
        this.priceHT = priceHT;
    }

    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(Double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }
}
