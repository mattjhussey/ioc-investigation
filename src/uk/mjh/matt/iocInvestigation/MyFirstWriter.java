/**
 * 
 */
package uk.mjh.matt.iocInvestigation;

/**
 * @author matt
 *
 */
public class MyFirstWriter implements Writer {
	
	private static int nextId = 0;
	
	private int id;
	
	public MyFirstWriter() {
		id = nextId++;
	}

	/* (non-Javadoc)
	 * @see uk.mjh.matt.iocInvestigation.Writer#write(java.lang.String)
	 */
	@Override
	public void write(String message) {
		System.out.println(String.format("MyFirstWriter(%d).write", id));
	}

}
