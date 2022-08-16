package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTest {

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
	void test() {
		try {
			InputStream input
				= new FileInputStream
				("/Users/keisuke_ishizuka/"
				+ "spring-workspace/junit-ensyu/"
				+ "src/main/java/junit/tutorial/"
				+ "ex02/e02/Employee.txt");
			List<Employee> employeeList = Employee.load(input);
			assertAll(
					() -> assertEquals("Ichiro", employeeList.get(0).getFirstName()),
					() -> assertEquals("Tanaka", employeeList.get(0).getLastName()),
					() -> assertEquals("ichiro@example.com", employeeList.get(0).getEmail())
					);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
