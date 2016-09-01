package br.gov.planejamento.dao;

import java.util.List;

import br.gov.planejamento.bean.LevantamentoSistemas;
import br.gov.planejamento.bean.LevantamentoSistemasConsolidado;

public class ManterListaLevantamento {

	public void inserirListaLevantamento(LevantamentoSistemasConsolidado levantamento){
		String SIORG = levantamento.getSIORG();
		List<LevantamentoSistemas> listaLevantamento = levantamento.getLista();
		for (LevantamentoSistemas levantamentoSistemas : listaLevantamento) {
			TabelaConsolidadaDAOImpl tabela = new TabelaConsolidadaDAOImpl();
			tabela.insereInfo(SIORG, levantamentoSistemas);
		}
	}
}
