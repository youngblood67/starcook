package org.cnam.starcook.sales.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


@Entity
@Table(name = "commande")
public class CommandeModel {
    @Id
    @GeneratedValue
    private int id;

    private String reference;

    private int idClient;

    @ManyToMany(mappedBy = "commandes")
    private Collection<ArticleModel> articles;

    private boolean isPayed;

    public CommandeModel() {
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

    public Collection<ArticleModel> getArticles() {
        return articles;
    }

    public void setArticles(Collection<ArticleModel> articles) {
        this.articles = articles;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }
}
