package org.cnam.starcook.sales.domain;

public class Article {
    private int id;
    private String ref;
    private String label;
    private Category category;
    private Double priceHT;
    private Double buyingPrice;
    private Promotion promotion;

    public Article(int id, String ref, String label, Category category, Double priceHT, Double buyingPrice, Promotion promotion) {
        this.id = id;
        this.ref = ref;
        this.label = label;
        this.category = category;
        this.priceHT = priceHT;
        this.buyingPrice = buyingPrice;
        this.promotion = promotion;
    }

    public Article(String ref, String label, Category category, Double priceHT, Double buyingPrice, Promotion promotion) {
        this.id = 0;
        this.ref = ref;
        this.label = label;
        this.category = category;
        this.priceHT = priceHT;
        this.buyingPrice = buyingPrice;
        this.promotion = promotion;
    }

    public Article(String ref, String label, Category category, Double priceHT, Promotion promotion) {
        this.id = 0;
        this.ref = ref;
        this.label = label;
        this.category = category;
        this.priceHT = priceHT;
        this.buyingPrice = 0D;
        this.promotion = promotion;
    }

    public Article(String ref, String label, Category category, Promotion promotion) {
        this.id = 0;
        this.ref = ref;
        this.label = label;
        this.category = category;
        this.priceHT = 0D;
        this.buyingPrice = 0D;
        this.promotion = promotion;
    }

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
