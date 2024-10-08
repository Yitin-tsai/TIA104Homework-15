package hw4;

public class Hw4_6HighScoreCount {
	public static void main(String[] args) {
		int[][] score ={{10,35,40,100,90,85,75,70},
						{37,75,77,89,64,75,70,95},
						{100,70,79,90,75,70,79,90},
						{77,95,70,89,60,75,85,89},
						{98,70,89,90,75,90,89,90},
						{90,80,100,75,50,20,99,75}};
		int[] count = new int [8];
		int max;
		for(int i=0;i<score.length;i++) {
			max = score[i][0];
			for(int j=0;j<score[i].length;j++) {
				if(score[i][j]>=max)
					max=score[i][j];				
			}
			System.out.println(max);
			for(int j=0;j<score[i].length;j++) {
				if(score[i][j]== max )
					count[j]++;
			}	
		}
		for(int i=0; i< count.length;i++)
			System.out.println("第"+(i+1)+"號同學拿到最高分次數為"+count[i]+"次");
	}

}
