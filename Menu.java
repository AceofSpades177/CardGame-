import java.util.Scanner;
public class Menu{
	public static void main(String[] args){
	start();
	}
	public static void start(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to My Card Game");
		System.out.println("Press G to Start a New Game ");
		if(scan.nextLine().equals("G")||scan.nextLine().equals("g")){
			Game game1 = new Game();
		}
		else
			start();
	}
}