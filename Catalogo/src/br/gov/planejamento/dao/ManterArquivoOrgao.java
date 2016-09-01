package br.gov.planejamento.dao;

import java.io.InputStream;

public class ManterArquivoOrgao {

	public void inserirArquivo(String SIORG, InputStream inputStream){
		
			ArquivoOrgaoDAOImpl tabela = new ArquivoOrgaoDAOImpl();
			tabela.insereArquivo(SIORG, inputStream);
	}
}