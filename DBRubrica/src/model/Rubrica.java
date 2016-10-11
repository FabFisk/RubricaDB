package model;

import java.util.Map;

import dao.VoceDAO;

public class Rubrica {
	
	private int id_rubrica;
	private String nome;
	
	public Voce aggiungiVoce(String nome, String cognome, String telefono){
		VoceDAO vDAO = new VoceDAO();
		Voce v = null;
		boolean bool = vDAO.creaVoce(nome, cognome, telefono, this.id_rubrica);
		if(bool){
			v = vDAO.trovaVoce(nome, cognome, id_rubrica);
		}
		return v;
	}
	
	public Voce getVoce(String nome, String cognome){
		VoceDAO vDAO = new VoceDAO();
		Voce v = null;
		v = vDAO.trovaVoce(nome, cognome, id_rubrica);
		return v;		
	}
	
	public Map<Integer, Voce> getAll(){
		VoceDAO vDAO = new VoceDAO();
		return vDAO.trovaVoce(id_rubrica);
	}

	public Voce updateVoce(String nomeVecchio, String cognomeVecchio, 
			String nome, String cognome, String telefono){
		VoceDAO vDAO = new VoceDAO();
		Voce v = null;
		v = vDAO.trovaVoce(nomeVecchio, cognomeVecchio, this.id_rubrica);
		if(v!=null){
			vDAO.aggiornaVoce(nome, cognome, telefono, v.getId_voce());
			v = vDAO.trovaVoce(nome, cognome, id_rubrica);
		}
		return v;
	}
	
	public void deleteVoce(String nome, String cognome){
		VoceDAO vDAO = new VoceDAO();
		Voce v = vDAO.trovaVoce(nome, cognome, id_rubrica);
		vDAO.rimuoviVoce(v.getId_voce());		
	}

	public Rubrica(){}
	public Rubrica(int id_r, String nome){
		this.id_rubrica = id_r;
		this.nome = nome;
	}
	public int getId_rubrica() {
		return id_rubrica;
	}
	public void setId_rubrica(int id_rubrica) {
		this.id_rubrica = id_rubrica;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	
}
