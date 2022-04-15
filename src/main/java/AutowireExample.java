
public class AutowireExample {
	private AutoInterface autoClass;
	
	
	public AutoInterface getAutoClass() {
		return autoClass;
	}


	public void setAutoClass(AutoInterface autoClass) {
		this.autoClass = autoClass;
	}


	public void display() {
		autoClass.show();
	}
}
