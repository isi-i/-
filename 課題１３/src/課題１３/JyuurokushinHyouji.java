package 課題１３;

class JyuurokushinHyouji implements Observer{

	public void update(Subject s) {
		print(((Suuchi)s).getValue());
	}

	private void print(int n) {
		System.out.println(n + "を十六進数で表示します");

	}

}
