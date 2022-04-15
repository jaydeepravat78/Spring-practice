import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoPostProcess implements BeanPostProcessor {

	private static final Logger log = Logger.getLogger(DemoPostProcess.class.getClass());

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		log.info("post init before initializtion");
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		log.info("post init after initialization");
		return bean;
	}
}
