package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Weightage {

	public Map<String, String[]> isPagingStored() {
		Map<String, String[]> map = new HashMap();
		String[] arr1 = { "Ford", "Car", "Review" };
		String[] arr2 = { "Toyota", "Showroom", "Review" };
		String[] arr3 = { "Car", "Review" };
		String[] arr4 = { "Automobile" };
		String[] arr5 = { "Car", "Ford" };
		map.put("P1", arr1);
		map.put("P2", arr2);
		map.put("P3", arr3);
		map.put("P4", arr4);
		map.put("P5", arr5);
		return map;
	}

	public String checkElement(String[] checkerElement) {
		StringBuilder queryList = new StringBuilder();
		Map<String, String[]> pagingStored = isPagingStored();
		for (Map.Entry<String, String[]> entry : pagingStored.entrySet()) {
			for (String elementCheck : checkerElement) {
				if (Arrays.asList(entry.getValue()).contains(elementCheck)) {
					queryList.append(entry.getKey());
				}
			}
		}
		if (queryList.toString().trim().equals("")) {
			return "No Records Available";
		}
		return queryList.toString();

	}

}
