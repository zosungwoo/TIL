package hellojpa;

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


            tx.commit();  // 커밋 직전에 업데이트 쿼리를 만들어 날림
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
}
