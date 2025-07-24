class Vikram_Visa{
	public static void main(String[]args){
		int age=19;
		Boolean passport=true;
		if(age>=18 && passport==true){
		System.out.println("Valid passport and Visa application is accepted");
		}
		else if(age>=18 && passport==false){
		System.out.println(" no Valid passport and application is rejected ");
		
		}
		else if(age<18){
		System.out.println("visa not allowed");		}
	}
}