/**
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

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Test that the output is correct.
     */
    public void testApp()
    {
        assertEquals("\nHello CMIS 141. Java has some really cool tools."
          + "\n\nMy current toolset includes:"
          + "\n\tGit"
          + "\n\tGitHub"
          + "\n\tSublime Text"
          + "\n\tMaven"
          + "\n\tJUnit"
          + "\n\tJavadoc"
          + "\n\nIf you have a github account I'd love to follow you! Mine "
          + "is BenBunk or http://github.com/benbunk\n", App.getMessage());
    }
}
