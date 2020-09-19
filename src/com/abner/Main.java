package com.abner;

public class Main {

    /**
     *
     * Calculo binomial - Probabilidade e Estatísticas.
     *
     * Uma prova consta de 10 testes com 5 alternativas cada um sendo, apenas umas delas correta.
     * Um aluno que nada sabe a respeito da matéria avaliada, “chuta” uma resposta para cada teste.
     * Qual é a probabilidade de ele acertar exatamente 6 testes?
     *
     */

    public static void main(String[] args) {
        CalculadoraProbabilidade cal = new CalculadoraProbabilidade(10,6,5);
        System.out.print(cal.CalculoBinomial()+" % de chance");

    }
}
