package test;

public class Te {
	private volatile Te t = new Te();

	private static class A{
		private static  Te te = new Te();
	}
	
	public static Te getTe(){
		return A.te;
	}
	
	
}