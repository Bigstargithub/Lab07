package edu.handong.csee.java.Lab07.prob03; // the package that perform Attendence class.
import java.util.Random; // get the Random class from the java.util package.
/**
 * This is Attendence class.</br>
 * The class will display your Attendence.</br>
 * If your Absence is greater than 6, you will fail.</br>
 * But it is less than 6, you will not fail.</br>
 * @author Bigstar</br>
 *
 */
public class Attendence {

	String name,ID; // set the String variable, name and ID.
	int grade; // set the integer variable, grade.
	int absence; // set the integer variable, grade.
	
	/**
	 * This method is constructor.</br>
	 * The constructor instantiates the object, Attendence class.</br>
	 */
	
	public Attendence()
	{
		name = ""; // call to initial String variable, name.
		grade = 0 ; // call to initial integer variable, grade.
		ID = ""; // call to initial String variable, ID.
		absence = 0; // call to initial integer variable, Name.
	}
	/**
	 * This method is constructor.</br>
	 * @param name</br>
	 * @param grade</br>
	 * @param ID</br>
	 * @param absence</br>
	 */
	public Attendence(String name,int grade, String ID, int absence)
	{
		this.name = name; // the this keyword. the object points itself.
		this.grade = grade; // the this keyword. the object points itself.
		this.ID = ID; // the this keyword. the object points itself.
		this.absence = absence; // the this keyword. the object points itself.
	}
	/**
	 * The method points out instance variable (name) itself.</br>
	 * @param name
	 */
	public void get_name(String name)
	{
		this.name = name; // instance String variable(name) itself.
	}

	/**
	 * The method points out instance variable (grade) itself.</br>
	 * @param grade
	 */
	
	public void get_grade(int grade)
	{
		this.grade = grade; // instance integer variable(grade) itself.
	}
	
	/**
	 * The method points out instance variable (ID) itself.</br>
	 * @param ID
	 */
	public void get_ID(String ID)
	{
		this.ID = ID; //  instance String variable(ID) itself.
	}
	
	/**
	 * The method points out instance variable (absence) itself.</br>
	 * @param absence
	 */
	public void get_absence(int absence)
	{
		this.absence = absence; // instance integer variable(absence) itself.
	}
	
	/**
	 * The method returns String variable, name.</br>
	 * @return name
	 */
	public String setname()
	{
		return this.name; // return String variable, name.
	}
	
	/**
	 * The method returns integer variable, grade.</br>
	 * @return grade
	 */
	public int grade()
	{
		return this.grade; // return integer variable, grade.
	}
	
	/**
	 * The method returns String variable, ID.</br>
	 * @return ID
	 */
	public String setID()
	{
		return this.ID; // return String variable, ID.
	}
	
	/**
	 * The method returns integer variable, absence.</br>
	 * @return
	 */
	public int setabsence()
	{
		return this.absence; // return integer variable, absence.
	}
	
	/**
	 * This is a main method of Attendence class.</br>
	 * @param args
	 */
	
	public static void main(String[] args)
	{
		Attendence Student1 = new Attendence("Jess",4, "21400999", 0); // instantiate the Chicken class. instance name is Student1.
		Attendence Student2 = new Attendence("Kent",2, "21700111", 0); // instantiate the Chicken class. instance name is Student2.
		Attendence Student3 = new Attendence("Lucas",1, "21833222", 0);// instantiate the Chicken class. instance name is Student3.
		Attendence Student4 = new Attendence(); // instantiate the Chicken class. instance name is Student4.
		
		Student4.get_name("Martha"); // get the Student4's name, Martha.
		Student4.get_grade(2); // get the Student4's grade, 2.
		Student4.get_ID("21733444");// get the Student4's ID, 21733444.
		Random RD = new Random(); // instantiate Random class.
		
		Student1.get_absence(RD.nextInt(10)); // get the Student1's absence randomly.
		Student2.get_absence(RD.nextInt(10)); // get the Student2's absence randomly.
		Student3.get_absence(RD.nextInt(10)); // get the Student3's absence randomly.
		Student4.get_absence(RD.nextInt(10)); // get the Student4's absence randomly.
		
		
		if(Student1.setabsence()>6) // if Student1's absence is greater than 6.
			System.out.println("I'm sorry " + Student1.setname() + " You failed this course."); // you will see "I'm sorry Jess, you failed this course."
		else
			System.out.println("You will see your score " + Student1.setname()); // if not, you will see "you will see your score Jess".
		
		if(Student2.setabsence()>6) // if Student2's absence is greater than 6.
			System.out.println("I'm sorry " + Student2.setname() + "You failed this course."); // you will see "I'm sorry Kent, you failed this course."
		else
			System.out.println("You will see your score " + Student2.setname()); // if not, you will see "you will see your score Kent".
		
		if(Student3.setabsence()>6) // if Student3's absence is greater than 6.
			System.out.println("I'm sorry " + Student3.setname() + "You failed this course."); // you will see "I'm sorry Lucas, you failed this course."
		else
			System.out.println("You will see your score " + Student3.setname()); // if not, you will see "you will see your score Lucas".
		
		if(Student4.setabsence()>6) // if Student4's absence is greater than 6.
			System.out.println("I'm sorry " + Student4.setname() + "You failed this course."); // you will see "I'm sorry Martha, you failed this course."
		else
			System.out.println("You will see your score " + Student4.setname()); // if not, you will see "you will see your score Martha".
	}
}
