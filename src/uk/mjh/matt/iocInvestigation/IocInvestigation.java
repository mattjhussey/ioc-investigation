/**
 * 
 */
package uk.mjh.matt.iocInvestigation;

/**
 * @author matt
 *
 */
public class IocInvestigation {
	
	final static int DOERS = 3;
	final static int DOSOMETHINGS = 3;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		handrolledBuild();
	}
	
	private static void handrolledBuild() {
		Reader reader1 = new MyFirstReader();		
		DataSource dataSource = new MyFirstDataSource(reader1);
		WriterFactory writerFactory = new MyFirstWriterFactory();
		
		for(int i = 0; i != DOERS; ++i) {
			Reader reader2 = new MySecondReader("Where");
			Writer writer1 = new MyFirstWriter();
			ReaderWriter readerWriter = new MyFirstReaderWriter(reader1, writer1);
			Doer doer = new MyFirstDoer(dataSource, readerWriter, readerWriter, reader2, writerFactory);
			for(int j = 0; j != DOSOMETHINGS; ++j) {
				doer.doSomething();
			}
		}
	}

}
