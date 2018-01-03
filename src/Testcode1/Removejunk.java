package Testcode1;

public class Removejunk {

	public static void main(String[] args) {
		String s="#@$@ rahul prakash 9631611789  *&^%";
				s=s.replaceAll("[^a-zA-Z0-9]","");
				System.out.println(s);

	}

}
