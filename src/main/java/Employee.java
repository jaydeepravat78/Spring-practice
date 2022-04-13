import java.util.List;
import java.util.Map;

public class Employee {
	private int id;
	private String name;
	private String email;
	private String number;
	private List<Address> address;
	private Map<String, Double> job;

	public Employee(int id) {
		this.id = id;
	}

	public Map<String, Double> getJob() {
		return job;
	}

	public void setJob(Map<String, Double> job) {
		this.job = job;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Address> getAddress() {
		return address;
	}

	public Employee(int id, List<Address> address) {
		this.id = id;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
