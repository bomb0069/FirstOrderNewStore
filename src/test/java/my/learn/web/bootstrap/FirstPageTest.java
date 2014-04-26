package my.learn.web.bootstrap;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class FirstPageTest {
	@Test
	public void testFirstPage () {
		FirstPage firstPage = new FirstPage();
		assertTrue(firstPage.isFirst());
	}
}