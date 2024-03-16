package tutorial.schooljdbc;


import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Populate {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("application context loaded.. ");

        StudentDAOImpl studentDAOImpl = context.getBean("studentDao", StudentDAOImpl.class);

        Student student_A = new Student();
        student_A.setRole_no(5);
        student_A.setName("Kwon");
        student_A.setAddress("Chuncheon");

        studentDAOImpl.insert(student_A);

//        StudentDAO studentDAO = new StudentDAOImpl();
//        studentDAO.insert(student_A);
    }
}
