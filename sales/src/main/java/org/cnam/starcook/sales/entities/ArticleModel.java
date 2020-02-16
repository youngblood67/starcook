package org.cnam.starcook.sales.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "article")
public class ArticleModel {

    @Id
    @GeneratedValue
    private int id;

    private String ref;

    private String label;


    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ID_CATEGORY")
    private CategoryModel category;

    private Double priceHT;

    private Double buyingPrice;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ID_PROMO")
    private PromotionModel promotion;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "ART_CATALOG",
            joinColumns = @JoinColumn(name = "ID_ART"),
            inverseJoinColumns = @JoinColumn(name = "ID_CATALOG")
    )
    private Collection<CatalogModel> catalogs;

    //GETTERS AND SETTERS

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

    public CategoryModel getCategory() {
        return category;
    }

    public void setCategory(CategoryModel category) {
        this.category = category;
    }

    public Double getPriceHT() {
        return priceHT;
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

    public PromotionModel getPromotion() {
        return promotion;
    }

    public void setPromotion(PromotionModel promotion) {
        this.promotion = promotion;
    }

    public Collection<CatalogModel> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(Collection<CatalogModel> catalogs) {
        this.catalogs = catalogs;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public ArticleModel() {
    }
}
