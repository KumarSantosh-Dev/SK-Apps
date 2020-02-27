package com.app.test;

import org.codehaus.jackson.map.ObjectMapper;

import com.app.student.Student;

public class TestWrite {
	public static void main(String[] args) {
		ObjectMapper om=null;
		try {
			//create object
			Student s=new Student();
			s.setSid(101);
			s.setsName("Santosh");
			s.setFee(3000.30);
			//create objectMapper
			om=new ObjectMapper();
			//call write methods
			String json=om.writeValueAsString(s);
			//print json
			System.out.println("Json value :"+json);
		}//try
		catch (Exception e) {
			System.out.println(e);
		}//catch

	}//main method
}//class
