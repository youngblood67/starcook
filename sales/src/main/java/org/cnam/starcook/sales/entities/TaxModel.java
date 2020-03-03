package org.cnam.starcook.sales.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tax")
public class TaxModel {

    @Id
    @GeneratedValue
    private int id;

    private Double amount;

    public TaxModel(Double amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public TaxModel() {
    }

}
