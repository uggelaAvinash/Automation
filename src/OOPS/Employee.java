package OOPS;

public class Employee {
  int EmpId;
  String Ename;
  String Ejob;
  int Esal;
  
  Employee(String Ename,int EmpId, String Ejob,int Esal)
  {
	  this.Ename=Ename;
	  this.EmpId=EmpId;
	  this.Ejob=Ejob;
	  this.Esal=Esal;
  }
   
  void Display() {
      System.out.println(EmpId);
      System.out.println(Ename);
      System.out.println(Ejob);
      System.out.println(Esal);
  }
   
  void Show() {
	  System.out.println("Next Employee Data");
  }
	public static void main(String[] args) {
	   Employee Emp1=new Employee("avinash",521227,"tester",50000);
	   Emp1.Display();
	   Emp1.Show();
	   
	   Employee Emp2=new Employee("naveen",521727,"tester",60000);
	   Emp2.Display();
	   Emp2.Show();
	   
	   

	}

}
