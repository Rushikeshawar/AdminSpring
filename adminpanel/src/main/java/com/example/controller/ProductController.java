package com.example.controller;

import com.example.model.Product;

import service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String showAllProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "showProducts";
    }

    @GetMapping("/addProduct")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "addProduct";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.saveProduct(product);
        return "redirect:/admin/products";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
        return "redirect:/admin/products";
    }
}
