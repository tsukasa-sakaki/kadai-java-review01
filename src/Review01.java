
public class Review01 {

    public static void main(String[] args) {
        //商品価格
        int price    = 1500;
        //税率
        double rate     = 0.1;
        //消費税
        int tax = tax(price, rate);
        //結果表示
        System.out.println(price + "円の商品の税込み価格は" + (price + tax) + "円（消費税は" + tax +"円）です。");
    }

    //int型,double型引数を2つ受け取るtaxメソッドの定義（戻り値あり）
    public static int tax(int price, double rate) {
        //消費税計算
        double result1 = price * rate;
        //キャスト
        int result2 = (int)result1;
        return result2;
    }

}
