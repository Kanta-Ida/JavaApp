package dao_stub;

import java.util.ArrayList;
import java.util.List;

import vo.EmpVO;

public class EmpDAO {

	public EmpDAO(String fileName) {

	}

	public List<EmpVO> getAll() {
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		//EmpVoのインスタンスを生成
		EmpVO vo1 = new EmpVO();
		//織田信長のデータを生成
		String syainNumber1 = "641340";
		String name1 = "Oda Nobunaga";
		String height1 = "160";
		String weight1 = "40.0";

		//setterで設定する
		vo1.setSyainNumber(syainNumber1);
		vo1.setName(name1);
		vo1.setHeight(height1);
		vo1.setWeight(weight1);
		//vo1をlistに追加する
		list.add(vo1);

		//EmpVoのインスタンスを生成
		EmpVO vo2 = new EmpVO();
		//徳川家康のデータを生成
		String syainNumber2 = "213426";
		String name2 = "Tokugawa Ieyasu";
		String height2 = "174";
		String weight2 = "75.0";

		//setterで設定する
		vo2.setSyainNumber(syainNumber2);
		vo2.setName(name2);
		vo2.setHeight(height2);
		vo2.setWeight(weight2);
		//vo2をlistに追加
		list.add(vo2);

		return list;

	}

}
