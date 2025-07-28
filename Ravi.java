class Ravi{
 public static void main(String[]args){
	int distance=105;
	Boolean weekdays=false;
	Boolean weekend=true;

		if(distance<50){
			System.out.println("bus fare is 50");
			}
		else if(distance>=50 && distance<100){
			System.out.println("bus fare is 100");
			}
		else if(distance>100 && weekdays == true ){

			System.out.println("bus fare is 200");
			}

		else if(distance>100 && weekend == true) {
			System.out.println("bus fare is 300");
			}		
	}
}