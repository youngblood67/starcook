package org.cnam.starcook.sales.dto;

public class ArticleDetailsResponse {
    private String ref;
    private String label;
    private String categoryLabel;
    private Double priceTTC;

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCategoryLabel() {
        return categoryLabel;
    }

    public void setCategoryLabel(String categoryLabel) {
        this.categoryLabel = categoryLabel;
    }

    public Double getPriceTTC() {
        return priceTTC;
    }

    public void setPriceTTC(Double priceTTC) {
        this.priceTTC = priceTTC;
    }
}
