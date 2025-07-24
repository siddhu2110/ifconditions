class Bus_Ticket{
   static String busname="Super luxury";
  public static void main(String[]args){
     if (busname  ==  "Super luxury"){
         System.out.println("Please select the seats");

     }
         Boolean selectedseats=true;
           if(selectedseats){

                   System.out.println("please choose payment method");
 
              }
                   String paymentmethod="Paytm";
                     if(paymentmethod == "Paytm"){
                         System.out.println("Paytm app opens");
                          }
                            int balance =500;
                            int amount=350;
                              if(amount <= balance){
                             System.out.println("your transaction is under process");       

                         }
                                  
   }
 }