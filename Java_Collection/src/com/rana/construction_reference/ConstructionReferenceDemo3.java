package com.rana.construction_reference;

import java.util.function.Function;

class Student
{
	private Integer id;
	private String name;
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return " Student[id=" + id + ", name=" + name + "]";
	}
	
	
	
}

public class ConstructionReferenceDemo3 {

	public static void main(String[] args) 
	{
		//Need to create student array
		
		Function<Integer, Student[]> fn3=Student[]::new;
		
		Integer size=Integer.valueOf(IO.readln("Enter the size of the array."));
		Student[] students=fn3.apply(size);
		for (int i = 0; i < students.length; i++) 
		{
			Integer id=Integer.valueOf(IO.readln("Enyer the id of the student : "));
			String name=IO.readln("Enter the name of the student.");
			students[i]=new Student(id, name);
	
		}
		
		for (Student student : students) 
		{
			System.out.println(student);
			
		}
	}

}
