import java.util.Objects;

public record イベント名(String 名称) {
	
		public イベント名 {
			Objects.requireNonNull(名称);
			if (名称.isEmpty()) {
				throw new IllegalArgumentException();
			}
		}
	

}
