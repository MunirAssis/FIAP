package br.com.fiap.main;

import br.com.fiap.entities.cliente;

import br.com.fiap.entities.endereco;
import br.com.fiap.entities.produto;

public class testesistema {
    static void main (String[] args) {

        cliente objcliente = new cliente();
        endereco objendereco = new endereco();
        produto objproduto = new produto();

        //entradas clientes
        objcliente.setNome("Braufa");
        objcliente.setCpf("888.888.888/88");
        objcliente.setIdade(97);
        objcliente.setAltura(1.80);

        // entradas do endereco
        objendereco.setBairro("vila prudente");
        objendereco.setCep("03156-001");
        objendereco.setCidade("São Paulo");
        objendereco.setLogradouro("Avenida Vila ema");
        objendereco.setEstado("SP");
        objendereco.setNumero(1027);

        //SETando o endereço ao cliente
        objcliente.setEndereco(objendereco);

        // entradas do produtos
        objproduto.setCodigo(123);
        objproduto.setMarca("body");
        objproduto.setPreco(55.55);
        objproduto.setTipo("nike");

        //Saidas 
    }
}
