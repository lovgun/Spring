package com.lovely.springDependencyLookupManually1;

public class EngineFactory {
	public static Engine getEngine(String type){
		if(type.equals("turbo")){
			Engine eng=new TurboEngine();
			eng.setName("TurboEngine");
		return eng;
	}
	else{
		Engine eng=new PowerEngine();
		eng.setName("PowerEngine");
	return eng;
		

}
}

}