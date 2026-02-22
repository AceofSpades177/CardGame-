import java.util.ArrayList;
public class Game{
	public static void main(String[] args){
		Card[] mainDeck = new Card[112];
		mainDeck=fill(mainDeck);
		mainDeck=shuffle(mainDeck);
		ArrayList<Card> Player1 = new ArrayList<>();
		ArrayList<Card> Player2 = new ArrayList<>();
		ArrayList<Card> Player3 = new ArrayList<>();
		ArrayList<Card> Player4 = new ArrayList<>();
		distrubute(mainDeck, Player1, Player2, Player3, Player4);
		}
		public static Card[] fill(Card[] mainDeck){
			String tempColor = "";
			int count = 0;
			for(int x=0;x<4;x++){
				if(x==0)
					tempColor = "red";
				if(x==1)
					tempColor = "blue";
				if(x==2)
					tempColor = "green";
				if(x==3)
			tempColor = "yellow";
			mainDeck[count]= new Card(0, tempColor);
			count++;
			for(int y=1;y<10;y++){
				mainDeck[count]= new Card(y, tempColor);
				count++;
				mainDeck[count]= new Card(y, tempColor);
				count++;
			}
			for(int y=0;y<10;y++){
				if(y==1||y==2){
					mainDeck[count]= new Card("skip",tempColor);
					count++;}
				if(y==3||y==4){
					mainDeck[count]= new Card("reverse",tempColor);
					count++;}
				if(y==5||y==6){
					mainDeck[count]= new Card("+2",tempColor);
					count++;}
				if(y==7){
					mainDeck[count]= new Card("wild");
					count++;}
				if(y==8){
					mainDeck[count]= new Card("+4");
					count++;}
				if(y==9){
					mainDeck[count]= new Card("skipEveryone",tempColor);
					count++;}
			}
		}
		return mainDeck;
		}
		public static Card[] shuffle(Card[] mainDeck)
		{
			Card temp;
			for(int x=0;x<112;x++){
			int rand = (int)(Math.random()*112);
			temp = mainDeck[x];
			mainDeck[x]=mainDeck[rand];
			mainDeck[rand]=temp;
			}
			return mainDeck;
		}
		public static void distrubute(Card[] mainDeck, ArrayList<Card> Player1, ArrayList<Card> Player2, ArrayList<Card> Player3, ArrayList<Card> Player4){
			int count = 0;
			for(int x=0;x<7;x++){
			Player1.add(mainDeck[count]);
			count++;
			Player2.add(mainDeck[count]);
			count++;
			Player3.add(mainDeck[count]);
			count++;
			Player4.add(mainDeck[count]);
			count++;
			}
			System.out.println(Player1);
			System.out.println(Player2);
			System.out.println(Player3);
			System.out.println(Player4);
		}
}