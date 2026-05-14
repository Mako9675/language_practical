package src;

public class SevenProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args[0].matches(".*[０-９].*")) {
			throw new IllegalArgumentException("エラー: 全角数字は使用できません。半角数字で入力してください。");
		}
		if (args[1].matches(".*[０-９].*")) {
			throw new IllegalArgumentException("エラー: 全角数字は使用できません。半角数字で入力してください。");
		}
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int result = num1 + num2;
		System.out.println("一つ目の引数：" + num1);
		System.out.println("二つ目の引数：" + num2);
		System.out.println("加算の結果：" + result);
	}
	
}
