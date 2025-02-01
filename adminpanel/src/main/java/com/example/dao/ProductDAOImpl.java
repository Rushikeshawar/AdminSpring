package com.example.dao;

import com.example.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class ProductDAOImpl implements ProductDAO {
    
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void saveProduct(Product product) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(product);
        tx.commit();
        session.close();
    }

    @Override
    public List<Product> getAllProducts() {
        Session session = sessionFactory.openSession();
        List<Product> products = session.createQuery("from Product", Product.class).list();
        session.close();
        return products;
    }

    @Override
    public Product getProductById(int id) {
        Session session = sessionFactory.openSession();
        Product product = session.get(Product.class, id);
        session.close();
        return product;
    }

    @Override
    public void updateProduct(Product product) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(product);
        tx.commit();
        session.close();
    }

    @Override
    public void deleteProduct(int id) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        Product product = session.get(Product.class, id);
        if (product != null) session.delete(product);
        tx.commit();
        session.close();
    }
}
