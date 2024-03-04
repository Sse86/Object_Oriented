package PKG1;

class Employee {
	
	private String name;
	private int empId;
	private double workHours;
	protected double wage;
	private String jobTitle;
	private String deptName;
   
	Employee(String name,int empId, double workHours, double wage, 
			String jobTitle,String deptName){ 
		                       
		this.name=name;
		this.empId=empId;
		this.workHours=workHours;
		this.wage=wage;
		this.jobTitle=jobTitle;
		this.deptName=deptName;
	}
	
	
	public String getName() {
		return this.name;
	}
	public int getEmpId() {
		return this.empId;
	}
	public double getWorkHours() {
		return this.workHours;
	}
	public double getWage() {
		return  this.wage;
	}	
	public String getJobTitle() {
		
		return this.jobTitle;
	}
	public String getDeptName() {
		return this.deptName;
	}
	
	public double calcSalary() {
		return 0.0;
	}
  }

