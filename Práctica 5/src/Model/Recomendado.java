package Model;

public class Recomendado {
	private String usuario;
	private String app;
	private String categorias;
	private int valoracion;
	private int nDescargas;

	
	
	public Recomendado (String anombreuser,String anombreapp,String acategoria,
	int avaloracion,int andescargas){
		usuario= anombreuser;
		app= anombreapp;
		categorias= acategoria;
		valoracion = avaloracion;
		nDescargas=andescargas;
	}
	public Recomendado(Recomendado copy){
		usuario=copy.getusuario();
		app=copy.getapp();
		categorias=copy.getcategorias();
		valoracion=copy.getvaloracion();
		nDescargas=copy.getnDescargas();
	}
	
	public String getusuario(){
		return usuario;
	}
	public String getapp(){
		return app;
	}
	public int getvaloracion(){
		return valoracion;
	}
	public int getnDescargas(){
		return nDescargas;
	}
	public String getcategorias(){
		return categorias;
	}

}
