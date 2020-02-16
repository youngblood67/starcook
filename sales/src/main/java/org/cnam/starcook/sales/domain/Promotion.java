package org.cnam.starcook.sales.domain;

import java.util.Date;

public class Promotion {
    private int id;
    private Double amount;
    private Date startDate;
    private Date endDate;

    public Promotion(int id, Double amount, Date startDate, Date endDate) {
        this.id = id;
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Promotion(Double amount, Date startDate, Date endDate) {
        this.id = 0;
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Promotion(Double amount, Date startDate) {
        this.id = 0;
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = null;
    }

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
