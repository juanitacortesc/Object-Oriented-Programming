/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.encap;

/**
 *
 * @author juanitacortes
 */

/*Encapsulatio: all the methods are just in 1 class. We tried to hide data from 
the public class and can only be accesed by entering to one class.
Wrapping all the information.*/


class Employee
{
    private int empno;
    private String name;
    private double salary;
    
    public int getempno()
    {
        return empno;
    }
    
    public String getname()
    {
        return name;
    }
    
    public double getsalary()
    {
        return salary;
    }
    public void setempno(int a)
    {
        empno=a;
    }
    public void setname(String b)
    {
        name=b;
    }
    public void setsalary(double c)
    {
        this.salary=c;
    }
}
public class Encap {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setempno(52145);
        emp1.setname("john");
        emp1.setsalary(52145);
        System.out.println("Employee No:"+emp1.getempno()+" Employee Name:"+emp1.getname()+" Employee salary:"+emp1.getsalary());
        Employee emp2 = new Employee();
        emp2.setempno(65214);
        emp2.setname("David");
        emp2.setsalary(2500000);
        System.out.println("Employee No:"+emp2.getempno()+" Employee Name:"+emp2.getname()+" Employee salary:"+emp2.getsalary());
        
    }
}
