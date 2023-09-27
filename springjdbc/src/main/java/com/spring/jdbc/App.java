package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program Spring JDBC" );
        Scanner scn=new Scanner(System.in);
        ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
       // ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        //JdbcTemplate template= context.getBean("jdbcTemplate",JdbcTemplate.class);
        
        //insert query
        //String query="insert into student(id,name,city,course) values(?,?,?,?)";
        
        //fire the query
        
//        int result= template.update(query,105,"Bablu Singh","Nalanda","B.SC");
//        System.out.println("Number of record inserted" +result);
        
        StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
       
        Student student=new Student();
        student.setId(114);
        student.setName("Visky Singh");
        student.setCity("Nawada");
        student.setCourse("BBA");
        
        int result= studentDao.insert(student);
        System.out.println("Insert Data Success " +result);
//        int result=studentDao.change(student);
//        System.out.println("Data change Success " +result);
       
        
        //Delete
//        int result=studentDao.delete(106);
//        System.out.println("Data deleted Sccess"+result);
        
//        Student student= studentDao.getStudent(101);
//        System.out.println("Student : "+student);
        
        List<Student> students=studentDao.getAllStudents();
        for(Student s:students) {
        	System.out.println(s);
        }
    }
}
