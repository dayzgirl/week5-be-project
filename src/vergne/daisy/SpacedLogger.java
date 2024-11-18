package vergne.daisy;

// Creates a class that implements the Logger interface
public class SpacedLogger implements Logger {
    @Override
    public void log(String message) {
        
    	//Prints the message with a space between the characters
    	System.out.println(addSpaces(message));
    }
    
    @Override
    public void error(String message) {
        //Prints "ERROR" followed by the spaced messaged
    	System.out.println("ERROR: " + addSpaces(message));
    }
    //Helper method to add the spaces. It's private because it only applies within this class
    private String addSpaces(String message) {
        
    	//split breaks the string into individual characters and String.join joins the characters back together with spaces
    	return String.join(" ", message.split(""));
    }
}