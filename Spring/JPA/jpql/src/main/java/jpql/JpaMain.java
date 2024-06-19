package jpql;

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
            Member member = new Member();
            member.setUsername("member1");
            member.setAge(10);
            em.persist(member);

//            TypedQuery<Member> query = em.createQuery("select m from Member m where m.username = :username", Member.class);
//            query.setParameter("username", "member1");
//            List<Member> resultList = query.getResultList();
////            Member singleResult = query.getSingleResult();  -> 반드시 하나여야함 (0 or <= 2 라면 예외 발생)
////            System.out.println(singleResult);
//
//            for (Member member1 : resultList) {
//                System.out.println(member1);
//            }

//            List<Member> resultList = em.createQuery("select m from Member m", Member.class)
//                    .getResultList();

            List<MemberDto> resultList = em.createQuery("select new jpql.MemberDto(m.username, m.age) from Member m", MemberDto.class)
                    .getResultList();
            System.out.println(resultList.get(0).getUsername());
            System.out.println(resultList.get(0).getAge());


            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            e.printStackTrace();
        } finally {
            em.close();
        }
        emf.close();
    }
}
