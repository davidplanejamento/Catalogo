package br.gov.planejamento.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class ConexaoBD {
	private static final String STR_DRIVER = "com.mysql.jdbc.Driver";
	private static final String USER = "root"; // usuario do database
	//private static final String PASSWORD = "DavidOli10"; // senha do database
	private static final String PASSWORD = "root"; // senha do database
	private static final String IP = "localhost";
	private static final String DATABASE = "catalogo";
	private static final String STR_CON = "jdbc:mysql://" + IP + ":3306/" + DATABASE + "?useSSL=false";

	public static Connection getConexao() throws SQLException {
		Connection conn = null;
		try {
			Class.forName(STR_DRIVER);
			conn = (Connection) DriverManager.getConnection(STR_CON, USER, PASSWORD);
		return conn;
	
		} catch (ClassNotFoundException e) {
			String errorMsg = "Driver nao encontrado";
			throw new SQLException(errorMsg, e);
		} catch (SQLException e) {
			String errorMsg = "Erro ao obter a conexao";
			throw new SQLException(errorMsg, e);
		}
	}	

	public static void closeAll(Connection conn) {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
