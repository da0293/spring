package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;
import spring.entity.Exam;
import spring.entity.NewlecExam;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context = 
				//new ClassPathXmlApplicationContext("spring/di/setting.xml"); 같은 역할
				new AnnotationConfigApplicationContext(NewlecDIConfig.class);
		//ExamConsole console = context.getBean(ExamConsole.class); 
		ExamConsole console = (ExamConsole)context.getBean("console"); 
		console.print();
	}

}
