import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		List<Cat> cats = new ArrayList<Cat>();
			
		System.out.println("***猫集め***");

		System.out.print("1.集める 2.遊ぶ 3.終了 >>>");
		int select = new Scanner(System.in).nextInt();
		switch (select) {
		case 1:
			String[] kind = { "黒", "白", "茶トラ" };
			int colore = new java.util.Random().nextInt(kind.length);
			System.out.println(kind[colore] + "猫を見つけた！");

			System.out.println("この猫に名前をつけてください>>");
			String s = new java.util.Scanner(System.in).nextLine();
			System.out.println(s + "が仲間に加わった!");
			
			

			break;
		case 2:
			System.out.println("田中です");
			break;
			
		case 3:
			System.out.println("アプリを終了します。");
			return;
		default:
			System.out.println("選択肢に無い番号です。");

//			String[] what = { "遊ぶ", "遊んでない" };
//			

		}
	}
}
