package br.com.projeto.test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.projeto.jpa.model.Cliente;
import br.com.projeto.jpa.model.Pacote;
import utils.DateUtil;

public class JpaTest {

	public static void main(String[] args) {
		System.out.println("EuAki!");
		
		Cliente cliente = new Cliente("Cris RedField", "crisredfield@email.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-test");
		EntityManager em = emf.createEntityManager();
		
		Cliente cliente2 = new Cliente("Clara", "clara@email.com");
		cliente2.setId(1009);
		
		em.getTransaction().begin();
	//	Cliente clienteresult = em.find(Cliente.class, 1007);
	
//	  em.persist(cliente); em.getTransaction().commit();
	 
	  //  System.out.println("Resultado " + clienteresult.getNome());
		/*
		 * List<Cliente> clientes = em.createQuery("from cliente",
		 * Cliente.class).getResultList(); clientes.forEach(cli ->
		 * System.out.println(cli));
		 */
		//System.out.println(clientes.toString());
		//em.remove(clienteresult);
		Date dataInicio = DateUtil.stringToDate("19/09/2022");
		Date dataFim = DateUtil.stringToDate("25/09/2022");
		Pacote pacote = new Pacote(3, "Alagoas", dataInicio, dataFim, "Top demais hein",
				"Você vai curtir demais",  
				new BigDecimal(500.00));
		
		em.persist(pacote);
	
		/*
		 * em.merge(cliente2); em.getTransaction().commit();
		 */
		em.close();
	}

}
