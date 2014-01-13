package fr.bonplans.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
				"(pseudo,email,password,nom,prenom,date_de_naissance,date_inscription,active) VALUES (?,?,?,?,?,?,?,?)";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, utilisateur.getPseudo());
			ps.setString(2, utilisateur.getEmail());
			ps.setString(3, utilisateur.getPassword());
			ps.setString(4, utilisateur.getNom());
			ps.setString(5, utilisateur.getPrenom());
			ps.setString(6, utilisateur.getDate_de_naissance());
			ps.setString(7, utilisateur.getDate_inscription());
			ps.setString(8, utilisateur.getActive());

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


	public boolean isEmailAvailable(String email){

		String sql = "SELECT count(*) AS nombre FROM UTILISATEUR WHERE email = ?";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, email);
			int resultat = 0;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				resultat = rs.getInt("nombre");
			}
			rs.close();
			ps.close();
			if(resultat > 0)return false;
			else return true;
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
