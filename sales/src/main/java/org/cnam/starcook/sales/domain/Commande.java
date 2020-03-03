package org.cnam.starcook.sales.domain;

import java.util.ArrayList;
import java.util.List;

public class Commande {
    private int id;
    private String reference;
    private ArrayList<Article> articles;
    private int idClient;
    private boolean isPaid;

    public Commande() {
        this.id = 0;
        this.idClient = 0;
        this.reference = "";
        this.isPaid = false;
        this.articles = new ArrayList<Article>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<Article> articles) {
        this.articles = articles;
    }
}
