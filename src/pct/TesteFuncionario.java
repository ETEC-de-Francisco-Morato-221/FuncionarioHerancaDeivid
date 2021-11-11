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
public class TesteFuncionario {
    
    public static void main(String[] args) {
        //Criação das instancias
        
        
       
        
        
        //Construção do objeto funcionario
        Funcionario funcionario = new Funcionario();
        
        //imprimindo Funcionario
        System.out.println("\n\t\t\t====== Apresentando Funcionário =====\n");
        funcionario.calcularSalario();
        funcionario.apresentarFuncionario();
        
        //Construção do objeto funcionario2
        Funcionario funcionario2 = new Funcionario(1, "Flavinho do pneu", 2500);
        
        //imprimindo Funcionario2
        System.out.println("\n\t\t\t====== Apresentando Funcionário 2 =====\n");
        funcionario2.calcularSalario();
        funcionario2.apresentarFuncionario();
        
        //criação do objeto vendedor
        Vendedor vendedor = new Vendedor();
        
        
         //criação do objeto vendedor2
        Vendedor vendedor2 = new Vendedor();
        vendedor.setNome("Shaolin Matador de porcos");
        vendedor.setNumero(3);
        vendedor.setSalario(3000);
        
        //imprimindo vendedor
        System.out.println("\n\t\t\t====== Apresentando Vendedor =====\n");
        vendedor.apresentarVendedor();
        
        //imprimindo vendedor2
        System.out.println("\n\t\t\t====== Apresentando Vendedor 2 =====\n");
        vendedor2.apresentarVendedor();
    }
    
}
