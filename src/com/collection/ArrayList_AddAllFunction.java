package com.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_AddAllFunction {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		list.add(12);
		list.add(14);
		list.add(16);
		list.add(18);
		list.add(20);

		System.out.println(list);

		List<Integer> newlist = new ArrayList();

		newlist.add(22);
		newlist.add(22);

		list.addAll(newlist);
		System.out.println(list);
	}

}