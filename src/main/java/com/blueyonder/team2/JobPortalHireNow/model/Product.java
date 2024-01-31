package com.blueyonder.team2.JobPortalHireNow.model;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Product {
    private Integer productId;
    private Integer productName;
    private Integer productPrice;
    private Integer quantityOnHand;
    private Integer productCost;
}
