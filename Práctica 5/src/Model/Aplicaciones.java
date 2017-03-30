package Model;


public class Aplicaciones {
	private String nombre;
	private int duracion; // 1,2 o 3 dependiendo de la duracion.Selecciona una o mas.
	private int valoracion;
	private int nDescargas;
	private String categoria;
	private int movil;// 1,2 o 3 dependiendo de la calidad necesaria del telefono.
	//Quitamos palabras clave
	private int precio; //1,2 o 3;
	private int edadminima;
	
	public Aplicaciones(String anombre,int aduracion,int avaloracion,
	int anDescargas,String acategoria,int amovil,int aprecio,int aedadminima){
		nombre = anombre;
		duracion = aduracion;
		valoracion = avaloracion;
		nDescargas = anDescargas;
		categoria = acategoria;
		precio = aprecio;
		movil = amovil;
		edadminima=aedadminima;
	}
	
	public String getNombre(){
		return nombre;
	}
	public int getDuracion(){
		return duracion;
	}
	public int getValoracion(){
		return valoracion;
	}
	public int getnDescargas(){
		return nDescargas;
	}
	public String getCategoria(){
		return categoria;
	}
	public int getPrecio(){
		return precio;
	}
	public int getMovil(){
		return movil;
	}
	public int getEdadMinima(){
		return edadminima;
	}
		
}
