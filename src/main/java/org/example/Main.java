package org.example;

public class Main {
    public static void main(String[] args) {
        // Exemplos funcionários incompatíveis
            /*
                Funcionario funcionario3 = new Funcionario("Sétimo andar, 702", "Gabriel Souza", "Engenheiro de Software", "2000");
                Funcionario funcionario4 = new Funcionario(984, "Gabriel Souza", "Engenheiro de Software", 2000);
                Funcionario funcionario5 = new Funcionario("Sétimo andar, 702", GabrielSouza, "Engenheiro de Software", 2000);
                Funcionario funcionario6 = new Funcionario("Sétimo andar, 702", "Gabriel Souza", 23, "2000");
            */
        // Exemplo funionário funcional
        Funcionario funcionario1 = new Funcionario("Sétimo andar, 703", "Gabriel Souza", "Engenheiro de Software", 2000);
        Funcionario funcionario2 = new Funcionario("Quarto andar, 401", "Fernando Machado", "Engenheiro de Software", 3200);

        // Impressão dos detalhes dos funcionários
        System.out.println("Detalhes do Funcionário 1:");
        System.out.println("Nome: " + funcionario1.getNome());
        System.out.println("Área: " + funcionario1.getArea());
        System.out.println("Salário: " + funcionario1.getSalario());
        System.out.println("Função: " + funcionario1.getFuncao());

        System.out.println("\nDetalhes do Funcionário 2:");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Área: " + funcionario2.getArea());
        System.out.println("Salário: " + funcionario2.getSalario());
        System.out.println("Função: " + funcionario2.getFuncao());

        funcionario2.setNome("Fernando Maia");
        funcionario2.setfuncao("Cientista de dados");

        System.out.println("\nDetalhes do Funcionário 2:");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Área: " + funcionario2.getArea());
        System.out.println("Salário: " + funcionario2.getSalario());
        System.out.println("Função: " + funcionario2.getFuncao());

        /* testar erros
        funcionario2.setNome("");

        System.out.println("\nDetalhes do Funcionário 2:");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Área: " + funcionario2.getArea());
        System.out.println("Salário: " + funcionario2.getSalario());
        System.out.println("Função: " + funcionario2.getFuncao());

        funcionario2.setSalario(0);

        System.out.println("\nDetalhes do Funcionário 2:");
        System.out.println("Nome: " + funcionario2.getNome());
        System.out.println("Área: " + funcionario2.getArea());
        System.out.println("Salário: " + funcionario2.getSalario());
        System.out.println("Função: " + funcionario2.getFuncao());

         */

        // Exemplo de chamada de métodos para manipular o objeto
        System.out.println("\nSalário de " + funcionario1.getNome() + " antes do aumento: " + funcionario1.getSalario());
        funcionario1.aplicarAumento(10); // Aumento de 10%
        System.out.println("Salário de " + funcionario1.getNome() + " após o aumento: " + funcionario1.getSalario());

    }
}