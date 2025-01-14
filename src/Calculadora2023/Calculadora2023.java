package Calculadora2023;

import java.util.Scanner;

public class Calculadora2023 {

    public static void main(String[] args) {
    	
    	//Variáveis
        double num1, num2, resultado, modulo;
    
        
        //Instancias
        JonasOperacoes objJonas = new JonasOperacoes();
        raylsonOperacao objRaylson = new raylsonOperacao();  // Adicionado aqui
        RamonOperacoes objRamon = new RamonOperacoes();
        subsavio subtracao = new subsavio();
        
        
        //Início
        System.out.println("Digite o primeiro número: " );
        Scanner input = new Scanner (System.in);
        num1 = input.nextDouble();

        System.out.println("Digite o segundo número: " );
        num2=input.nextDouble();

        //Soma
        Soma somalarissa = new Soma ();
        resultado = somalarissa.soma(num1, num2);
        System.out.println("A soma é: " + resultado);
      
        modulo = somalarissa.modulo(resultado);
        System.out.println("O módulo é: " + modulo );

         //Savio 
         resultado = subtracao.subtrair(num1, num2);
         System.out.println("A subtração é: " + resultado);
         System.out.println("A área do retângulo é: " + objJonas.multiplicacao(num1, num2));


        // Multiplicação
         //Jonas >> Multiplicação
        System.out.println("A Multiplicação é: " + objJonas.multiplicacao(num1, num2));

        //Larissa
        System.out.println("O resultado truncado da multiplicação é:  " + objJonas.nomeMétodo(num1*num2));

        // Divisão Matheus
        DivisaoMatheus DivisaoMatheus = new DivisaoMatheus();
        if (num1 == 0 || num2 == 0) {
            System.out.println("Não é possível dividir por zero");
        } else
        System.out.println("A divisão é: " + DivisaoMatheus.divisao(num1, num2));

        
        //Jonas >> Hipotenusa
        System.out.println("A Hipotenusa dos lados A = " + somalarissa.modulo(num1) + " e B = " + somalarissa.modulo(num2) + " é = " + objJonas.Hipotenusa(num1, num2));
        
        //Jonas >> Binário
        Double somaResul = somalarissa.modulo(somalarissa.soma(num1, num2));
        System.out.println("O resultado da soma dos Inteiros recebido, em binário, é: " + somalarissa.numeroDecimalParaBinario(somaResul.intValue()));
        
        //Raylson >> Área do círculo
        objRaylson.AreaCirculo(num1, num2);  // Adicionado aqui
        
        //Ramon >> Raiz Quadrada
        System.out.println("A Raiz Quadarada da Soma dos números é: " + objRamon.CalcularRaizQuadrada(somalarissa.soma(num1, num2)) );
        
        //Ramon >> Raiz Cubica
        System.out.println("A Raiz Cúbica  da Soma dos números é: " + objRamon.CalcularRaizCubica(somalarissa.soma(num1, num2)) );
        
       //Ramon >> Hexadecimal
        objJonas.DoubleToHex(num1, num2);

        //Matheus Transformando a divisão em Inteiro
        if (num1 == 0 || num2 == 0) {
            System.out.println("Não é possível exibir o numeiro inteiro de uma divisão por zero");
        } else
        System.out.println("O resultado da divisão em inteiro é: " + DivisaoMatheus.divisãoInteiro(num1/num2));

        //Matheus Calculando a Raiz Quarta (implementado na classe RamonOperacoes)
        System.out.println("A raiz Quarta do número é: " + objRamon.CalcularRaizQuarta(somalarissa.soma(num1, num2)));

        //Fim


    }
}
