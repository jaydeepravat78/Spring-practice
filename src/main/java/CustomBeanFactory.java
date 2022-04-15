import org.springframework.beans.factory.FactoryBean;

public class CustomBeanFactory implements FactoryBean<Address> {
	private Address object = new Address();

	@Override
	public Address getObject() throws Exception {
		return object;
	}

	@Override
	public Class<? extends Address> getObjectType() {
		return object.getClass();
	}
}
