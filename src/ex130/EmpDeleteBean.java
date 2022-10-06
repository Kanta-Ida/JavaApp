package ex130;

import dao.EmpDAO;
import myutil.UserInput;
import view.EmpPrintInfo;
import vo.EmpVO;

public class EmpDeleteBean {
	public void execute(int empNo, String fileName) {
		EmpDAO dao = new EmpDAO(fileName);
		EmpVO empVO = dao.get(empNo);
		if (empVO == null) {
			System.out.println("社員番号" + empNo + "は登録されていません。");
			System.exit(0);
		}

		EmpPrintInfo.printHeader();
		EmpPrintInfo.printInfo(empVO);

		String judge = UserInput.getString("削除しますか<y/n>:");
		if (judge.equals("y") || judge.equals("Y")) {
			dao.delete(empVO);
		}
		System.out.println("データを削除しました。");

	}

}
