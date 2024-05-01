/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Marlene Juliana
 */

   class Cliente implements Comparable<Cliente> {
    private int codigo;
    private String nome;
    private String dataNasc;
    private String cpf;

    // Construtor
    public Cliente(int codigo, String nome, String dataNasc, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
    }
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getdataNasc() {
        return dataNasc;
    }

    public String getCpf() {
        return cpf;
    }
    
    public int compareTo(Cliente outroCliente) {
        return Integer.compare(this.codigo, outroCliente.getCodigo());
    }
}