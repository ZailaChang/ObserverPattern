package projectManager_observer;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class artistA implements IObserver, Idisplay {
	private String statement;
	private long cost;
	private ISubject Database;


	public artistA(ISubject Database) {
		this.Database = Database;
		Database.registerObserver(this);
	}

	public void update(String statement, long cost) {
		this.statement = statement;
		this.cost = cost;
		display();

	}

	public void display() {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		System.out.println(dateFormat.format(date) + "_" + getClass().getSimpleName() + " 廠商上傳新資料");
		System.out.println("執行進度為 " + statement + ",已使用花費 " + cost);
	}

}
