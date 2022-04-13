import org.apache.log4j.Logger;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle, InitializingBean, DisposableBean {

	private static final Logger log = Logger.getLogger(Car.class.getClass());
	
	private int speed;
	@Override
	public void setSpeed(int speed) {
		log.info("In car setter");
		this.speed = speed;
	}
	
	@Override
	public int speed() {
		return speed;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("In init method of Car");
	}

	@Override
	public void destroy() throws Exception {
		log.info("In destroy method of Car");
	}
}
