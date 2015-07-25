package br.com.fabricaweb;

import br.com.fabricaweb.persistencia.entidade.Usuario;
import br.com.fabricaweb.persistencia.jdbc.UsuarioDao;

public class TestUsuarioDao {

	public static void main(String[] args) {
		//testAlterar();
		//testCadastrar();
		testExclui();
	}
	
	public static void testExclui(){
		//criando o usuario
		Usuario u = new Usuario();
		u.setId(2);

		//cadastrando usuario no banco

		UsuarioDao uDao = new UsuarioDao();
		uDao.excluir(u);

		System.out.println("Deletado!");
	}
	public static void testAlterar(){
		//criando o usuario
		Usuario u = new Usuario();
		u.setId(6);
		u.setNome("dfdfdfdf");
		u.setLogin("fdfdfdf");
		u.setSenha("fdfddfd");

		//cadastrando usuario no banco

		UsuarioDao uDao = new UsuarioDao();
		uDao.alterar(u);

		System.out.println("Alterado!");
	}

	public static void testCadastrar(){
		//criando o usuario
		Usuario u = new Usuario();

		u.setNome("carapartoad");
		u.setLogin("maxdsdsdo");
		u.setSenha("maxdo");

		//cadastrando usuario no banco

		UsuarioDao uDao = new UsuarioDao();
		uDao.cadastrar(u);

		System.out.println("Cadastrado!");
	}

}
