package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ListTest {
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		List<Integer> ls = new LinkedList<>();

		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(3);
		ls.add(4);
		/*
		 * Iterator<Integer> it = ls.iterator(); while (it.hasNext()) {
		 * System.out.println(it.next()); }
		 */
		for (Integer n : ls) {
			System.out.println(n);
		}
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(ls.get(i));
		}
		Set<Integer> se = new LinkedHashSet<>();
		se.add(1);
		se.add(4);
		se.add(2);
		se.add(3);
		se.add(3);

		System.out.println(se);
		System.out.println(se.size());
		PriorityQueue<Integer> q = new PriorityQueue<>();
		q.add(10);
		q.add(20);
		q.add(5);
		System.out.println(q);

		q.poll();
		System.out.println(q);
		Map<Integer, String> map = new HashMap();
		map.put(30, "Younus");
		map.put(10, "Kalyan");
		map.put(20, "Varsha");
		System.out.println(map);
		System.out.println(map.containsKey(10));
		System.out.println(map.get(10));

	}
}
