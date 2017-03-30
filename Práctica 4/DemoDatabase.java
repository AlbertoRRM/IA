package gov.sandia.jess.example.pricing.demo;

import gov.sandia.jess.example.pricing.model.Aplicaciones;
import gov.sandia.jess.example.pricing.Database;

import java.util.ArrayList;
import java.util.List;

/**
 * A toy implementation of the Database interface with some hard-coded order
 * data.
 */

/*
 * 	private String nombre;
	private Integer duracion; // 1,2 o 3 dependiendo de la duracion.Selecciona una o mas.
	private Integer valoracion;
	private Integer nDescargas;
	private String categoria;
	private Integer movil;// 1,2 o 3 dependiendo de la calidad necesaria del telefono.
	private Integer precio; //1,2 o 3;
 * */



public class DemoDatabase implements Database {

	private List apps;

	public DemoDatabase() {
		createApps();
	}

	private void createApps() {
		apps = new ArrayList();
		List duracion= new ArrayList();
		
		//Juegos
		apps.add(new Aplicaciones("Angry Birds",1,5,50000000,"Juegos",1,1));
		apps.add(new Aplicaciones("Minecraft",2,4,40000000,"Juegos",3,3));
		apps.add(new Aplicaciones("Geometry Dash",1,5,500000,"Juegos",2,1));
		apps.add(new Aplicaciones("CandyCrush",2,3,50000000,"Juegos",1,1));
		apps.add(new Aplicaciones("Monopoly",3,4,400000,"Juegos",2,2));
		apps.add(new Aplicaciones("Clash Of Clans",1,3,2000000,"Juegos",2,1));
		apps.add(new Aplicaciones("Hitman",3,2,100000,"Juegos",3,2));
		apps.add(new Aplicaciones("Pokemon GO",2,4,100000000,"Juegos",2,1));
		apps.add(new Aplicaciones("GTA: Vice City",3,4,1000000,"Juegos",3,3));
		apps.add(new Aplicaciones("Dungeon Hunter 5",3,4,5000000,"Juegos",3,1));
		
		// Redes sociales
		apps.add(new Aplicaciones("WhatsApp Messenger",5,1000000000000,"Redes sociales",1,1));
		apps.add(new Aplicaciones("Facebook Messenger",4,1000000000000,"Redes sociales",1,1));
		apps.add(new Aplicaciones("Skype",4,500000000,"Redes sociales",3,1));
		apps.add(new Aplicaciones("Telegram",3,500000000,"Redes sociales",1,1));
		apps.add(new Aplicaciones("Viber",2,500000000,"Redes sociales",1,1));
		apps.add(new Aplicaciones("Team Speak",3,500000,"Redes sociales",2,2));
		apps.add(new Aplicaciones("Instagram",5,1000000000000,"Redes sociales",1,1));
		apps.add(new Aplicaciones("Tinder",2,50000000,"Redes sociales",1,1));
		apps.add(new Aplicaciones("Snapchat",1,100000000,"Redes sociales",2,1));
		apps.add(new Aplicaciones("Badoo Premium",4,100000000,"Redes sociales",2,2));
		
		// Productividad
		apps.add(new Aplicaciones("Microsoft Word",4,100000000,"Productividad",1,1));
		apps.add(new Aplicaciones("Dropbox",4,500000000,"Productividad",1,1));
		apps.add(new Aplicaciones("Swype Keyboard",2,1000000,"Productividad",1,2));
		apps.add(new Aplicaciones("CCleaner",3,10000000,"Productividad",1,1));
		apps.add(new Aplicaciones("Adobe Acrobat Reader",5,100000000,"Productividad",1,1));
		apps.add(new Aplicaciones("ES File Explorer",3,100000000,"Productividad",1,2));
		apps.add(new Aplicaciones("Cam Scanner",5,500000,"Productividad",1,2));
		apps.add(new Aplicaciones("Text Grabber",4,50000000,"Productividad",1,3));
		apps.add(new Aplicaciones("SketchUp Viewer",3,10000,"Productividad",3,3));
		apps.add(new Aplicaciones("DU Battery Saver",2,100000,"Productividad",1,2));
		
		// Noticias
		apps.add(new Aplicaciones("RTVE Móvil",3,1000000,"Noticias",3,1));
		apps.add(new Aplicaciones("El País",3,1000000,"Noticias",1,1));
		apps.add(new Aplicaciones("News Reader Pro",5,1000,"Noticias",3,2));
		apps.add(new Aplicaciones("gReader Pro",4,50000,"Noticias",2,3));
		apps.add(new Aplicaciones("The Wall Street Journal",4,1000000,"Noticias",1,2));
		apps.add(new Aplicaciones("Daily Mail Plus",2,50000,"Noticias",2,1));
		apps.add(new Aplicaciones("Twitter",4,500000000,"Noticias",3,1));
		apps.add(new Aplicaciones("Radio COPE",2,100000,"Noticias",2,1));
		apps.add(new Aplicaciones("Flipboard",4,500000000,"Noticias",1,3));
		apps.add(new Aplicaciones("El Mundo",3,500000000,"Noticias",1,2));
		
		// Educación
		apps.add(new Aplicaciones("Duolingo",5,50000000,"Educación",3,1));
		apps.add(new Aplicaciones("TodoTest",3,1000000,"Educación",1,2));
		apps.add(new Aplicaciones("Peak",4,1000000,"Educación",2,2));
		apps.add(new Aplicaciones("Stellarium Mobile Sky Map",5,100000,"Educación",2,3));
		apps.add(new Aplicaciones("Reading Trainer",2,50000,"Educación",1,3));
		apps.add(new Aplicaciones("Human Anatomy Atlas",3,10000,"Educación",2,3));
		apps.add(new Aplicaciones("King of Maths Junior",1,10000,"Educación",2,1));
		apps.add(new Aplicaciones("Kahoot",4,1000000,"Educación",3,3));
		apps.add(new Aplicaciones("ClassDojo",2,5000000,"Educación",1,1));
		apps.add(new Aplicaciones("Babbel",5,10000000,"Educación",1,3));
		
		// Música
		apps.add(new Aplicaciones("Spotify",5,100000000,"Música",2,3));
		apps.add(new Aplicaciones("Shazam",3,100000000,"Música",1,2));
		apps.add(new Aplicaciones("SoundCloud",2,100000000,"Música",1,1));
		apps.add(new Aplicaciones("TuneIn Radio",4,100000000,"Música",3,2));
		apps.add(new Aplicaciones("iReal Pro",5,100000,"Música",2,3));
		apps.add(new Aplicaciones("Poweramp",4,1000000,"Música",3,1));
		apps.add(new Aplicaciones("Musicmatch Lyrics",5,10000000,"Música",1,1));
		apps.add(new Aplicaciones("Ultimate Guitar Tabs",4,1000000,"Música",3,3));
		apps.add(new Aplicaciones("Metronome Beats",1,10000,"Música",2,1));
		apps.add(new Aplicaciones("Tuner",3,10000,"Música",2,2));
		
		// Salud
		apps.add(new Aplicaciones("Period Tracker",5,50000000,"Música",1,2));
		apps.add(new Aplicaciones("Mi Fit",3,5000000,"Música",2,2));
		apps.add(new Aplicaciones("Cita Sanitaria Madrid",4,100000,"Música",1,1));
		apps.add(new Aplicaciones("iCare Health Monitor",2,500000,"Música",3,2));
		apps.add(new Aplicaciones("Quirónsalud",1,10000,"Música",2,3));
		
	}

	public List getAplicaciones() {
		return apps;
	}
}
