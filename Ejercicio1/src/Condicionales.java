import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) throws Exception {

    Scanner teclado = new Scanner(System.in);
    System.out.println("Indicame que edad tienes y te indicaré en que nivel escolar te ubicas:");
    int edad = teclado.nextInt();


    if (edad<6 || edad>120){
        System.out.println("Por favor, indica una edad escolar más habitual.");
    }
    else if (edad<12){
        System.out.println("Genial! Estas en primaria");
    }
    else if (edad<16){
        System.out.println("Perfecto! Estas en la ESO");
    }
    else if (edad<18){
        System.out.println("Ya casi lo tienes! A finalizar el Bachilerato.");
    }
    else if (edad<22){
        System.out.println("Genial! Ya estás en la uni.");
    }
    else{
        System.out.println("Enhorabuena! Ya preparado para trabajar");
    }
}   
}
