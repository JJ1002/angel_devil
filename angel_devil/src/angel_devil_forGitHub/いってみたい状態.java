package angel_devil_forGitHub;

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
	
	public boolean 参加申込可能かどうかを調べる() {
		if (this==いってみたい状態.参加申込 || this==いってみたい状態.出席表明 || this==いってみたい状態.参加済 || this==いってみたい状態.欠席){
			return false;
		}
		return true;
	}
	
	public boolean 出席可能かどうかを調べる() {
		if (this==いってみたい状態.参加済 || this==いってみたい状態.欠席){
			return false;
		}
		return true;
	}
	
	public boolean 欠席可能かどうかを調べる() {
		if (this==いってみたい状態.参加済 || this==いってみたい状態.欠席){
			return false;
		}
		return true;
	}
	
	
}

