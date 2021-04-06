public class Scenario {
  public static void main(String[] args) {
    String playerName1 = args[0];
    String playerName2 = args[1];

    // インスタンスの生成
    Player player1 = new Player(args[0]);
    Player player2 = new Player(args[1]);

    // makemakeHandStatusでじゃんけんの手を決定
    player1.makeHandStatus();
    player2.makeHandStatus();

    // 出力
    System.out.println("じゃんけん・・・ぽん!!!!!");
    System.out.println(player1.name + "さんの手：" + player1.handStatus);
    System.out.println(player2.name + "さんの手：" + player2.handStatus);
    System.out.println("結果は・・・");
    // 勝敗
    if (player1.handStatus == player2.handStatus) {
      System.out.println("あいこ！勝負つかず!");
    } else if ((player1.handStatus.equals("パー") && player2.handStatus.equals("グー"))
        || (player1.handStatus.equals("グー") && player2.handStatus.equals("チョキ"))
        || (player1.handStatus.equals("チョキ") && player2.handStatus.equals("パー"))) {
      System.out.println(player1.name + "さんの勝利!");
    } else {
      System.out.println(player2.name + "さんの勝利!");
    }
  }
}
