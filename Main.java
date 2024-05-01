/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Marlene Juliana
 */
public class Main {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        // Solicita ao usuário os dados do cliente e adiciona à lista
        System.out.println("Cadastro de Clientes");
        while (true) {
            System.out.print("Informe o codigo do cliente (ou digite -1 para encerrar): ");
            int codigo = scanner.nextInt();
            if (codigo == -1) {
                break;
            }
            scanner.nextLine(); // Limpar o buffer
            System.out.print("Informe o nome do cliente: ");
            String nome = scanner.nextLine();
            System.out.print("Informe a data de nascimento do cliente (DD/MM/AAAA): ");
            String dataNascimento = scanner.nextLine();
            System.out.print("Informe o CPF do cliente: ");
            String cpf = scanner.nextLine();

            Cliente cliente = new Cliente(codigo, nome, dataNascimento, cpf);
            clientes.add(cliente);
        }

        // Ordena os clientes pelo código
        Collections.sort(clientes);

        // Imprime os clientes ordenados
        System.out.println("\nClientes cadastrados (ordenados por codigo):");
        for (Cliente cliente : clientes) {
            System.out.println("Codigo: " + cliente.getCodigo() + ", Nome: " + cliente.getNome() +
                    ", Data de Nascimento: " + cliente.getdataNasc() + ", CPF: " + cliente.getCpf());
        }

        // Solicita ao usuário o código do cliente a ser pesquisado
        System.out.print("\nDigite o codigo do cliente para pesquisa: ");
        int codigoPesquisa = scanner.nextInt();

        // Realiza uma pesquisa linear para encontrar o cliente
        Cliente clienteEncontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == codigoPesquisa) {
                clienteEncontrado = cliente;
                break;
            }
        }

        // Exibe os dados do cliente encontrado (ou mensagem de não encontrado)
        if (clienteEncontrado != null) {
            System.out.println("Cliente encontrado:");
            System.out.println("Codigo: " + clienteEncontrado.getCodigo() + ", Nome: " + clienteEncontrado.getNome() +
                    ", Data de Nascimento: " + clienteEncontrado.getdataNasc() + ", CPF: " + clienteEncontrado.getCpf());
        } else {
            System.out.println("Cliente nao encontrado.");
        }

        scanner.close();
    }
}
