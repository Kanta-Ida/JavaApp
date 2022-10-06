package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import vo.EmpVO;

public class EmpDAO {

	private String fileName;

	public EmpDAO(String fileName) {
		this.fileName = fileName;

	}

	public List<EmpVO> getAll() {

		ArrayList<EmpVO> list = new ArrayList<>();

		BufferedReader br = null;

		File f = new File(fileName);
		if (f.length() == 0) {
			return null;
		}
		try {
			br = new BufferedReader(new FileReader(fileName));
			//ファイルを1行ずつ読み込む準備をする
			String str;
			//ファイルを1行ずつ読み込む
			while ((str = br.readLine()) != null) {
				String[] jv = str.split(",");

				//EmpVoのインスタンスを生成
				EmpVO vo = new EmpVO();

				String syainNumber = jv[0];
				String name = jv[1];
				String height = jv[2];
				String weight = jv[3];

				//setterで設定する
				vo.setSyainNumber(syainNumber);
				vo.setName(name);
				vo.setHeight(height);
				vo.setWeight(weight);
				//voをlistに追加する
				list.add(vo);

			}

		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);

		}
		return list;

	}

	public EmpVO get(int syainNumber) {

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(fileName));
			//ファイルを1行ずつ読み込む準備をする
			String str;
			int num = 0;
			//ファイルを1行ずつ読み込む
			while ((str = br.readLine()) != null) {
				String[] jv = str.split(",");
				if (String.valueOf(syainNumber).equals(jv[0])) {
					EmpVO vo = new EmpVO();
					jv[0] = String.valueOf(syainNumber);
					String name = jv[1];
					String height = jv[2];
					String weight = jv[3];
					vo.setSyainNumber(jv[0]);
					vo.setName(name);
					vo.setHeight(height);
					vo.setWeight(weight);

					num = 1;

					return vo;

				}

			}
			if (num == 0) {
				return null;
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);

		}
		return null;

	}

	public void insert(EmpVO empVO) {
		try (BufferedWriter br = new BufferedWriter(new FileWriter(this.fileName, true))) {

			String syainNumber = empVO.getSyainNumber();
			String name = empVO.getName();
			String height = empVO.getHeight();
			String weight = empVO.getWeight();

			br.write(syainNumber + ",");
			br.write(name + ",");
			br.write(height + ",");
			br.write(weight + ",");
			br.newLine();
			System.out.println("データを登録しました。");

		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);

		}
	}

	public void delete(EmpVO empVO) {
		List<EmpVO> list = getAll();
		//listの中身を削除する
		for (int i = 0; i < list.size(); i++) {
			if (empVO.getSyainNumber().equals(list.get(i).getSyainNumber())) {
				list.remove(i);
			}
		}
		try (BufferedWriter br = new BufferedWriter(new FileWriter(this.fileName))) {
			for (int i = 0; i < list.size(); i++) {
				String syainNumber = list.get(i).getSyainNumber();
				String name = list.get(i).getName();
				String height = list.get(i).getHeight();
				String weight = list.get(i).getWeight();
				br.write(syainNumber + ",");
				br.write(name + ",");
				br.write(height + ",");
				br.write(weight + ",");
				br.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);

		}

	}

}
