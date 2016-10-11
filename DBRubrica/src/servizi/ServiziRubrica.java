package servizi;

import java.util.Map;

import model.Rubrica;
import model.Voce;
import dao.VoceDAO;

public class ServiziRubrica {

	public Voce aggiungiVoce(Rubrica r, String nome, String cognome, String telefono){
		VoceDAO vDAO = new VoceDAO();
		Voce v = null;
		boolean bool = vDAO.creaVoce(nome, cognome, telefono, r.getId_rubrica());
		if(bool){
			v = vDAO.trovaVoce(nome, cognome, r.getId_rubrica());
		}
		return v;
	}
	
	public Voce getVoce(Rubrica r, String nome, String cognome){
		VoceDAO vDAO = new VoceDAO();
		Voce v = null;
		v = vDAO.trovaVoce(nome, cognome, r.getId_rubrica());
		return v;		
	}
	
	public Map<Integer, Voce> getAll(Rubrica r){
		VoceDAO vDAO = new VoceDAO();
		return vDAO.trovaVoce(r.getId_rubrica());
	}

	public Voce updateVoce(Rubrica r, String nomeVecchio, String cognomeVecchio, 
			String nome, String cognome, String telefono){
		VoceDAO vDAO = new VoceDAO();
		Voce v = null;
		v = vDAO.trovaVoce(nomeVecchio, cognomeVecchio, r.getId_rubrica());
		if(v!=null){
			vDAO.aggiornaVoce(nome, cognome, telefono, v.getId_voce());
			v = vDAO.trovaVoce(nome, cognome, r.getId_rubrica());
		}
		return v;
	}
	
	public void deleteVoce(Rubrica r, String nome, String cognome){
		VoceDAO vDAO = new VoceDAO();
		Voce v = vDAO.trovaVoce(nome, cognome, r.getId_rubrica());
		vDAO.rimuoviVoce(v.getId_voce());		
	}

	
}
