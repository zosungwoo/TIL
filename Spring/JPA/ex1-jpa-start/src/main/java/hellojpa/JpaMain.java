package hellojpa;

import hellojpa.entity.Member;
import jakarta.persistence.*;

import java.util.List;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            // 등록
//            Member member = new Member();
//            member.setId(1L);
//            member.setName("hello1");
//            em.persist(member);

            // 조회 / 수정
//            Member findMember = em.find(Member.class, 1L);
//            System.out.println(findMember.getId() + " " + findMember.getName());
//            findMember.setName("hello2");

//            List<Member> result = em.createQuery("select m from Member as m where m.id < 100", Member.class)  // JPQL
//                    .setFirstResult(0)
//                    .setMaxResults(2)
//                    .getResultList();
//            for (Member member : result) {
//                System.out.println(member.getName());
//            }


//            Member member = new Member();
//            member.setId("member1");
//            member.setUsername("회원1");
//            //1차 캐시에 저장됨
//            em.persist(member);
//            //1차 캐시에서 조회
//            Member findMember = em.find(Member.class, "member1");
//
//            Member a = em.find(Member.class, "member1");
//            Member b = em.find(Member.class, "member1");
//            System.out.println(a == b); //동일성 비교 true


//            EntityManager em = emf.createEntityManager();
//            EntityTransaction transaction = em.getTransaction();
//
//            //엔티티 매니저는 데이터 변경시 트랜잭션을 시작해야 한다.
//            transaction.begin(); // [트랜잭션] 시작
//
//            em.persist(memberA);
//            em.persist(memberB);
//            //여기까지 INSERT SQL을 데이터베이스에 보내지 않는다.
//
//            //커밋하는 순간 데이터베이스에 INSERT SQL을 보낸다.
//            transaction.commit(); // [트랜잭션] 커밋



//            EntityManager em = emf.createEntityManager();
//            EntityTransaction transaction = em.getTransaction();
//            transaction.begin(); // [트랜잭션] 시작
//
//            // 영속 엔티티 조회
//            Member memberA = em.find(Member.class, "memberA");
//
//            // 영속 엔티티 데이터 수정
//            memberA.setUsername("hi");
//            memberA.setAge(10);
//
//            //em.update(member) 이런 코드가 있어야 하지 않을까?
//
//            transaction.commit(); // [트랜잭션] 커밋

            Member member = new Member();
            member.setName("asdf");

            System.out.println("=============");
            em.persist(member);
            System.out.println(member.getId());
            System.out.println("=============");

            

            tx.commit();  // 커밋 직전에 업데이트 쿼리를 만들어 날림
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
}
