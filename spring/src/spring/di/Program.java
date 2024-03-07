package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		/*
		스프링에게 지시하는 방법으로 코드를 변경
		1. 부품 생성
		Exam exam = new NewlecExam();
		2. 부품 조립
		ExamConsole console = new InlineExamConsole();
		ExamConsole console = new GridExamConsole(exam); 
		3. 결합
		console.setExam(exam);// DI
		이 관계를 설정으로 따로 파일로 뺄 것이다.설정으로 뺀 것을 객체화 해서 다시 전달을 해주는 그것이 스프링이다. 
		*/
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		// 빈 이름(id)으로 꺼내온다. 형변환해야한다.
		//ExamConsole console=(ExamConsole)context.getBean("console"); 
		// 자료형명으로 꺼내온다.형변환할필요없고 클래스명을 깔끔하게 설정하므로 선호함
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
	}

}
