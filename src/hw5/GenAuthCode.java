package hw5;

public class GenAuthCode {
	public String genAuthCode(){
		String pool = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] authCode= new char[8];
		for(int i=0;i<authCode.length ;i++) {
			 authCode[i] =  pool.charAt((int)(Math.random()*62)+1);	 
		}
		return String.valueOf(authCode);
	}
}
