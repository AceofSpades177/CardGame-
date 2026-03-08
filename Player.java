import java.util.ArrayList;
public class Player{
	private ArrayList<Card> deck;
	private String name;
	public Player(String a){
		name = a;
		deck = new ArrayList<Card>();
	}
	public void add(Card card){
		deck.add(card);
	}
	public String toString(){
		String str=name+" ";
		for(int x=0;x<deck.size();x++)
		str+=deck.get(x)+", ";
		return str;
	}
}
