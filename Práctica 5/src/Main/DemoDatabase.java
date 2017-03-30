package Main;


import java.util.ArrayList;
import java.util.List;

import Metadata.Database;
import Model.Aplicaciones;

/**
 * A toy implementation of the Database interface with some hard-coded order
 * data.
 */

public class DemoDatabase implements Database {

	private List apps;

	public DemoDatabase() {
		createApps();
	}

	private void createApps() {
		apps = new ArrayList();
		
		//Juegos
		apps.add(new Aplicaciones("Angry Birds",1,5,10000,"Juegos",1,1,12));
		apps.add(new Aplicaciones("Minecraft",3,4,40000,"Juegos",3,3,14));
		apps.add(new Aplicaciones("Geometry Dash",1,5,5000,"Juegos",2,1,11));
		apps.add(new Aplicaciones("CandyCrush",2,3,50000,"Juegos",1,1,16));
		apps.add(new Aplicaciones("Monopoly",3,4,4000,"Juegos",2,2,16));
		apps.add(new Aplicaciones("Clash Of Clans",2,3,20000,"Juegos",2,1,14));
		apps.add(new Aplicaciones("Hitman",3,2,2000,"Juegos",3,2,18));
		apps.add(new Aplicaciones("GTA: Vice City",3,4,1000000,"Juegos",3,3,18));
		apps.add(new Aplicaciones("Dungeon Hunter 5",3,4,5000000,"Juegos",3,1,16));
		
		/*
		 * 	private String nombre;
			private Integer duracion; // 1,2 o 3 dependiendo de la duracion.Selecciona una o mas.
			private Integer valoracion;
			private Integer nDescargas;
			private String categoria;
			private Integer movil;// 1,2 o 3 dependiendo de la calidad necesaria del telefono.
			private Integer precio; //1,2 o 3;
		 * */
		
		
		//Gastronomia
		
		apps.add(new Aplicaciones( "CHEF PRO",2,4,1000,"Gastronomia",1,2,14));
		apps.add(new Aplicaciones( "Recetas rápidas",1,3,50000 ,"Gastronomia",1,3,15));
		apps.add(new Aplicaciones( "Guía Gastronómica",3,2,500,"Gastronomia",1,1,13));
		apps.add(new Aplicaciones( "Tudo goso",1 ,5 ,10000000 ,"Gastronomia",2,1,16));
		apps.add(new Aplicaciones( "Recetas Master chef junior",2,3,1000,"Gastronomia",3,3,9));
		apps.add(new Aplicaciones( "Cocina Española",2 ,4 ,10000 ,"Gastronomia",2,1,14));
		apps.add(new Aplicaciones( "Just Eat ",2,5 ,1000000 ,"Gastronomia",1 ,1,18));
		apps.add(new Aplicaciones( "Deliveroo",1,4,500000 ,"Gastronomia",2,2,18));
		apps.add(new Aplicaciones( "McDonald`s",1,3,1000000 ,"Gastronomia",1,1,14));
		apps.add(new Aplicaciones( "Historia Cocina Peru",3,2,5000 ,"Gastronomia",1,2,14));
		apps.add(new Aplicaciones( "VIP gastronomicos",2 ,4 ,20000 ,"Gastronomia",2,3,18));
		
		//Viajes
		apps.add(new Aplicaciones( "Social Drive",2,4,1000000,"Viajes",2,2,18));
		apps.add(new Aplicaciones( "Google Earth",1,5,100000000,"Viajes",3,1,16));
		apps.add(new Aplicaciones( "Booking",3,3,10000000,"Viajes",2,2,18));
		apps.add(new Aplicaciones( "Ryanair",2,2,5000000,"Viajes",1,1,18));
		apps.add(new Aplicaciones( "MyTaxi",1,3,3000000,"Viajes",1,2,16));
		apps.add(new Aplicaciones( "Blabacar",2,4,20000000,"Viajes",2,1,16));
		apps.add(new Aplicaciones( "Skyscanner",3,5,10000000,"Viajes",3,3,14));
		apps.add(new Aplicaciones( "Airbnb",2,4,40000000,"Viajes",2,1,18));
		apps.add(new Aplicaciones( "Renfe Tickets",1,3,500000,"Viajes",1,2,16));
		apps.add(new Aplicaciones( "Metro madrid",1,4,500000,"Viajes",1,1,14));
		
		//Deportes
		
		apps.add(new Aplicaciones( "Marca",3,4,5000000,"Deportes",2,1,12));
		apps.add(new Aplicaciones( "Resultados futbol ",2,3,700000,"Deportes",1,1,12));
		apps.add(new Aplicaciones( "Bet365",3,2,600000,"Deportes",2,3,18));
		apps.add(new Aplicaciones( "NBA",2,3,1300000,"Deportes",2,2,16));
		apps.add(new Aplicaciones( "Quedadas Deportes",1,4,50000,"Deportes",1,1,16));
		apps.add(new Aplicaciones( "BeIN Connect",3,2,200000,"Deportes",3,2,18));
		apps.add(new Aplicaciones( "Runner Guide",2,4,1000000,"Deportes",2,2,14));
		apps.add(new Aplicaciones( "Senderismo",3,5,10000,"Deportes",1,2,14));
		apps.add(new Aplicaciones( "Hipodromo Online",2,4,600000,"Deportes",2,3,18));
		apps.add(new Aplicaciones( "Olimpicos Infor",1,3,90000,"Deportes",1,1,14));

		
		//Salud 
		
		
		apps.add(new Aplicaciones( "Sanitas",2,4,500000,"Salud",2,2,18));
		apps.add(new Aplicaciones( "ColesteTroll",1,1,20000,"Salud",2,1,18));
		apps.add(new Aplicaciones( "Pasos diarios",2,3,100000,"Salud",1,1,16));
		apps.add(new Aplicaciones( "Dietista",3,5,1000000,"Salud",2,3,18));
		apps.add(new Aplicaciones( "Alcoholimetro",1,2,60000,"Salud",1,1,18));
		apps.add(new Aplicaciones("Period Tracker",1,5,50000000,"Salud",1,2,14));
		apps.add(new Aplicaciones("Mi Fit",1,3,5000000,"Salud",2,2,15));
		apps.add(new Aplicaciones("Cita Sanitaria Madrid",1,4,100000,"Salud",1,1,16));
		apps.add(new Aplicaciones("iCare Health Monitor",2,2,500000,"Salud",3,2,16));
		apps.add(new Aplicaciones("Quirónsalud",3,1,10000,"Salud",2,3,18));
		

		
		// Redes sociales
		apps.add(new Aplicaciones("WhatsApp Messenger",1,5,800000000,"Redes sociales",1,1,14));
		apps.add(new Aplicaciones("Facebook Messenger",1,4,900000000,"Redes sociales",1,1,14));
		apps.add(new Aplicaciones("Skype",2,4,500000000,"Redes sociales",3,1,14));
		apps.add(new Aplicaciones("Telegram",1,3,500000000,"Redes sociales",1,1,14));
		apps.add(new Aplicaciones("Viber",1,2,500000000,"Redes sociales",1,1,14));
		apps.add(new Aplicaciones("Team Speak",2,3,500000,"Redes sociales",2,2,14));
		apps.add(new Aplicaciones("Instagram",1,5,900000000,"Redes sociales",1,1,14));
		apps.add(new Aplicaciones("Tinder",2,2,50000000,"Redes sociales",1,1,18));
		apps.add(new Aplicaciones("Snapchat",1,1,100000000,"Redes sociales",2,1,14));
		apps.add(new Aplicaciones("Badoo Premium",3,4,100000000,"Redes sociales",2,2,18));
		
		// Productividad
		apps.add(new Aplicaciones("Microsoft Word",3,4,100000000,"Productividad",1,1,14));
		apps.add(new Aplicaciones("Dropbox",1,4,500000000,"Productividad",1,1,14));
		apps.add(new Aplicaciones("Swype Keyboard",1,2,1000000,"Productividad",1,2,12));
		apps.add(new Aplicaciones("CCleaner",2,3,10000000,"Productividad",1,1,12));
		apps.add(new Aplicaciones("Adobe Acrobat Reader",3,5,100000000,"Productividad",1,1,12));
		apps.add(new Aplicaciones("ES File Explorer",1,3,100000000,"Productividad",1,2,12));
		apps.add(new Aplicaciones("Cam Scanner",2,5,500000,"Productividad",1,2,12));
		apps.add(new Aplicaciones("Text Grabber",1,4,50000000,"Productividad",1,3,12));
		apps.add(new Aplicaciones("SketchUp Viewer",2,3,10000,"Productividad",3,3,12));
		apps.add(new Aplicaciones("DU Battery Saver",1,2,100000,"Productividad",1,2,12));
		
		// Noticias
		apps.add(new Aplicaciones("RTVE Móvil",2,3,1000000,"Noticias",3,1,12));
		apps.add(new Aplicaciones("El País",1,3,1000000,"Noticias",1,1,14));
		apps.add(new Aplicaciones("News Reader Pro",3,5,1000,"Noticias",3,2,12));
		apps.add(new Aplicaciones("gReader Pro",3,4,50000,"Noticias",2,3,12));
		apps.add(new Aplicaciones("The Wall Street Journal",1,4,1000000,"Noticias",1,2,16));
		apps.add(new Aplicaciones("Daily Mail Plus",1,2,50000,"Noticias",2,1,14));
		apps.add(new Aplicaciones("Twitter",1,4,500000000,"Noticias",3,1,14));
		apps.add(new Aplicaciones("Radio COPE",2,2,100000,"Noticias",2,1,16));
		apps.add(new Aplicaciones("Flipboard",1,4,500000000,"Noticias",1,3,14));
		apps.add(new Aplicaciones("El Mundo",2,3,500000000,"Noticias",1,2,14));
		
		// Educación
		apps.add(new Aplicaciones("Duolingo",1,5,50000000,"Educación",3,1,14));
		apps.add(new Aplicaciones("TodoTest",2,3,1000000,"Educación",1,2,14));
		apps.add(new Aplicaciones("Peak",1,4,1000000,"Educación",2,2,14));
		apps.add(new Aplicaciones("Stellarium Mobile Sky Map",2,5,100000,"Educación",2,3,14));
		apps.add(new Aplicaciones("Reading Trainer",1,2,50000,"Educación",1,3,10));
		apps.add(new Aplicaciones("Human Anatomy Atlas",3,3,10000,"Educación",2,3,12));
		apps.add(new Aplicaciones("King of Maths Junior",1,1,10000,"Educación",2,1,12));
		apps.add(new Aplicaciones("Kahoot",3,4,1000000,"Educación",3,3,10));
		apps.add(new Aplicaciones("ClassDojo",1,2,5000000,"Educación",1,1,10));
		apps.add(new Aplicaciones("Babbel",2,5,10000000,"Educación",1,3,12));
		
		// Música
		apps.add(new Aplicaciones("Spotify",2,5,100000000,"Música",2,3,12));
		apps.add(new Aplicaciones("Shazam",1,3,100000000,"Música",1,2,12));
		apps.add(new Aplicaciones("SoundCloud",2,2,100000000,"Música",1,1,12));
		apps.add(new Aplicaciones("TuneIn Radio",1,4,100000000,"Música",3,2,12));
		apps.add(new Aplicaciones("iReal Pro",1,5,100000,"Música",2,3,14));
		apps.add(new Aplicaciones("Poweramp",2,4,1000000,"Música",3,1,14));
		apps.add(new Aplicaciones("Musicmatch Lyrics",1,5,10000000,"Música",1,1,13));
		apps.add(new Aplicaciones("Ultimate Guitar Tabs",3,4,1000000,"Música",3,3,12));
		apps.add(new Aplicaciones("Metronome Beats",1,1,10000,"Música",2,1,14));
		apps.add(new Aplicaciones("Tuner",1,3,10000,"Música",2,2,13));
		

	}

	public List getAplicaciones() {
		return apps;
	}
}
