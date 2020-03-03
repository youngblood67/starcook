package org.cnam.starcook.sales.domain;

import java.util.Date;

public class Promotion {
    private int id;
    private Double amount;
    private Date startDate;
    private Date endDate;

    public Promotion() {
        this.id = 0;
        this.amount = 0D;
        this.startDate = null;
        this.endDate = null;
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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
