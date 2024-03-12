package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.entity.Exam;
import spring.entity.NewlecExam;

// <context:component-scan base-package="spring.di.ui"/>
@ComponentScan("spring.di.ui")
@Configuration
public class NewlecDIConfig {
	//<bean id="exam" class="spring.entity.NewlecExam"/>
	@Bean
	public Exam exam() {
		// 이 함수를 spring이 호출, NewlecExam객체를 IOC컨테이너에 담는다.
		return new NewlecExam();
	}
}
