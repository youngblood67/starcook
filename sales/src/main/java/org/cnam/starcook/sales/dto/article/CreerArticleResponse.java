package org.cnam.starcook.sales.dto.article;

import javax.validation.constraints.Min;
import java.util.Date;

public class CreerArticleResponse {
    public int id;
    public String reference;
    public String label;
    public String categoryLabel;
    public Double taxAmount;
    public Double priceHT;
    public Double priceTTC;
    public Double buyingPrice;
    public Double promotionAmount;
    public Date promotionStartDate;
    public Date promotionEndDate;


}
