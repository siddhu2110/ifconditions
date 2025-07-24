class Sunitha_Marathon{
	public static void main(String[]args){
	  int age=36;
	  Boolean isAccepted=true;

	  if(age>=18 && age<=45 && isAccepted){
		System.out.println("She can participate");
		}
	  else if(age<18 || age>45 ){
		System.out.println("Not allowed");
		} 
	  else if(isAccepted==false){
		System.out.println("denied");
		}
	else{
		System.out.println("denied");
		}
	}

}