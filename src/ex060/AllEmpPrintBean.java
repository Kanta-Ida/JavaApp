package ex060;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import myutil.HealthCalc;

public class AllEmpPrintBean {

	public void execute(String file) {

		BufferedReader br = null;

		File f = new File(file);
		if (f.length() == 0) {
			System.out.println(file + "には、社員情報が一件も存在しません。");
		}

		try {
			br = new BufferedReader(new FileReader("syain.txt"));
			//ヘッダーを表示する
			System.out.println("番号\t氏名\t\t\t\t身長\t体重\t適正体重\t偏差");
			//ファイルを1行ずつ読み込む準備をする
			String str;
			//ファイルを1行ずつ読み込む
			while ((str = br.readLine()) != null) {
				String[] jv = str.split(",");
				System.out.print(jv[0] + "\t");
				System.out.print(jv[1] + "\t\t");
				System.out.print(jv[2] + "\t\t");
				System.out.print(jv[3] + "\t");
				/*String syainNumber = jv[0];
				String name = jv[1];
				String height = jv[2];
				String weight = jv[3];*/
				String bestWeight = HealthCalc.calcBestWeight(jv[2]);
				String deflection = HealthCalc.calcWeightDeflection(jv[3], bestWeight);
				System.out.print(bestWeight + "\t\t");
				System.out.print(deflection);
				System.out.println();
				/*System.out.println(
						jv[0] + "\t" + jv[1] + "\t\t" + jv[2] + "\t\t" + jv[3] + "\t" + bestWeight + "\t\t"
								+ deflection);
								*/
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);

		}

	}

}
