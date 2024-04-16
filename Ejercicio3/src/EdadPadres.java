import java.util.Scanner;

public class EdadPadres {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Como se llama tu madre?");
        String nombreMadre = teclado.nextLine();

        System.out.println("¿Cuantos años tiene "+nombreMadre+"?");
        int edadMadre = teclado.nextInt();
        //Esto hay que añadirlo porque el teclado después de leer un entero, introduce un salto de línea.
        //Esto provoca que cuando recogemos el nombrePadre lo deja en blanco (enter)
        teclado.nextLine();
        System.out.println("¿Como se llama tu padre?");
        String nombrePadre = teclado.nextLine();
        
        System.out.println("¿Cuantos años tiene "+nombrePadre+"?");
        int edadPadre = teclado.nextInt();

        float media = (float) (edadMadre+edadPadre)/2;

        System.out.println("Tu madre se llama "+nombrePadre+" y tiene "+edadMadre+", y tu padre se llama "+nombrePadre+" y tiene "+edadPadre+". La media de sus edades es "+media);


        // teclado.close();
    }
}
