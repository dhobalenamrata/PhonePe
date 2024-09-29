package app_PhonePe;

public class PhonePe{
	 static BankAccount acc;
	
	public PhonePe(BankAccount acc) {
		this.acc = acc;
	}
	
	public static void makePayment(QR qr,double amt){
		if(qr instanceof QR && amt>0 && amt<acc.getBalance()){
			acc.setBalance(acc.getBalance() - amt);
			System.out.println("Payment successful");
		}
		else
		{
			System.out.println("The System is not able to pay "+amt+" amount.");
		}
	}
	public static void makePayment(UPIiD upi,double amt){
		if(upi instanceof UPIiD && amt>0 && amt<acc.getBalance()){
			double mp = acc.getBalance() - amt;
			acc.setBalance(mp);
			System.out.println("Payment successful");
		}
		else
		{
			System.out.println("The System is not able to pay "+amt+" amount.");
		}
	}
	public static void makePayment(MobileNumber mobNo,double amt){
		if(mobNo instanceof MobileNumber && amt>0 && amt<acc.getBalance()){
			double mp = acc.getBalance()- amt;
			acc.setBalance(mp);
			System.out.println("Payment successful");
		}
		else
		{
			System.out.println("The System is not able to pay "+amt+" amount.");
		}
	}
	public static void makePayment(AccountNumber accNo,double amt){
		if(accNo instanceof AccountNumber && amt>0 && amt<acc.getBalance()){
			double mp = acc.getBalance() - amt;
			acc.setBalance(mp);
			System.out.println("Payment successful");
		}
		else
		{
			System.out.println("The System is not able to pay "+amt+" amount.");
		}
	}
}
