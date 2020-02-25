package variable;
import java.util.*;
public class variable {
private String nom="Pablo";
private String apellidos="Herrera Amieva";
private String Edad="21";
public static void main(String [] args) {	
int l,m,c;
float a,b,d;
variable myObj = new variable();
System.out.println("Nombre: "+myObj.nom);
System.out.println("Apellidos: "+myObj.apellidos);
System.out.println("Edad: "+myObj.Edad);

Scanner teclado=new Scanner(System.in);
System.out.print("Ingresar un numero: ");
l=teclado.nextInt();
System.out.print("Ingresar un numero: ");
m=teclado.nextInt();
System.out.print("Ingresar un numero: ");
l=teclado.nextInt();
System.out.print("Ingresar un numero: ");
a=teclado.nextInt();
System.out.print("Ingresar un numero: ");
b=teclado.nextInt();
c=l+m;
d=a*b;
System.out.println("El resultado de la suma: "+c);
System.out.println("El resultado de la multiplicacion: "+d);
}
}
