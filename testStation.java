package projectManager_observer;

public class testStation {

	public static void main(String[] args) {

		Database A = new Database();
		Database B = new Database();

		artistA a = new artistA(A);
		artistB b = new artistB(B);

		A.upload("70%", 1000);
		B.upload("30", 2000);

	}

}
