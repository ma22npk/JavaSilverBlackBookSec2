package aboutPart2;

public class AboutLiteral {

    public static void main(String[] args) {

        int i1 = 123456789;
        // アンダースコアを挿入した変数
        int i2 = 123_456_789;

        // 2つの変数が正しいか確認する
        System.out.println(i1 == i2);
    }

}
