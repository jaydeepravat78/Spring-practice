import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

	public int speed() {
		return 120;
	}

}
