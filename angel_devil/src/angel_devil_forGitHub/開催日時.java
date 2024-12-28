package angel_devil_forGitHub;
import java.time.LocalDateTime;
import java.util.Objects;

public record 開催日時(LocalDateTime 日時) {
	
	public 開催日時 {
		Objects.requireNonNull(日時);
		// 過去日付は開催日付に設定不可
		if (日時.isBefore(LocalDateTime.now())) {
			throw new IllegalArgumentException();
		}
	}
}
