package collection7.map.enummap;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Set;

public class EnumMapDemo {
	public enum Tutor {
		CODE, CONTRIBUTE, QUIZ, MCQ;
	}

	public static void main(String[] args) {
//		create EnumMap
		EnumMap<Tutor, String> enumMap = new EnumMap<EnumMapDemo.Tutor, String>(Tutor.class);

//		Adding elements to enum types
		enumMap.put(Tutor.CODE, "Start coding everyday");
		enumMap.put(Tutor.CONTRIBUTE, "Start contibuting in coding");
		enumMap.put(Tutor.MCQ, "Solve MCQ's");
		enumMap.put(Tutor.QUIZ, null); // null value can be added

//		enumMap.put(null, ""); //null key cant be added

		System.out.println("EnumMap: " + enumMap);

//		size 
		System.out.println("EnumMap size: " + enumMap.size());

//		getting an element
		System.out.println("get(Tutor.CODE): " + enumMap.get(Tutor.CODE));

//		contains key
		System.out.println("containsKey(Tutor.CODE): " + enumMap.containsKey(Tutor.CODE));

		System.out.println("containsValue(\"Solve MCQ's\"): " + enumMap.containsValue("Solve MCQ's"));

//		remove
		System.out.println("remove(Tutor.QUIZ): " + enumMap.remove(Tutor.QUIZ));

//		keySet
		Set<Tutor> keys = enumMap.keySet();
		System.out.println("Iterating keys of EnumMap");
		Iterator<Tutor> itr = keys.iterator();
		while (itr.hasNext()) {
			Tutor tutor = itr.next();
			System.out.println(tutor + " : ordinal : " + tutor.ordinal());
		}
	}
}
