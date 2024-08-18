package a_Tricky_java;

public class OPT_genrator {
//	This is how you generate a OTP
	
	public void OPT() {
		System.out.println(Math.floor(Math.random()*2343 +1000));
	}
	public static void main(String[] args) {
		OPT_genrator abc  = new OPT_genrator();
		abc.OPT();
	}
}
