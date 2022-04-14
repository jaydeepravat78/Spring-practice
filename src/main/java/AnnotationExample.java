import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AnnotationExample {
	
	@Override
	public String toString() {
		return "AnnotationExample [id=" + id + ", name=" + name + "]";
	}

	@Value("2")
	private int id;
	@Value("Abc")
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
