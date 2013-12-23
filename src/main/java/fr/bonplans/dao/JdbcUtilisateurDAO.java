package fr.bonplans.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import fr.bonplans.dao.interfaces.UtilisateurDAO;
import fr.bonplans.modele.Utilisateur;

public class JdbcUtilisateurDAO implements UtilisateurDAO {
	
	
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	
	@Override
	public void register(Utilisateur utilisateur) {
		String sql = "INSERT INTO UTILISATEUR " +
				"(pseudo,email, role,password,nom,prenom,date_de_naissance,date_inscription) VALUES (?,?, ?,?,?,?,?,?)";
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, utilisateur.getPseudo());
			ps.setString(2, utilisateur.getEmail());
			ps.setString(3, utilisateur.getRole());
			ps.setString(4, utilisateur.getPassword());
			ps.setString(5, utilisateur.getNom());
			ps.setString(6, utilisateur.getPrenom());
			ps.setString(7, utilisateur.getDate_de_naissance());
			ps.setString(8, utilisateur.getDate_inscription());
			
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		
	}
	
	@Override
	public void insert(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		
	}

}
