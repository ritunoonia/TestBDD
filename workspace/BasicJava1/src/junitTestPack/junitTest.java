package junitTestPack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll; 
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




class junitTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
	}

	@Test
	void test() {
		System.out.println("Test1");
	}



@Test
void test2() {
	String a = "Software Testing";
	String b = "Software Testing";
	Assert.assertEquals(a, b);
}


}


