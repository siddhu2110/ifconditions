class Priya_Online_Shopping{
 public static void main(String[]args){
	int amount=10000;
	Boolean isMember=true;
	if(amount>=10000 && isMember==true){
		System.out.println("30% discount is available");
		}
	else if(amount>=5000 && isMember==true){
		System.out.println("20% discount is available");		
		}
	else{
		System.out.println("5% discount is available");
		}
	}
}