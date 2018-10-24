import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class sampleTest {
	private sample tester;

	@Before
	/** Fixture */
	public void setUp() {
		tester = new sample();
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}



	@Test /** Test */
	public void testSample() {
		sample.main(new String[] {"arg1", "arg2", "arg3"});
	}
}