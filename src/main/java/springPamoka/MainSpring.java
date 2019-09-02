package springPamoka;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml"); //sukuriamas kontekstas iš xml failo
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld"); //Paimamas bean objektas iš xml failo
		obj.setPranesimas("Laba diena");
		obj.getPranesimas();


		HelloWorld obj2 = (HelloWorld) context.getBean("helloWorld"); //Paimamas bean objektas iš xml failo
		obj2.getPranesimas();

//		context.getBean()

		System.out.println(context.getBeanDefinitionCount());


		context.close();


		//((ConfigurableApplicationContext) context).close();
	}

}
