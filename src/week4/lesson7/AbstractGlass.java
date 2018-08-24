package week4.lesson7;

public abstract class AbstractGlass implements Glassable {
	private String form;

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}
	
	public AbstractGlass(String form) {
		this.setForm(form);
	}
	
	public void pourFromMe() {
		System.out.println("I'm a " + this.getForm() + " glass is going to pour");

	}
}
