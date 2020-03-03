package org.cnam.starcook.sales.dto.article;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.validation.annotation.Validated;

@JsonIgnoreProperties(ignoreUnknown = false)
@Validated
public class ArticleToCommandRequest {
    public String reference;
}
