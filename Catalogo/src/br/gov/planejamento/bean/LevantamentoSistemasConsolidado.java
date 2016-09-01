package br.gov.planejamento.bean;

import java.util.ArrayList;
import java.util.List;

public class LevantamentoSistemasConsolidado {

	private String SIORG;
	private List<LevantamentoSistemas> lista = new ArrayList<LevantamentoSistemas>();
	
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
	
}
