package com.springboot.test.service.imlp;

import com.springboot.test.data.dto.ProductDto;
import com.springboot.test.data.dto.ProductResponseDto;
import com.springboot.test.data.entity.Product;
import com.springboot.test.data.repository.ProductRepository;
import com.springboot.test.service.impl.ProductServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

public class ProductServiceTest {
    // Mock 객체로 ProductRepository를 주입받음
    private ProductRepository productRepository = Mockito.mock(ProductRepository.class);
    private ProductServiceImpl productService;

    @BeforeEach
    public void setUpTest() {  // 각 테스트 전에 ProductService 객체 초기화
        productService = new ProductServiceImpl(productRepository);
    }

    // 예제 7.11
    @Test
    void getProductTest() {
        // given
        Product givenProduct = new Product();   // 테스트에 사용될 Product 엔티티 객체를 생성
        givenProduct.setNumber(123L);
        givenProduct.setName("펜");
        givenProduct.setPrice(1000);
        givenProduct.setStock(1234);

        Mockito.when(productRepository.findById(123L))  // ProductRepository의 동작에 대한 결괏값 리턴을 설정
                .thenReturn(Optional.of(givenProduct));

        // when
        ProductResponseDto productResponseDto = productService.getProduct(123L);

        // then
        Assertions.assertEquals(productResponseDto.getNumber(), givenProduct.getNumber());
        Assertions.assertEquals(productResponseDto.getName(), givenProduct.getName());
        Assertions.assertEquals(productResponseDto.getPrice(), givenProduct.getPrice());
        Assertions.assertEquals(productResponseDto.getStock(), givenProduct.getStock());

        verify(productRepository).findById(123L);
    }

    // 예제 7.12
    @Test
    void saveProductTest() {
        // given
        Mockito.when(productRepository.save(any(Product.class)))
                .then(returnsFirstArg());

        // when
        ProductResponseDto productResponseDto = productService.saveProduct(
                new ProductDto("펜", 1000, 1234));

        // then
        Assertions.assertEquals(productResponseDto.getName(), "펜");
        Assertions.assertEquals(productResponseDto.getPrice(), 1000);
        Assertions.assertEquals(productResponseDto.getStock(), 1234);

        verify(productRepository).save(any());
    }
}
