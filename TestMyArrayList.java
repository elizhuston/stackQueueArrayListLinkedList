package arrayList;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestMyArrayList {
private MyArrayList<String> testArray;

	@Before
	public void setUpArray(){
		this.testArray= new MyArrayList<String>();
	}
	
	@Test
	public void testSetGetObject(){
		String fromArray;
		testArray.setObject("newyo", 0);
		fromArray=(String) this.testArray.getObject(0);
		assertEquals("newyo",fromArray);
		
		
	}
	@Test
	public void testSize(){
		int i=this.testArray.size();
		assertEquals(0,i);
	}
	@Test
	public void testAppendSingle(){
		String str ="Test";
		testArray.appendObject(str);
		String str2 = (String) testArray.getObject(0);
		assertEquals(str2,"Test");
	
	}
	@Test
	public void testAppendArray(){
	  String[] junk = new String[]{"test", "stuff"};
	  testArray.appendObject(junk);
	  String[] retJunk = new String[2];
	  retJunk[0]=(String) testArray.getObject(0);
	  retJunk[1]=(String) testArray.getObject(1);
	  int sz= testArray.size();
	  assertEquals(sz,2);
	  assertEquals(retJunk[0], "test");
	  assertEquals(retJunk[1], "stuff");
	}
	
	@Test
	public void testRemoveObject(){
		String[] junk = new String[]{"some","more","stuff"};
		testArray.appendObject(junk);
	    int sz=testArray.size();
	    testArray.removeObject(1);
		Object[] junkLess = new String[]{"some","stuff"};
		Object[] result = new String[]{(String) testArray.getObject(0),(String) testArray.getObject(1)};
	
	    assertArrayEquals (junkLess, result);
	}
}
