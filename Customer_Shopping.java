class Customer_Shopping{
	public static void main(String[]args){
		int cartAmount=4000;
		Boolean isMember=false;
		Boolean hasCoupon=true;

		if(cartAmount>5000 && isMember==true){
		System.out.println("25% Discount");
		}
		else if (cartAmount>3000 && isMember==true && hasCoupon==true){
		System.out.println("20% Discount");
		}
		else if(cartAmount>3000 && isMember==true || hasCoupon==true){
		System.out.println("10% Discount");
		}
		else{
		System.out.println("No Discount");
		}
	}
}