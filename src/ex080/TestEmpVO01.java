package ex080;

import vo.EmpVO;

public class TestEmpVO01 {

	public static void main(String[] args) {
		//EmpVOクラスのインスタンスを生成
		EmpVO vo = getNobunaga();

		printNobunaga(vo);

	}

	public static EmpVO getNobunaga() {
		//EmpVOクラスのインスタンスを生成
		EmpVO vo = new EmpVO();

		//織田信長のデータを生成
		String syainNumber1 = "641340";
		String name1 = "Oda Nobunaga";
		String height1 = "160";
		String weight1 = "40.0";

		vo.setSyainNumber(syainNumber1);
		vo.setName(name1);
		vo.setHeight(height1);
		vo.setWeight(weight1);

		return vo;

	}

	public static void printNobunaga(EmpVO vo) {

		String syainNumber1 = vo.getSyainNumber();
		String name1 = vo.getName();
		String height1 = vo.getHeight();
		String weight1 = vo.getWeight();
		System.out.println("番号\t氏名\t\t\t身長\t体重");
		System.out.println(syainNumber1 + "\t" + name1 + "\t" + height1 + "\t" + weight1);

	}

}
