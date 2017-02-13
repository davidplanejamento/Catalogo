package br.gov.planejamento.bean;

import java.util.ArrayList;
import java.util.List;

public class NecessidadeSoftwareConsolidada {

	private String SIORG;
	private List<NecessidadeSoftware> lista = new ArrayList<NecessidadeSoftware>();
	
	public String getSIORG() {
		return SIORG;
	}
	public void setSIORG(String sIORG) {
		SIORG = sIORG;
	}
	public List<NecessidadeSoftware> getLista() {
		return lista;
	}
	public void setLista(List<NecessidadeSoftware> lista) {
		this.lista = lista;
	}
	
}
