package org.example;

public class Main {
    public static void main(String[] args) {
        // Exemplos funcionários incompatíveis
        Funcionario funcionario1 = new Funcionario("Sétimo andar, 402", "Gabriel Souza", "Engenheiro de Software", "2000");
        // Exemplo funionário funcional
        Funcionario funcionario2 = new Funcionario("João Silva", "Analista de TI", 5000.0, "TI");

        // Exemplo de chamada de métodos para manipular o objeto
        System.out.println("Salário antes do aumento: " + funcionario1.getSalario());
        funcionario1.aplicarAumento(10); // Aumento de 10%
        System.out.println("Salário após o aumento: " + funcionario1.getSalario());

        // Alteração do cargo do funcionário
        funcionario1.setCargo("Gerente de TI");

        // Exemplo de criação de outro funcionário com diferentes valores de atributos
        Funcionario funcionario3 = new Funcionario("Maria Oliveira", "Analista Financeiro", 6000.0, "Financeiro");

        // Impressão dos detalhes dos funcionários
        System.out.println("Detalhes do Funcionário 1:");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Cargo: " + funcionario1.getCargo());
        System.out.println("Salário: " + funcionario1.getSalario());
        System.out.println("Departamento: " + funcionario1.getDepartamento());

        System.out.println("\nDetalhes do Funcionário 2:");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Cargo: " + funcionario2.getCargo());
        System.out.println("Salário: " + funcionario2.getSalario());
        System.out.println("Departamento: " + funcionario2.getDepartamento());
    }
}