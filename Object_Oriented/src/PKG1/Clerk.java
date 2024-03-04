package PKG1;

class Clerk extends Employee {
	
	private int managerId;
	
	Clerk(String name,int empId, double workHours,
			double wage,String jobTitle,String deptName, int managerId ){
			
		 
		super(name,empId,workHours,wage,jobTitle,deptName );
		this.managerId = managerId;
	}
	
	@Override
	public double calcSalary() {
		return super.getWage() * super.getWorkHours();
	}

	
}


