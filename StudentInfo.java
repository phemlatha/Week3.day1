package Week3.assinhments;

public class StudentInfo {
	public static void getStudentInfo( int id)
	{
		System.out.println( + id);
		return;
	}
	
	public static void getStudentInfo( int id,String name)
	{
		System.out.println( + id+ " and " +name);
		return;
	}
	public static void getStudentInfo( int id,String name,String email,String ph)
	{
		System.out.println( + id +", "+name +", "+ email+ " and " +ph);
		return;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentInfo stObj = new StudentInfo();
		stObj.getStudentInfo(10);
		stObj.getStudentInfo(12, "test");
		stObj.getStudentInfo(14, "mytest","test@lv.com" , "044 22323232");

	}

}
