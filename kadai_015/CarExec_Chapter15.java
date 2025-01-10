package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
					
		//車をインスタンス化
		Car_Chapter15 car = new Car_Chapter15( 1 , 10 );
		int beforeGear = car.gear;
		
		//ギアを変更
		car.gearChange( 3 );
		
		//ギアの変更を出力
		System.out.println("ギア" + beforeGear +"から"+ car.gear +"に切り替えました");
		
		//ギアチェンジ後の速度を表示
		car.run();
	}

}