
/**
 * A class to represent a bank customer
 * 
 * @author Dler Ahmad , Atir Petkar
 * @version May 17, 2015
 */
public class Node 
{
	
	int age;
	String job;
	String martial;
	String education;
	String dfault;
	double balance;
	String housing;
	String loan;
	String contact;
	int day;
	String month;
	int duration;
	int campaign;
	int pdays;
	int previous;
	String poutcome;
	String classVariable;
	
	/**
	 * constructor of the client
	 * 
	 * @param age
	 * @param job
	 * @param martial
	 * @param education
	 * @param dfault
	 * @param balance
	 * @param housing
	 * @param loan
	 * @param contact
	 * @param day
	 * @param month
	 * @param duration
	 * @param campaign
	 * @param pdays
	 * @param previous
	 * @param poutcome
	 */
	public Node(int age,String job,String martial,String education,String dfault,double balance,
				String housing,String loan,String contact,int day,String month,int duration,
				int campaign,int pdays,int previous,String poutcome)
	{
		this.age=age;
		this. job=job;
		this. martial=martial;
		this.education=education;
		this. dfault=dfault;
		this. balance=balance;
		this. housing=housing;
		this. loan=loan;
		this.contact=contact;
		this. day=day;
		this. month=month;
		this. duration=duration;
		this. campaign=campaign;
		this. pdays=pdays;
		this. previous=previous;
		this. poutcome=poutcome;
	}
	
	/**
	 * 	sets the class variable
	 * 
	 * @param value
	 */
	public void setClassVariable(String value)
	{
		this.classVariable=value;
	}
	
	/**
	 * 	gets the class variable
	 * 
	 * @return class variable
	 */
	public String getClassVariable()
	{
		return this.classVariable;
	}
	
	/**
	 * return string representing this client
	 */
	public String toString()
	{
		return this.age+";"+this.job+";"+this.martial+";"+this.dfault+";"+
		this.balance+";"+this.housing+";"+this.loan+";"+this.day+";"+this.month+";"+
		this.duration+";"+this.campaign+";"+this.pdays+";"+this.previous+";"+this.poutcome;
	}
}
