import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import collections.Student;

public class Test {
	public static void main(String[] args) {
		List<Student> ls = new ArrayList<>();
		Optional<Student> student = Student.findByRollNo(12, ls);
		System.out.println(student.get());

	}

	public static void readFile() {

	}
}