package com.example.demo.everythingBecauseItsBasic;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class GerenciadoraClientesTest_Ex1 {

	@Test
	public void testPesquisaCliente() {

		// criando alguns clientes
		Cliente cliente01 = new Cliente(1, "Gustavo Farias", 31, "gugafarias@gmail.com", 1, true);
		Cliente cliente02 = new Cliente(2, "Felipe Augusto", 34, "felipeaugusto@gmail.com", 2, true);
		
		// inserindo os clientes criados na lista de clientes do banco
		List<Cliente> clientesDoBanco = new ArrayList<>();
		clientesDoBanco.add(cliente01);
		clientesDoBanco.add(cliente02);
		
		GerenciadoraClientes gerClientes = new GerenciadoraClientes(clientesDoBanco);
		
		Cliente cliente = gerClientes.pesquisaCliente(1);

		assertThat(cliente.getId()).isEqualTo(1); // Use isEqualTo para comparar valores inteiros
		assertThat(cliente.getEmail()).isEqualTo("gugafarias@gmail.com");


	}

}
