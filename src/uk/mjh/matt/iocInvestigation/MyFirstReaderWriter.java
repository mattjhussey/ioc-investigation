/**
 * 
 */
package uk.mjh.matt.iocInvestigation;

/**
 * @author matt
 *
 */
public class MyFirstReaderWriter implements ReaderWriter {
	
	public MyFirstReaderWriter(Reader input, Writer output) {
		
	}
	
	public MyFirstReaderWriter(ReaderWriter source) {
		
	}

	/* (non-Javadoc)
	 * @see uk.mjh.matt.iocInvestigation.Writer#write(java.lang.String)
	 */
	@Override
	public void write(String message) {
		System.out.println("MyFirstReaderWriter.write()");
	}

	/* (non-Javadoc)
	 * @see uk.mjh.matt.iocInvestigation.Reader#read()
	 */
	@Override
	public String read() {
		System.out.println("MyFirstReaderWriter.read()");
		return "MyFirstReaderWriter.read()";
	}

}
