
package util;

/**
 * @author Jonathan McFadden (mcfaddja@uw.edu)
 * @version 1.0
 * 
 * Utility class to launch the running of the code for prob1a.
 */
public class Prob1aLauncher {

    private static String myFileNameIN;
    
    private static TheRunner myRunner;
    /**
     * @param theFileNameIN The path and file name of the text file to analyze.
     */
    public static void main(final String theFileNameIN) {
        myFileNameIN = theFileNameIN;

        myRunner = new TheRunner(myFileNameIN);
    }

}
