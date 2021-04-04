import java.util.HashMap;
import java.util.Map;

public class CalcCakeSum {
  public static void main(String[] args) {
    int i = 0;
    int Amount = 0;
    double tax = 1.08;

    Map<String, Integer> cakeMap = new HashMap<>();
    cakeMap.put("ショートケーキ", 320);
    cakeMap.put("モンブラン", 350);
    cakeMap.put("チョコレートケーキ", 370);
    cakeMap.put("いちごのタルト", 400);
    cakeMap.put("チーズケーキ", 300);

    while (i < args.length) {
      int cost = cakeMap.get(args[i]);
      i++;
      int quantity = Integer.parseInt(args[i]);
      Amount += cost * quantity;
      i++;
    }
    if (Amount >= 1000) {
      Amount *= 0.8;
    }
    Amount *= tax;
    System.out.println("合計金額は" + Amount + "円です。");
  }
}
