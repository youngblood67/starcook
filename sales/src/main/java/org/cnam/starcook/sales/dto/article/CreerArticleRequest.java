package org.cnam.starcook.sales.dto.article;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.cnam.starcook.sales.domain.Category;
import org.cnam.starcook.sales.domain.Promotion;
import org.cnam.starcook.sales.domain.Tax;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = false)
@Validated
public class CreerArticleRequest {

    public String reference;
    public String label;
    public String categoryLabel;
    public Double taxAmount;
    @Min(20L)
    public Double priceHT;
    public Double buyingPrice;
    public Double promotionAmount;
    public Date promotionStartDate;
    public Date promotionEndDate;

}
