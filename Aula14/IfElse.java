package Aula14;

import java.util.Scanner;

public class IfElse {
 public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Entre com a sua idade: ");
    int idade = scan.nextInt();

    if (idade >= 18){
        System.out.println("Você é maior de idade :)");
    }else{
        System.out.println("Você é menor de idade :(");
   }

    //barato <= 10
   //10 < valor < 15 - pedir desconto
   //15 <= valor < 17 - pesquisar mais
   //>=17 - muito caro

    System.out.println("Entre com o preço do item");
    double valorpreço = scan.nextDouble();

    if(valorpreço <= 10){
        System.out.println("O Valor está barato!");

    }else if( valorpreço > 10 && valorpreço< 15){
        System.out.println("Você pode pedir um desconto");

    }else if(valorpreço >= 15 && valorpreço < 17){
        System.out.println("Você pode pesquisar mais");
    
    }else{
        System.out.println("Esta muito caro");
    }
  

  
   
 }

    
}