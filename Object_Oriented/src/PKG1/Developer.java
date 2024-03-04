package PKG1;

class Developer extends Employee {
	
	private double overtime;
	
	Developer(String name,int empId,double workHours,
			  double wage,String jobTitle,String deptName, double overtime) { 
		super(name,empId,workHours,wage,jobTitle,deptName);
		this.overtime=overtime;
	}
	
	@Override
	public double calcSalary() {
		return super.getWage()  * (super.getWorkHours()+ this.overtime) ;
	}
		
}


