
public class Grading {
	public void StudentAnswer(int answer[],int student[][],char yesOrNot[][], double studentSc[], double score[]){
		for(int i=0;i<student.length;i++){
			for(int j=0;j<student[i].length;j++){
				if(student[i][j]==answer[j]){//정답과 같을 때
					studentSc[i]=studentSc[i]+score[i];//학생[i]의 점수를 10점씩 더해줌
					yesOrNot[i][j]='O';//정오표에 O를 입력
				}else yesOrNot[i][j]='X';//정답이 아닐 때 정오표에 X를 입력
			}
		}
	}
	public void Print(double studentSc[], char yesOrNot[][]){
		for(int i=0;i<studentSc.length;i++){
			System.out.println("학생 "+(i+1)+"의 점수 : "+studentSc[i]+"점");//각 학생의 총점
			System.out.print("==>정오표 : ");
				for(int j=0;j<yesOrNot[i].length;j++){
					System.out.print(yesOrNot[i][j]+" ");
				}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("시작합니다.");
		//배열 추가해서 double해서 총점이 100점으로 만들어서 각문제를 점수를 다르게해서..
		int student[][]={
				{1,3,2,4,3,1,4,2,2,1},
				{3,2,4,2,2,1,1,3,4,1},
				{2,4,3,2,1,2,1,3,3,4},
				{2,3,3,1,1,3,2,2,4,4},
				{3,1,1,2,4,1,2,3,1,3}
		};		
		int answer[]=new int[10];
		double studentSc[]={0,0,0,0,0};
		char yesOrNot[][]=new char[5][10];
		double score[]={4.5, 6.6, 8.4, 7.6, 9.2, 9.8, 13.4, 13.6, 10, 16.9};
		
		if(args.length!=answer.length){
			System.out.println("정답의 개수가 맞지 않습니다.");
		}
		
		//정답입력
		for(int i=0;i<answer.length;i++){
			answer[i]=Integer.parseInt(args[i]);
		}
		
		Grading a=new Grading();
	
		a.StudentAnswer(answer,student,yesOrNot, studentSc, score);
		
		a.Print(studentSc, yesOrNot);
		
	}

}
