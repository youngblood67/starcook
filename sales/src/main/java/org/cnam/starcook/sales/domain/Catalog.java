package org.cnam.starcook.sales.domain;

import java.util.ArrayList;

public class Catalog {
    private int id;
    private String label;
    private ArrayList<Article> articles;

    public Catalog() {
        this.id = 0;
        this.label = "";
        this.articles = new ArrayList<Article>();
    }

    public void addArticle(Article article) {
        this.articles.add(article);
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public ArrayList<Article> getArticles() {
        return this.articles;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
