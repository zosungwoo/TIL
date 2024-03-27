package jpashop;

import jakarta.persistence.*;
import jpashop.domain.Member;

public class JpaMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Member member = new Member();
            member.setName("조성우");

            em.persist(member);
            System.out.println(member.getId());

            tx.commit();  // 커밋 직전에 업데이트 쿼리를 만들어 날림
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
            emf.close();
        }
    }
}
