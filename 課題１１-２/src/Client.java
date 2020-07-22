
public class Client {

	public static void main(String[] args) {
		Seihin[] seihin = new Seihin[3];
		seihin[0] = new Television();
		seihin[1] = new Radio();
		seihin[2] = new Television();

		for(int i=0; i<seihin.length; i++) {
			if(seihin[i] instanceof Television) {
				((Television)seihin[i]).numberring();
				((Television)seihin[i]).setDate(Date.today());
			}
			else if(seihin[i] instanceof Radio) {
				((Radio)seihin[i]).numberring();
			}
			for(int o=0; o<seihin.length; o++) {
				seihin[o].print();
			}
		}
	}

}