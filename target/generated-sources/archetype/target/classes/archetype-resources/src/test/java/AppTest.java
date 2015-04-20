#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
	
	 private Collection collection;
	 
	    @BeforeClass
	    public static void oneTimeSetUp() {
	        // one-time initialization code   
	    	System.out.println("@BeforeClass - oneTimeSetUp");
	    }
	 
	    @AfterClass
	    public static void oneTimeTearDown() {
	        // one-time cleanup code
	    	System.out.println("@AfterClass - oneTimeTearDown");
	    }
	 
	    @Before
	    public void setUp() {
	        collection = new ArrayList();
	        System.out.println("@Before - setUp");
	    }
	 
	    @After
	    public void tearDown() {
	        collection.clear();
	        System.out.println("@After - tearDown");
	    }
	 
	    @Test
	    public void testEmptyCollection() {
	        assertTrue(collection.isEmpty());
	        System.out.println("@Test - testEmptyCollection");
	    }
	 
	    @Test
	    public void testOneItemCollection() {
	        collection.add("itemA");
	        assertEquals(1, collection.size());
	        System.out.println("@Test - testOneItemCollection");
	    }
   
}
