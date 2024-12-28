package angel_devil_forGitHub;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;

public class いってみたいtest {
	
	@Test
	public void 参加してみる() {
		いってみたい sample = new いってみたい(new イベント名("A"), new 開催日時(LocalDateTime.of(2024, 12, 9, 0, 0)), いってみたい状態.希望, true);
//		sampleからrecordの中身を確認する
		sample.参加申込();
		
		sample.出席();
	}
}
