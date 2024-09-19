package org.example;

public class FuncionarioMeioPeriodo extends Funcionario{
    private double horasTrabalhadas;
    private double valorPorHora;

    public FuncionarioMeioPeriodo(String nome, int salarioBase, String cpf, double horasTrabalhadas, double valorPorHora) {
        super(nome, salarioBase, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setValorPorHora(double valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (getHorasTrabalhadas() * getValorPorHora());
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salário por horas: " + calcularSalario());
    }
}
