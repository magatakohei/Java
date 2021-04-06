public class Referee {
  final String HAND_G = "グー";
  final String HAND_C = "チョキ";
  final String HAND_P = "パー";

  private String name;

  Referee(String nm) {
    this.name = nm;
  }

  // 開始
  void gameStart() {
    System.out.println("審判" + this.name + "「じゃんけん・・・ぽん！！！！！」");
  }

  // じゃんけんの手
  void sayHandStatus(String playerName, String handStatus) {
    System.out.println("審判" + this.name + "「" + playerName + "さんの手は" + handStatus + "でした！」");
  }

  // 勝敗
  void sayJudge(String playerName1, String handStatus1, String playerName2, String handStatus2) {

    System.out.println("結果は・・・");
    if (handStatus1 == handStatus2) {
      System.out.println("あいこ！勝負つかず!");
    } else if ((handStatus1 == HAND_P && handStatus2 == HAND_G) || (handStatus1 == HAND_G && handStatus2 == HAND_C)
        || (handStatus1 == HAND_C && handStatus2 == HAND_P)) {
      System.out.println(playerName1 + "さんの勝利!");
    } else {
      System.out.println(playerName2 + "さんの勝利!");
    }

  }

  public String getName() {
    return this.name;
  }
}
