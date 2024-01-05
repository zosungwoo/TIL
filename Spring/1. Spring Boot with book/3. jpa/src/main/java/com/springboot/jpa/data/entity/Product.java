package com.springboot.jpa.data.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
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

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}
