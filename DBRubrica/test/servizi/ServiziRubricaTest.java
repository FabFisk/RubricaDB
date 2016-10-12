package servizi;

import static org.junit.Assert.*;

import java.util.Map;

import model.Rubrica;
import model.Voce;

import org.junit.Test;

import dao.RubricaDAO;
import dao.VoceDAO;

public class ServiziRubricaTest {

	ServiziRubrica s = new ServiziRubrica();
	
	
	@Test
	public void testAggiungi() {
		RubricaDAO rDAO = new RubricaDAO();
		int id_R = rDAO.creaRubrica("prova");
		Rubrica r = rDAO.trovaRubrica(id_R);
		Voce v = s.aggiungiVoce(r, "", "", "");
		assertNotNull(v);
	}

	@Test
	public void testGetVoce() {
		RubricaDAO rDAO = new RubricaDAO();
		int id_R = rDAO.creaRubrica("prova");
		Rubrica r = rDAO.trovaRubrica(id_R);
		s.aggiungiVoce(r, "", "", "");
		Voce v = s.getVoce(r, "", "");
		assertNotNull(v);
	}

	@Test
	public void testGetAll() {
		RubricaDAO rDAO = new RubricaDAO();
		int id_R = rDAO.creaRubrica("prova");
		Rubrica r = rDAO.trovaRubrica(id_R);
		s.aggiungiVoce(r, "", "", "");
		Map<Integer, Voce> voci = s.getAll(r);
		assertNotEquals(0, voci.size());
	}
	
	@Test
	public void testUpdate() {
		RubricaDAO rDAO = new RubricaDAO();
		int id_R = rDAO.creaRubrica("prova");
		Rubrica r = rDAO.trovaRubrica(id_R);
		s.aggiungiVoce(r, "", "", "");
		Voce v = s.updateVoce(r, "", "", "", "", "");
		assertNotNull(v);
	}
		
	@Test
	public void testDelete() {
		RubricaDAO rDAO = new RubricaDAO();
		int id_R = rDAO.creaRubrica("prova");
		Rubrica r = rDAO.trovaRubrica(id_R);
		s.aggiungiVoce(r, "", "", "");
		s.deleteVoce(r, "", "");
		Voce v = s.getVoce(r, "", "");
		assertNull(v);
	}
}
