package vergne.daisy;

// Creates a class that implements the Logger interface
public class AsteriskLogger implements Logger {
	@Override
	public void log(String message) {
        System.out.println("***" + message + "***");
    }
    
	// Indicates we're implementing the interface method
    @Override
    public void error(String message) {
        //This is going to print out the Error message with 3 * before and 3 * after
    	String errorMessage = "***Error: " + message + "***";
        //Creates a line of * that spans the length of the Error message
    	String asteriskBox = "*".repeat(errorMessage.length());
        //Top
    	System.out.println(asteriskBox);
        //Error message
    	System.out.println(errorMessage);
        //Bottom
    	System.out.println(asteriskBox);
    }

}
