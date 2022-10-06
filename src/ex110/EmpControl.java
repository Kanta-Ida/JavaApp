package ex110;

import myutil.ArgsUtil;
import myutil.UserInput;
import view.Menu;

public class EmpControl {

	public static void main(String[] args) {

		String file = ArgsUtil.parseArgs(args);
		while (true) {
			int num = Menu.getNo();

			switch (num) {
			case 1:
				AllEmpPrintBean aepb = new AllEmpPrintBean();
				aepb.execute(file);
				break;

			case 2:
				int empNo = UserInput.getNumber("社員番号を入力してください:");
				EmpPrintBean epb = new EmpPrintBean();
				epb.execute(empNo, file);
				break;

			case 3:
				System.out.println("「3.レコードの新規登録」が選択されました。");
				break;

			case 4:
				System.out.println("「4.レコードの削除」が選択されました。");
				break;

			case 5:
				System.out.println("「5.レコードの修正」が選択されました。");
				break;

			case 6:
				System.out.println("「6.平均値の表示」が選択されました。");
				break;

			case 0:
				System.out.println("「0.終了」が選択されました。");
				System.out.println("プログラムを終了します。");
				System.exit(0);
				break;

			}

		}

	}

}
