import java.util.List;
import java.util.Map;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static final Logger log = Logger.getLogger(Main.class.getClass());
	private static AbstractApplicationContext context;
	private static BeanFactory context2;
	private static ApplicationContext context3;

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
//		context.registerShutdownHook();
		Employee emp3 = context.getBean("employee2", Employee.class);
		log.info(emp3.getId() + " " + emp3.getName() + " " + emp3.getEmail() + " " + emp3.getNumber());
		List<Address> addresses2 = emp3.getAddress();
		for (Address address : addresses2) {
			log.info("Address: " + address.getStreet() + " " + address.getCity() + " " + address.getState());
		}
		Employee empPrototype = context.getBean("employee2", Employee.class);
		log.info(emp3 + " " + empPrototype); // new object creating while calling bean

		Teacher teacher = context.getBean("teacher", Teacher.class);
		log.info(teacher);
		// Bean initialization and referencing using annotation
		context2 = new AnnotationConfigApplicationContext(HybridExample.class); // annotation based config
		Employee emp2 = context2.getBean(Employee.class); // getting bean using annotation
		log.info("ID: " + emp2.getId());

		Child child = context.getBean("values", Child.class); // inheritance and alias
		log.info(child);
		context3 = new AnnotationConfigApplicationContext(AnnotationExample.class);
		AnnotationExample ann = context3.getBean("annotationExample", AnnotationExample.class);
		log.info(ann);
		context.close();
	}
}
