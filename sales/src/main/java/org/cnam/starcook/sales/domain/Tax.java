package org.cnam.starcook.sales.domain;

public class Tax {
    private int id;
    private Double amount;

    public Tax(int id, Double amount) {
        this.id = id;
        this.amount = amount;
    }

    public Tax(Double amount) {
        this.id = 0;
        this.amount = amount;
    }

    public Tax() {
        this.id = 0;
        this.amount = 0D;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
