package br.gov.planejamento.dao;

import java.util.List;

import br.gov.planejamento.bean.LevantamentoSistemas;
import br.gov.planejamento.bean.LevantamentoSistemasConsolidado;
import br.gov.planejamento.bean.NecessidadeSoftware;

public class ManterListaLevantamento {

	public void inserirListaLevantamento(LevantamentoSistemasConsolidado levantamento){
		String SIORG = levantamento.getSIORG();
		List<LevantamentoSistemas> listaLevantamento = levantamento.getLista();
		TabelaNecessidadeSoftwareDAOImpl tabelaNecessidade;
		TabelaConsolidadaDAOImpl tabelaSistema;
		for (LevantamentoSistemas levantamentoSistemas : listaLevantamento) {
			tabelaSistema = new TabelaConsolidadaDAOImpl();
			tabelaSistema.insereInfo(SIORG, levantamentoSistemas);
		}
		
		List<NecessidadeSoftware> listaNecessidadeSoftware = levantamento.getListaNecessidade();
		for (NecessidadeSoftware necessidade : listaNecessidadeSoftware) {
		tabelaNecessidade = new TabelaNecessidadeSoftwareDAOImpl();
		tabelaNecessidade.insereInfo(SIORG, necessidade);
		}
	}
}
