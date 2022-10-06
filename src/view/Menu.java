package view;

import myutil.UserInput;

public class Menu {
	public static void show() {
		System.out.println();
		System.out.println("社員名簿管理ツール");
		System.out.println("1.レコードの一覧");
		System.out.println("2.レコードの検索");
		System.out.println("3.レコードの新規登録");
		System.out.println("4.レコードの削除");
		System.out.println("5.レコードの修正");
		System.out.println("6.平均値の表示");
		System.out.println("0.終了");
		System.out.println("");
	}

	public static int getNo() {
		int num = 0;
		do {
			System.out.println("");
			show();
			System.out.println("");
			num = UserInput.getNumber("番号を入力してください：");
		} while (num < 0 || num >= 7);
		return num;

	}

}
