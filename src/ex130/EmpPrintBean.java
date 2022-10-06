package ex130;

import dao.EmpDAO;
import view.EmpPrintInfo;
import vo.EmpVO;

public class EmpPrintBean {

	public void execute(int empNo, String fileName) {

		EmpDAO dao = new EmpDAO(fileName);
		EmpVO empVO = dao.get(empNo);

		if (empVO == null) {
			System.out.println("社員番号" + empNo + "は登録されていません");
			return;
		}

		EmpPrintInfo.printHeader();

		EmpPrintInfo.printInfo(empVO);

	}
}
