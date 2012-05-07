/**
 * 
 */
package uk.mjh.matt.iocInvestigation;

/**
 * @author matt
 *
 */
public class MyFirstDataSource implements DataSource {
	
	private static int nextId = 0;
	
	private int id;
	
	public MyFirstDataSource(Reader source) {
		id = nextId++;
	}

	/* (non-Javadoc)
	 * @see uk.mjh.matt.iocInvestigation.DataSource#queryMeSomething()
	 */
	@Override
	public String queryMeSomething() {
		System.out.println(String.format("MyFirstDataSource(%d).queryMeSomething()", id));
		return null;
	}

}
