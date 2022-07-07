package spring.core.ch01.ex05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

@Component
public class Shooter {
	@Autowired @Nullable private Gun pistol;
	@Autowired @Nullable private Gun rifleGun;
	
	public void fire() {//과제: NullPointerException으로 인해, 앱이 죽지 않도록 하라.
		try {
			pistol.fire();
			rifleGun.fire();
		}catch(Exception e) {
			
		}
	}
}