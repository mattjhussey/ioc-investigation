/**
 * 
 */
package uk.mjh.matt.iocInvestigation;

/**
 * @author matt
 *
 */
public class MyFirstReader implements Reader {
	
	private static int nextId = 0;
	
	private int id;
	
	public MyFirstReader() {
		id = nextId++;
	}

	/* (non-Javadoc)
	 * @see uk.mjh.matt.iocInvestigation.Reader#read()
	 */
	@Override
	public String read() {
		System.out.println(String.format("MyFirstReader(%d).read()", id));
		return null;
	}

}
