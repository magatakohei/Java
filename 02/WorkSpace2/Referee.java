public class Referee {
  String name;

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
    } else if ((handStatus1 == "パー" && handStatus2 == "グー") || (handStatus1 == "グー" && handStatus2 == "チョキ")
        || (handStatus1 == "チョキ" && handStatus2 == "パー")) {
      System.out.println(playerName1 + "さんの勝利!");
    } else {
      System.out.println(playerName2 + "さんの勝利!");
    }

  }
}
