package main.java.abstracttypes;

import main.java.basics.Student;
import main.java.inheritance.NaughtyStudent;
import main.java.enums.Level;
import java.util.List;
import java.util.Map;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Register {
	private final List<? super NaughtyStudent> registeredStudents;

	public Register(List<? super NaughtyStudent> students) {
		this.registeredStudents = students;
	}

	public List<String> getRegister() {
		return this.registeredStudents.stream().map((student) -> ((Student) student).getName())
				.collect(Collectors.toList());
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Map<Level, List<Student>> getRegisterByLevel(Level level) {
		Map<Level, List<Student>> registerLevelMap = new HashMap();
		List<? super NaughtyStudent> registeredStudentsOfLevel = registeredStudents.stream()
				.filter((student) -> ((Student) student).getLevel() == level).collect(Collectors.toList());
		registerLevelMap.put(level, (List<Student>) registeredStudentsOfLevel);
		return registerLevelMap;
	}

	@SuppressWarnings({ "unchecked" })
	public List<? super NaughtyStudent> sort(Comparator<? super NaughtyStudent> comparator) {
		Collections.sort((List<Student>) this.registeredStudents, (Comparator<Student>) comparator);
		return this.registeredStudents;
	}

	public String printReport() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%s \t %s\n", "Name", "Level"));
		this.registeredStudents.stream().map(
				(student) -> String.format("%s \t %s\n", ((Student) student).getName(), ((Student) student).getLevel()))
				.forEach((formattedStudent) -> sb.append(formattedStudent));
		return sb.toString();
	}
}
