public class Game{
	public static void main(String[] args){
		Card[] mainDeck = new Card[112];
		mainDeck = fill(mainDeck);
		mainDeck = shuffle(mainDeck);

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
			boolean empty = false;
			int count=0;
			Card[] shuffled = new Card[108];
			while(empty==false){
				for(int x=0;x<108;x++){
				int rand = (int)(Math.random()*108)+1;
				if(mainDeck[rand]!=null){
					shuffled[x]=mainDeck[rand];
					mainDeck[rand]=null;
				}
				}
				for(int x=0;x<=107;x++){
					if(mainDeck[x]==null)
						count++;
				}
				if(count==108)
					empty=true;
				}
		return shuffled;
		}
}