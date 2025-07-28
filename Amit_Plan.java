class Amit_Plan{
	public static void main(String[]args){
		int data=1500;
		Boolean Basic=false;
		Boolean Standard=true;

		if(data>500 && Basic==true){
		System.out.println("Premium is suggested");
		}
		else if(data>1000 && Standard==true){
		System.out.println("Ultra is suggested");
		}
		else{
		System.out.println("Continue the same plan");
		}
	}
}