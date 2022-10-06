package ex080;

import java.util.ArrayList;

import vo.EmpVO;

public class TestEmpVO02 {

	public static void main(String[] args) {
		ArrayList<EmpVO> list = getListOfEmpVO();

		printListOfEmpVo(list);

	}

	public static ArrayList<EmpVO> getListOfEmpVO() {

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

	public static void printListOfEmpVo(ArrayList<EmpVO> list) {

		System.out.println("番号\t氏名\t\t\t身長\t体重");
		for (EmpVO vo : list) {
			String syainNumber = vo.getSyainNumber();
			String name = vo.getName();
			String height = vo.getHeight();
			String weight = vo.getWeight();
			System.out.println(syainNumber + "\t" + name + "\t" + height + "\t\t" + weight);

		}

	}

}
