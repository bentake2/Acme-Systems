package ver1;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello from Eclipse");
		System.out.println("Hello from GitHub");

	}
	public static void heyNow() {
		String Msg = "Hey Now!";
		System.out.println(Msg);
	}
	
	public static String whatFor(String s) {
		String wf = new String();
		for(int i=s.length()-1; i>=0; i--){
			    wf = wf + s.charAt(i);
			    System.out.println("What For "+ wf);
	}
		return wf;
	}
}
