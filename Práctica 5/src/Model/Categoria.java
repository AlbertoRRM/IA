package Model;


public class Categoria {
	private String nombre;
	private String categoria;
	
	public Categoria(String anombreuser,String acategoria){
		nombre=anombreuser;
		categoria=acategoria;
	}
	
	public String getNombre(){
		return nombre;
	}
	public String getCategoria(){
		return categoria;
	}
}
