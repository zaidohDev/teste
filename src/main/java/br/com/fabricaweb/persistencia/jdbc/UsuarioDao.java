package br.com.fabricaweb.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricaweb.persistencia.entidade.Usuario;

public class UsuarioDao {
	private Connection con = ConexaoFactory.getConnection();
	public void cadastrar(Usuario u) {
		String sql ="insert into usuarios (nome, login, senha) values (?, ?, ?)";
		try (PreparedStatement preparador = con.prepareStatement(sql)){;
		//substitui cada ? no comando SQL da variavel sql
		preparador.setString(1, u.getNome());
		preparador.setString(2, u.getLogin());
		preparador.setString(3, u.getSenha());
		//executa comando no banco
		preparador.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void alterar(Usuario u) {
		String sql ="update usuarios set nome=?, login=?, senha=? where id=?";
		try (PreparedStatement preparador = con.prepareStatement(sql)){;
		//substitui cada ? no comando SQL da variavel sql
		preparador.setString(1, u.getNome());
		preparador.setString(2, u.getLogin());
		preparador.setString(3, u.getSenha());
		preparador.setInt(4, u.getId());
		//executa comando no banco
		preparador.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	public void excluir(Usuario u) {
		String sql ="delete from usuarios where id=?";
		try (PreparedStatement preparador = con.prepareStatement(sql)){;
		//substitui cada ? no comando SQL da variavel sql
		preparador.setInt(1, u.getId());
		//executa comando no banco
		preparador.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	


}
