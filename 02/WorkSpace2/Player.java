import java.util.Random;

public class Player {
  final String HAND_G = "グー";
  final String HAND_C = "チョキ";
  final String HAND_P = "パー";

  String name;
  String handStatus;

  Player(String nm) {
    this.name = nm;
  }

  void makeHandStatus() {
    String hdSts = "";
    Random rand = new Random();
    int randNumber = rand.nextInt(3) + 1;

    switch (randNumber) {
    case 1:
      hdSts = HAND_G;
      break;
    case 2:
      hdSts = HAND_C;
      break;
    case 3:
      hdSts = HAND_P;
      break;
    }
    this.handStatus = hdSts;
  }
}
