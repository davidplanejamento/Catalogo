package br.gov.planejamento.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.gov.planejamento.bean.LevantamentoSistemas;

public class TabelaConsolidadaDAOImpl implements TabelaConsolidadaDAO{
	
	Connection conn = null;
	
	
	@Override
	public void insereInfo(String SIORG, LevantamentoSistemas levantamento){
		try {
			conn = ConexaoBD.getConexao();
			
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO TABELACONSOLIDADA "
            		+ "(SIORG, nomeSoftware,finalidadeDescricao,area,criticidade,categoria1,categoria2,"
            		+ "categoria3,compartilhar,motivoNaoCompartilhamento,nivelSatisfacao,situacao,"
            		+ "tipoDeAquisicao,valorPontoFuncao,valorDaAquisicao,custoManutencaoAnual,plataformaOperacional,"
            		+ "localHospedagem,sistemaOperacional,linguagemProgramacao,bancoDeDados,framework,integracoes) "
            		+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            
            
            preparedStatement.setString(1, SIORG); 
        	preparedStatement.setString(2, levantamento.getNomeSoftware()); 
        	preparedStatement.setString(3, levantamento.getFinalidadeDescricao());
        	preparedStatement.setString(4, levantamento.getArea());
        	preparedStatement.setString(5, levantamento.getCriticidade());
        	preparedStatement.setString(6, levantamento.getCategoria1());
        	preparedStatement.setString(7, levantamento.getCategoria2());
        	preparedStatement.setString(8, levantamento.getCategoria3());
        	preparedStatement.setBoolean(9, levantamento.isCompartilhar());
        	preparedStatement.setString(10, levantamento.getMotivoNaoCompartilhamento());
        	preparedStatement.setString(11, levantamento.getNivelSatisfacao());
        	preparedStatement.setString(12, levantamento.getSituacao());
        	preparedStatement.setString(13, levantamento.getTipoDeAquisicao());
        	preparedStatement.setDouble(14, levantamento.getValorPontoFuncao());
        	preparedStatement.setDouble(15, levantamento.getValorDaAquisicao());
        	preparedStatement.setDouble(16, levantamento.getCustoManutencaoAnual());
        	preparedStatement.setString(17, levantamento.getPlataformaOperacional());
        	preparedStatement.setString(18, levantamento.getLocalHospedagem());
        	preparedStatement.setString(19, levantamento.getSistemaOperacional());
        	preparedStatement.setString(20, levantamento.getLinguagemProgramacao());
        	preparedStatement.setString(21, levantamento.getBancoDeDados());
        	preparedStatement.setString(22, levantamento.getFramework());
        	preparedStatement.setString(23, levantamento.getIntegracoes());
            preparedStatement.executeUpdate();
            preparedStatement.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			ConexaoBD.closeAll(conn);
		}
	}
	
}
