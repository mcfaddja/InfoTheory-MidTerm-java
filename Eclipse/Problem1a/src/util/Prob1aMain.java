
package util;

/**
 * @author Jonathan McFadden (mcfaddja@uw.edu)
 * @version 1.0
 * 
 * Utility class to launch the running of the code for prob1a.
 */
public final class Prob1aMain {

    private static String myFileNameIN;
    
    private static TheProb1aRunner myRunner;
    
    
    /**
     * Private constructor preventing instantiation.
     */
    private Prob1aMain() {
        throw new IllegalStateException();
    }
    
    
    /**
     * @param theFileNameIN The path and file name of the text file to analyze.
     */
    public static void main(final String[] theFileNameIN) {
        myFileNameIN = theFileNameIN[0];

        myRunner = new TheProb1aRunner(myFileNameIN);
        myRunner.printer(myFileNameIN);
    }

}
