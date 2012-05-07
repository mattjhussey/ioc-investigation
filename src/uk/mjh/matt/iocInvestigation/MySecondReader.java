/**
 * 
 */
package uk.mjh.matt.iocInvestigation;

/**
 * @author matt
 *
 */
public class MySecondReader implements Reader {
	
	public MySecondReader(String readFromWhere) {
		
	}

	/* (non-Javadoc)
	 * @see uk.mjh.matt.iocInvestigation.Reader#read()
	 */
	@Override
	public String read() {
		System.out.println("MySecondReader.read()");
		return "MySecondReader.read()";
	}

}
