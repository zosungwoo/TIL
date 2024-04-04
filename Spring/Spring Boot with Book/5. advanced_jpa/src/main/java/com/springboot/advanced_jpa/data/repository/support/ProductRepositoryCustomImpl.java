package com.springboot.advanced_jpa.data.repository.support;

import com.springboot.advanced_jpa.data.entity.Product;
import com.springboot.advanced_jpa.data.entity.QProduct;
import java.util.List;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Component;

@Component
public class ProductRepositoryCustomImpl extends QuerydslRepositorySupport implements
    ProductRepositoryCustom {

    // 생성자를 통해 도메인 클래스를 부모 클래스에 전달애햐 함
    public ProductRepositoryCustomImpl() {
        super(Product.class);
    }

    // 인터페이스에 정의한 메서드를 구현
    @Override
    public List<Product> findByName(String name) {
        QProduct product = QProduct.product;

        // Q도메인 클래스를 사용해 QuerydslRepositorySupport가 제공하는 기능 사용
        List<Product> productList = from(product)
            .where(product.name.eq(name))
            .select(product)
            .fetch();

        return productList;
    }
}