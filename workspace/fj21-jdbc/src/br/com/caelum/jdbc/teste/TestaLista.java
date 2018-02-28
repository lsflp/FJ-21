package br.com.caelum.jdbc.teste;

import java.util.List;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaLista {
	
	public static void main(String[] args) {
		ContatoDao contatoDao = new ContatoDao();
		
		List<Contato> lista = contatoDao.getLista();
		
		for(Contato contato : lista) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("E-mail:" + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			System.out.println("Data de Nascimento: " + contato.getDataNascimento().getTime());
			System.out.println();
		}
	}
}
