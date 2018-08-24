package week2.lesson3;

public class MainPhone {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Phone phone1 = new Phone("222-22-22");
		Phone phone2 = new Phone("222-21-22");
		Phone phone3 = new Phone("222-21-23");
		Phone phone32 = new Phone("222-21-23");
		Phone phone4 = new Phone("212-21-23");
		Phone phone5 = new Phone("112-21-23");
		Phone phone6 = new Phone("212-21-66");
		Phone phone7 = new Phone("233-21-23");
		Phone phone8 = new Phone("212-222-23");
		Phone phone9 = new Phone("212-21-234");
		Phone phone10 = new Phone("712-21-23");
		Phone phone11 = new Phone("772-21-23");
		phone2.call("02");
		System.out.println(phone3.getMyNumber());
		phone1.sendSms(phone3.getMyNumber(), "You have won!");
	}

}
//done