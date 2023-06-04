package com.nguyenvanvinh.bt_shoppingcart.service;

import com.nguyenvanvinh.bt_shoppingcart.model.CartItem;

import java.util.Collection;

public interface ShoppingCartService {
    void add (CartItem newItem);
    void remove (int id);
    CartItem update (int productID, int quantity);
    void clear();
    double getAmount ();
    int getCount();
    Collection<CartItem> getAllItems();
}
