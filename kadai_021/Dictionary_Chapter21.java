package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	HashMap<String,String> fruits = new HashMap<String,String>();
	
	public Dictionary_Chapter21() {
	
	fruits.put("apple","りんご");
	fruits.put("peach","桃");
	fruits.put("banana","バナナ");
	fruits.put("lemon","レモン");
	fruits.put("pear","梨");
	fruits.put("kiwi","キウィ");
	fruits.put("strawberry","いちご");
	fruits.put("grape","ぶどう");
	fruits.put("muscat","マスカット");
	fruits.put("cherry","さくらんぼ");
	}
	
	public String getFruits(String engFruit) {
		String wayaku = fruits.get(engFruit);
		if (wayaku != null) {
			return engFruit + "の意味は" + wayaku;	
		} else {
			return 	engFruit + "は辞書に存在しません";
		}
			
	}
	
}
