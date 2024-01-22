package com.springboot.advanced_jpa.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product")  // 명시 안해도 되나, 테이블 이름과 클래스 이름이 다르다면 테이블명 명시
public class Product {
    @Id  // 테이블의 기본키
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 어떤 방식으로 자동으로 생성할지
    private Long number;

    @Column(nullable = false)  // name, nullable, length, unique 등 명시 가능
    private String name;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer stock;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
