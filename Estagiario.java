package org.example;

public class Estagiario extends Funcionario{
    private String instituicaoEnsino;
    private double bolsaAuxilio;

    public Estagiario(String nome, int salarioBase, String cpf, String instituicaoEnsino, double bolsaAuxilio) {
        super(nome, salarioBase, cpf);
        this.instituicaoEnsino = instituicaoEnsino;
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + getBolsaAuxilio();
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Instituicao: " + instituicaoEnsino);
        System.out.println("Bolsa Auxilio: " + bolsaAuxilio);
        System.out.println("Salário: " + getSalarioBase());
        System.out.println("Salário total: " + calcularSalario());
    }


}
