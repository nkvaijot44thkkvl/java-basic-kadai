package kadai_015;

public class Car_Chapter15 {
	//フィールド設定
	public int gear = 1;
	public int speed =10;
	
	//
	public Car_Chapter15 (int gear,int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	public void gearChange(int afterGear) {
		if (afterGear > 0 && afterGear < 6) {
			this.gear = afterGear;
			this.speed = afterGear * 10;
		} else {
			this.speed = 10;
		}
	}

	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
		
}