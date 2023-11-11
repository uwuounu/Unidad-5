package practica2;
import java.util.Scanner;
public class Practica2 {

    public static void main(String[] args) {
        Scanner leerNumeros = new Scanner (System.in);
        double num1;
        double num2;
        
        System.out.println("DIME DOS NUMEROS Y HARE OPERACIONES CON ELLOS:");

        System.out.print("Primer numero: ");       
        num1 = leerNumeros.nextDouble();
        
        System.out.print("Segundo nuumero: ");
        num2= leerNumeros.nextDouble();
        
        System.out.println("-----------------------------");
        
        //IMPRIMIR RESULTADOS DE LOS METODOS
        //Lamar a los metodos con todo y parametros
        System.out.println("La suma es: "+Sumar(num1, num2));
        System.out.println("La resta es: "+Restar(num1, num2));       
        System.out.println("La divicion es: "+Dividir(num1, num2));
        System.out.println("La multiplicacion es: "+Multiplicar(num1, num2));
        System.out.println();
    }
    
    //METODO PARA HACER LA SUMA
    public static double Sumar (double num1, double num2){
        double suma = num1+num2;
        return suma;
    }
    
    //METODO PARA HACER LA RESTA
    public static double Restar (double num1, double num2){
        double resta = num1-num2;
        return resta;
    }
    
    //METODO PARA HACER LA DIVISION
    public static double Dividir (double num1, double num2){
        double division = num1/num2;
        return division;
    }
    
    //METODO PARA HACER LA MULTIPLICACION
    public static double Multiplicar(double num1, double num2){
        double multiplicacion= num1*num2;
        return multiplicacion;
    }   
}
