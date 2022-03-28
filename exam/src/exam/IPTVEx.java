package exam;

public class IPTVEx extends ColorTV{

	public IPTVEx(int size) {
		super(size);

	}

	public static void main(String[] args) {
		IPTV iptv = new IPTV(32, 2048, "192.1.1.2");
		iptv.printProperty();

	}

}
