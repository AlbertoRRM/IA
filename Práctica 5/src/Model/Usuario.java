package Model;


public class Usuario {

	private String nombre;
	private int edad;
	//quitamos la economia porque con el slot de precio basta ( lo que estas dispuesto a pagar)
	// Quitamos la nacionalidad por ser demasiado especifico.
	//IDIOMAS lo hacia demasiado complejo
	private String aficion; // de categorias
	//Restricciones implicitas en la aficiones
	private int movil; //1,2 o 3 dependiendo de la calidad del movil;
	private int precio; // 1,2 o 3 dependiendo del coste.
	private int duracion; // 1,2 o 3;
	// 	Quitamos aplicaciones instaladas anteriormente por complejidad
	
	public Usuario(String anombre,int aedad,
		String aaficion,int amovil,int aprecio,int aduracion){
		nombre = anombre;
		edad= aedad;
		aficion=aaficion;
		movil=amovil;
		precio= aprecio;
		duracion=aduracion;
	}
	
	public String getNombre(){
		return nombre;
	}
	public int getEdad(){
		return edad;
	}
	public String getAficion(){
		return aficion;
	}
	public int getMovil(){
		return movil;
	}
	public int getPrecio(){
		return precio;
	}
	public int getDuracion(){
		return duracion;
	}
}
