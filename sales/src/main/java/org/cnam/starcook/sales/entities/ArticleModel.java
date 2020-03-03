package org.cnam.starcook.sales.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;

@Entity
@Table(name = "article")
public class ArticleModel {

    @Id
    @GeneratedValue
    private int id;

    private String reference;

    private String label;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_CATEGORY")
    private CategoryModel category;

    private Double priceHT;

    private Double buyingPrice;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_PROMO")
    private PromotionModel promotion;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "ART_CATALOG",
            joinColumns = @JoinColumn(name = "ID_ART"),
            inverseJoinColumns = @JoinColumn(name = "ID_CATALOG")
    )

    private Collection<CatalogModel> catalogs;

    @JsonIgnore
    @ManyToMany
    @JoinTable(name = "ART_COMMANDES",
            joinColumns = @JoinColumn(name = "ID_COMMANDES"),
            inverseJoinColumns = @JoinColumn(name = "ID_ART")
    )

    private Collection<CommandeModel> commandes;

    //GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRef() {
        return reference;
    }

    public void setRef(String ref) {
        this.reference = ref;
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

    public Collection<CommandeModel> getCommandes() {
        return commandes;
    }

    public void setCommandes(Collection<CommandeModel> commandes) {
        this.commandes = commandes;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public ArticleModel() {
    }

    public ArticleModel(int id, String ref, String label, CategoryModel categoryModel, double priceHt, double buyingPrice, PromotionModel promotionModel) {
        this.id = id;
        this.reference = ref;
        this.label = label;
        this.category = categoryModel;
        this.priceHT = priceHt;
        this.buyingPrice = buyingPrice;
        this.promotion = promotionModel;
    }

    public ArticleModel(String ref, String label, CategoryModel categoryModel, double priceHt, double buyingPrice, PromotionModel promotionModel) {
        this.reference = ref;
        this.label = label;
        this.category = categoryModel;
        this.priceHT = priceHt;
        this.buyingPrice = buyingPrice;
        this.promotion = promotionModel;
    }

}
