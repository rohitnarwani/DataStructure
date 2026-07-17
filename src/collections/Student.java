package collections;

import java.util.List;
import java.util.Optional;

public class Student {
	public Student(String name, int rollno) {
		this.name = name;
		this.rollNo = rollno;

	}

	private String name;
	private int rollNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

	public static Optional<Student> findByRollNo(int rollNo, List<Student> students) {
		return Optional.empty();

	}

}
