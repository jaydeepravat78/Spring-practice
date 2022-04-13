import java.util.List;
import java.util.Map;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static final Logger log = Logger.getLogger(Test.class.getClass());
	private static AbstractApplicationContext context;
	private static ApplicationContext context2;

	public static void main(String[] args) {
		BasicConfigurator.configure();

		// Bean initialization and referencing using xml file
		context = new ClassPathXmlApplicationContext("spring.xml"); // using classpathxml
		Employee emp = (Employee) context.getBean("employee"); // getting employee bean from xml

		log.info(emp.getId() + " " + emp.getName() + " " + emp.getEmail() + " " + emp.getNumber());
		List<Address> addresses = emp.getAddress();
		for (Address address : addresses) {
			log.info("Address: " + address.getStreet() + " " + address.getCity() + " " + address.getState());
		}
		Map<String, Double> jobs = emp.getJob();
		for (Map.Entry<String, Double> job : jobs.entrySet()) {
			log.info("JOB: " + job.getKey() + "  Salary: " + job.getValue());
		}

		Vehicle car = context.getBean("car", Vehicle.class); // getting interface object
		Vehicle bike = context.getBean("bike", Vehicle.class); // getting interface object

		log.info("Car speed: " + car.speed());
		log.info("Bike speed: " + bike.speed());

		context.registerShutdownHook(); // call destroy of all the beans

		// Bean initialization and referencing using annotation
		context2 = new AnnotationConfigApplicationContext(Example.class); // annotation based config
		Employee emp2 = context2.getBean(Employee.class); // getting bean using annotation
		log.info("ID: " + emp2.getId());

		Employee emp3 = context.getBean("employee2", Employee.class);
		log.info(emp3.getId() + " " + emp3.getName() + " " + emp3.getEmail() + " " + emp3.getNumber());
		List<Address> addresses2 = emp3.getAddress();
		for (Address address : addresses2) {
			log.info("Address: " + address.getStreet() + " " + address.getCity() + " " + address.getState());
		}

		Child child = context.getBean("child", Child.class);
		log.info(child);
	}
}
