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
        Funcionario funcionario2 = new Funcionario();
        Vendedor vendedor = new Vendedor();
        Vendedor vendedor2 = new Vendedor();
        
        //Construção do objeto funcionario
        funcionario.setNome("Flavinho do pneu");
        funcionario.setNumero(1);
        funcionario.setSalario(2500);
        
        funcionario.calcularSalario();
        
        //imprimindo Funcionario
        System.out.println("\n\t\t\t====== Apresentando Funcionário =====\n");
        funcionario.apresentarFuncionario();
        
         //imprimindo Funcionario2
        System.out.println("\n\t\t\t====== Apresentando Funcionário 2 =====\n");
        funcionario2.apresentarFuncionario();
        
        //criação do objeto vendedor
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
