
package util;

/**
 * @author Jonathan McFadden (mcfaddja@uw.edu)
 * @version 1.0
 * 
 * Utility class to run the code for prob1a.
 */
public class TheProb1aRunner {
    
    
// CLASS VARIABLES
    
    private final String myFileNameIN;
    
 
// CONSTRUCTOR(S)
    
    /**
     * Appropriately runs the code for this project using the specified path and file name.
     * 
     * @param theFileNameIN The path and file name of the text file to analyze.
     */
    public TheProb1aRunner(final String theFileNameIN) {
        myFileNameIN = theFileNameIN;
        
        testPrinter(myFileNameIN);
    }

    
// PUBLIC METHODS
    
    public void printer(final String theString) {
        System.out.println("printed from the caller of the Runner routine" + theString);
        
        testPrinter(myFileNameIN);
    }
 
// PRIVATE HELPERS
    
    private void testPrinter(final String theString) {
        System.out.println("printed from within Runner routine" + theString);
    }
    
}
