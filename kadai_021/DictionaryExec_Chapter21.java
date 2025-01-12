package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		//辞書クラスの宣言、インスタンス化
		Dictionary_Chapter21 dic21 = new Dictionary_Chapter21();
		
		//調べる英単語を配列にセット
		String[] searchWords = {"apple","banana","grape","orange"}; 
				
		//辞書を調べるメソッドを引数指定で呼び出す
		for(int i = 0; i < searchWords.length; i++) {
			System.out.println(dic21.getFruits(searchWords[i]));
		}
		
		
	}

}
