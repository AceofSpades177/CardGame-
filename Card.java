public class Card{
	private int num=-1;
	private String color;
	private String special;
	private String wild;
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
		if(special!=null)
			return(color + " " + special);
		return(wild);
	}
	public String getColor(){
		return color;
	}
	public String getSpecial(){
		return special;
	}
	public String getWild(){
		return wild;
	}
	public int getNum(){
		return num;
	}
	public String getType(){
	if(num!=-1)
		return "num";
	else if(special!=null)
		return "special";
	return "wild";
	}
}
