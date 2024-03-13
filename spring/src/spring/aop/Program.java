package spring.aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;


public class Program {

	public static void main(String[] args) {
		// 애플리케이션 컨텍스트 생성
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/aop/setting.xml");
		Exam exam = (Exam)context.getBean("exam"); 
		// proxy를 이용해 업무 로직 실행 시간 계산하는 부수적 기능까지 껴 놓음 
		System.out.printf("total is %d\n", exam.total());
		System.out.printf("avg is %f\n", exam.avg());
	}

}
