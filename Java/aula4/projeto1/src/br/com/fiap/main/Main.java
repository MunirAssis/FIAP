package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

public class Main {
public static void main(String[] args) {
    Cliente cliente = new Cliente();
    Endereco endereco = new Endereco();
    cliente.setEndereco(endereco);

    Produto produto = new Produto();





    System.out.println("client:" + cliente.getNome() + "\n"
                    + "idade:" + cliente.getIdade()+ "\n"
                    + "altura:" + cliente.getAltura()+ "\n"
                    + "cpf:" + cliente.getCpf()+ "\n");

    System.out.println("produto:" + produto.getTipo()+ "\n"
                    + "Marca:" + produto.getMarca()+ "\n"
                    + "Preco:" + produto.getPreco()+ "\n"
                    + "Codigo:" + produto.getCodigo()+ "\n");

    System.out.println("rua:" + cliente.getEndereco().getLogradouro()+ "\n"
                    + "cidade:" + cliente.getEndereco().getCidade()+ "\n"
                    + "estado:" + cliente.getEndereco().getEstado()+ "\n"
                    + "cep:" + cliente.getEndereco().getCep()+ "\n"
                    + "numero:" + cliente.getEndereco().getNumero()+ "\n");
}
    }
