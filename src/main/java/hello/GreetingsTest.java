package hello;

import junit.framework.Assert;

import org.junit.Test;

public class GreetingsTest {

	Greetings obj = new Greetings();
	@Test
	public void test1() {
		Assert.assertTrue(obj.sayHello("Manish").contains("Hello"));
	}
	
	@Test
	public void test2() {
		Assert.assertTrue(obj.sayHello("Manish").contains("Hello2"));
	}
	
	@Test
	public void test3() {
		Assert.assertTrue(obj.sayHello("Manish").contains("Hello"));
	}
	
	@Test
	public void test4() {
		Assert.assertTrue(obj.sayHello("Manish").contains("Hello"));
	}

}
