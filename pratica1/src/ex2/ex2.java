/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

/**
 *
 * @author 1616749
 */

import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;

public class ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leitor = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = leitor.next();

        System.out.print("Sobrenome: ");
        String sobrenome = leitor.next();

        System.out.print("Idade: ");
        int idade = leitor.nextInt();

        System.out.print("Altura: ");
        double altura = leitor.nextDouble();

        System.out.print("Peso: ");
        double peso = leitor.nextDouble();
        
        System.out.println("Data de Nascimento: ");
        String datanasc = leitor.next();

        Pessoa p = new Pessoa(nome, sobrenome, idade, altura, peso);

        double imc = p.calculaIMC();

        System.out.println("IMC: " + imc);
        System.out.println("Classificacao: " + p.informaObesidade());

        leitor.close();
    }
    
}
