package spring.core.ch02.ex03;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Timer {
	@Before("execution(* spring..*(int))")//1회용이라 이름을 붙일 필요가없는 joinpoint, joinpoint 전에 실행된다.
	public void clockStart(JoinPoint jp) {
		System.out.println(jp.toShortString());
		System.out.println("시작 시각: " + LocalDateTime.now());
	}
	
	@After("within(spring..Calculator)")
	public void clockEnd(JoinPoint jp) {
		System.out.println(jp.toShortString());
		System.out.println("종료 시각: " + LocalDateTime.now());
	}
	
	//@AfterReturning(pointcut="bean(calc*)", returning="result")
}