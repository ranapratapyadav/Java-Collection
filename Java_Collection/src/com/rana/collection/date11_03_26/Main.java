package com.rana.collection.date11_03_26;

/*
 Create a Java application that demonstrates how to store employee details in a LinkedList and update the salary of each employee using a setter method.

1. Create an Employee Class

This class must contain the following instance variables:

int empNo → Employee Number

String name → Employee Name

double salary → Employee Salary

Also include:

A parameterized constructor to initialize employee details.

A setter method to update the salary.

2. Create an ELC Class (Execution / Main Class)

Inside this class, you must:

Create a LinkedList<Employee> object.

Accept N employee details from the user.

Store each employee as an object inside the LinkedList.

Traverse the LinkedList using an enhanced for loop.

While traversing, add a bonus of 5000.00 to each employee's salary using the setter method.

Finally, print the updated employee details.

Examples
Example 1
Input:
(Count of the Employee)
empNo
name
salary

Example :-
----------

5
101
Rahul
45000
102
Priya
50000
103
Arjun
48000
104
Sneha
52000
105
Karan
47000
Output:
Updated Employee Details:
101 Rahul 50000.0
102 Priya 55000.0
103 Arjun 53000.0
104 Sneha 57000.0
105 Karan 52000.0
Explanation:
Accept number of employees Create Employee objects Add them to a LinkedList Iterate using Iterator and update salaries Print updated results

Constraints
1 ≤ N ≤ 20
Bonus = 5000.00
Use LinkedList
not ArrayList
Must update salary using Iterator
 */

import java.util.LinkedList;
public class Main
{
    void main()
    {
        LinkedList<Employee>ll=new LinkedList<>();

        int size=Integer.parseInt(IO.readln("Enter the size of linked list."));

        for(int i=0;i<size;i++)
        {
            int empNo=Integer.parseInt(IO.readln("Enter the empid."));
            String name=IO.readln("enter the name.");
            double salary=Double.parseDouble(IO.readln("enter the salary"));

            ll.add(new Employee(empNo,name,salary));
        }
        for(Employee emp:ll)
        {
            emp.setSalary(emp.getSalary()+5000);
        }

        IO.println("Updated Employee Details:");
        for(Employee emp1:ll)
        {
            IO.println(emp1);
        }
    }
}






class Employee
{
    private int empNo;
    private String name;
    private double salary;


    public Employee(int empNo,String name,double salary)
    {
        this.empNo=empNo;
        this.name=name;
        this.salary=salary;
    }

    public void setSalary(double salary)
    {
        this.salary=salary;
    }

    public double getSalary()
    {
        return this.salary;
    }

    public String toString()
    {
        return empNo +" "+name+" "+salary;
    }
}