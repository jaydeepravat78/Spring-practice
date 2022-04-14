import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * <p>
 * The following class create bean using annotation
 * </p>
 *
 */

@Configuration
public class HybridExample {
	@Bean
	public Employee emp() {
		return new Employee(2);
	}
}
