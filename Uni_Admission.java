class Uni_Admission{
	public static void main(String[]args){
	int percentage=79;
	Boolean sportsCertificate=true;
	int familyIncome=200000;
	Boolean volunteerExperience=true;
		if(percentage>=90 && sportsCertificate==true && familyIncome<=200000){
		System.out.println("Full scholarship");
		}
		else if(percentage>=85 && (sportsCertificate==true || volunteerExperience==true )){
		System.out.println("Partial Scholarship");
		}

		else{
		System.out.println("No scholarship");
		}
	}
}