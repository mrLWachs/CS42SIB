
/** required package class namespace */
package testing;

import io.Output;
import testing.cs30s.ComputerScience30STest;
import testing.cs40s.ComputerScience40STest;
import testing.cs42sib.ComputerScience42SIBTest;
import testing.cs42sib.SearchingAndSortingTest;
import testing.testclass.TestingClassTest;

/**
 * Tester.java - description here...
 *
 * @author Mr. Wachs (login: lawrence.wachs)
 * @since Feb 15, 2018 
 * @instructor Mr. Wachs
 */
public class Tester 
{

    /** 
     * Default constructor for the class 
     */
    public Tester() {        
        new SearchingAndSortingTest();   
//        simpleVisualTest();
//        allVisualTests(); 
//        interfaceTest();
    }

    
    private void interfaceTest() {
        new TestingClassTest();
    }
    
    private void allVisualTests() {
        Output.init();
        Output.header("All testing",true,true);
        new ComputerScience30STest();
        new ComputerScience40STest();
        new ComputerScience42SIBTest();
        Output.header("All testing",false,true);        
        Output.flush();
    }

    private void simpleVisualTest() {
        Output.init();
        Output.header("All testing",true,true);
//        new ComputerScience30STest();
//        new ComputerScience40STest();
        new ComputerScience42SIBTest();
        Output.header("All testing",false,true);        
        Output.flush();
    }
    
}
