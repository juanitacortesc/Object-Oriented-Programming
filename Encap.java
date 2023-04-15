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

class Department
{
    private int depno;
    private String depname;
    
    public int getdepno()
    {
        return depno;
    }
    
    public String getdepname()
    {
        return depname;
    }
    
    public void setdepno(int a)
    {
        depno=a;
    }
    public void setdepname(String b)
    {
        depname=b;
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
        
        Department dep1 = new Department();
        dep1.setdepno(12345);
        dep1.setdepname("IT");
        System.out.println("Department No:"+dep1.getdepno()+" Department Name:"+dep1.getdepname());
        Department dep2 = new Department();
        dep2.setdepno(67890);
        dep2.setdepname("Human Resources");
        System.out.println("Department No:"+dep2.getdepno()+" Department Name:"+dep2.getdepname());
    }
}
