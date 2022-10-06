package ex070;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import myutil.HealthCalc;

public class EmpPrintBean {

	public void execute(int empNo, String file) {

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(file));
			//ヘッダーを表示する
			System.out.println("番号\t氏名\t\t\t\t身長\t体重\t適正体重\t偏差");
			//ファイルを1行ずつ読み込む準備をする
			String str;
			int num = 0;
			//ファイルを1行ずつ読み込む
			while ((str = br.readLine()) != null) {
				String[] jv = str.split(",");
				if (String.valueOf(empNo).equals(jv[0])) {

					System.out.print(jv[0] + "\t");
					System.out.print(jv[1] + "\t\t");
					System.out.print(jv[2] + "\t\t");
					System.out.print(jv[3] + "\t");
					String bestWeight = HealthCalc.calcBestWeight(jv[2]);
					String deflection = HealthCalc.calcWeightDeflection(jv[3], bestWeight);
					System.out.print(bestWeight + "\t\t");
					System.out.print(deflection);
					System.out.println();
					num = 1;
				}
			}
			if (num == 0) {
				System.out.println("社員番号" + empNo + "は登録されていません。");
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);

		}

	}

}
