package org.cnam.starcook.sales.entities;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class CategoryModel {
    @Id
    @GeneratedValue
    private int id;

    private String label;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ID_TAXE")
    private TaxModel taxe;

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

    public TaxModel getTaxe() {
        return taxe;
    }

    public void setTaxe(TaxModel taxe) {
        this.taxe = taxe;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public CategoryModel(String label) {
        this.id = 0;
        this.label = label;
        this.taxe = null;
    }
    public CategoryModel() {
        this.id = 0;
        this.label = "";
        this.taxe = null;
    }
}
