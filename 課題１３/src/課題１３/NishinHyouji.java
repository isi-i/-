package 課題１３;

class NishinHyouji implements Observer{

	public void update(Subject s) {
		print(((Suuchi)s).getValue());
	}

	private void print(int n) {
		System.out.println(n + "を二進数で表示します");

	}

}
