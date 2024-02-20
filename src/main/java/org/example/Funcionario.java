package org.example;

import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Funcionario {
    private String area;
    private String funcao;

    private String nome;

    private double salario;

    public Funcionario(String area, String nome, String funcao, double salario) {
        if(!Objects.equals(area, "")){
            this.area = area;
        }
        else {
            throw new IllegalArgumentException("Área não pode ser nulo");
        }
        if(!Objects.equals(funcao, "")){
            this.funcao = funcao;
        }
        else {
            throw new IllegalArgumentException("Função não pode ser nulo");
        }
        if(!Objects.equals(nome, "")){
            this.nome = nome;
        }
        else {
            throw new IllegalArgumentException("Nome não pode ser nulo");
        }
        if(salario > 0){
            this.salario = salario;

        }
        else {
            throw new IllegalArgumentException("Salário tem de ser maior que 0");
        }
    }


    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        if(!Objects.equals(area, "")){
            this.area = area;
        }
        else {
            throw new IllegalArgumentException("Área não pode ser nulo");
        }
    }

    public String getFuncao() {
        return funcao;
    }

    public void setfuncao(String funcao) {
        if(!Objects.equals(funcao, "")){
            this.funcao = funcao;
        }
        else {
            throw new IllegalArgumentException("Função não pode ser nulo");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(!Objects.equals(nome, "")){
            this.nome = nome;
        }
        else {
            throw new IllegalArgumentException("Nome não pode ser nulo");
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if(salario > 0){
            this.salario = salario;

        }
        else {
            throw new IllegalArgumentException("Salário tem de ser maior que 0");
        }
    }

    public void aplicarAumento(double percentualAumento) {
        if(percentualAumento > 0){
            double aumento = salario * percentualAumento / 100;
            salario += aumento;
        }
        else {
            throw new IllegalArgumentException("Salário tem de ser maior que 0");
        }
    }
}
