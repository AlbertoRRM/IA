package Metadata;


import jess.*;

import java.util.Iterator;


public class Engine {
    public Rete engine;
    private Database database;

    public Engine(Database aDatabase) throws JessException {
        // Create a Jess rule engine
        engine = new Rete();
        engine.reset();
        database = aDatabase;
        engine.addAll(database.getAplicaciones());
        engine.batch("recomendador.clp");
        for(int i=0;i<5;i++){
        System.out.println();
        }
    }
    
    public void ResetRete() throws JessException{
    	
    	engine.clear();
        engine.reset();
        engine.addAll(database.getAplicaciones());
        engine.batch("recomendador.clp");
        for(int i=0;i<5;i++){
        System.out.println();
        }
    }

    
    public Iterator run() throws JessException{

    	engine.batch("recomendador.clp");
    	Iterator it = engine.listFacts();
    	return it;
    }
    
    public Rete GetRete(){
    	return this.engine;
    }
}