package br.gov.planejamento.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jopendocument.dom.spreadsheet.Sheet;
import org.jopendocument.dom.spreadsheet.SpreadSheet;

import br.gov.planejamento.bean.LevantamentoSistemas;
import br.gov.planejamento.bean.LevantamentoSistemasConsolidado;
import br.gov.planejamento.bean.NecessidadeSoftware;
import br.gov.planejamento.util.Utils;

public class LerPlanilha {

private List<LevantamentoSistemas> informacoesList = new ArrayList<LevantamentoSistemas>();
private List<NecessidadeSoftware> necessidadeList = new ArrayList<NecessidadeSoftware>();
private LevantamentoSistemasConsolidado lista = new LevantamentoSistemasConsolidado();	
	
	public LevantamentoSistemasConsolidado readODS(File file)
    {
      Sheet sheetInfoBasicas;
      Sheet sheetInfoTecnicas;
      Sheet sheetInfoContratuais;
      Sheet sheetNecessidades;
      try {
           
           sheetInfoBasicas = SpreadSheet.createFromFile(file).getSheet(0);
           sheetInfoTecnicas = SpreadSheet.createFromFile(file).getSheet(1);
           sheetInfoContratuais = SpreadSheet.createFromFile(file).getSheet(2);
           sheetNecessidades = SpreadSheet.createFromFile(file).getSheet(3);
           
           ValidaCampo vc = new ValidaCampo();
           ValidaOrgao vo = new ValidaOrgao();
           
           int linhasEmBranco = 0;
           int linhasEmBrancoNecessidades = 0;
           
           int nRowCount = sheetInfoBasicas.getRowCount();
           int nRowCountNecessidade = sheetNecessidades.getRowCount();
           
           boolean error = false;
           LevantamentoSistemas info;
           NecessidadeSoftware necessidadeSoftware;
           
           
           lista.setSIORG(vo.retornaSIORG(sheetInfoBasicas.getCellAt(3,2).getValue().toString()));
           
           loop: for(int nRowIndex = 9; nRowIndex < nRowCount; nRowIndex++)
           {
        	   String verificaConteudo = sheetInfoBasicas.getCellAt(2, nRowIndex).getValue().toString();
        	   if (verificaConteudo.length() > 0){
        	   
        		   String categoria1 = sheetInfoBasicas.getCellAt(6, nRowIndex).getValue().toString();
        		   String categoria2 = sheetInfoBasicas.getCellAt(7, nRowIndex).getValue().toString();
        		   String categoria3 = sheetInfoBasicas.getCellAt(8, nRowIndex).getValue().toString();
     
        		   if ((categoria1 == null || categoria1.trim().length() == 0) &&
        				   (categoria2 == null || categoria2.trim().length() == 0) &&
        				   		(categoria3 == null || categoria3.trim().length() == 0)){
        			   throw new RuntimeException("Um dos campos \"Categoria\" deve ser preenchido!" );
        		   }
        	   
	        	   info = new LevantamentoSistemas();
	        	   //Informacoes Basicas
	        	   String finalidade = sheetInfoBasicas.getCellAt(3, nRowIndex).getValue().toString();
	        	   
	        	   if ((verificaConteudo == null || verificaConteudo.trim().length() == 0) && (finalidade != null && finalidade.trim().length() > 0) ){
       					throw new RuntimeException("Campo \"Sigla/Nome do Software\" é obritório. Favor preencher!" );
       				} else {
       					info.setNomeSoftware(sheetInfoBasicas.getCellAt(2, nRowIndex).getValue().toString());
       				}
	        	   
	        	   if (vc.validaFinalidade(finalidade)){
	        		   info.setFinalidadeDescricao(finalidade);
	        	   } else {
	        		   throw new RuntimeException("Favor corrigir a informação da célula da coluna \"Finalidade/Descrição\" linha " + (nRowIndex + 1) + " da aba Informações Básicas");
	        	   }
	        	   
	        	   if (vc.validaArea(sheetInfoBasicas.getCellAt(4, nRowIndex).getValue().toString())){
	        		   info.setArea(sheetInfoBasicas.getCellAt(4, nRowIndex).getValue().toString());	        		   
	        	   } else {
	        		   throw new RuntimeException("Favor corrigir a informação da célula da coluna \"Área\" linha " + (nRowIndex + 1) + " da aba Informações Básicas");
	        	   }
	        	  
	        	   if (vc.validaCriticidade(sheetInfoBasicas.getCellAt(5, nRowIndex).getValue().toString())){
	        		   info.setCriticidade(sheetInfoBasicas.getCellAt(5, nRowIndex).getValue().toString());
	        	   } else {
	        		   throw new RuntimeException("Favor corrigir a informação da célula da coluna \"Criticidade\" linha " + (nRowIndex + 1) + " da aba Informações Básicas");
	        	   }
	        	   
	        	   if (vc.validaCategoria(sheetInfoBasicas.getCellAt(6, nRowIndex).getValue().toString())){
	        		   info.setCategoria1(sheetInfoBasicas.getCellAt(6, nRowIndex).getValue().toString());
	        	   } else {
	        		   throw new RuntimeException("Favor corrigir a informação da célula da coluna \"Categoria 1\" linha " + (nRowIndex + 1) + " da aba Informações Básicas");
	        	   }

	        	   if (vc.validaCategoria(sheetInfoBasicas.getCellAt(7, nRowIndex).getValue().toString())){
	        		   info.setCategoria2(sheetInfoBasicas.getCellAt(7, nRowIndex).getValue().toString());
	        	   } else {
	        		   throw new RuntimeException("Favor corrigir a informação da célula da coluna \"Categoria 2\" linha " + (nRowIndex + 1) + " da aba Informações Básicas");
	        	   }
	        	   
	        	   info.setCategoria3(sheetInfoBasicas.getCellAt(8, nRowIndex).getValue().toString());
	        	   
	        	   String compartilhar = sheetInfoBasicas.getCellAt(9, nRowIndex).getValue().toString();
	        	   if(compartilhar == null || compartilhar.equalsIgnoreCase("Não") || compartilhar.equalsIgnoreCase("Nao") ){
	        		   info.setCompartilhar(false);
	        	   } else {
	        		   info.setCompartilhar(true);        		   
	        	   }
	        	   
	        	   info.setMotivoNaoCompartilhamento(sheetInfoBasicas.getCellAt(10, nRowIndex).getValue().toString());
	        	   
	        	   if (vc.validaNivelSatisfacao(sheetInfoBasicas.getCellAt(11, nRowIndex).getValue().toString())){
	        		   info.setNivelSatisfacao(sheetInfoBasicas.getCellAt(11, nRowIndex).getValue().toString());
	        	   } else {
	        		   throw new RuntimeException("Favor corrigir a informação da célula da coluna \"Nível de Satisfação\" com o Uso linha " + (nRowIndex + 1) + " da aba Informações Básicas");
	        	   }
	        	   
	        	   //Informacoes Tecnicas
	        	   
	        	   if (vc.validaPlataformaOperacional(sheetInfoTecnicas.getCellAt(3, nRowIndex).getValue().toString())){
	        		   info.setPlataformaOperacional(sheetInfoTecnicas.getCellAt(3, nRowIndex).getValue().toString());
	        	   } else {
	        		   throw new RuntimeException("Favor corrigir a informação da célula da coluna \"Plataforma Operacional\" linha " + (nRowIndex + 1) + " da aba Informações Técnicas");
	        	   }
	        	   
	        	   if (vc.validaHospedagem(sheetInfoTecnicas.getCellAt(4, nRowIndex).getValue().toString())){
	        		   info.setLocalHospedagem(sheetInfoTecnicas.getCellAt(4, nRowIndex).getValue().toString());
	        	   } else {
	        		   throw new RuntimeException("Favor corrigir a informação da célula da coluna \"Onde é Hospedado?\" linha " + (nRowIndex + 1) + " da aba Informações Técnicas");
	        	   }
	        	   
	        	   if (vc.validaSO(sheetInfoTecnicas.getCellAt(5, nRowIndex).getValue().toString())){
	        		   info.setSistemaOperacional(sheetInfoTecnicas.getCellAt(5, nRowIndex).getValue().toString());
	        	   } else {
	        		   throw new RuntimeException("Favor corrigir a informação da célula da coluna \"Sistema Operacional\" linha " + (nRowIndex + 1) + " da aba Informações Técnicas");
	        	   }
	        	  
	        	   if (vc.validaLP(sheetInfoTecnicas.getCellAt(6, nRowIndex).getValue().toString())){
	        		   info.setLinguagemProgramacao(sheetInfoTecnicas.getCellAt(6, nRowIndex).getValue().toString());
	        	   } else {
	        		   throw new RuntimeException("Favor corrigir a informação da célula da coluna \"Linguagem de Programação\" linha " + (nRowIndex + 1) + " da aba Informações Técnicas");
	        	   }
	        	   
	        	   if (vc.validaBD(sheetInfoTecnicas.getCellAt(7, nRowIndex).getValue().toString())){
	        		   info.setBancoDeDados(sheetInfoTecnicas.getCellAt(7, nRowIndex).getValue().toString());
	        	   } else {
	        		   throw new RuntimeException("Favor corrigir a informação da célula da coluna \"Banco de Dados\" linha " + (nRowIndex + 1) + " da aba Informações Técnicas");
	        	   }
	        	   
	        	   info.setFramework(sheetInfoTecnicas.getCellAt(8, nRowIndex).getValue().toString());
	        	   info.setIntegracoes(sheetInfoTecnicas.getCellAt(9, nRowIndex).getValue().toString());
	        	   
	        	   //Informacoes Contratuais
	        	   if (vc.validaSituacao(sheetInfoContratuais.getCellAt(3, nRowIndex).getValue().toString())){
	        		   info.setSituacao(sheetInfoContratuais.getCellAt(3, nRowIndex).getValue().toString());
	        	   } else {
	        		   throw new RuntimeException("Favor corrigir a informação da célula da coluna \"Situação\" linha " + (nRowIndex + 1) + " da aba Informações Contratuais");
	        	   }
	        	  
	        	   if (vc.validaTipoAquisicao(sheetInfoContratuais.getCellAt(4, nRowIndex).getValue().toString())){
	        		   info.setTipoDeAquisicao(sheetInfoContratuais.getCellAt(4, nRowIndex).getValue().toString());
	        	   } else {
	        		   throw new RuntimeException("Favor corrigir a informação da célula da coluna \"Tipo de Aquisição\"  linha " + (nRowIndex + 1) + " da aba Informações Contratuais");
	        	   }
	        	   String valorPontoFuncaoString = sheetInfoContratuais.getCellAt(5, nRowIndex).getValue().toString();
	        	   Double valorPontoFuncaoDouble = Utils.isNumeric(valorPontoFuncaoString) ? new Double (valorPontoFuncaoString) : 0.0;
	        	   info.setValorPontoFuncao(valorPontoFuncaoDouble);
	        	   
	        	   String ValorDaAquisicaoString = sheetInfoContratuais.getCellAt(5, nRowIndex).getValue().toString();
	        	   Double valorDaAquisicaoDouble = Utils.isNumeric(ValorDaAquisicaoString) ? new Double (ValorDaAquisicaoString) : 0.0;
	        	   info.setValorDaAquisicao(valorDaAquisicaoDouble);
	        	   
	        	   String custoManutencaoAnualString = sheetInfoContratuais.getCellAt(5, nRowIndex).getValue().toString();
	        	   Double custoManutencaoAnualDouble = Utils.isNumeric(custoManutencaoAnualString) ? new Double (custoManutencaoAnualString) : 0.0;
	        	   info.setCustoManutencaoAnual(custoManutencaoAnualDouble);
	        	   
	        	   informacoesList.add(info);
	        	  
        	   } else {
        		   linhasEmBranco++;
        	   }
        	   
        	   if (linhasEmBranco == 5){
        		   break loop;
        	   } 
            }
           
           
           loopNecessidadeSOftware: for(int nRowIndex = 7; nRowIndex < nRowCountNecessidade; nRowIndex++)
           {
        	   String verificaConteudo = sheetNecessidades.getCellAt(2, nRowIndex).getValue().toString();
        	   if (verificaConteudo.length() > 0){
        		   necessidadeSoftware = new NecessidadeSoftware();
        		   necessidadeSoftware.setAreaMeio(sheetNecessidades.getCellAt(2, nRowIndex).getValue().toString());
        		   necessidadeSoftware.setDescricao(sheetNecessidades.getCellAt(3, nRowIndex).getValue().toString());
        		   System.out.println(sheetNecessidades.getCellAt(2, nRowIndex).getValue().toString());
        		   System.out.println(sheetNecessidades.getCellAt(3, nRowIndex).getValue().toString());
        		   necessidadeList.add(necessidadeSoftware);
        	   } else {
        		   linhasEmBrancoNecessidades++;
        	   }
        	   
        	   if (linhasEmBrancoNecessidades == 5){
        		   break loopNecessidadeSOftware;
        	   }
           }
           
           
           lista.setLista(informacoesList);
           lista.setListaNecessidade(necessidadeList);
          } catch (IOException e) {
            e.printStackTrace();
          }
      return lista;
    }
}
