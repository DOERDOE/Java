import java.util.*;
import java.io.*;

public class Tarjeta{
	public static void main(String args[ ]){
		String nombre1;
		String nombre2;
		String apellido1;
		String apellido2;
		String edads;
		int edad=0;
		int edadrestante;
		int mesA;
		int diaA;
		String numerotarjeta1="";
		String numerotarjeta2="";
		String numerotarjeta3="";
		String numerotarjeta4="";
		int numtarjeta1=0;
		int numtarjeta2=0;
		int numtarjeta3=0;
		int numtarjeta4=0;
		int sumatoria2;
		int sumatoria;
		int numfalt;
		int var;
		int unouno;
		int unodos;
		int unotres;
		int unocuatro;
		int dosuno;
		int dosdos;
		int dostres;
		int doscuatro;
		int tresuno;
		int tresdos;
		int trestres;
		int trescuatro;
		int cuatrouno;
		int cuatrodos;
		int cuatrotres;
		int cuatrocuatro;
		int dia;
		int mes;
		System.out.println("Debe ingresar 2 nombres y 2 apellidos, su edad y su numero de tarjeta, separado tal y como esta en su tarjeta fisica");
		System.out.println("");
		dia=Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		mes=Calendar.getInstance().get(Calendar.MONTH);
		//Agregando Valores
		nombre1=args[0];
		nombre2=args[1];
		apellido1=args[2];
		apellido2=args[3];
		edads=(args[4]);
		edad=Integer.parseInt(edads);
		numerotarjeta1=(args[5]);
		numerotarjeta2=(args[6]);
		numerotarjeta3=(args[7]);
		numerotarjeta4=(args[8]);
		numtarjeta1=Integer.parseInt(numerotarjeta1);
		numtarjeta2=Integer.parseInt(numerotarjeta2);
		numtarjeta3=Integer.parseInt(numerotarjeta3);
		numtarjeta4=Integer.parseInt(numerotarjeta4);
		unouno=(((((args[5].charAt(0)) -48)*2)%10)+((((args[5].charAt(0)) -48)*2)/10));
		unodos=((((args[5].charAt(1)) -48)%10)+(((args[5].charAt(1)) -48)/10));
		unotres=(((((args[5].charAt(2)) -48)*2)%10)+((((args[5].charAt(2)) -48)*2)/10));
		unocuatro=((((args[5].charAt(3)) -48)%10)+(((args[5].charAt(3)) -48)/10));
		dosuno=(((((args[6].charAt(0)) -48)*2)%10)+((((args[6].charAt(0)) -48)*2)/10));
		dosdos=((((args[6].charAt(1)) -48)%10)+(((args[6].charAt(1)) -48)/10));
		dostres=(((((args[6].charAt(2)) -48)*2)%10)+((((args[6].charAt(2)) -48)*2)/10));
		doscuatro=((((args[6].charAt(3)) -48)%10)+(((args[6].charAt(3)) -48)/10));
		tresuno=(((((args[7].charAt(0)) -48)*2)%10)+((((args[7].charAt(0)) -48)*2)/10));
		tresdos=((((args[7].charAt(1)) -48)%10)+(((args[7].charAt(1)) -48)/10));
		trestres=(((((args[7].charAt(2)) -48)*2)%10)+((((args[7].charAt(2)) -48)*2)/10));
		trescuatro=((((args[7].charAt(3)) -48)%10)+(((args[7].charAt(3)) -48)/10));
		cuatrouno=(((((args[8].charAt(0)) -48)*2)%10)+((((args[8].charAt(0)) -48)*2)/10));
		cuatrodos=((((args[8].charAt(1)) -48)%10)+(((args[8].charAt(1)) -48)/10));
		cuatrotres=(((((args[8].charAt(2)) -48)*2)%10)+((((args[8].charAt(2)) -48)*2)/10));
		cuatrocuatro=((((args[8].charAt(3)) -48)%10)+(((args[8].charAt(3)) -48)/10));
		sumatoria=(((args[5].charAt(0)) -48)+((args[5].charAt(1)) -48)+((args[5].charAt(2)) -48)+((args[5].charAt(3)) -48)+((args[6].charAt(0)) -48)+((args[6].charAt(1)) -48)+((args[6].charAt(2)) -48)+((args[6].charAt(3)) -48)+((args[7].charAt(0)) -48)+((args[7].charAt(1)) -48)+((args[7].charAt(2)) -48)+((args[7].charAt(3)) -48)+((args[8].charAt(0)) -48)+((args[8].charAt(1)) -48)+((args[8].charAt(2)) -48));
		//sumatoria2=((((args[5].charAt(0)) -48)*2)+((args[5].charAt(1)) -48)+(((args[5].charAt(2))-48)*2)+((args[5].charAt(3)) -48)+(((args[6].charAt(0)) -48)*2)+((args[6].charAt(1)) -48)+(((args[6].charAt(2)) -48)*2)+((args[6].charAt(3)) -48)+(((args[7].charAt(0)) -48)*2)+((args[7].charAt(1)) -48)+(((args[7].charAt(2)) -48)*2)+((args[7].charAt(3)) -48)+(((args[8].charAt(0)) -48)*2)+((args[8].charAt(1)) -48)+(((args[8].charAt(2)) -48)*2));
		sumatoria2=(unouno+unodos+unotres+unocuatro+dosuno+dosdos+dostres+doscuatro+tresuno+tresdos+trestres+trescuatro+cuatrouno+cuatrodos+cuatrotres+cuatrocuatro);
		var=(args[8].charAt(3)) -48;
		numfalt=(sumatoria%10);
		if(args.length==9)
		{
			if(edad>=18)
			{
				/*System.out.println("Cuarto numero, cuarto conjunto "+var);
				System.out.println("Total de sumar todos los digitos "+sumatoria);
				System.out.println("Total de sumar todos los digitos, con los impares multiplicados por 2 y si son 2 digitos, separados sus digitos y sumados "+sumatoria2);
				System.out.println("Numero Correcto del Final "+numfalt);
				*/
			
				System.out.println("Datos Ingresados:");
				System.out.println("Dia: "+dia+" Mes "+mes);
				System.out.println("Nombre "+nombre1+" "+nombre2+" "+apellido1+" "+apellido2+" Edad "+edad );
				System.out.println("Numero de Tarjeta "+numerotarjeta1+" "+numerotarjeta2+" "+numerotarjeta3+" "+numerotarjeta4);
				// Si FUNCIONA :D => System.out.println("numero 4to."+(args[8].charAt(3)+""));
		//		System.out.println("Para ser correcto deben ser iguales el cuarto numero del cuarto conjunto y el numero correcto del final");
			//	System.out.println("Tambien la segunda sumatoria/10 debe dar 0");
						if ((var==numfalt) && ((sumatoria2%10)==0))
						{
							System.out.println("Su numero de tarjeta es correcto");
						}
						else
						{
							System.out.println("Su numero de tarjeta es Incorrecto");
						}

			
			}
			else
			{
			System.out.println("Usted es menor de Edad");
			System.out.println("Le faltan "+((18*12)-(edad*12))+" Meses y "+(30-dia)+" Dias Aproximadamente.");
			}	
		}
			if (args.length>=10)
			{
			System.out.println("Ha ingresado mas valores de los necesarios, repita su ingreso por favor");
			}		
	
	}
	
}


/* 							PASOS A SEGUIR:

Debe ingresarse "Java Tarjeta Nombre1 Nombre2 Apellido1 Apellido2 Edad Numero de tarjeta (donde Numero de Tarjeta son 4 conjuntos de 4 digitos a excepcion del ultimo, donde solo se ingresan 3)
 El cuarto numero del cuarto conjunto de la tarjeta sera el modulo de la division de la sumatoria de todos los anteriores divido 10
 Para comprobar la tarjeta, los numeros impares se multiplicaran por 2, en caso de que su numero adquiera un valor de 2 digitos, se debera tomar por separado ambos digitos y sumarlos
Verificar que sean 15 los digitos ingresados
CREAR UN PROCESO QUE HAGA:
PRIMERO:
Una comparacion entre el numero que Él ingreso y el numero que deberia ser su tarjeta
para esto, se deben comparar el ultimo digito del cuarto conjunto con el modulo de la division de la sumatoria





Luego, la siguiente operacion

 Que a los numeros impares se les sume multiplique por 2, y si su cantidad es de 2 digitos separarlos y que se sumen
*/

		