package spring.di;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;
import spring.entity.Exam;
import spring.entity.NewlecExam;

public class Program {

	public static void main(String[] args) {
		ApplicationContext context = 
				new ClassPathXmlApplicationContext("spring/di/setting.xml");
		Exam exam =context.getBean(Exam.class);
		System.out.println(exam.toString());
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		List<Exam> exams = (List<Exam>)context.getBean("exams");//new ArrayList<>();
		exams.add(new NewlecExam(1,1,1,1));
		for(Exam e : exams) {
			System.out.println(e);
		}
	}

}
