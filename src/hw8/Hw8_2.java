package hw8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Hw8_2 {
	public static void main(String[] args) {
		Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
		Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train t3 = new Train(118, "自強", "高雄", "台北", 500);
		Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);
		Set<Train> set = new HashSet<Train>();
		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);

		Iterator objs = set.iterator();
		while (objs.hasNext()) {
			Train thisTrain = (Train) objs.next();
			System.out.println(thisTrain);
		}
		System.out.println("==============================");

		for (Train trains : set) {
			System.out.println(trains);
		}
		System.out.println("==============================");
		ArrayList<Train> list = new ArrayList<Train>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		list.add(t6);
		list.add(t7);
		Collections.sort(list);
		
		for(int i = 0 ; i<list.size() ; i++) {
			Train thisTrain = list.get(i);
			System.out.println(thisTrain);
		}	
		System.out.println("==============================");
		Iterator objs2 = list.iterator();
		while (objs2.hasNext()) {
			Train thisTrain = (Train) objs2.next();
			System.out.println(thisTrain);
		}
		System.out.println("==============================");
				
		for (Train trains : list) {
			System.out.println(trains);
		}

		System.out.println("==============================");
		TreeSet<Train> tSet = new TreeSet<Train>();
		tSet.add(t1);
		tSet.add(t2);
		tSet.add(t3);
		tSet.add(t4);
		tSet.add(t5);
		tSet.add(t6);
		tSet.add(t7);
		
		Iterator objs3 = tSet.iterator();
		while (objs3.hasNext()) {
			Train thisTrain = (Train) objs3.next();
			System.out.println(thisTrain);
		}
		System.out.println("==============================");		
			
		for (Train trains : tSet) {
			System.out.println(trains);
		}

	}

}
