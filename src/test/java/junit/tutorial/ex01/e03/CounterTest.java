package junit.tutorial.ex01.e03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CounterTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

Counter counter = new Counter();
	
	@Test
	void test1() {
		int result = counter.increment();
		assertEquals(1, result);
		System.out.println(result);
	}
	
	@Test
	void test2() {
		counter.increment();
		int result = counter.increment();
		assertEquals(2, result);
		System.out.println(result);
	}
	
	@Test
	void test3() {
		for(int i = 1; i <= 50; i++) {
			counter.increment();
		}
		int result = counter.increment();
		assertEquals(51, result);
		System.out.println(result);
	}

}
