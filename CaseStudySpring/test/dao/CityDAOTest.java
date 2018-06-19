package dao;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import models.City;

@RunWith(Parameterized.class)
public class CityDAOTest {
	int id; String expected; 
	
	
	public CityDAOTest(int id, String expected) {
		super();
		this.id = id;
		this.expected = expected;
	}

	@Parameterized.Parameters
	public static Collections params() {
		return (Collections) Arrays.asList(new Object[][] {
			{1, "TamD@yahoo.com"}
		});
		
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
