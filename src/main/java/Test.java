import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static final Logger log = Logger.getLogger(Test.class.getClass());
	private static ApplicationContext context;
	private static ApplicationContext context2;

	public static void main(String[] args) {
		BasicConfigurator.configure();

		// Bean initialization and referencing using xml file
		context = new ClassPathXmlApplicationContext("spring.xml"); // using classpathxml
		Employee emp = (Employee) context.getBean("employee"); // getting employee bean from xml
		Vehicle car = context.getBean("car", Vehicle.class); // getting interface object
		Vehicle bike = context.getBean("bike", Vehicle.class); // getting interface object
		log.info(emp.getId() + " " + emp.getName() + " " + emp.getEmail() + " " + emp.getNumber());
		log.info("Car speed: " + car.speed());
		log.info("Bike speed: " + bike.speed());

		// Bean initialization and referencing using annotation
		context2 = new AnnotationConfigApplicationContext(Example.class); // annotation based config
		Employee emp2 = context2.getBean(Employee.class); // getting bean using annotation
		log.info("ID: " + emp2.getId());
	}
}
