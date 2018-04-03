package edu.handong.csee.java.Lab07.prob02; // the package that perform Chicken class.

/**
 * This is a Chicken class. </br>
 * This class displays Chicken's menu and customer's review.</br>
 * 
 * @author Bigstar
 */
public class Chicken {
    String Name; // Chicken's name.
    double price; // Chicken's price.
    int numberofstars; // customer's review
    
    /**
	 * This method is constructor.</br>
	 * The constructor instantiates the object, Chicken class.</br>
	 */
    
	public Chicken()
	{
		Name = ""; // call to initial String, Name.
		price = 0; // call to initial double, price.
		numberofstars = 0 ; // call to initial integer, numberofstars.
	}
	
	/**
	 * This method is constructor.</br>
	 * @param Name</br>
	 * @param price</br>
	 * @param numberofstars</br>
	 */
	public Chicken(String Name, double price, int numberofstars)
	{
		this.Name = Name; // the this keyword. the object points itself.
		this.price = price; // the this keyword. the object points itself.
		this.numberofstars = numberofstars; // the this keyword. the object points itself.
	}
	/**
	 * this method points out the instance variable(Name) itself.</br>
	 * @param Name</br>
	 */
	public void get_name(String Name)
	{
		this.Name = Name; // instance String variable(Name) itself.
	}
	/**
	 * this method points out the instance variable(price) itself.</br>
	 * @param price</br>
	 */
	public void get_price(double price)
	{
		this.price = price; // instance double variable(price) itself.
	}
	/**
	 * this method points out the instance variable(numberofstars) itself.</br>
	 * @param numberofstars</br>
	 */
	public void get_numberofstars(int numberofstars)
	{
		this.numberofstars = numberofstars; // instance integer variable(numberofstars) itself.
	}
	
	/**
	 * this method returns String variable (name).</br>
	 * @return</br>
	 */
	public String setname()
	{
		return this.Name; // return String variable, name.
	}
	/**
	 * this method returns double variable (price).</br>
	 * @return</br>
	 */
	public double setprice()
	{
		return this.price; // return double variable, price.
	}
	/**
	 * this method returns integer variable (numberofstars).</br>
	 * @return</br>
	 */
	public int setnumberofstars()
	{
		return this.numberofstars; // return integer variable, numberofstars. 
	}
	
	/**
	 * this is a main method of chicken class.</br>
	 */
	public static void main(String[] args)
	{
		Chicken menu1 = new Chicken("Cheese_mustard",16000.00,3); // instantiate the Chicken class. instance name is menu1.
		Chicken menu2 = new Chicken("Honey_mustard",16000.00,4); // instantiate the Chicken class. instance name is menu2.
		Chicken menu3 = new Chicken("Spicey_chicken",16000.00,1); // instantiate the Chicken class. instance name is menu3.
		
		System.out.println(menu1.setname() + "'s rating is " + menu1.setnumberofstars()); // display the Chicken menu1's name and numberofstars.
		System.out.println(menu2.setname() + "'s rating is " + menu2.setnumberofstars()); // display the Chicken menu2's name and numberofstars.
		System.out.println(menu3.setname() + "'s rating is " + menu3.setnumberofstars()); // display the Chicken menu3's name and numberofstars.
	
	}
	
}
