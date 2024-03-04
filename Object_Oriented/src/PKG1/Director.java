package PKG1;

class Director extends Employee{
	
	private double promotionExpense;
	
	Director(String name,int empId,double workHours,
			 double wage, String jobTitle,String deptName,
			 double promotionExpense){
		super(name,empId,workHours,wage,jobTitle,deptName);
		this.promotionExpense=promotionExpense;
	}
	public double getPromotionExpense() {
		return this.promotionExpense;
	}

}
