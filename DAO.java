
class student{
	String name;
	String course;
	int fee;
	public student(String name, String course, int fee) {
		super();
		this.name = name;
		this.course = course;
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", course=" + course + ", fee=" + fee + "]";
	}
	
}

class lsitofstudents{
	public static void main(String[] args) {
		List<student>list=Arrays.asList(
				new student("shaad","Js",2000),
				new student("aysha","DevOps",4000),
				new student("zain","Python",3000),
				new student(null,"DevOps",4000),
				new student("shaad","DevOps",5000),
				new student("riad","DevJavaOps",2500),
				new student("taseen","Python",4000),
				new student("aysha","DevOps",4000),
				new student("shaad","DevOps",8000),
				new student("moti","Js",2700),
				new student(null,"DevOps",4000),
				new student("sami","DevOps",3000),
				new student("yaseen","Java",6000),
				new student("shaad","DevOps",8000),
				new student("kamal","DevOps",5400),
				new student("shaad","Python",3200),
				new student("amit","Java",2000),
				new student("shaad","DevOps",5000),
				new student(null,"DevOps",4000)
				);
