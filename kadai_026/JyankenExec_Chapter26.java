package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		//じゃんけんクラスのインスタンス作成
		Jyanken_Chapter26 hoge = new Jyanken_Chapter26();

		//自分のじゃんけんの手を入力
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		String jibun = hoge.getMyChoice();

		//対戦相手のじゃんけんがランダムで選ばれる
		String aite = hoge.getRandom();
		System.out.println("自分の手は" +  hoge.jyanken.get(jibun) + ",対戦相手の手は" + hoge.jyanken.get(aite));

		hoge.playGame(jibun,aite);

	}

}