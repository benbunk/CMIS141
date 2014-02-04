/**
 * HelloWorld Discussion Assignment.
 *
 * The HelloWorldDemo program is built to display a message to the end user.
 *
 * Javadoc Generated Documentation is available 
 * @see <a href="https://github.com/benbunk/CMIS141/HelloWorldDemo/target/apidocs/index.html">here.</a>
 *
 * @author Benjamin Bunk
 * HelloWorldDemo
 * CMIS 141 6980 Introductory Programming (2142)
 * Feb. 4, 2014
 */

package edu.umuc.cmis141.helloworlddemo;

/**
 * HelloWorldDemo Application Class.
 *
 */
public class App
{

    /**
     *
     * The main entry point to the program.
     *
     * This method encompasses all INPUT/OUTPUT.
     * For CALCULATION steps @see #getMessage() getMessage().
     *
     * @param args The array of String arguments passed in at runtime.
     *
     * @return void
     *
     */
    public static void main( String[] args )
    {
        System.out.println( App.getMessage() );
    } // End of main method.

    /**
     *
     * The message that will be displayed to the end user.
     *
     * This method ecompasses all CALCULATIONS.
     * For INPUT/OUTPUT steps @see #main(String[]) main(String[]).
     *
     * @return The String output.
     *
     */
    public static String getMessage() {
        return "\nHello CMIS 141. Java has some really cool tools."
          + "\n\nMy current toolset includes:"
          + "\n\tGit"
          + "\n\tGitHub"
          + "\n\tSublime Text"
          + "\n\tMaven"
          + "\n\tJUnit"
          + "\n\tJavadoc"
          + "\n\nIf you have a github account I'd love to follow you! Mine "
          + "is BenBunk or http://github.com/benbunk\n";
    } // End of getMessage method.

} // End of App class.
