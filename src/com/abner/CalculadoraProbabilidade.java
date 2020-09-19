package com.abner;

public class CalculadoraProbabilidade {

    private int numero_teste;
    private int numero_sucesso;
    private int tentativas;


    public CalculadoraProbabilidade(int numero_teste, int numero_sucesso, int tentativas) {
        this.numero_teste = numero_teste; // 10
        this.numero_sucesso = numero_sucesso; //6
        this.tentativas = tentativas; // 5
    }


    public float calculoBernoulli(float sucesso, int tentativas){
        return sucesso/tentativas;
    }


    public double CalculoBinomial(){
        float p = calculoBernoulli(1,tentativas);

        double resultado = CalculoCombinacao(numero_teste,numero_sucesso)*Math.pow(p,numero_sucesso)*Math.pow(1-p,numero_teste-numero_sucesso);

        return resultado*100;
    }

    private double CalculoFatorial(double n){
        double soma=1;
        for(double i=n; i>1; i--){
            soma = soma*i;
        }
        return soma;
    }

    private double CalculoCombinacao(double n, double k){

        return  CalculoFatorial(n)/(CalculoFatorial(n-k)*CalculoFatorial(k));
    }




}
