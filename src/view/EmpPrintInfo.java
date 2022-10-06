package view;

import myutil.HealthCalc;
import vo.EmpVO;

public class EmpPrintInfo {

	public static void printHeader() {
		System.out.println("番号\t氏名\t\t\t身長\t体重\t適正体重\t\t偏差");

	}

	public static void printInfo(EmpVO empVO) {

		/*vo.setSyainNumber(syainNumber);
		vo.setName(name);
		vo.setHeight(height);
		vo.setWeight(weight);
		*/
		String syainNumber = empVO.getSyainNumber();
		String name = empVO.getName();
		String height = empVO.getHeight();
		String weight = empVO.getWeight();
		String bestWeight = HealthCalc.calcBestWeight(height);
		String deflection = HealthCalc.calcWeightDeflection(weight, bestWeight);
		System.out.println(
				syainNumber + "\t" + name + "\t" + height + "\t\t" + weight + "\t" + bestWeight + "\t\t" + deflection);

	}

}
