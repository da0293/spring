package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;


public class Program {

	public static void main(String[] args) {
		Exam exam =  new NewlecExam(1, 1, 1, 1);
		/*
		 * loader : NewlecExam 객체를 로드 (실제 업무)
		 * interfaces 
		 * h : 곁다리 부분을 꺄줘야한다.
		 */
		Exam proxyExam = (Exam)Proxy.newProxyInstance(NewlecExam.class.getClassLoader(), 
				new Class[] {Exam.class}, new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						long start = System.currentTimeMillis(); 
						Object result = method.invoke(exam, args); //실제 업무 로직 호출
						long end = System.currentTimeMillis();
						String message = (end-start) + "ms 시간이 걸렸습니다.";
						System.out.println(message);
						return result;
					}
				});
		// 주 업무 로직만
		System.out.printf("total is %d\n", exam.total());
		System.out.printf("avg is %f\n", exam.avg());
		System.out.println("-----------------");
		// proxy를 이용해 업무 로직 실행 시간 계산하는 부수적 기능까지 껴 놓음 
		System.out.printf("total is %d\n", proxyExam.total());
		System.out.printf("avg is %f\n", proxyExam.avg());
	}

}
