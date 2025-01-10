package kadai_018;

abstract public class Kato_Chapter18 {
	//コンストラクタ
	public String familiyName = "加藤";
	public String givenName = "";
	public String address = "東京都中野区○×";
	
	//共通の紹介を出力
	public void commonIntroduce() {
		System.out.println("名前は" + familiyName + givenName + "です");
		System.out.println("住所は" + address + "です");
		
	}
	
	//個別の紹介を出力する
	abstract public void eachIntroduce();
	
	//紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}
