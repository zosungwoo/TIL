package org.example.treeset;

import org.example.hashset.implementation.MyHashSet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class TreeSetExample7 {

	public static HashSet<Integer> getHashSetID() throws IOException {
		HashSet<Integer> data = new HashSet<Integer>();
		BufferedReader br = new BufferedReader(new FileReader("/Users/sungwoo/Desktop/TIL/Data Engineering (Java)/src/main/java/org/example/data/email.txt"));
		while (true) {
			String line = br.readLine();
			if (line == null)
				break;
			if (line.startsWith("#"))
				continue;

			String[] array = line.split("\t");
			int from = Integer.parseInt(array[0]);
			int to = Integer.parseInt(array[1]);
			data.add(from);
			data.add(to);
		}
		br.close();
		return data;
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {

		HashSet<Integer> hashSet = getHashSetID();
		MyHashSet<Integer> myHashSet = new MyHashSet<Integer>(hashSet);
		ArrayList<Integer> arrayList = new ArrayList<Integer>(hashSet);
		LinkedList<Integer> linkedList = new LinkedList<Integer>(hashSet);

		long p0 = System.currentTimeMillis();
		int min = Integer.MAX_VALUE;
		for (Integer val : linkedList) {
			if (val < min) {
				min = val;
			}
		}
		System.out.println("linkedList: " + (System.currentTimeMillis() - p0));

		// HashSet: 19
		// myHashSet: 66
		// arrayList: 11
		// linkedList: 12

		TreeSet<Integer> treeSet = new TreeSet<>(hashSet);

		long p1 = System.currentTimeMillis();
		System.out.println(treeSet.first());
		System.out.println("treeset: " + (System.currentTimeMillis() - p1));

		// TreeSet => 0ms

	}
}