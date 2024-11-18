package vergne.daisy;

//This will test our logger implementations.
public class App {
    //Main method
	public static void main(String[] args) {
        
		//Creates instances of both logger types
		Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();
        
        //Tests asteriskLogger and spacedLogger respectively
		asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");
        
        
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }
}