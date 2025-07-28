class Passport_Visa_Eligibility{
	public static void main(String[]args){
		
	int age=25;
	Boolean hasPassport=true;
	Boolean hasNoCriminalRecord=false;
	Boolean passport_missing=true;
	
	if(age>=18 && hasPassport == false && hasNoCriminalRecord == true){
	System.out.println("Eligible for visa");
	}

	else if(age>=18 && passport_missing==true && hasNoCriminalRecord==true){
	System.out.println("Apply for passport first");
	}

	else if(age<18 || hasNoCriminalRecord==false){
	System.out.println("Not eligible");
	}


	}
}