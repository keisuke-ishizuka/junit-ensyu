package junit.tutorial.ex02.e03;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import junit.tutorial.ex02.e04.Range;

class RangeTest {

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
	
	@Nested
	class RangeTest01 {
		
		@ParameterizedTest
		@ValueSource(doubles = {0.0,10.5})
		void test(double n) {
			Range range = new Range(0.0, 10.5);
			assertTrue(range.contains(n));
		}
	}
	
	@Nested
	class RangeTest02 {
		
		@ParameterizedTest
		@ValueSource(doubles = {-0.1,10.6})
		void test(double n) {
			Range range = new Range(0.0, 10.5);
			assertFalse(range.contains(n));
		}
	}
	
	@Nested
	class RangeTest03 {
		
		@ParameterizedTest
		@ValueSource(doubles = {-5.1,5.1})
		void test(double n) {
			Range range = new Range(-5.1, 5.1);
			assertTrue(range.contains(n));
		}
	}
	
	
	@Nested
	class RangeTest04 {
		
		@ParameterizedTest
		@ValueSource(doubles = {-5.2,5.2})
		void test(double n) {
			Range range = new Range(-5.1, 5.1);
			assertFalse(range.contains(n));
		}
	}
	
}
