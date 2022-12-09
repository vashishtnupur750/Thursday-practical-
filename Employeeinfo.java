 class Employee
 {
  int id;
  String name;
  float salary;
 
   Employee(int id,String name,float salary )
 {
  this.id=id;
  this.name=name;
  this.salary=salary;
  }
Employee(){
}
   public void display()
  {
     System.out.println("Employee Id :"+id);
     System.out.println("Employee name: "+name);
     System.out.println("Employee Salary :"+salary);
   }
}
    class Employeeinfo {
    public static void main(String args[]) 
    {
    Employee emp = new Employee(101, "nupur", 25000);
    Employee emp1 = new Employee(101, "diksha", 25000);
    emp.display();
    emp1.display();
    }
}
