
/*
 * Annotation: In this @Autowired annotation can be applied to constructor, data member or setter
 */
public class Teacher {
	private Student student;
	private Address address;
	private String name;
	private String subject;

	public Teacher(Student student, Address address2) {
		this.student = student;
		this.address = address2;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Teacher [student=" + student + ", address=" + address + ", name=" + name + ", subject=" + subject + "]";
	}

	
}
