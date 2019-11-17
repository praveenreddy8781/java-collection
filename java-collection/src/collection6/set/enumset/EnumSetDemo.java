package collection6.set.enumset;

import java.util.ArrayList;
import java.util.EnumSet;

enum Tutor {
	CODE, LEARN, CONTRIBUTE, QUIZ, MCQ
};

public class EnumSetDemo {

	public static void main(String[] args) {
		EnumSet<Tutor> set1, set2, set3, set4, set5;

		set1 = EnumSet.allOf(Tutor.class);
		System.out.println("allOf(Tutor.class) : " + set1);

		set2 = EnumSet.of(Tutor.CODE, Tutor.CONTRIBUTE);
		System.out.println("of(Tutor.CODE, Tutor.CONTRIBUTE) : " + set2);

		set3 = EnumSet.complementOf(set2);
		System.out.println("complementOf(set2): " + set3);

		set4 = EnumSet.range(Tutor.LEARN, Tutor.QUIZ);
		System.out.println("range(Tutor.LEARN, Tutor.QUIZ) : " + set4);

		set5 = EnumSet.copyOf(set4);
		System.out.println("copyOf(set4): " + set5);

		EnumSet<Tutor> set6 = EnumSet.noneOf(Tutor.class);
		System.out.println("noneOf(Tutor.class): " + set6);
	}
}
