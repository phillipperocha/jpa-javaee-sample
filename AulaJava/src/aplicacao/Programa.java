package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		// Criar pessoas para inserir
		Pessoa p1 = new Pessoa(null, "Carlos", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Carlos2", "carlos2@gmail.com");
		Pessoa p3 = new Pessoa(null, "Carlos3", "carlos3@gmail.com");
		
		// Iniciar a fábrica e o entitymanager
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		// Iniciando as transações
		em.getTransaction().begin();
		
//		C - CREATE
//		em.persist(p1);
//		em.persist(p2);
//		em.persist(p3);
		
//		R - READ (procurando um objeto Pessoa de ID 2)
//		Pessoa p = em.find(Pessoa.class, 2);
		
//		U - UPDATE
//		Pessoa p = em.find(Pessoa.class, 2);
//		p.setNome("João da Silva");
//		em.merge(p);
		
//		D - DELETE
//		Pessoa p = em.find(Pessoa.class, p);
//		em.remove(p);
		
		em.getTransaction().commit();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

	}

}
