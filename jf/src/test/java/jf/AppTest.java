package jf;

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
     * Rigourous Test :-)
     */
    public void testApp()
    {
        int Test, Test2;
        Test=App.max(3,2);
        Test2=App.max(6,8);
        System.out.println("Resultat 1: "+Test+" Resultat2: "+Test2);
        assertEquals(App.max(4,5),App.max(5,4));
    }
}
