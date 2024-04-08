## 스프링 시큐리티 + JWT

스프링 시큐리티 6 프레임워크를 활용하여 JWT 기반의 인증/인가를 구현하고 회원 정보 저장(영속성) MySQL 데이터베이스를 활용한다.

서버는 API 서버 형태로 구축한다. (웹 페이지를 응답하는 것이 아닌 API 클라이언트 요청을 통해 데이터 응답만 확인함)

토큰 발급의 경우 단일 토큰으로 진행한다. (Access, Refresh로 나누는 경우도 있지만 한 개로 진행함)

<br>

### 버전 및 의존성
- Spring Boot 3.2.1
- Security 6.2.1
- Lombok
- Spring Data JPA - MySQL
- Gradle - Groovy
- IntelliJ Ultimate

<br>
<br>

- **회원가입** : 내부 회원 가입 로직은 세션 방식과 JWT 방식의 차이가 없다.
    
    ![image](https://github.com/zosungwoo/TIL/assets/30895117/c73b429c-6908-4ea2-bb06-03f4be418575)

    
- **로그인 (인증)** : 로그인 요청을 받은 후 세션 방식은 서버 세션이 유저 정보를 저장하지만 JWT 방식은 토큰을 생성하여 응답한다.
    
    ![image](https://github.com/zosungwoo/TIL/assets/30895117/30537097-e726-49e8-9318-c8c2ee8d0c39)

    
- **경로 접근 (인가)** : JWT Filter를 통해 요청의 헤더에서 JWT를 찾아 검증을하고 일시적 요청에 대한 Session을 생성한다. (생성된 세션은 요청이 끝나면 소멸됨)

    ![image](https://github.com/zosungwoo/TIL/assets/30895117/285f0ba1-7bc0-4eb7-8916-f4703b9d26d4)
