package volodymyr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import volodymyr.dao.StudentDao;
import volodymyr.dao.impl.StudentDaoImpl;

@Configuration
public class CustomConfiguration {
	@Bean(name = "studentDao")
	public StudentDao getStudentDao() {
		StudentDao studentDao = new StudentDaoImpl();
		return studentDao;
	}
	
	@Bean(name = "student")
	public Student getStudent() {
		Student student = new Student();
		student.setId(1);
		student.setName("Volodymyr");
		student.setAge(24);

		return student;
	}
}