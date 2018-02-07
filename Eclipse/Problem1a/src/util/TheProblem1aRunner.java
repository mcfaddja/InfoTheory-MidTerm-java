
package util;

/**
 * @author Jonathan McFadden (mcfaddja@uw.edu)
 * @version 1.0
 * 
 * Utility class to run the code for prob1a.
 */
public class TheRunner {
    
    
// CLASS VARIABLES
    /** Name of alphabet file. */
    private final String myFileNameIN;
    
 
// CONSTRUCTOR(S)
    
    /**
     * Appropriately runs the code for this project using the specified 
     * path and file name.
     * 
     * @param theFileNameIN The path and file name of the text file to analyze.
     */
    public TheRunner(final String theFileNameIN) {
        myFileNameIN = theFileNameIN;
        
        testME(myFileNameIN);
    }

    
// PUBLIC METHODS
    /**
     * Printing method for testing purposes.
     * 
     * @param theString The file name of the text file to analyze.
     */
    public void printer(final String theString) {
        System.out.println("This is printed from outside TheRunner" + theString);
    }
    
 
// PRIVATE HELPERS
    
    private void testME(final String theString) {
        this.printer("This is printed from inside TheRunner" + theString);
    }
}
