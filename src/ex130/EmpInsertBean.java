package ex130;

import dao.EmpDAO;
import myutil.UserInput;
import view.EmpPrintInfo;
import vo.EmpVO;

public class EmpInsertBean {

	public void execute(int empNo, String fileName) {
		//EmpDAOクラスのインスタンスを生成
		EmpDAO dao = new EmpDAO(fileName);
		EmpVO empVO = dao.get(empNo);
		if (empVO != null) {
			System.out.println("社員番号" + empNo + "は既に登録されています。");
			return;
		}
		String syainNumber = String.valueOf(empNo);
		String name = UserInput.getString("氏名を入力してください");
		String height = UserInput.getString("身長を入力してください");
		String weight = UserInput.getString("体重を入力してください");
		//EmpVOのインスタンスを生成
		EmpVO vo = new EmpVO();
		vo.setSyainNumber(syainNumber);
		vo.setName(name);
		vo.setHeight(height);
		vo.setWeight(weight);

		//ヘッダーを表示
		EmpPrintInfo.printHeader();
		EmpPrintInfo.printInfo(vo);

		String judge = UserInput.getString("登録しますか<y/n>:");
		if (judge.equals("y") || judge.equals("Y")) {
			dao.insert(vo);
		}
	}

}
