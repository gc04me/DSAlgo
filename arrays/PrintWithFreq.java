package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class PrintWithFreq {

	private static void printFreq(String str) {

		char[] arr = str.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<Map.Entry<Character, Integer>>(
				(a, b) -> b.getValue() - a.getValue());

		pq.addAll(map.entrySet());

		StringBuilder sb = new StringBuilder();

		while (!pq.isEmpty()) {
			Entry<Character, Integer> entry = pq.poll();
			char key = entry.getKey();
			int val = entry.getValue();

			for (int i = 0; i < val; i++) {
				sb.append(key);
			}
		}

		System.out.println(sb.toString());

	}

	public static void main(String[] args) {

		printFreq("pineapple");
	}

}
