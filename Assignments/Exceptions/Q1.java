

import java.util.Scanner;

class Student {
	private int rollno;
	private String sname;
	private String staddress;
	private StudentResult srobj;

	public Student(int rollno, String sname, String staddress, StudentResult srobj) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.staddress = staddress;
		this.srobj = srobj;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getStaddress() {
		return staddress;
	}

	public void setStaddress(String staddress) {
		this.staddress = staddress;
	}

	public StudentResult getSrobj() {
		return srobj;
	}

	public void setSrobj(StudentResult srobj) {
		this.srobj = srobj;
	}

}

class StudentResult {

	private int marksOfSub1;
	private int marksOfSub2;
	private int marksOfSub3;
	private int marksOfSub;

	public StudentResult(int marksOfSub1, int marksOfSub2, int marksOfSub3, int marksOfSub) {
		super();
		this.marksOfSub1 = marksOfSub1;
		this.marksOfSub2 = marksOfSub2;
		this.marksOfSub3 = marksOfSub3;
		this.marksOfSub = marksOfSub;
	}

	public int getMarksOfSub1() {
		return marksOfSub1;
	}

	public void setMarksOfSub1(int marksOfSub1) {
		this.marksOfSub1 = marksOfSub1;
	}

	public int getMarksOfSub2() {
		return marksOfSub2;
	}

	public void setMarksOfSub2(int marksOfSub2) {
		this.marksOfSub2 = marksOfSub2;
	}

	public int getMarksOfSub3() {
		return marksOfSub3;
	}

	public void setMarksOfSub3(int marksOfSub3) {
		this.marksOfSub3 = marksOfSub3;
	}

	public int getMarksOfSub() {
		return marksOfSub;
	}

	public void setMarksOfSub(int marksOfSub) {
		this.marksOfSub = marksOfSub;
	}

}

class ResultException extends Exception {
	private static final long serialVersionUID = 1L;

	public ResultException(String noOfSubject) {
		super(noOfSubject);
	}
}

class NegtaiveMarksException extends Exception {
	private static final long serialVersionUID = 1L;

	public NegtaiveMarksException(String marks) {
		super(marks);
	}
}

class FailException extends Exception {
	private static final long serialVersionUID = 1L;

	public FailException(String score) {
		super(score);
	}
}

public class Q1 {
	private static void validate1(double score) throws FailException {
		if (score < 40) {
			throw new FailException("Total score is less than 40%.");
		}
	}

	private static void validate(int m1, int m2, int m3, int m4) throws ResultException {
		if (m1 < 30 || m2 < 30 || m3 < 30 || m4 < 30) {
			throw new ResultException("User is failed in more than 1 subject.");
		}
	}

	private static void validate2(int m1, int m2, int m3, int m4) throws NegtaiveMarksException {
		if (m1 < 0 || m2 < 0 || m3 < 0 || m4 < 0) {
			throw new NegtaiveMarksException("User mistakenly input the negative marks.");
		}
	}

	public static void main(String[] args) {

		StudentResult sr = new StudentResult(57, 78, -40, 87);
		Student s1 = new Student(20, "Ajay", "Goa", sr);
		try {
			Scanner scn= new Scanner(System.in);
			System.out.println("Enter subject1 marks:");
			int m1 = scn.nextInt();  sr.setMarksOfSub(m1);   //sr.getMarksOfSub(); 
			System.out.println("Enter subject2 marks:");
			int m2 = scn.nextInt(); sr.setMarksOfSub1(m2);
			System.out.println("Enter subject3 marks:");
			int m3 = scn.nextInt(); sr.setMarksOfSub2(m3);
			System.out.println("Enter subject4 marks:");
			int m4 = scn.nextInt(); sr.setMarksOfSub3(m4);
			
			int total = m1 + m2 + m3 + m4;
			double score = total / 4;
			System.out.println("score :" + score);

			validate(m1, m2, m3, m4);
			validate1(score);
			validate2(m1, m2, m3, m4);

		} catch (FailException e) {
			System.out.println("Exception :");
			e.printStackTrace();
		} catch (ResultException e) {
			System.out.println("Exception :");
			e.printStackTrace();
		} catch (NegtaiveMarksException e) {
			System.out.println("Exception :");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
