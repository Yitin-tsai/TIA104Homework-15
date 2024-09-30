package hw1;

public class Hw103 {
	public static void main (String[] args){
		int time = 256559;
		int days = time/(24*3600);
		int hours = time%(24*3600)/3600;
		int mins = time%(24*3600)%3600/60;
		int seconds = time%(24*3600)%3600%60;
		System.out.println(days + "天" + hours + "小時" + mins +"分鐘" + seconds + "秒");
	}

}
