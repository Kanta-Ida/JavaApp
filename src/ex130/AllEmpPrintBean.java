package ex130;

import java.util.List;

import dao.EmpDAO;
import view.EmpPrintInfo;
import vo.EmpVO;

public class AllEmpPrintBean {

	public void execute(String fileName) {
		EmpDAO dao = new EmpDAO(fileName);
		List<EmpVO> list = dao.getAll();
		//ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		//list = dao.getAll();

		if (list == null) {
			System.out.println(fileName + "には社員情報が一件も存在しません。");
			System.exit(0);
		}

		EmpPrintInfo.printHeader();
		for (EmpVO i : list) {
			EmpPrintInfo.printInfo(i);
		}

	}

}
