package junit.tutorial.ex02.e01;



import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

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

	FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test
	void test() {
		List<String> result = fizzBuzz.createFizzBuzzList(16);
		assertIterableEquals(result, result);
		System.out.println(result);
	}

}
