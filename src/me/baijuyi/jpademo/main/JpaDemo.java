package me.baijuyi.jpademo.main;

import me.baijuyi.jpademo.entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaDemo {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("juyi");
        EntityManager em = factory.createEntityManager();
        System.out.println(em);
        Student stu = new Student();
        stu.setStudentId(1);
        stu.setName("Juyi");
        em.getTransaction().begin();
        em.persist(stu);
        em.getTransaction().commit();
        em.close();
        factory.close();
    }
}
