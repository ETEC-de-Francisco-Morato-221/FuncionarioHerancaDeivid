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
public class Vendedor extends Funcionario{

    //Métodos
    double salario = getSalario(); 
    @Override
    public void calcularSalario() {
        super.calcularSalario();
    }
    
    //adiciona 5% ao salario
    public double percentualComissao(){
       return getSalario() * 1.05;
    }
    
    public void apresentarVendedor(){
        calcularSalario();
        super.setSalario(percentualComissao());
        apresentarFuncionario();
    }

    //Método construtor
    public Vendedor() {
        super.setNome("Vendedor não definido");
    }

      
   
}
