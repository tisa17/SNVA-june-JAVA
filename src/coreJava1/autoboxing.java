package coreJava1;

public class autoboxing {
	
	public static void main(String[] args) {
	long long1= 87987;
	double double1= 9898.987;
	//Autoboxing
	
	Long longwrap=long1;
	Double doublewrap=double1;
	System.out.println(longwrap+" "+ doublewrap);
	
	//Auto-unboxing
	long long2= longwrap;
	double double2=doublewrap;
	System.out.println(long2+ " "+ double2);
	}

}
