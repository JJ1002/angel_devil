import java.util.Objects;

public record ユーザ(String ユーザ名) {
	public ユーザ {
		Objects.requireNonNull(ユーザ名);
		if (ユーザ名.isEmpty()) {
			throw new IllegalArgumentException();
		}
	}
}
