package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entites.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();
}


/*
 * <?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
	xmlns:context="http://www.springframework.org/schema/context"
	xmlns:p="http://www.springframework.org/schema/p"
	xsi:schemaLocation="http://www.springframework.org/schema/beans
    http://www.springframework.org/schema/beans/spring-beans.xsd
    http://www.springframework.org/schema/context
    http://www.springframework.org/schema/context/spring-context.xsd">    
    
    <bean class="org.springframework.jdbc.datasource.DriverManagerDataSource" name="ds">
    <property name="driverClassName" value="com.mysql.cj.jdbc.Driver" />
    <property name="url" value="jdbc:mysql://localhost:3306/springjdbc" />
    <property name="username" value="root" />
    <property name="password" value="1234" />
    </bean>
    
    <bean class="org.springframework.jdbc.core.JdbcTemplate" name="jdbcTemplate" p:dataSource-ref="ds" />    
    <bean class="com.spring.jdbc.dao.StudentDaoImpl" name="studentDao" >
    <property name="jdbcTemplate" ref="jdbcTemplate" />
    
    </bean>
   
</beans> 
 */