package com.nguyenvanvinh.bt_shoppingcart.service;

import com.nguyenvanvinh.bt_shoppingcart.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    void saveProduct(Product product);
    Product getProductById(int id);
    void deleteProductById(int id);
}
