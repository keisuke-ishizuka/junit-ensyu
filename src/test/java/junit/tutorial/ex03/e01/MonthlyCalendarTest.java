package junit.tutorial.ex03.e01;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MonthlyCalendarTest {

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

	@Test
	@DisplayName("システム時間に依存するテスト")
	void test() {
		LocalDate localDate = LocalDate.parse("2012-01-31");
		MonthlyCalendar monthlyCalendar = new MonthlyCalendar(localDate);
		assertEquals(0, monthlyCalendar.getRemainingDays());
	}
	
	@Test
	@DisplayName("システム時間に依存するテスト")
	void test2() {
		LocalDate localDate2 = LocalDate.parse("2012-01-30");
		MonthlyCalendar monthlyCalendar2 = new MonthlyCalendar(localDate2);
		assertEquals(1, monthlyCalendar2.getRemainingDays());
	}
	
	@Test
	@DisplayName("システム時間に依存するテスト")
	void test3() {
		LocalDate localDate3 = LocalDate.parse("2012-02-01");
		MonthlyCalendar monthlyCalendar3 = new MonthlyCalendar(localDate3);
		assertEquals(28, monthlyCalendar3.getRemainingDays());
	}
	

}
