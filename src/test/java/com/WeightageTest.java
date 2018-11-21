package com;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import com.main.Weightage;

public class WeightageTest {

	private Weightage weightage;

	@Before
	public void setup(){
		weightage  = new Weightage();
	}

	@Test
	public void whether_Page_Map_Initializied() {
		Map<String, String[]> pagingStored = weightage.isPagingStored();

		assertNotNull(weightage);
		assertEquals(5, pagingStored.size());

	}

	@Test
	public void check_isElement_Available_inSingleNode() {
		String[] checkerElement = {"Automobile"};
		String checkElement = weightage.checkElement(checkerElement);
		assertEquals("P4", checkElement);
	}

	@Test
	public void check_isElement_Available_inMultiNode() {
		String[] checkerElement = {"Review"};
		String checkElement = weightage.checkElement(checkerElement);
		assertEquals("P1P2P3", checkElement);
	}

	@Test
	public void isElement_UnAvailable_inNode() {
		String[] checkerElement = {"Maddy"};
		String checkElement = weightage.checkElement(checkerElement);
		assertEquals("No Records Available", checkElement);
	}

	@Test
	public void isElement_Fetched_AlongwithIndex(){
		String[] checkerElement = {"Showroom"};
		String checkElement = weightage.checkElement(checkerElement);
		assertEquals("P2", checkElement);
	}

	@Test
	public void isGivenElements_Combination_Splitup_Available_LeastNodes() {
		String[] checkerElement = {"Ford","Automobile"};
		String checkElement = weightage.checkElement(checkerElement);
		assertEquals("P1P4P5", checkElement);
	}

	@Test
	public void isGivenElements_Combination_Splitup_Available_ManyNodes() {
		String[] checkerElement = {"Ford","Review"};
		String checkElement = weightage.checkElement(checkerElement);
		assertEquals("P1P2P3P5", checkElement);
	}






}
