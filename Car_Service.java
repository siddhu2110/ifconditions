class Car_Service{
 public static void main(String[]args){
	int a=200;
	if(a>20000){
		System.out.println("It needs full service");
		}
	else if(a>10000 && a<20000){
		System.out.println("It needs semi-service");
		}
	else if(a<10000){
		System.out.println("Only general checkup is needed");
		}
	}
}