package Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import Metadata.Engine;
import Model.Recomendado;


import jess.*;

public class Main {
	 static Scanner entradaEscaner = new Scanner(System.in); //Creación de un objeto Scanner
	 static Engine Rete;
	 static String nombre;
	 static int edad;
	 static	String aficion="";// de categorias
	 static	int movil; //1,2 o 3 dependiendo de la calidad del movil;
	 static	int precio; // 1,2 o 3 dependiendo del coste.
	 static	int duracion; // 1,2 o 3 dependiendo del tiempo que vayas a invertir en la aplicacion.
	
	public static void printArray(String[] array) {
		for (int i=0; i<array.length; i++) {
			System.out.print("" + i + " - " + array[i] + "\n");
		}
	}
	
	
	public static Recomendado[] ListToArray(List applist){
		int n = applist.size();
		Recomendado [] a = new Recomendado[n];
		Iterator itlist = applist.iterator();
		for(int i=0;i<n;i++){
			a[i]=(Recomendado)itlist.next();
		}
		return a;
	}
	
	public static void InsercionValoracion(Recomendado [] a){
	    //Primero lo pasamos a vector para poder ordenarlo con mas facilidad
		
		int n = a.length;
	    for (int i = 1; i <= n - 1; i++) {
	        Recomendado x = new Recomendado(a[i]);
	        int j = i - 1;
	        while (j >= 0 && x.getvaloracion() > (a[j]).getvaloracion()){
	        	a[j + 1] = a[j];
	            j = j - 1;
	        }
	        a[j + 1] = x;
	    }	
	}
	
	public static void InsercionDescargas(Recomendado [] a){
	    //Primero lo pasamos a vector para poder ordenarlo con mas facilidad
		
		int n = a.length;
	    for (int i = 1; i <= n - 1; i++) {
	        Recomendado x = new Recomendado(a[i]);
	        int j = i - 1;
	        while (j >= 0 && x.getnDescargas() > (a[j]).getnDescargas()){
	        	a[j + 1] = a[j];
	            j = j - 1;
	        }
	        a[j + 1] = x;
	    }	
	}
	
public static Iterator RelajarCondiciones(){
	try {
		Rete.ResetRete();
		if(duracion <3)	duracion++; //1º Relajamos duración
		else if(precio < 3) precio ++; // 2º El precio
		else edad++;
		Deffacts deffacts = new Deffacts("DatosJava", null, Rete.GetRete());
		Fact usuario= new Fact("Usuario", Rete.GetRete());
		usuario.setSlotValue("nombre", new Value(nombre, RU.STRING));
		usuario.setSlotValue("edad", new Value(edad, RU.INTEGER));
		usuario.setSlotValue("aficion", new Value(aficion, RU.STRING));	
		usuario.setSlotValue("movil", new Value(movil, RU.INTEGER));
		usuario.setSlotValue("precio", new Value(precio, RU.INTEGER));
		usuario.setSlotValue("duracion", new Value(duracion, RU.INTEGER));
		deffacts.addFact(usuario);
		Rete.GetRete().addDeffacts(deffacts);
		
		Iterator it2;
		it2=Rete.run();
		return it2;
			
	} catch (JessException e) {
		e.printStackTrace();
	}
	return null;

}

public static List ExtraerHechos(Iterator it){
	
	List aplicaciones = new ArrayList();
	Fact fact;
	String app="",categorias="";
	String nombreusuario;
	int valoracion=-1,nDescargas=-1;
	Value v0,v1,v3,v4,v5;
	

	while(it.hasNext()) {
		fact = (Fact)it.next();

		if(fact.getName().equalsIgnoreCase("MAIN::Recomendado")){
			try{	
				v0 = fact.get(0); //APP
				v1 =fact.get(1); //CATEGORIA
				v3 =fact.get(3); //DESCARGAS
				v4 =fact.get(4); //USUARIO
				v5 = fact.get(5); //VALORACION
				nombreusuario=v4.toString();
				app=v0.toString();
				categorias=v1.toString();
				valoracion=Integer.parseInt(v5.toString());
				nDescargas=Integer.parseInt(v3.toString());
				aplicaciones.add(new Recomendado(nombreusuario,app,categorias,valoracion,nDescargas));
				
			}
			catch (JessException e1) {
				e1.printStackTrace();
				return null;
			}	
		}
	}
	return aplicaciones;	
}
	
public static void printResults(String nombre, Iterator it) {
		
		List aplicaciones = ExtraerHechos(it);
		while (aplicaciones.size() < 5) {
			it=RelajarCondiciones();
			aplicaciones=ExtraerHechos(it);
		}

		Recomendado [] recomendaciones = ListToArray(aplicaciones); //Pasamos la lista a vector
		String opcion;
		do{
			entradaEscaner.nextLine();//Salto de carro;
			System.out.println(nombre + ", quieres ordenar por valoracíon (1) o por número de descargas (2):");
			opcion = entradaEscaner.nextLine(); 
			if(opcion.equals("1")){
				InsercionValoracion(recomendaciones);
			}
			else if (opcion.equals("2")){
				InsercionDescargas(recomendaciones);
			}
			}while(!opcion.equals("1") && !opcion.equals("2"));
	
		System.out.println(nombre + ", te recomendamos:");
		
		//for(int i=0;i<recomendaciones.length;i++){
		int n =recomendaciones.length;
		if(recomendaciones.length > 10) n=10;
		for(int i=0;i<n;i++){
			System.out.println(" ------>> "+ recomendaciones[i].getapp()+ " De la categoria: "+ recomendaciones[i].getcategorias() + " Total de descargas = " + recomendaciones[i].getnDescargas() + " Y valoracion: " + recomendaciones[i].getvaloracion());
		}

	}

public static void main(String[] args) {

		DemoDatabase database = new DemoDatabase();
		try {
			System.out.println("Cargando las reglas");
			Rete = new Engine(database);
		} catch (JessException e1) {
			System.out.println("Error de lectura del fichero de reglas");
			e1.printStackTrace();
			return;
		}
		
	String salir;
	
	do {
		//NOMBRE
		System.out.print("Introduce tu nombre: ");
		nombre = entradaEscaner.nextLine();
		
		//EDAD
		System.out.print("Introduce tu edad: ");
		edad = entradaEscaner.nextInt();
		
		
		//AFICIONES
		System.out.print("Introduce una de tus aficion (0-9): ");
		printArray(listaaficiones);

		int numaficion,totalaficiones=0;
		do{
		numaficion= entradaEscaner.nextInt();
			if(numaficion >= 0 && numaficion <10){
				aficion=listaaficiones[numaficion];
				totalaficiones++;
			}
		}
		while(totalaficiones<1);
		
		// MOVIL
		do{
			System.out.print("Introduce la calidad de tu smartphone (1-> Gama baja , 2-> Gama media, 3->Gama Alta) : ");
			movil = entradaEscaner.nextInt();
			}while(movil<1 && movil >3);
		
		do{
			System.out.print("Introduce el precio dispuesto a pagar por una aplicación  (1-> Gratis , 2-> 0€ - 5€, 3-> +5€ ): ");
			precio = entradaEscaner.nextInt();
			}while(precio <1 && precio >3);
		
		//DURACION
		do{
			System.out.println("Introduce el tiempo que sueles invertir en una aplicación.");
			System.out.print(" 1-> corta (<15 min), 2-> media (15-30 min), 3-> larga (+30  min): ");
			duracion = entradaEscaner.nextInt();
			}while(duracion <1 && duracion >3);
		
		try {
			Deffacts deffacts = new Deffacts("DatosJava", null, Rete.GetRete());
			Fact usuario= new Fact("Usuario", Rete.GetRete());
			usuario.setSlotValue("nombre", new Value(nombre, RU.STRING));
			usuario.setSlotValue("edad", new Value(edad, RU.INTEGER));
			usuario.setSlotValue("aficion", new Value(aficion, RU.STRING));	
			usuario.setSlotValue("movil", new Value(movil, RU.INTEGER));
			usuario.setSlotValue("precio", new Value(precio, RU.INTEGER));
			usuario.setSlotValue("duracion", new Value(duracion, RU.INTEGER));

			deffacts.addFact(usuario);
			Rete.GetRete().addDeffacts(deffacts);
			
		} catch (JessException e) {
			System.out.println("Error en la carga de reglas");
			e.printStackTrace();
		}
		
		Iterator it;
		try {
			it=Rete.run();
			printResults(nombre,it);
			
		} catch (JessException e) {
			System.out.println("Error en la ejecución");
			e.printStackTrace();
		}
		
		System.out.print("Deseas recibir otra recomendacion (S/N): ");
		salir = entradaEscaner.nextLine();
		
		while ( !salir.equalsIgnoreCase("S") && !salir.equalsIgnoreCase("N") ) 
		{
			System.out.print("Introduce una respuesta válida: ");
			salir = entradaEscaner.nextLine();
		
		}
		try {
			Rete.ResetRete();
		} catch (JessException e) {
			e.printStackTrace();
		}
			
		
	} while (!salir.equalsIgnoreCase("N"));
	
	System.out.println("Gracias por usar nuestro sistema de recomendacion de juegos. Adios!");
	entradaEscaner.close();
}


private static final String[] listaaficiones = {"Aire Libre", "Actualidad", "Cocinar", "Fiesta", "Ocio",
	"Cultura","Bienestar","Trabajo","Lectura","Automocion"};
}
