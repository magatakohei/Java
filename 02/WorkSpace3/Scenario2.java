public class Scenario2 {
  public static void main(String[] args) {
    // インスタンス生成
    Player player1 = new Player(args[0]);
    Player player2 = new Player(args[1]);
    Referee referee = new Referee(args[2]);

    // じゃんけんの手を生成
    player1.makeHandStatus();
    player2.makeHandStatus();

    // じゃんけん
    referee.gameStart();
    referee.sayHandStatus(player1.getName(), player1.getHandStatus());
    referee.sayHandStatus(player2.getName(), player2.getHandStatus());
    referee.sayJudge(player1.getName(), player1.getHandStatus(), player2.getName(), player2.getHandStatus());
  }

}
