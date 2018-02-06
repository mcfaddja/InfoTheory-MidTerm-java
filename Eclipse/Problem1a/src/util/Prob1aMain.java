
package util;

/**
 * @author Jonathan McFadden (mcfaddja@uw.edu)
 * @version 1.0
 * 
 * Utility class to launch the running of the code for prob1a.
 */
public final class Prob1aMain {
	
	// /** Name of alphabet file. */
	/** The file name of the text file to analyze. */
	private static String myFileNameIN;
	
	/** Instance of myRunner class to run all required code. */
	private static TheRunner myRunner;
	
	/**
	 * Private constructor to prevent instantiation.
	 */
	private Prob1aMain() {
		//Private constructor
	}
    
	
    
    /**
     * @param theArgs The path and file name of the text file to analyze.
     */
    public static void main(final String theArgs) {
        myFileNameIN = theArgs;

        myRunner = new TheRunner(myFileNameIN);
        myRunner.printer(myFileNameIN);
    }

}
