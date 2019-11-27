import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();

		students.add(new Student("Ankush", 10));
		students.add(new Student("Praveen", 10));
		students.add(new Student("Ankush", 50));
		students.add(new Student("Praveen", 30));
		students.add(new Student("Ankush", 10));
		students.add(new Student("Akash", 45));
		students.add(new Student("Ankush", 20));
		students.add(new Student("Rajesh", 12));

//		find how many times the same student in list
		HashMap<String, Integer> duplicateStudents = new HashMap<String, Integer>();
		for (Student student : students) {
			String key = student.getName();
			if (duplicateStudents.containsKey(key)) {
				Integer value = duplicateStudents.get(key);
				duplicateStudents.put(key, ++value);
			} else {
				duplicateStudents.put(key, 1);
			}
		}

		System.out.println(duplicateStudents);

		HashMap<String, Integer> studentsIndividualScores = new HashMap<String, Integer>();

		for (Student student : students) {
			String key = student.getName();
			if (studentsIndividualScores.containsKey(key)) {
				Integer value = studentsIndividualScores.get(key);
				studentsIndividualScores.put(key, value + student.getScore());
			} else {
				studentsIndividualScores.put(key, student.getScore());
			}
		}

		System.out.println(studentsIndividualScores);

		Set<Entry<String, Integer>> set = studentsIndividualScores.entrySet();

		Iterator<Entry<String, Integer>> iterator = set.iterator();

		HashMap<String, Float> finalResult = new HashMap<String, Float>();
		while (iterator.hasNext()) {
			Entry<String, Integer> entry = iterator.next();
			String key = entry.getKey();
			Integer divisior = duplicateStudents.get(entry.getKey());
			Integer totalScore = studentsIndividualScores.get(key);

			finalResult.put(key, (float) (totalScore / divisior));
		}
		System.out.println(finalResult);
	}
}
