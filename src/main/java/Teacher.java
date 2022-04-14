import org.springframework.beans.factory.annotation.Autowired;

/*
 * Annotation: In this @Autowired annotation can be applied to constructor, data member or setter
 */
public class Teacher {
	private Student student;
	private String name;
	private String subject;

	@Autowired
	Teacher(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher [student=" + student + ", name=" + name + ", subject=" + subject + "]";
	}

}
