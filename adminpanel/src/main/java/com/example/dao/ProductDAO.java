package com.example.dao;

import com.example.model.Product;
import java.util.List;

public interface ProductDAO {
    void saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(int id);
    void updateProduct(Product product);
    void deleteProduct(int id);
}
