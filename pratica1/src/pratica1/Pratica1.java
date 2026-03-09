/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica1;

import java.util.Scanner;

/**
 *
 * @author 1616749
 */
public class Pratica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        TrianguloRetangulo triangulo = new TrianguloRetangulo();
        
        System.out.println("Digite o valor do cateto 1:");
        triangulo.setC1(leitor.nextDouble());
        
        System.out.println("Digite o valor do cateto 2:");
        triangulo.setC2(leitor.nextDouble());
        
        double hipotenusa = triangulo.calculaHipotenusa();
        double area= triangulo.calculaArea();
        
        System.out.println("Hipotenusa:" +hipotenusa);
        System.out.println("Area:" +area);
        
        leitor.close();
    }
    
}
