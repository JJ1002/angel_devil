package angel_devil_forGitHub;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class いってみたい {

	private イベント名 name;
	private 開催日時 date;
	private いってみたい状態 状態;
	private boolean 要参加申込;
	private List<いってみたい履歴> 履歴;
	
	public いってみたい(イベント名 name, 開催日時 date, いってみたい状態 状態, boolean 要参加申込) {
		super();
		if (Objects.isNull(状態) || 状態.isCorrectNewState()==false) {
			throw new IllegalArgumentException();
		}
		this.name = name;
		this.date = date;		
		this.状態 = 状態;
		this.要参加申込 = 要参加申込;
		this.履歴 = new ArrayList<いってみたい履歴>();
		履歴の生成();
	}
	
	private void 履歴の生成() {
		this.履歴.add(new いってみたい履歴(name, date, 状態, 要参加申込, LocalDateTime.now()));
	}

	public void 参加申込() {
		if (!要参加申込) {
			throw new IllegalStateException();
		}
		if (this.状態.参加申込可能かどうかを調べる() == false) {
			throw new IllegalStateException();		
		}
		this.状態 = いってみたい状態.参加申込;
		履歴の生成();
	}
	
	public void 出席() {
		if (this.状態.出席可能かどうかを調べる() == false) {
			throw new IllegalStateException();
		}
		this.状態 = いってみたい状態.参加済;
		履歴の生成();
	}
	
	public void 欠席() {
		if (this.状態.欠席可能かどうかを調べる() == false){
			throw new IllegalStateException();
		}
		this.状態 = いってみたい状態.欠席;
		履歴の生成();
	}

	@Override
	public String toString() {
		return "いってみたい [name=" + name + ", date=" + date + ", 状態=" + 状態 + ", 要参加申込=" + 要参加申込 + ", 履歴=" + 履歴 + "]";
	}
	

	
//	public void notifyToUser() {
//		//メッセージを作るとか取ってくるとかの処理
//		
//		
//		for(User u : this.attendees){
//			System.out.println(u.getMailAddress() + "にメールを送りました。");
//		}
//		
//	}
	
	
	
}
