package javaprogramms;

public class removeJUNK {

	public static void main(String[] args) {
		String str ="??>>>::><<<>>> thid is 1234564";
      str=str.replaceAll("[^A-Za-z1-9]", "");
      System.out.println(str);
	}

}
