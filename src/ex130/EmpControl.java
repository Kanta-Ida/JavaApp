package ex130;

import myutil.ArgsUtil;
import myutil.UserInput;
import view.Menu;

public class EmpControl {

	public static void main(String[] args) {

		String file = ArgsUtil.parseArgs(args);
		int i = -1;
		while (i < 0) {
			int num = Menu.getNo();

			switch (num) {
			case 1:
				AllEmpPrintBean aepb = new AllEmpPrintBean();
				aepb.execute(file);
				break;

			case 2:
				int empNo2 = UserInput.getNumber("社員番号を入力してください:");
				EmpPrintBean epb = new EmpPrintBean();
				epb.execute(empNo2, file);
				break;

			case 3:
				int empNo3 = UserInput.getNumber("社員番号を入力してください:");
				EmpInsertBean eib = new EmpInsertBean();
				eib.execute(empNo3, file);
				break;

			case 4:
				int empNo4 = UserInput.getNumber("社員番号を入力してください:");
				EmpDeleteBean edb = new EmpDeleteBean();
				edb.execute(empNo4, file);

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
				i = 1;
				break;

			}

		}

	}

}
