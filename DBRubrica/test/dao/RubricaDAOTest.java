package dao;

import static org.junit.Assert.*;
import model.Rubrica;

import org.junit.Test;

public class RubricaDAOTest {
	
	static RubricaDAO rDAO = new RubricaDAO();

	@Test
	public void createDelete(){
		int b = rDAO.creaRubrica("Fabrizio");
		assertNotEquals(0, b);
	}
	
	@Test
	public void readTest() {
		int b = rDAO.creaRubrica("Fabrizio");
		Rubrica rub = rDAO.trovaRubrica(b);
		assertNotNull(rub);
	}
	
	@Test
	public void updatetest(){
		int b1 = rDAO.creaRubrica("Fabrizio");
		boolean b2 = rDAO.aggiornaRubrica(b1, "Fabrizio1");
		assertTrue(b2);
	}
	
	@Test
	public void deleteTest(){
		int b1 = rDAO.creaRubrica("Fabrizio");
		boolean b = rDAO.rimuoviRubrica(b1);
		assertTrue(b);
	}

}
