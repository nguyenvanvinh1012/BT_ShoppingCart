package com.nguyenvanvinh.bt_shoppingcart.model;

import lombok.Data;

@Data
public class CartItem {
    private int productId;
    private String name;
    private double price;
    private double quantity = 1;
}
