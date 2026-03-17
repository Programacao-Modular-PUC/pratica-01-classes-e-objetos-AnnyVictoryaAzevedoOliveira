/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

import java.util.Calendar;

/**
 *
 * @author 1616749
 */

public class Pessoa {
    private String nome;
    private String sobrenome;
    private int idade;
    private double altura;
    private double peso;
    private double imc;
    private Data datanasc;


    public Pessoa(String nome, String sobrenome, double altura, double peso, Data datanasc){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.altura = altura;
        this.peso = peso;
        this.datanasc = datanasc;
        this.idade = calculaIdade();
    }

    public double calculaIMC() {
        setImc(getPeso() / (getAltura() * getAltura()));
        return getImc();
    }

    public String informaObesidade() {

        if (getImc() < 18.5) {
            return "Abaixo do peso";
        } else if (getImc() <= 24.9) {
            return "Peso normal";
        } else if (getImc() <= 29.9) {
            return "Sobrepeso";
        } else if (getImc() <= 34.9) {
            return "Obesidade grau 1";
        } else if (getImc() <= 39.9) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }

    }
    
    public int calculaIdade(){
        Calendar hoje = Calendar.getInstance();
        
        int anoAtual = hoje.get(Calendar.YEAR);
        int mesAtual = hoje.get(Calendar.MONTH) +1;
        int diaAtual = hoje.get(Calendar.DAY_OF_MONTH);
        
        int idade = anoAtual - datanasc.getAno();
       
        if ((mesAtual < datanasc.getMes()) || (mesAtual == datanasc.getMes() && diaAtual < datanasc.getDia())) {
            idade --;
        }
        
      return idade;
    }

    public String getNomeCompleto() {
        return getNome() + " " + getSobrenome();
    }
    
    public String getNomeReference(){
        return sobrenome + "," + nome.toUpperCase();
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the imc
     */
    public double getImc() {
        return imc;
    }

    /**
     * @param imc the imc to set
     */
    public void setImc(double imc) {
        this.imc = imc;
    }
    
    public Data getDatanasc() {
        return datanasc;
    }
    
    public void setDatanasc(Data datanasc) {
        this.datanasc = datanasc;
    }
    
}
    
