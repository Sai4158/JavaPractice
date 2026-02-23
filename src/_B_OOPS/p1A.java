package _B_OOPS;

public class p1A {

	public    int pub    = 1;
	protected int prot   = 2;
	int def    = 3;   
	private   int priv   = 4;

	public void sameClassAccess() {

		System.out.println(pub);
		System.out.println(prot);
		System.out.println(def);
		System.out.println(priv);
	}
}
