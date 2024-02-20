package com.lovely.DependencyLookup;

public class EngineFactory {//resources of the engines
	public static Engine getEngine(String type) {
		if (type.equals("Turbo")){
			Engine eng=new TurboEngine();
			eng.setName("Turbo Engine");
			return  eng;
			
		}
		else{
			Engine eng=new PowerEngine();
			eng.setName("Power Engine");
			return eng;
			
		}
		
	}


}
