package in.beans.MyCIApp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.beans.UserService;

public class CIAppConfig {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("CIBeans.xml");

		UserService userService = context.getBean(UserService.class);

	}
}
