package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	@DisplayName("test of the method concat")
	void concatTest() {
		String hello ="Hello";
		assertEquals("Hello World!!!",hello.concat(" World").concat("!!!"));
	}
	@Test
	void containsTest() { 
		String hello = "Hello";
		assertTrue(hello.contains("ell"));
		assertFalse( hello.contains("elo"));
	}
	//HW
	@Test
	void compareToTest() {
		String a = "a";
		String b = "b";
		String c = "c";
		String z = "z";
		assertEquals(-1,a.compareTo(b));
		assertEquals(-2,a.compareTo(c));
		assertEquals(-25,a.compareTo(z));
	}
	@Test
	void CompareToIgnoreCaseTest() {
		String mandarin ="mandarin";
		String MaNdarin ="MaNdarin";
		assertEquals(0,mandarin.compareToIgnoreCase(MaNdarin));
	}
	@Test
	void concatTest2 () {
		String Hello ="Hello";
		String everyone =" everyone";
		assertEquals("Hello everyone",Hello.concat(everyone));
	}
	@Test
	void startWithTest () {
		String Hello = "Hello";
		assertTrue(Hello.startsWith("Hell"));
		assertFalse(Hello.startsWith("Heaven"));
	}
	@Test 
	void endWiithTest() {
		String Corn ="Corn";
		assertFalse(Corn.endsWith("Hell"));
		assertTrue(Corn.endsWith("rn"));
	}
	@Test
	void testEqualsIgnoreCase () {
		String apple ="apple";
		String Apple = "Apple";
		assertTrue(apple.equalsIgnoreCase(Apple));
	}
	@Test
	 void indexOfTest () {
		String mandarin ="mandarin";
		assertEquals(1,mandarin.indexOf("a"));	
	}
	@Test 
	void lastIndexOfTest () {
		String mandarin ="mandarin";
		assertEquals(4,mandarin.lastIndexOf("a"));
		assertTrue(mandarin.lastIndexOf("a")==4);
	}
}
