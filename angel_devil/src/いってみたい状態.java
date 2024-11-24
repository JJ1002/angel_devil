
public enum いってみたい状態 {
	希望,
	参加申込,
	出席表明,
	参加済,
	欠席;

	public boolean isCorrectNewState() {
		if (出席表明==this || 参加済==this || 欠席==this) {
			return false;
		}
		return true;
	}
}

