import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Checker implements Comparator<Player>{
	@Override
    public int compare(Player a, Player b){
		//if(a.name.equals(b.name)) {
		if(a.score == b.score) {
			System.out.println(a.name + " compareTo " + b.name + " = " +  a.name.compareTo(b.name));
			return a.name.compareTo(b.name);
		}else {
			System.out.println(b.name+"("+b.score+")" + " - " + a.name+"("+a.score+")" + " = " + (b.score - a.score));
			return b.score - a.score;
		}
    }
}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class JavaComparator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        //Arrays.sort(player);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }

	}

}
