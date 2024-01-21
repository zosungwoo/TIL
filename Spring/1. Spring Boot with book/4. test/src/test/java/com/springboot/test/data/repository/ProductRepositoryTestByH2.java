package com.springboot.test.data.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.springboot.test.data.entity.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

//@TestPropertySource("classpath:application-test.properties")

// 1. JPA 관련 설정만 로드해 테스트 진행, 2. @Transactional 어노테이션 포함 -> 테스트 코드 종료 시 DB 롤백, 3. 기본값으로 임베디드 DB 사용
@DataJpaTest
public class ProductRepositoryTestByH2 {

    @Autowired
    private ProductRepository productRepository;

    // 예제 7.15
    @Test
    void saveTest() {
        // given
        Product product = new Product();
        product.setName("펜");
        product.setPrice(1000);
        product.setStock(1000);

        // when
        Product savedProduct = productRepository.save(product);

        // then
        assertEquals(product.getName(), savedProduct.getName());
        assertEquals(product.getPrice(), savedProduct.getPrice());
        assertEquals(product.getStock(), savedProduct.getStock());
    }

    @Test
    void selectTest() {
        // given
        Product product = new Product();
        product.setName("펜");
        product.setPrice(1000);
        product.setStock(1000);

        Product savedProduct = productRepository.saveAndFlush(product);

        // when
        Product foundProduct = productRepository.findById(savedProduct.getNumber()).get();

        // then
        assertEquals(product.getName(), foundProduct.getName());
        assertEquals(product.getPrice(), foundProduct.getPrice());
        assertEquals(product.getStock(), foundProduct.getStock());
    }
}