package spring.di.ui;

import spring.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	private Exam exam;
	

	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	public InlineExamConsole() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}

	@Override
	public void setExam(Exam exam) {
		this.exam=exam; 
		
	}

}
