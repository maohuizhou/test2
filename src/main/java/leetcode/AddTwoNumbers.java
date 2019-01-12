package main.java.leetcode;

import java.util.LinkedList;

public class AddTwoNumbers {

	public static void main(String[] args) {
		AddTwoNumbers atn = new AddTwoNumbers();

		LinkedList<Integer> a = new LinkedList();
		a.add(new Integer(5));
		a.add(new Integer(6));
		a.add(new Integer(4));
		LinkedList<Integer> b = new LinkedList();
		b.add(new Integer(2));
		b.add(new Integer(4));
		b.add(new Integer(9));
		b.add(new Integer(9));

		LinkedList c = atn.addTwoNumbers(a,b);
		System.out.println("c size = " +c.size());
		for (int i =0; i<c.size();i++)
			System.out.println( c.get(i) + " ");

	}

	public LinkedList<Integer> addTwoNumbers(LinkedList<Integer> a, LinkedList<Integer> b) {

		LinkedList<Integer> result = new LinkedList();

		int up = 0;
		if (a.size() >= b.size()) {
			for (int i = 0; i < a.size(); i++) {

				if ((a.get(i) + b.get(i)) / 10 > 0) {
					result.add(i, (a.get(i) + b.get(i) + up) % 10);
					up = (a.get(i) + b.get(i) + up) / 10;
				} else
					result.add(i, (a.get(i) + b.get(i) + up) % 10);

			}
		}
			else{
				for (int i = 0; i < b.size(); i++) {
					if(i<a.size()) {
						if ((a.get(i) + b.get(i)) / 10 > 0) {
							result.add(i, (a.get(i) + b.get(i) + up) % 10);
							up = (a.get(i) + b.get(i) + up) / 10;
						} else
							result.add(i, (a.get(i) + b.get(i) + up) % 10);


					}
					else{
						if ((up+ b.get(i)) / 10 > 0) {
							result.add(i, ( b.get(i) + up) % 10);
							up = ( b.get(i) + up) / 10;
						} else
							result.add(i, ( b.get(i) + up) % 10);


					}
				}
				if( up>0){
					result.add(up);
				}
		}
		return result;
	}

}
