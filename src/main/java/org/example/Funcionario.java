package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Funcionario {
    private String nome;
    private String area;
    private double salario;
    private String funcao;

    public Funcionario(String area, String nome, String funcao, double salario) {
        this.area = area;
        this.funcao = funcao;
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setfuncao(String funcao) {
        this.funcao = funcao;
    }

    public void aplicarAumento(double percentualAumento) {
        double aumento = salario * percentualAumento / 100;
        salario += aumento;
    }
}
