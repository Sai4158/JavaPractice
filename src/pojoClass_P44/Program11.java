package pojoClass_P44;

public class Program11 {
	public static void main(String[] args) {
		
		//create a object and print them out with
		Employee e = new Employee();
		e.setId(101);
		e.name =  "Sai";
		e.salary = 4158;
		
		//then print them out 
		//get 
		System.out.println(e.getId());
		System.out.println(e.name);
		System.out.println(e.salary);
		
		
		
		//or
		//this is how you use printing 
		Employee e1 = new Employee();
		e1.setId(131);
		e1.name =  "Abda";
		e1.salary = 3341;
		
		Employee e2 = new Employee();
		e2.setId(143);
		e2.name =  "hsk";
		e2.salary = 32412;
		
		Employee e3 = new Employee();
		e3.setId(123);
		e3.name =  "aWDF";
		e3.salary = 2342;
		
		//print using the array
		Employee[] employee = new Employee[] {e1, e2, e3};
		//this will only print salary's using the for loop 
		for(int i = 0; i<employee.length; i++) {
			//we want to print .salary for all 
			System.out.println("Salary is " + employee[i].salary);
		}
	}
	
}
