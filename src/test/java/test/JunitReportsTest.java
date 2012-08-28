package test;

import junit.framework.Assert;

import org.junit.Assume;
import org.junit.Ignore;
import org.junit.Test;

public class JunitReportsTest {

	@Test
	public void fails() {
		Assert.fail("This should fail");
	}

	@Test
	public void success() {}

	@Test
	@Ignore
	public void ignored() {}

	@Test
	public void assumptionFails () {
		Assume.assumeTrue(false);
	}

	@Test
	public void error() {
		throw new RuntimeException("Expected JUnit Error");
	}
}
