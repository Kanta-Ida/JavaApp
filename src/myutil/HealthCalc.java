package myutil;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class HealthCalc {

	public static String calcBestWeight(String height) {
		//double型に変換して計算
		double d_height = Double.parseDouble(height);
		double weight = ((d_height - 100) * 0.9);
		//四捨五入の計算
		BigDecimal calc_weight = BigDecimal.valueOf(weight);
		calc_weight = calc_weight.setScale(1, RoundingMode.HALF_UP);
		//計算結果をString型に変換する
		String bestWeight = calc_weight.toString();
		return bestWeight;
	}

	public static String calcWeightDeflection(String weight, String bestWeight) {

		//double型に変換して計算
		double d_weight = Double.parseDouble(weight);
		double d_bestWeight = Double.parseDouble(bestWeight);
		//偏差を求める
		double d_deflection = d_weight - d_bestWeight;
		//四捨五入の計算
		BigDecimal calc_deflection = BigDecimal.valueOf(d_deflection);
		calc_deflection = calc_deflection.setScale(1, RoundingMode.HALF_UP);
		//計算結果をString型に変換する
		String deflection = calc_deflection.toString();
		return deflection;

	}

}
