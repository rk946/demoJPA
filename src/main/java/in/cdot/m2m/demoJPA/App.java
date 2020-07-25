package in.cdot.m2m.demoJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setId(4);
		s1.setName("Cdot");
		s1.setTech("GPON");

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Student s = entityManager.find(Student.class, 3);

		System.out.println(s.toString());
		entityManager.getTransaction().begin();
		entityManager.persist(s1);
		entityManager.getTransaction().commit();
		System.out.println(entityManager.find(Student.class, 4));
		
	}
}
