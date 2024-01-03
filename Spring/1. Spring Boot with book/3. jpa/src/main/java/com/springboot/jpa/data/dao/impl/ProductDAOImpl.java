package com.springboot.jpa.data.dao.impl;

import com.springboot.jpa.data.dao.ProductDAO;
import com.springboot.jpa.data.entity.Product;
import com.springboot.jpa.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component  // 클래스를 스프링이 관리하는 빈으로 등록하려면 @Component 또는 @Service 어노테이션 지정
public class ProductDAOImpl implements ProductDAO {

    private final ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product insertProduct(Product product) {
        return null;
    }

    @Override
    public Product selectProduct(Long number) {
        return null;
    }

    @Override
    public Product updateProductName(Long number, String name) {
        return null;
    }

    @Override
    public void deleteProduct(Long number) throws Exception {

    }
}
