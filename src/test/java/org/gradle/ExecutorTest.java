package org.gradle;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ExecutorTest {
	@Test
	public void testHoge() {
		assertThat("hoge", is("hoge"));
	}
}
