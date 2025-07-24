class Sneha{
 public static void main(String[]args){
          int S1=66;
	  int S2=98;
	  int S3=80;
	  int S4=36;
	  int S5=64;
	  int S6=38;
          float avg=((S1+S2+S3+S4+S5+S6)/6);
	  if  (avg>=90){
		System.out.println("Outstanding");
		}
	  else if(avg>=75){
		System.out.println("Distinction");
		}	  
	  else if(avg>=60){
		System.out.println("First Class");
		}
	  else{
		System.out.println("Pass");
		}
	}
}