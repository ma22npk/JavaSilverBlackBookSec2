package aboutPart2.section12;

public class Main {
    public static void main(String[] args) {
        String s = "あいうえおかきくけこあいうえおかきくけこ";
        int n = s.indexOf("らりるれろ");//存在しない文字列を指定
        System.out.println(n);
    }
}
