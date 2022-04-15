import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Aware implements ApplicationContextAware, BeanNameAware{
	private String name;
	private ApplicationContext context;
	public String getName() {
		return name;
	}
	public ApplicationContext getContext() {
		return context;
	}
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}
	@Override
	public void setBeanName(String name) {
		this.name = name;
	}
}
