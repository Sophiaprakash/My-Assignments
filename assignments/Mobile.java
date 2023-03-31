package week1.day1.assignments;

public class Mobile {
	public void makeCall() {
	String mobileModel="iphone12";
	System.out.println(mobileModel);
	float mobileWeight=0.15f;
	System.out.println(mobileWeight);
	}
	public void sendMsg() {
	boolean FullCharged=true;
	System.out.println(FullCharged);
	int mobileCost=800;
	System.out.println(mobileCost);
	}
	
	public static void main(String[] args) {
		Mobile apple=new Mobile();
		apple.makeCall();
		apple.sendMsg();
		System.out.println("This is my mobile");
		}
	

}
