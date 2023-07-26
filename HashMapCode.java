package com.collection.framework.continuation;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCode {
	public static void main(String... args) {
		/*
		 * there are four ways to create an hashmap.
		 */
		// default intial capacity,load factor
		HashMap<String, Integer> map1 = new HashMap<>();

		// initial capacity
		HashMap<String, Integer> map2 = new HashMap<>(20);

		// initial capacity load factor
		HashMap<String, Integer> map3 = new HashMap<>(10, 0.73f);

		// creating hashmap by cloning another map
		HashMap<String, Integer> map4 = new HashMap<>(map1);

		// add key -value pair to hashmap
		map1.put("aaa", 100);
		map1.put("ccc", 10);
		map1.put("ggg", 900);
		map1.put("qqq", 500);
		map1.put("ooo", 300);
		System.out.println(map1);
		Set<Entry<String, Integer>> entries = map1.entrySet();
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry + " " + map1.get(entry));

		}

		HashMap<String, Integer> another = new HashMap<String, Integer>();
		another.putAll(map1);
		System.out.println(another);

		another.putIfAbsent("fff", 90);
		System.out.println(another);
		another.putIfAbsent("ooo", 7);
		System.out.println(another);

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(0, "geetha");
		map.put(1, "teena");
		map.put(2, "vinay");
		map.put(3, "raju");
		map.put(7, "raju");
		// get()

		for (int index = 0; index < map.size(); index++) {
			System.out.println(map.get(index));
		}

		// containsKey

		System.out.println(map1.containsKey("ooo"));
		System.out.println(map1.containsValue(90));

		map1.clear();
		System.out.println(map1);

		// all keys present in map
		Set<Integer> key = map.keySet();

		for (int k : key) {
			System.out.println(k + " " + map.get(k));
		}

		Collection<String> value = map.values();

		for (String v : value) {
			System.out.println(v);
		}
		System.out.println(map);
		map.remove(2);
		System.out.println(map);

		System.out.println(map);
		map.remove(1, "teena");
		System.out.println(map);

		System.out.println(map);
		map.replace(0, "hyder");
		System.out.println(map);

		System.out.println(map);
		map.replace(7, "raju", "kaviya");
		System.out.println(map);

		Collections.synchronizedMap(map);
		System.out.println(map);
	}

}
