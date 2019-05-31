package hello;

import junit.framework.Assert;

import org.junit.Test;

public class GreetingsTest {

	Greetings obj = new Greetings();
	@Test
	public void test() {
		Assert.assertTrue(obj.sayHello("Manish").contains("Hello"));
	}

}
