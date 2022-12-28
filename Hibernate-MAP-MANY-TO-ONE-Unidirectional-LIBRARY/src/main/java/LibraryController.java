import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class LibraryController {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("milind");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Library library = new Library();
		library.setLibrary_name("Akhil Bhartiya");
		library.setLocation("Belapur");
		
		Students s1 = new Students();
		s1.setName("Milind");
		s1.setRoll_no("1");
		s1.setLibrary(library);
		
		Students s2 = new Students();
		s2.setName("Amit");
		s2.setRoll_no("2");
		s2.setLibrary(library);
		
		Students s3 = new Students();
		s3.setName("Aniket");
		s3.setRoll_no("3");
		s3.setLibrary(library);
		
		entityTransaction.begin();
		entityManager.persist(library);
		entityManager.persist(s1);
		entityManager.persist(s2);
		entityManager.persist(s3);
		entityTransaction.commit();
	}
}