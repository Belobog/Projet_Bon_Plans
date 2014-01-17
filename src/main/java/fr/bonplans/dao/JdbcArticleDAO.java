package fr.bonplans.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import fr.bonplans.dao.interfaces.ArticleDAO;
import fr.bonplans.modele.Article;
import fr.bonplans.modele.Categorie;






public class JdbcArticleDAO implements ArticleDAO{

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insert(Article article) {
		String sql = "INSERT INTO Article " +
				"(titre,sous_titre,url_image,date_de_ecriture,date_de_modification) VALUES (?,?,?,?,?)";
		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, article.getTitre());
			ps.setString(2, article.getSous_titre());
			ps.setString(3, article.getUrl_image());
			ps.setString(4, article.getDate_de_ecriture());
			ps.setString(5, article.getDate_de_modification());


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
	
	public void register(Article article){
		insert(article);
		for(Categorie categorie : article.getCategories()){
			String sql = "INSERT INTO Article_to_Categorie " +
					"(id_article,id_categorie) VALUES (?,?)";
			Connection conn = null;
			try {
				conn = dataSource.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ps.setString(1, article.getId());
				ps.setString(2, categorie.getId());
				
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
	}

	/*
	public ArrayList<Categorie> selectAll(){
		ArrayList<Categorie> categories = new ArrayList<Categorie>();
		String sql = "SELECT * FROM Categorie";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			Categorie categorie = null;
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				categorie = new Categorie();
				categorie.setNom(rs.getString("nom"));
				categorie.setId(rs.getString("id"));
				categories.add(categorie);
				
			}
			rs.close();
			ps.close();
			return categories;
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
	*/

}
