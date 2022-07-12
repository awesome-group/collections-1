package main;

import java.util.ArrayList;
import java.util.List;

public class Collections {
	public static void main(String[] args) {
	
	List<Integer> list=new ArrayList<Integer> ();
	list.add(1);
	list.add(3);
	list.add(6);
	list.add(9);
	for(int i =0;i<list.size();i++) {
			System.out.println(list.get(i) * 2);
	}                 
		System.out.println(list);
	}
}
