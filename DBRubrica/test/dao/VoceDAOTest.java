package dao;

import static org.junit.Assert.*;
import model.Rubrica;
import model.Voce;

import org.junit.Test;

public class VoceDAOTest {

	static VoceDAO vDAO = new VoceDAO();

//	@Test
//	public void createDelete(){
//		RubricaDAO rDAO = new RubricaDAO();
//		int a = rDAO.creaRubrica("Fabrizio");
//		int b = vDAO.creaVoce("Pippo", "Pappo", "1111", a); 
//		assertNotEquals(0, b);
//	}
//	
//	@Test
//	public void readTest() {
//		RubricaDAO rDAO = new RubricaDAO();
//		int a = rDAO.creaRubrica("Fabrizio");
//		int b1 = vDAO.creaVoce("Pippo", "Pappo", "1111", a); 
//		Voce v = vDAO.trovaVoce(b1, a);
//		assertNotNull(v);
//	}
//	
//	@Test
//	public void updatetest(){
//		RubricaDAO rDAO = new RubricaDAO();
//		int a = rDAO.creaRubrica("Fabrizio");
//		int b1 = vDAO.creaVoce("Pippo", "Pappo", "1111", a); 
//		boolean b2 = vDAO.aggiornaVoce("Tizio", "Qualunque", "222", b1);
//		assertTrue(b2);
//	}
	
	@Test
	public void deleteTest(){
		RubricaDAO rDAO = new RubricaDAO();
		int a = rDAO.creaRubrica("Fabrizio");
		int b1 = vDAO.creaVoce("Pippo", "Pappo", "1111", a); 
		boolean b = vDAO.rimuoviVoce(b1);
		assertTrue(b);
	}

}
