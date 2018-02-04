
package util;

/**
 * @author Jonathan McFadden (mcfaddja@uw.edu)
 * @version 1.0
 * 
 * Utility class to run the code for prob1a.
 */
public class TheRunner {
    
    
// CLASS VARIABLES
    
    private final String myFileNameIN;
    
 
// CONSTRUCTOR(S)
    
    /**
     * Appropriately runs the code for this project using the specified path and file name.
     * 
     * @param theFileNameIN The path and file name of the text file to analyze.
     */
    public TheRunner(final String theFileNameIN) {
        myFileNameIN = theFileNameIN;
        
        printer(myFileNameIN);
    }

    
// PUBLIC METHODS
    
    
 
// PRIVATE HELPERS
    
    private void printer(final String theString) {
        System.out.print(theString);
    }
}
