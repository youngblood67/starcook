package org.cnam.starcook.sales.domain;

public class Category {
    private int id;
    private String label;
    private Tax tax;

    public Category(int id, String label, Tax tax) {
        this.id = id;
        this.label = label;
        this.tax = tax;
    }

    public Category(String label, Tax tax) {
        this.id = 0;
        this.label = label;
        this.tax = tax;
    }

    public Category() {
        this.id = 0;
        this.label = "";
        this.tax = null;
    }

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

    public Tax getTaxe() {
        return tax;
    }

    public void setTaxe(Tax tax) {
        this.tax = tax;
    }
}
