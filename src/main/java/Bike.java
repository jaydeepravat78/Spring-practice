import org.apache.log4j.Logger;

public class Bike implements Vehicle {
	private int speed;
	private static final Logger log = Logger.getLogger(Bike.class.getClass());
	
	
	@Override
	public void setSpeed(int speed) {
		log.info("In Bike setter");
		this.speed = speed;
	}

	@Override
	public int speed() {
		return speed;
	}
	
	public void init() {
		log.info("In the bike init method");
	}
	
	public void destroy() {
		log.info("In the bike destory method");
	}
}
