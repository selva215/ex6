/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise6;

import java.util.Scanner;

/**
 *
 * @author Thiagarajan
 */
public class empsalary {
    public static void main(String[] args){
        employee emp=new manager();
        manager man=new manager();
        System.out.println("enter manager 1 details");
        man.getdetails();
         man.calcsalary();
        System.out.println(man.toString());
         manager man2=new manager();
         System.out.println("\nenter manager 2 details");
        man2.getdetails();
         man2.calcsalary();
        System.out.println(man2.toString()); 
        employee emp2=new clerk();
        clerk clk=new clerk();
        System.out.println("\nenter clerk details");
        clk.getdetails();
        clk.calcsalary();
        System.out.println(clk.toString());

        
    }
    
}
abstract class employee
{
    abstract double calcsalary();
    abstract public String toString();
    String name;
    int age;
    double a,b,hrs;
    double salary;
    Scanner obj=new Scanner(System.in);
    
           
}
class manager extends employee
{
    
    void getdetails()
    {
        System.out.println("enter manager name:");
        name=obj.next();
        System.out.println("enter age:");
        age=obj.nextInt();
        System.out.println("enter no.of hours worked:");
        hrs=obj.nextDouble();
        System.out.println("enter salary for an hour:");
        a=obj.nextDouble();
    }
    @Override
    double calcsalary()
    {
        salary=a*hrs;
        return salary;
    }
    @Override
    public String toString()
    {
        return "Manager name:"+name+"\nAge:"+age+"\nHours worked:"+hrs+"\nSalary:Rs."+salary;
    }
    
}
class clerk extends employee
{
    void getdetails()
    {
        System.out.println("enter clerk name:");
        name=obj.next();
        System.out.println("enter age:");
        age=obj.nextInt();
        System.out.println("enter no.of hours worked:");
        hrs=obj.nextDouble();
         System.out.println("enter salary for an hour:");
        b=obj.nextDouble();
        
    }
      @Override
    double calcsalary()
    {
        salary=b*hrs;
        return salary;
    }
    @Override
    public String toString()
    {
        return "Clerk name:"+name+"\nAge:"+age+"\nHours worked:"+hrs+"\nSalary:Rs."+salary;
    }
}