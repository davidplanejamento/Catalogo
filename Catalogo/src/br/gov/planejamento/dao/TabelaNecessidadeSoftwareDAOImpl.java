package br.gov.planejamento.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import br.gov.planejamento.bean.NecessidadeSoftware;

public class TabelaNecessidadeSoftwareDAOImpl implements TabelaNecessidadeSoftwareDAO{
	
	Connection conn = null;
	
	
	@Override
	public void insereInfo(String SIORG, NecessidadeSoftware necessidadeSoftware){
		try {
			conn = ConexaoBD.getConexao();
			
            PreparedStatement preparedStatement = conn.prepareStatement("INSERT INTO necessidadesorgao "
            		+ "(SIORG, areameio,descricao) "
            		+ "VALUES (?,?,?)");
            
            
            preparedStatement.setString(1, SIORG); 
        	preparedStatement.setString(2, necessidadeSoftware.getAreaMeio()); 
        	preparedStatement.setString(3, necessidadeSoftware.getDescricao());
            preparedStatement.executeUpdate();
            preparedStatement.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			ConexaoBD.closeAll(conn);
		}
	}
	
}
