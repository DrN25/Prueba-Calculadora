import java.util.*;

public class Calculadora {
	
	public int IngreseVariables1() {
	   System.out.print("Ingrese el primer número: ");
		 return scanner.nextInt();
	}
	
	public int IngreseVariables2() {
	  System.out.print("Ingrese el segundo número: ");
		return scanner.nextInt();
	}
	
	public String IngreseOperacion() {
	  System.out.print("Ingrese la operacion (+ para suma, - para resta, * para multiplicacion y / para division ): ");
		return scanner.next();
	}
	
	public int Calculadora(int a, String operacion, int b) {
	
	}
	
	public int Suma(int a, int b) { 
	
	}
	
	public int Resta(int a, int b) {
	
	}
	
	public int Multiplicacion(int a, int b) {
	  return a * b;
	}
	
	public int Division(int a, int b) {
	  if(b == 0){
	    return 0;
	  }
	  return a / b;
	}
	
	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int a = calculadora.IngreseVariables1();
		String operacion = calculadora.IngreseOperacion();
		int b = calculadora.IngreseVariables2();
		int resultado = calculadora.Calculadora(a, operacion, b);
		System.out.println("Resultado: " + resultado);
	}
}
