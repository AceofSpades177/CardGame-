public class Card{
	private int num;
	private String color;
	private String special;
	public Card(int a, String b){
		num = a;
		color = b;
	}
	public Card(String a, String b){
		special = a;
		color = b;
	}
	public Card(String a){
		special=a;
	}
}
