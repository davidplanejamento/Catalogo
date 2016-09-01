package br.gov.planejamento.dao;

import java.io.InputStream;

public interface ArquivoOrgaoDAO {
	
	public void insereArquivo(String SIORG, InputStream inputStream);
	
}
