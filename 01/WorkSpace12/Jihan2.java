public class Jihan2 {
  public static void main(String[] args) {
    int entryAmount = 0;
    int cost = Integer.parseInt(args[args.length - 1]);
    for (int i = 0; i < args.length - 1; i++) {
      switch (Integer.parseInt(args[i])) {
      case 10:
        entryAmount += Integer.parseInt(args[i]);
        break;
      case 50:
        entryAmount += Integer.parseInt(args[i]);
        break;
      case 100:
        entryAmount += Integer.parseInt(args[i]);
        break;
      case 500:
        entryAmount += Integer.parseInt(args[i]);
        break;
      case 1:
        System.out.println("警告:1円玉は使えません");
        break;
      case 5:
        System.out.println("警告:5円玉は使えません");
        break;
      default:
        System.out.println("警告:" + args[i] + "は硬貨として適切な値ではありません");
        break;
      }
    }
    System.out.println((entryAmount - cost) + "円のお釣りです。ありがとうございました。");
  }
}
