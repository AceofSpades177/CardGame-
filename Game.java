import java.util.ArrayList;
public class Game{
	//Main Variables
	private ArrayList<Card> mainDeck;
	private Card currentCard;
	private int currentPlayer;
	private int maxIndex=3;
	private int nextPlayer=1;
	private ArrayList<Player> Players;
	//starts Game and calls methods
	public void startGame(){
		fill();
		shuffle();
		distribute();
	}
	//Fills up mainDeck
	public void fill(){
		String tempColor = "";
		for(int x=0;x<4;x++){
			if(x==0)
				tempColor = "red";
			if(x==1)
				tempColor = "blue";
			if(x==2)
				tempColor = "green";
			if(x==3)
				tempColor = "yellow";
			mainDeck.add(new Card(0, tempColor));
			for(int y=1;y<10;y++){
				mainDeck.add(new Card(y, tempColor));
				mainDeck.add(new Card(y, tempColor));
			}
			for(int y=0;y<10;y++){
				if(y==1||y==2){
					mainDeck.add(new Card("skip",tempColor));
					}
				if(y==3||y==4){
					mainDeck.add(new Card("reverse",tempColor));
					}
				if(y==5||y==6){
					mainDeck.add(new Card("+2",tempColor));
					}
				if(y==7){
					mainDeck.add(new Card("wild"));
					}
				if(y==8){
					mainDeck.add(new Card("+4"));
					}
				if(y==9){
					mainDeck.add(new Card("skipEveryone",tempColor));
					}
				}
			}
		}

		//shuffles mainDeck
		public void shuffle()
				{
				Card temp;
				for(int x=0;x<112;x++){
				int rand = (int)(Math.random()*112);
				temp = mainDeck.get(x);
				mainDeck.set(x, mainDeck.get(rand));
				mainDeck.set(rand, temp);
				}
		}
		//distrubutes cards from mainDeck to all Players
		public void distribute(){
					for(int x=0;x<7;x++){
					Players.get(0).add(mainDeck.get(0));
					mainDeck.remove(0);
					Players.get(1).add(mainDeck.get(0));
					mainDeck.remove(0);
					Players.get(2).add(mainDeck.get(0));
					mainDeck.remove(0);
					Players.get(3).add(mainDeck.get(0));
					mainDeck.remove(0);
					}
					System.out.println(Players.get(0).toString());
					System.out.println(Players.get(1));
					System.out.println(Players.get(2));
					System.out.println(Players.get(3));
					currentCard=mainDeck.get(0);
					mainDeck.remove(0);
		}
}