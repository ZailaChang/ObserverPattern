package projectManager_observer;

import java.util.ArrayList;

public class Database implements ISubject {
	private String statement;
	private long cost;
	private ArrayList<IObserver> observers;

	public Database() {
		observers = new ArrayList<IObserver>();
	}

	public void registerObserver(IObserver o) {
		observers.add(o);

	}
	public void removeObserver(IObserver o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			IObserver ob = observers.get(i);
			ob.update(statement, cost);

		}

	}
	public void upload(String statement, long cost) {
		this.statement=statement;
		this.cost=cost;
		showmore();
	}
	public void showmore() {
		notifyObserver();
	}

}
