package PKG1;

class Manager extends Employee {
	
	private double managerAllowance;
	
	Manager(String name,int empId,double workHours,
			 double wage, String jobTitle,String deptName,
			 double managerAllowance){
		super(name,empId,workHours,wage,jobTitle,deptName);
		this.managerAllowance = managerAllowance;
	}
	                
public double getManagerAllowance() {
	return this.managerAllowance;
    }

@Override
public double calcSalary() {
	return (super.getWage()  * super.getWorkHours())+ this.managerAllowance; 
}
}

class Salesman extends Employee{
	
	private double incentive;
	
	Salesman(String name, int empId,double workHours,
			 double wage, String jobTitle, String deptName,
			 double incentive) {
	
	super(name,empId,workHours,wage,jobTitle,deptName);
	this.incentive = incentive;
			 
}
	public double getIncentive() {
		return this.incentive;
	}
	
	@Override
	public double calcSalary() {
		return (super.getWage()  * super.getWorkHours())+ this.incentive ;
	}
}
