package com.inventory.inventorymanagement.dto;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
    private Integer lowStockThreshold;
    private Long categoryId;
}
