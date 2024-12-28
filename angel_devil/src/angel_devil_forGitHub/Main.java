package angel_devil_forGitHub;
import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) {
		いってみたい sample = new いってみたい(new イベント名("A"), new 開催日時(LocalDateTime.of(2024, 12, 9, 0, 0)), いってみたい状態.希望, true);
		System.out.println(sample);

		sample.参加申込();
		System.out.println(sample);
		
		sample.出席();
		System.out.println(sample);
		
		// Record（いってみたい履歴）の中身の確認
		// テストコードを作る
		
//		sample.欠席();
//		System.out.println(sample);

		いってみたい sample2 = new いってみたい(new イベント名("B"), new 開催日時(LocalDateTime.of(2024, 12, 9, 0, 0)), いってみたい状態.希望, false);
		System.out.println(sample2);

		sample2.出席();
		System.out.println(sample2);
		
		sample2.欠席();
		System.out.println(sample2);
		

	}
}
