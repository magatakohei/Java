/*-< 演習：Ex1_11_1 >---------------------------------
while文を使用して、6の目がでるまでサイコロを降り続けるプログラムを作成してください。
※1～6までのランダムなint型の値を取得する方法 ： 1 + (int)(Math.random() * 6.0)
※6の目が出たら「6が出たのでを終了します」と表示してください
----------------------------------------------------*/
class Ex1_11_1 {
	public static void main(String[] args) {
		int diceSpot = 0;
		while (diceSpot != 6) {
			diceSpot = 1 + (int) (Math.random() * 6);
		}
		System.out.println("6が出たので終了します。");
	}
}
