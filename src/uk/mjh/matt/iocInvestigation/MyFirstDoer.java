/**
 * 
 */
package uk.mjh.matt.iocInvestigation;

/**
 * @author matt
 *
 */
public class MyFirstDoer implements Doer {
	
	private WriterFactory writerFactory;
	
	private static int nextId = 0;
	
	private int id;
	
	public MyFirstDoer(DataSource dataSource, Reader inCommands, Writer outCommands, Reader otherReader, WriterFactory writerFactory) {
		this.writerFactory = writerFactory;
		id = nextId++;
		dataSource.queryMeSomething();
		inCommands.read();
		outCommands.write("Something");
		otherReader.read();
	}

	/* (non-Javadoc)
	 * @see uk.mjh.matt.iocInvestigation.Doer#doSomething()
	 */
	@Override
	public void doSomething() {
		System.out.println(String.format("MyFirstDoer(%d).doSomething()", id));
		// Get a new Writer
		Writer writer = writerFactory.createWriter();
		writer.write("Something");
	}

}
