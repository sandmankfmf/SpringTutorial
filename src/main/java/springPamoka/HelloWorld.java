package springPamoka;

public class HelloWorld {
	private String pranesimas;

	public void setPranesimas(String pranesimas) {
		this.pranesimas = pranesimas;
	}

	public void getPranesimas() {
		System.out.println("Your Message : " + pranesimas);
	}

	public void init() {
		System.out.println("Bean is going through init.");
	}

	public void destroy() {
		System.out.println("Bean will destroy now.");
	}

}
