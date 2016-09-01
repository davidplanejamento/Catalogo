package br.gov.planejamento.controller;

import java.util.ArrayList;
import java.util.List;

public class ValidaCampo {

	private List<String> listaCategorias = new ArrayList<String>();
	private List<String> listaNivelSatisfacao = new ArrayList<String>();
	private List<String> listaSituacao = new ArrayList<String>();
	private List<String> listaPlataformaOperacional = new ArrayList<String>();
	private List<String> listaHospedagem = new ArrayList<String>();
	private List<String> listaTipoAquisicao = new ArrayList<String>();
	private List<String> listaSO = new ArrayList<String>();
	private List<String> listaLP = new ArrayList<String>();
	private List<String> listaBD = new ArrayList<String>();

	public ValidaCampo() {
		listaCategorias.add("Abastecimento");
		listaCategorias.add("Administração");
		listaCategorias.add("Agropecuária, Pesca e Extrativismo");
		listaCategorias.add("Comércio e Serviços");
		listaCategorias.add("Comunicações");
		listaCategorias.add("Cultura");
		listaCategorias.add("Defesa Nacional");
		listaCategorias.add("Economia e Finanças");
		listaCategorias.add("Educação");
		listaCategorias.add("Energia");
		listaCategorias.add("Esporte e Lazer");
		listaCategorias.add("Habitação");
		listaCategorias.add("Indústria");
		listaCategorias.add("Infraestrutura e Fomento");
		listaCategorias.add("Meio ambiente");
		listaCategorias.add("Pesquisa e Desenvolvimento");
		listaCategorias.add("Planejamento e Gestão");
		listaCategorias.add("Previdência Social");
		listaCategorias.add("Proteção Social");
		listaCategorias.add("Relações Internacionais");
		listaCategorias.add("Saneamento");
		listaCategorias.add("Saúde");
		listaCategorias.add("Segurança e Ordem Pública");
		listaCategorias.add("Trabalho");
		listaCategorias.add("Transportes");
		listaCategorias.add("Urbanismo");
		listaCategorias.add("Antivirus");
		listaCategorias.add("Auditoria e Controle Interno");
		listaCategorias.add("Biblioteca");
		listaCategorias.add("Compras");
		listaCategorias.add("Contabilidade/Financeiro/Orçamento");
		listaCategorias.add("Controle de acesso rede/sistemas");
		listaCategorias.add("Controle de Demandas/Chamados");
		listaCategorias.add("Controle de Frotas");
		listaCategorias.add("Controle de Processos");
		listaCategorias.add("Educação à Distância");
		listaCategorias.add("GED – Gestão Eletrônica de Documentos");
		listaCategorias.add("Gerenciamento de Conteúdo");
		listaCategorias.add("Gerenciamento de Contratos");
		listaCategorias.add("Gerenciamento de Projetos");
		listaCategorias.add("Gestão de Ativos");
		listaCategorias.add("Help Desk");
		listaCategorias.add("Licitação");
		listaCategorias.add("Ouvidoria");
		listaCategorias.add("Patrimônio");
		listaCategorias.add("Ponto Eletrônico");
		listaCategorias.add("Portais Internet");
		listaCategorias.add("Portais Intranet");
		listaCategorias.add("Portaria");
		listaCategorias.add("Protocolo");
		listaCategorias.add("Recursos Humanos");
		listaCategorias.add("Rede Social / Interações com o cidadão");
		listaCategorias.add("Viagem");

		listaNivelSatisfacao.add("Supera as expectativas");
		listaNivelSatisfacao.add("Atende às expectativas");
		listaNivelSatisfacao.add("Precisa melhorar");
		listaNivelSatisfacao.add("Não atende ao que se propõe");
		
		listaSituacao.add("Em desenvolvimento");
		listaSituacao.add("Em produção");
		listaSituacao.add("Em processo de compra");
		
		listaPlataformaOperacional.add("Web");
		listaPlataformaOperacional.add("Software como serviço");
		listaPlataformaOperacional.add("Mobile");
		listaPlataformaOperacional.add("Desktop");
		listaPlataformaOperacional.add("Cliente/Servidor");
		listaPlataformaOperacional.add("Mainframe");
		listaPlataformaOperacional.add("Outro");
		
		
		listaHospedagem.add("Próprio Órgão");
		listaHospedagem.add("Serpro");
		listaHospedagem.add("Dataprev");
		listaHospedagem.add("Telebrás");
		listaHospedagem.add("RNP");
		listaHospedagem.add("Outro");

		listaTipoAquisicao.add("Compra");
		listaTipoAquisicao.add("Desenvolvimento");
		listaTipoAquisicao.add("Sem Custo (SPB/SL/Outros)");
		
		
		listaNivelSatisfacao.add("Supera as expectativas");
		listaNivelSatisfacao.add("Atende às expectativas");
		listaNivelSatisfacao.add("Precisa melhorar");
		listaNivelSatisfacao.add("Não atende ao que se propõe​");
		
		listaSO.add("Android");
		listaSO.add("IOS");
		listaSO.add("Linux - CentOS");
		listaSO.add("Linux - Debian");
		listaSO.add("Linux - Fedora");
		listaSO.add("Linux - RedHat");
		listaSO.add("Linux - Ubuntu");
		listaSO.add("Linux - Outras Distribuições");
		listaSO.add("Windows");
		listaSO.add("Windows - Server");
		listaSO.add("Windows - Phone");
		listaSO.add("Outro");
		
		listaLP.add("ASP");
		listaLP.add("ASP.NET");
		listaLP.add("C#");
		listaLP.add("DELPHI");
		listaLP.add("JAVA");
		listaLP.add("PHP");
		listaLP.add("VB.NET");
		listaLP.add("Outro​");
		
		listaBD.add("Access");
		listaBD.add("DB2");
		listaBD.add("MARIADB");
		listaBD.add("MySQL");
		listaBD.add("ORACLE");
		listaBD.add("PostgreSQL");
		listaBD.add("SQL Server");
		listaBD.add("Outro");
		listaBD.add("Não se aplica​");

	}

	public boolean validaFinalidade(String str){
		return str != null && str.length() > 0;
	}
	
	public boolean validaArea(String str) {
		return (str != null && (str.equalsIgnoreCase("meio") || str.equalsIgnoreCase("fim")));
	}

	public boolean validaCriticidade(String str) {
		return str != null
				&& (str.equalsIgnoreCase("Alta") || str.equalsIgnoreCase("Baixa") || str.equalsIgnoreCase("Média"));
	}

	public boolean validaCategoria(String str) {
		if (str== null || str.trim().length() == 0)
			return true;
		return listaCategorias.contains(str);
	}

	public boolean validaNivelSatisfacao(String str) {
		return listaNivelSatisfacao.contains(str);
	}
	
	public boolean validaSituacao(String str) {
		return listaSituacao.contains(str);
	}
	
	public boolean validaPlataformaOperacional(String str) {
		return listaPlataformaOperacional.contains(str);
	}
	
	public boolean validaHospedagem(String str) {
		return listaHospedagem.contains(str);
	}
	
	public boolean validaTipoAquisicao(String str) {
		return listaTipoAquisicao.contains(str);
	}
	
	public boolean validaSO(String str){
		return listaSO.contains(str);
	}
	
	public boolean validaLP(String str){
		return listaLP.contains(str);
	}
	
	public boolean validaBD(String str){
		campoObrigatorioPreenchido(str, "Banco de Dados");
		return listaBD.contains(str);
	}
	
	public boolean containsCaseInsensitive(String strToCompare, List<String> list)
	{
	    for(String str:list)
	    {
	        if(str.equalsIgnoreCase(strToCompare))
	        {
	            return(true);
	        }
	    }
	    return(false);
	}
	
	private void campoObrigatorioPreenchido(String str, String campo){
		if (str== null || str.trim().length() == 0){
			throw new RuntimeException("Campo \"" + campo + "\" é obritório. Favor preencher!" );
		}
		//return str!= null && str.trim().length() > 0;
	}
}
