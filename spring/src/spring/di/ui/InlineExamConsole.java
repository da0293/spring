package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	@Autowired(required=false) //bean객체가 없어도 가능 
	@Qualifier("exam2")
	private Exam exam;
	
	public InlineExamConsole() {
		System.out.println("constructor");
	}

	public InlineExamConsole(Exam exam) {
		System.out.println("overload constructor");
		this.exam = exam;
	}


	@Override
	public void print() {
		if(exam==null)
			System.out.printf("total is %d, avg is %f\n",0,0.0);
		else
			System.out.printf("total is %d, avg is %f\n",exam.total(),exam.avg());
	}
	
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter injection");
		this.exam=exam; 
	}

}
