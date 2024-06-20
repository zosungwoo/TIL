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
//            Member member = new Member();
//            member.setUsername("member1");
//            member.setAge(10);
//            em.persist(member);

            // 기본 문법과 쿼리
//            TypedQuery<Member> query = em.createQuery("select m from Member m where m.username = :username", Member.class);
//            query.setParameter("username", "member1");
//            List<Member> resultList = query.getResultList();
////            Member singleResult = query.getSingleResult();  -> 반드시 하나여야함 (0 or <= 2 라면 예외 발생)
////            System.out.println(singleResult);
//
//            for (Member member1 : resultList) {
//                System.out.println(member1);
//            }


            // 프로젝션
//            List<Member> resultList = em.createQuery("select m from Member m", Member.class)
//                    .getResultList();

//            List<MemberDto> resultList = em.createQuery("select new jpql.MemberDto(m.username, m.age) from Member m", MemberDto.class)
//                    .getResultList();
//            System.out.println(resultList.get(0).getUsername());
//            System.out.println(resultList.get(0).getAge());


            // 페이징
//            List<Member> resultList = em.createQuery("select m from Member m order by m.age desc", Member.class)
//                    .setFirstResult(0)
//                    .setMaxResults(10)
//                    .getResultList();
//
//            System.out.println(resultList.size());
//            for (Member member1 : resultList) {
//                System.out.println(member1);
//            }


            // 조인
            Team team = new Team();
            team.setName("teamA");
            em.persist(team);

            Member member = new Member();
            member.setUsername("member1");
            member.setAge(10);
            member.setTeam(team);
            em.persist(member);

            em.flush();
            em.clear();

            List<Member> resultList = em.createQuery("select m from Member m inner join m.team t", Member.class)
                    .getResultList();



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
