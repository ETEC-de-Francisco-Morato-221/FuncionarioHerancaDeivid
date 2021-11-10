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
        
        Funcionario funcionario = new Funcionario();
       
        
        
        //Construção do objeto funcionario
        
        
        
        //imprimindo Funcionario
        System.out.println("\n\t\t\t====== Apresentando Funcionário =====\n");
        funcionario.calcularSalario();
        funcionario.apresentarFuncionario();
        
         //imprimindo Funcionario2
        System.out.println("\n\t\t\t====== Apresentando Funcionário 2 =====\n");
        Funcionario funcionario2 = new Funcionario(1, "Flavinho do pneu", 2500);
        funcionario.calcularSalario();
        funcionario2.apresentarFuncionario();
        
        //criação do objeto vendedor
        Vendedor vendedor = new Vendedor();
        Vendedor vendedor2 = new Vendedor();
        vendedor.setNome("Flavinho vendedor de pneu");
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
