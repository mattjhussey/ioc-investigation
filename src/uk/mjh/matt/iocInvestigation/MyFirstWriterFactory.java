/**
 * 
 */
package uk.mjh.matt.iocInvestigation;

/**
 * @author matt
 *
 */
public class MyFirstWriterFactory implements WriterFactory {
	
	private static int nextId = 0;
	
	private int id;
	
	public MyFirstWriterFactory() {
		id = nextId++;
	}

	/* (non-Javadoc)
	 * @see uk.mjh.matt.iocInvestigation.WriterFactory#createWriter()
	 */
	@Override
	public Writer createWriter() {
		System.out.println(String.format("MyFirstWriterFactory(%d).createWriter", id));
		return new MyFirstWriter();
	}

}
