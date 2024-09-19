package org.example;

public class Funcionario {
    private String nome;
    private String cpf;
    private int salarioBase;



    public Funcionario(String nome, int salarioBase, String cpf) {
        this.nome = nome;
        this.salarioBase = salarioBase;
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public int getSalarioBase() {
        return this.salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalarioBase(int salarioBase) {

        this.salarioBase = salarioBase;
    }


    public double calcularSalario() {
        return this.salarioBase;
    }
}
