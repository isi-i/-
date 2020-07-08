package 課題０９;

class NeteruState extends DogState{
	private static NeteruState s = new NeteruState();
	private NeteruState() {}

	public static DogState getInstance() {
		return s;
	}
	public void neta(Dog moto) {
	}
	public void tabeta(Dog moto) {
		moto.changeState(TanoshiiState.getInstance());
	}
	public void tukareta(Dog moto) {
		moto.changeState(IrairaState.getInstance());
	}
	public String toString() {
		return "寝てる状態";
	}

}
