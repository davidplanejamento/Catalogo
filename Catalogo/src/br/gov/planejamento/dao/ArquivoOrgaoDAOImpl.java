package br.gov.planejamento.dao;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ArquivoOrgaoDAOImpl implements ArquivoOrgaoDAO{
	
	Connection conn = null;
	
	
	@Override
	public void insereArquivo(String SIORG, InputStream inputStream) {
		try {
			conn = ConexaoBD.getConexao();
			
			String sql = "INSERT INTO arquivoorgao (SIORG, arquivo) values (?,?)";
			PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, SIORG); 
            preparedStatement.setBinaryStream(2, inputStream);
            preparedStatement.executeUpdate();
            preparedStatement.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e.getMessage());
		} finally {
			ConexaoBD.closeAll(conn);
		}
	}
	
}
