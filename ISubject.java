package projectManager_observer;

public interface ISubject {
	public void registerObserver(IObserver o);

	public void removeObserver(IObserver o);

	public void notifyObserver();

}