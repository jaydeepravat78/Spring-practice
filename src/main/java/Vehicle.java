import org.springframework.beans.factory.annotation.Autowired;

public interface Vehicle {
	int speed();
	@Autowired
	void setSpeed(int speed);
}
