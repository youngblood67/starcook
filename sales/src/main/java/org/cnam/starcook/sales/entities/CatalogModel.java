package org.cnam.starcook.sales.entities;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "catalog")
public class CatalogModel {

    @Id
    @GeneratedValue
    private int id;

    private String label;

    @ManyToMany(mappedBy = "catalogs")
    private Collection<ArticleModel> articles;

    //GETTERS AND SETTERS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Collection<ArticleModel> getArticles() {
        return articles;
    }

    public void setArticles(Collection<ArticleModel> articles) {
        this.articles = articles;
    }


    public CatalogModel(int id, String label, Collection<ArticleModel> articles) {
        this.id = id;
        this.label = label;
        this.articles = articles;
    }

    public CatalogModel(String label, Collection<ArticleModel> articles) {
        this.id = 0;
        this.label = label;
        this.articles = articles;
    }

    public CatalogModel(String label) {
        this.id = 0;
        this.label = label;
        this.articles = null;
    }

    public CatalogModel() {
        this.id = 0;
        this.label = "";
        this.articles = null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
