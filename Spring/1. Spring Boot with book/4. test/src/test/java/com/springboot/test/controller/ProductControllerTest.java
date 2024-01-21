package com.springboot.test.controller;

import com.google.gson.Gson;
import com.springboot.test.data.dto.ProductDto;
import com.springboot.test.data.dto.ProductResponseDto;
import com.springboot.test.service.impl.ProductServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

// 웹에서 사용되는 요청과 응답에 대한 테스트 수행
// 대상 클래스만 로드해 테스트 수행 (대상 클래스 추가 안할 시, @Controller, @RestContoller 등의 컨트롤러 관련 빈 객체가 모두 로드됨
// 일반적으로 슬라이스 테스트라고 부름 (단위 테스트와 통합 테스트의 중간 개념으로, 레이어드 아키텍처를 기준으로 각 레이어별로 나누어 테스트 진행)
@WebMvcTest(ProductController.class)
public class ProductControllerTest {

    // 컨트롤러의 API를 테스트하기 위해 사용된 객체
    // 서블릿 컨테이너의 구동 없이 가상의 MVC 환경에서 모의 HTTP 서블릿을 요청하는 유틸리티 클래스
    @Autowired
    private MockMvc mockMvc;

    // 실제 빈 객체가 아닌 Mock(가짜) 객체를 생성해 주입하는 역할
    // 실제 객체가 아니기 때문에 실제 행위를 수행하지 않음 -> 해당 객체는 Mockito의 given() 메서드를 통해 동작을 정의
    @MockBean
    ProductServiceImpl productService;

    @Test  // 테스트 코드가 포함되어 있다고 선언하는 어노테이션, JUnit Jupiter에서 감지
    @DisplayName("MockMvc를 통한 Product 데이터 가져오기 테스트")  // 테스트 메서드 이름이 복잡해 가독성이 떨어질 경우 설정
    void getProductTest() throws Exception{
        // given : Mock 객체가 특정 상황에서 해야하는 행위를 정의하는 메소드
        given(productService.getProduct(123L)).willReturn(
                new ProductResponseDto(123L, "pen", 5000, 2000)
        );

        String productId = "123";

        // 서버로 URL 요청을 보내는 것처럼 통신 테스트 코드를 작성해서 컨트롤러를 테스트할 수 있음
        // MockMvcRequestBuilders에서 제공하는 HTTP 메서드로 URL을 정의해서 사용함
        mockMvc.perform(
                get("/product?number=" + productId))
                .andExpect(status().isOk())  // andExpect : 기대하는 값이 나왔는지 체크해볼 수 있는 메소드
                .andExpect(jsonPath("$.number").exists()) // json path의 depth가 깊어지면 .을 추가하여 탐색할 수 있음 (ex : $.productId.productIdName)
                .andExpect(jsonPath("$.name").exists())
                .andExpect(jsonPath("$.price").exists())
                .andExpect(jsonPath("$.stock").exists())
                .andDo(print());  // 요청과 응답의 전체 내용을 확인

        // 전체적인 'When-Then'의 구조를 갖추고 있음

        // 지정된 메서드가 실행됐는지 검증 (일반적으로 given()에 정의된 동작과 대응)
        verify(productService).getProduct(123L);
    }

    @Test
    @DisplayName("Product 데이터 생성 테스트")
    void createProductTest() throws Exception {
        // Mock 객체에서 특정 메소드가 실행되는 경우 실제 Return을 줄 수 없기 때문에 아래와 같이 가정 사항을 만들어줌
        given(productService.saveProduct(new ProductDto("pen", 5000, 2000)))
                .willReturn(new ProductResponseDto(12315L, "pen", 5000, 2000));

        ProductDto productDto = ProductDto.builder()
                .name("pen")
                .price(5000)
                .stock(2000)
                .build();

        Gson gson = new Gson();
        String content = gson.toJson(productDto);

        mockMvc.perform(
                        post("/product")
                                .content(content)
                                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.number").exists())
                .andExpect(jsonPath("$.name").exists())
                .andExpect(jsonPath("$.price").exists())
                .andExpect(jsonPath("$.stock").exists())
                .andDo(print());

        verify(productService).saveProduct(new ProductDto("pen", 5000, 2000));
    }
}
