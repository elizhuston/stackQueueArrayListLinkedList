package arrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fromArray;
		Object[] junk = new Object[]{"test", "stuff"};
		Object[] trash = new Object[]{"Oscar", "compost"};
		MyArrayList testArray= new MyArrayList();
		junk[0] = "yo";
		testArray.appendObject(junk[0]);		
		testArray.appendObject(trash);	
		testArray.setObject("newyo", 0);
		System.out.println(testArray.getObject(0));
		fromArray=(String) testArray.getObject(2);
		System.out.println(testArray.getObject(2));
	}

}
