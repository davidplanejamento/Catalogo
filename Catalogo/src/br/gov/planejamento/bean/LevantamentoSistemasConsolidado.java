package br.gov.planejamento.bean;

import java.util.ArrayList;
import java.util.List;

public class LevantamentoSistemasConsolidado {

	private String SIORG;
	private List<LevantamentoSistemas> lista = new ArrayList<LevantamentoSistemas>();
	private List<NecessidadeSoftware> listaNecessidade = new ArrayList<NecessidadeSoftware>();
	
	public String getSIORG() {
		return SIORG;
	}
	public void setSIORG(String sIORG) {
		SIORG = sIORG;
	}
	public List<LevantamentoSistemas> getLista() {
		return lista;
	}
	public void setLista(List<LevantamentoSistemas> lista) {
		this.lista = lista;
	}
	public List<NecessidadeSoftware> getListaNecessidade() {
		return listaNecessidade;
	}
	public void setListaNecessidade(List<NecessidadeSoftware> listaNecessidade) {
		this.listaNecessidade = listaNecessidade;
	}
	
	
	
}
