package spring.core.ch01.ex02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static  void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("app.xml", Main.class);
		
		Shooter shooter1 = ctx.getBean("shooter1", Shooter.class);//여기서 Shooter1은 bean의 id값을 쓴것이다.
		Shooter shooter2 = ctx.getBean("shooter2", Shooter.class);
		
		shooter1.fire();
		shooter2.fire();
	}
}