package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElem {

	private static List<Integer> findMajorityElement(int[] arr) {
		
		List<Integer> result = new ArrayList<Integer>();
		int arrayLength= arr.length;

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			
			if(entry.getValue()>arrayLength/3) {
				result.add(entry.getKey());
			}
		}

		return result;
	}

	public static void main(String[] args) {

		List<Integer> majority = findMajorityElement(new int[] { 3, 2, 3 });

		majority.forEach(item -> System.out.println(item));
	}

}
