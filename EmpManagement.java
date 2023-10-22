package c209L02S1;

import java.util.ArrayList;

import C09L01S1.Helper;

public class EmpManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Emp> empList=new ArrayList<Emp>();
int option=0;
while(option!=4) {
	menu();
	option=Helper.readInt("Enter option:");
	if(option==1) {
		Helper.line(40, "-");
		System.out.println("");
		int id=Helper.readInt("Enter id>");
		double salary=Helper.readInt("Enter salary");
		String email=Helper.readString("Enter email");
		char gender=Helper.readChar("Enter gender(m/f)");
		empList.add(new Emp(id,salary,email,gender));
		System.out.println("Employee added");
		
		
		}
	else if(option==2) {
		Helper.line(60,"-");
		int updateID=Helper.readInt("Enter ID new update");
		boolean isUpdated=false;
		for(Emp emp:empList) {
			if(emp.getId()==updateID) {
				String updateEmail=Helper.readString("Enter new Email>");
				emp.setEmail(updateEmail);
				isUpdated=true;
				System.out.println("Employee email update");
				
			}
		if(isUpdated==false) {
			System.out.println("Invalid employee ID");
		}
			
		}
	}
	else if(option==3) {
		Helper.line(50, "-");
		String output=String.format("%-5s %-20s %-8s %-10s\n", "ID","Person Email","Gender","Salary");				
	    for(Emp emp:empList) {
	    	output+=String.format("%-5d %-20s %-8s %-10.2f\n",emp.getId(),emp.getEmail(),emp.getGender(),emp.getSalary());
	    }
	    System.out.println(output);
	    
	}
	else if(option==4) {
		  System.out.println("Thank u for using employee management program");
	}
	else 
	{
		  System.out.println("Invalid option");
	}
	
}
	}
public static void menu() {
	  System.out.println();
	  Helper.line(50,"-");
	  System.out.println("Welcome to employee management program");
	  Helper.line(50,"-");
	  System.out.println("1.Add employee>");
	  System.out.println("2.Update employee personal email>");
	  System.out.println("3.View employee list");
	  System.out.println("4.Quit.");
	  
	  
}

}
