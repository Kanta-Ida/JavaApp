package myutil;

import java.io.File;

public class ArgsUtil {

	//引数があるかの探索
	public static String parseArgs(String[] args) {
		//引数が指定されていないときの処理
		if (args.length != 1) {
			System.out.println("引数が指定されていません。");
			System.exit(0);

		}
		/*修正前の内容
		ファイルがあるかの確認
		File file = new File(args[0]);
		if (file.exists()) {
		//ファイルが存在しない場合の処理
		} else {
			System.out.println("ファイルが存在しません");
			System.exit(0);
		}
		return args[0];
		}
		*/
		//修正後の内容
		//ファイルを読み込むときの前準備
		File file = new File(args[0]);//新しいファイルの生成
		//社員情報管理ファイルが存在するかしないかの処理
		if (file.exists() == false) {
			System.out.println(args[0] + "ファイルが存在しません。");
			System.exit(0);
		} //ファイルが存在する場合の処理
		return args[0];
	}

}
