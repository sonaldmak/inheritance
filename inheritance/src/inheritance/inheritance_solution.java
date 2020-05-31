package inheritance;

public class inheritance_solution {
	class Emp{  
		 float salary=2000;  
		}  
		class Manager extends Emp{  
		 int bonus=1000;  
		 public void main(String args[]){  
		   Manager p=new Manager();  
		   System.out.println("Manager salary is:"+p.salary);  
		   System.out.println("Bonus of Manager is:"+p.bonus);  
		}  
		} 
}
 