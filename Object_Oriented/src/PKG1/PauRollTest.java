package PKG1;

public class PauRollTest {

	public static void main(String[] args) {
		
		Employee emp1 = new Developer("백현준",1111,8.0,10000.0, "developer","dept1", 3.0 );
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getEmpId());
		System.out.println(emp1.getWorkHours());
		System.out.println(emp1.getJobTitle());
		System.out.println(emp1.getWage());
		System.out.println(emp1.getDeptName());
		
		Employee emp2 = new Clerk("백현준1",1112,8.0,10000.0, "clerk","dept1", 1113 );
		Employee emp3 = new Manager("백현준2",1113,8.0,20000.0, "manage","dept1", 10000.0 );
		Employee emp4 = new Salesman("백현준3",1114,8.0,10000.0, "salesman","dept1", 15000.0 );
		//Employee emp5 = new Director("백현준4",1115,8.0,30000.0, "director","dept1", 30000.0 );
		
		Employee[] employees = new Employee[4];
		
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;
		employees[3]  = emp4;
		
		for (Employee emp : employees) {
			System.out.println(emp.calcSalary());
		}
     
	}

}
