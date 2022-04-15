import org.apache.log4j.Logger;

public class AutoClass implements AutoInterface{

	private static final Logger log = Logger.getLogger(AutoClass.class.getClass());
	@Override
	public void show() {
		log.info("Autowired Example");
	}
}
