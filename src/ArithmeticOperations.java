
public class ArithmeticOperations {

    public static void main(String[] args) {
        int num1 = 100; //int型変数num1を宣言し、100を代入
        int num2 = 10;  //int型変数num2を宣言し、10を代入

        //int型変数result1を宣言し,num1とnum2の加算結果を代入
        int result = num1 +num2;
        //加算結果を出力
        System.out.println("num1 + num2 = " + result);

        //int型変数result2を宣言し、num1とnum2の減算結果を代入
        result = num1 - num2;
        //減算結果を出力
        System.out.println("num1 - num2 = " + result);

        //int型変数result3を宣言し、num1とnum2の乗算結果を代入
        result = num1 * num2;
        //乗算結果を出力
        System.out.println("num1 * num2 = " + result);

        //int型変数result3を宣言し、num1とnum2の除算結果を代入
        result = num1 / num2;
        //除算結果を出力
        System.out.println("num1 / num2 = " + result);
        //int型変数result3を宣言し、num1とnum2の剰余算結果を代入
        result = num1 % num2;
        //剰余残結果を出力
        System.out.println("num1 % num2 = " + result);


        //加算結果を出力
        System.out.println("num1 + num2 = " + num1 + num2);
        //減算結果を出力
        System.out.println("num1 - num2 = " + (num1 - num2));
        //乗算結果を出力
        System.out.println("num1 * num2 = " + (num1 * num2));
        //除算結果を出力
        System.out.println("num1 / num2 = " + (num1 / num2));
        //剰余残結果を出力
        System.out.println("num1 % num2 = " + (num1 % num2));
        }

}
