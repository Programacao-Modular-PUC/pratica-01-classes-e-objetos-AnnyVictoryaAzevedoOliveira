/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

/**
 *
 * @author 1616749
 */

import java.util.Scanner;

public class ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                
            Scanner leitor = new Scanner(System.in)) {
            Pessoa[] pessoas = new Pessoa[10];
            
            String nomeAnterior = "";
            String sobrenomeAnterior = "";
            
            int a=0;
            
            for(int i=0; i<10;i++){
                System.out.println("Cadastro " + (i+1));
                
                System.out.println("Nome:");
                String nome = leitor.next();
                
                System.out.println ("Sobrenome:");
                String sobrenome = leitor.next();
                
                if (i > 0 && nome.equalsIgnoreCase(nomeAnterior) && sobrenome.equalsIgnoreCase(sobrenomeAnterior)) {
                    i = 10;
                } else {
                    
                    System.out.print("Dia de nascimento: ");
                    int dia = leitor.nextInt();
                    
                    System.out.print("Mes de nascimento: ");
                    int mes = leitor.nextInt();
                    
                    System.out.print("Ano de nascimento: ");
                    int ano = leitor.nextInt();
                    
                    System.out.print("Altura: ");
                    double altura = leitor.nextDouble();
                    
                    System.out.print("Peso: ");
                    double peso = leitor.nextDouble();
                    
                    Data data = new Data(dia, mes, ano);
                    
                    Pessoa p = new Pessoa(nome, sobrenome, altura, peso, data);
                    
                    p.calculaIMC();
                    
                    pessoas[i] = p;
                    
                    nomeAnterior = nome;
                    sobrenomeAnterior = sobrenome;
                    
                    a++;
                }
            }
            
            System.out.println("Dados:");
            
            for (int i = 0; i < a; i++) {
                
                Pessoa p = pessoas[i];
                
                System.out.println("Cadastro " + (i + 1) + ":");
                
                System.out.println("Nome completo: " + p.getNomeCompleto());
                
                System.out.println("Nome de referencia: " + p.getNomeReference());
                
                System.out.println("Idade: " + p.getIdade());
                
                System.out.println("Peso: " + p.getPeso());
                
                System.out.println("Altura: " + p.getAltura());
                
                System.out.println("IMC: " + String.format("%.2f", p.getImc()));
                
                System.out.println("Classificacao: " + p.informaObesidade());
            }
        }
    }
}

