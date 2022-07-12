package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list);
		main2(list);

	}

	public static void main2(List<Integer> list) {
		for (Integer a1 : list) {
			System.out.println(a1 * 2);
		}
	}
}
