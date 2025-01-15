package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	HashMap<String,String> jyanken = new HashMap<String,String>();
	public String myChoice;
	public String yourChoice;
	public int piyo;
	public String aite;
	public String hogehoge;
	
	public Jyanken_Chapter26() {
		jyanken.put("r", "グー");
		jyanken.put("s", "チョキ");
		jyanken.put("p", "パー");
		
		piyo = 0;
		hogehoge = "";
	}
	
	public void playGame(String myChoice, String yourChoice) {
		if (myChoice.equals(yourChoice)) {
			System.out.println("あいこです");
		} else {
			if(myChoice.equals("r")) {
				switch (yourChoice) {
				case "s" -> System.out.println("自分の勝ちです");
				case "p" -> System.out.println("自分の負けです");
				}
			} else if(myChoice.equals("s")) {
				switch (yourChoice) {
				case "p" -> System.out.println("自分の勝ちです");
				case "r" -> System.out.println("自分の負けです");
				}
			} else if(myChoice.equals("p")) {
				switch (yourChoice) {
				case "r" -> System.out.println("自分の勝ちです");
				case "s" -> System.out.println("自分の負けです");
				}
			}
		}
		
	}

  public String getRandom() {
                //対戦相手のじゃんけんがランダムで選ばれる
	  			String aite;
	  			
                piyo = (int)Math.floor(Math.random() * 3);
                
                hogehoge = switch (this.piyo) {
                case 0 -> "r";
                case 1 -> "s";
                default -> "p";
                };
                                
                aite = jyanken.get(hogehoge);
                return hogehoge;
	}

	public String getMyChoice() {
	
		Scanner fuga = new Scanner(System.in);
        String input = fuga.nextLine();
        fuga.close();        
        
        return input;
	} 
}