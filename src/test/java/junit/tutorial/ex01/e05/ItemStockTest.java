package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {

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

	Item item = new Item(null, 0);
	ItemStock itemStock = new ItemStock();
	
	
	@Test
	void test1() {
		assertEquals(0, itemStock.getNum(item));
		System.out.println(itemStock.getNum(item));
	}

	@Test
	void test2() {
		itemStock.add(item);
		assertEquals(1, itemStock.getNum(item));
		System.out.println(itemStock.getNum(item));
	}

	@Test
	void test3() {
		Item item = new Item("Book", 0);
		itemStock.add(item);
		assertEquals(1, itemStock.getNum(item));
		System.out.println(itemStock.getNum(item));
	}

	@Test
	void test4() {
		Item item = new Item("Book", 0);
		itemStock.add(item);
		itemStock.add(item);
		assertEquals(2, itemStock.getNum(item));
		System.out.println(itemStock.getNum(item));
	}

	@Test
	void test5() {
		Item item = new Item("Book", 0);
		itemStock.add(item);
		Item item2 = new Item("CD", 0);
		itemStock.add(item2);
		assertEquals(1, itemStock.getNum(item2));
		System.out.println(itemStock.getNum(item2));
	}
}
