public class Card{
	private int num=-1;
	private String color;
	private String special = "";
	private String wild = "";
	public Card(int a, String b){
		num = a;
		color = b;
	}
	public Card(String a, String b){
		special = a;
		color = b;
	}
	public Card(String a){
		wild=a;
	}
	public String toString(){
		if(num!=-1)
		return(color + " " + num);
		if(!special.equals(""))
		return(color + " " + special);
		return(wild);
	}
}
