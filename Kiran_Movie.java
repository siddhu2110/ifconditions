class Kiran_Movie{
	public static void main(String[]args){
	
	Boolean weekend=false;
	Boolean weekday=true;
	Boolean VIP_seat=true;
	Boolean normal_seat=false;

	if(weekend == true && VIP_seat == true){
		System.out.println("ticket price is 500");
		}
	else if(weekend == true && normal_seat == true){
		System.out.println("ticket price is 300");
		}
	else if(weekday == true && VIP_seat == true){
		System.out.println("ticket price is 400");
		}
	else if(weekday == true && normal_seat == true){
		System.out.println("ticket price is 200");
		}

	}
}