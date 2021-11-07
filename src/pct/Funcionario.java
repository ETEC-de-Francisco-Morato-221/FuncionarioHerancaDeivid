/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pct;

/**
 *
 * @author Deivid
 */
public class Funcionario {
    
    //declaração de atributos
    private int numero;
    private String nome;
    private double salario;
    
    //metodos
    public void calcularSalario(){
        setSalario(getSalario() * 0.9);
        
    }
    public void apresentarFuncionario(){
        System.out.println("Número: " + getNumero());
        System.out.println("Nome: " + getNome());
        System.out.printf("Sálario: %.2f", getSalario());
        
    }

    //Geters e seters
    public int getNumero() {
        return numero;
    }

    
    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public double getSalario() {
        return salario;
    }

    
    public void setSalario(double salario) {
        this.salario = salario;
    }

    //Métodos contrutores
    public Funcionario(int numero, String nome, double salario) {
        this.numero = numero;
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {
        setNome("Funcionário não definido!");
    }
    

}
