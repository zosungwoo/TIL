package com.springboot.advanced_jpa.data.repository;

import com.springboot.advanced_jpa.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {  // 대상 엔티티와 기본키 타입 지정
    // find...By
    Optional<Product> findByNumber(Long number);
    List<Product> findAllByName(String name);
    Product queryByNumber(Long number);

    // exists...By
    boolean existsByNumber(Long number);  // 존재하는지 boolean 타입으로 리턴

    // count...By
    long countByName(String name);  // 쿼리 결과로 나온 레코드의 개수

    // delete...By, remove...By
    void deleteByNumber(Long number);
    long removeByName(String name);  // 삭제한 횟수 리턴

    // ...First<number>..., ...Top<number>... : 조회된 결괏값의 개수를 제한
    List<Product> findFirst5ByName(String name);
    List<Product> findTop10ByName(String name);

    // Is, Equals (생략 가능)
    // findByNumber 메소드와 동일하게 동작
    Product findByNumberIs(Long number);
    Product findByNumberEquals(Long number);

    // (Is)Not
    Product findByNumberIsNot(Long number);
    Product findByNumberNot(Long number);

    // (Is)Null, (Is)NotNull : NULL인지/아닌지
    List<Product> findByUpdatedAtNull();
    List<Product> findByUpdatedAtIsNull();
    List<Product> findByUpdatedAtNotNull();
    List<Product> findByUpdatedAtIsNotNull();

    // And, Or : 여러 조건을 묶을 때 사용
    Product findByNumberAndName(Long number, String name);
    Product findByNumberOrName(Long number, String name);

    // (Is)GreaterThan, (Is)LessThan, (Is)Between (경곗값 포함하려면 Equal 추가)
    List<Product> findByPriceIsGreaterThan(Long price);
    List<Product> findByPriceGreaterThan(Long price);
    List<Product> findByPriceGreaterThanEqual(Long price);
    List<Product> findByPriceIsLessThan(Long price);
    List<Product> findByPriceLessThan(Long price);
    List<Product> findByPriceLessThanEqual(Long price);
    List<Product> findByPriceIsBetween(Long lowPrice, Long highPrice);
    List<Product> findByPriceBetween(Long lowPrice, Long highPrice);

    // (Is)Like, (Is)Containing, (Is)StartingWith, (Is)EndingWith
    List<Product> findByNameLike(String name);  // Like는 매개변수 값에 %를 명시적으로 입력해야 함
    List<Product> findByNameIsLike(String name);

    List<Product> findByNameContains(String name);
    List<Product> findByNameContaining(String name);
    List<Product> findByNameIsContaining(String name);

    List<Product> findByNameStartsWith(String name);
    List<Product> findByNameStartingWith(String name);
    List<Product> findByNameIsStartingWith(String name);

    List<Product> findByNameEndsWith(String name);
    List<Product> findByNameEndingWith(String name);
    List<Product> findByNameIsEndingWith(String name);

    /* 정렬 처리하기 */

    // Asc : 오름차순, Desc : 내림차순
    List<Product> findByNameOrderByNumberAsc(String name);
    List<Product> findByNameOrderByNumberDesc(String name);

    // 여러 정렬 기준 사용하기, And를 붙이지 않음
    List<Product> findByNameOrderByPriceAscStockDesc(String name);

    // 매개변수를 활용한 정렬 방법
    List<Product> findByName(String name, Sort sort);

    /* 페이징 처리하기 */
    // 페이징 쿼리 메서드 호출: Page<Product> productPage = productRepository.findByName("펜", PageRequest.of(0, 2));
    Page<Product> findByName(String name, Pageable pageable);

    /* @Query 어노테이션을 활용한 메소드 작성 */
    // 직접 JPQL 작성 (JPA 구현체에서 자동으로 쿼리 문장을 해석하고 실행)
    @Query("SELECT p FROM Product p WHERE p.name = ?1")  // ?1: 파라미터를 전달받기 위한 인자 (1: 첫번째 파라미터) -> 순서가 바뀌면 오류 발생 가능성 -> @Param 사용
    List<Product> findByName(String name);

    @Query("SELECT p FROM Product p WHERE p.name = :name")  // 파라미터를 바인딩 -> 가독성 높아짐, 유지보수 수월해짐
    List<Product> findByNameParam(@Param("name") String name);

    @Query("SELECT p.name, p.price, p.stock FROM Product p WHERE p.name = :name")  // 엔티티 타입이 아닌 원하는 컬럼의 값만 추출
    List<Object[]> findByNameParam2(@Param("name") String name);

}
