package org.example;

public class FuncionarioTempoIntegral extends Funcionario{

    private double bonus;

    public FuncionarioTempoIntegral(String nome, int salarioBase, String cpf, double bonus) {
        super(nome, salarioBase, cpf);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }


    @Override
    public double calcularSalario() {
        return getSalarioBase() + ((getSalarioBase() * getBonus()) / 100);
    }


    public void exibirInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Salário com bônus: " + calcularSalario());
    }

}
