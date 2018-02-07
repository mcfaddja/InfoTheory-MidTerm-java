
package util;

/**
 * @author Jonathan McFadden (mcfaddja@uw.edu)
 * @version 1.0
 * 
 * Utility class to launch the running of the code for Problem1b.
 */
public final class Problem1bMain {
	
	// /** Name of alphabet file. */
	/** The file name of the text file to analyze. */
	private static String myFileNameIN;
	
	/** Instance of myRunner class to run all required code. */
	private static TheProblem1bRunner myRunner;
	
	/**
	 * Private constructor to prevent instantiation.
	 */
	private Problem1bMain() {
		//Private constructor
	}
    
	
    
    /**
     * @param theArgs The path and file name of the text file to analyze.
     */
    public static void main(final String theArgs) {
        myFileNameIN = theArgs;

        myRunner = new TheProblem1bRunner(myFileNameIN);
        myRunner.printer(myFileNameIN);
    }

}
