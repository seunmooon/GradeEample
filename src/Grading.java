
public class Grading {
	public void StudentAnswer(int answer[],int student[][],char yesOrNot[][], int studentSc[]){
		for(int i=0;i<student.length;i++){
			for(int j=0;j<student[i].length;j++){
				if(student[i][j]==answer[j]){//����� ���� ��
					studentSc[i]=studentSc[i]+10;//�л�[i]�� ������ 10���� ������
					yesOrNot[i][j]='O';//����ǥ�� O�� �Է�
				}else yesOrNot[i][j]='X';//������ �ƴ� �� ����ǥ�� X�� �Է�
			}
		}
	}
	public void Print(int studentSc[], char yesOrNot[][]){
		for(int i=0;i<studentSc.length;i++){
			System.out.println("�л� "+(i+1)+"�� ���� : "+studentSc[i]+"��");//�� �л��� ����
			System.out.print("==>����ǥ : ");
				for(int j=0;j<yesOrNot[i].length;j++){
					System.out.print(yesOrNot[i][j]+" ");
				}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		//�迭 �߰��ؼ� double�ؼ� ������ 100������ ���� �������� ������ �ٸ����ؼ�..
		int student[][]={
				{1,3,2,4,3,1,4,2,2,1},
				{3,2,4,2,2,1,1,3,4,1},
				{2,4,3,2,1,2,1,3,3,4},
				{2,3,3,1,1,3,2,2,4,4},
				{3,1,1,2,4,1,2,3,1,3}
		};		
		int answer[]=new int[10];
		int studentSc[]=new int[5];
		char yesOrNot[][]=new char[5][10];
		
		if(args.length!=answer.length){
			System.out.println("������ ������ ���� �ʽ��ϴ�.");
		}
		
		//�����Է�
		for(int i=0;i<answer.length;i++){
			answer[i]=Integer.parseInt(args[i]);
		}
		
		Grading a=new Grading();
	
		a.StudentAnswer(answer,student,yesOrNot, studentSc);
		
		a.Print(studentSc, yesOrNot);
		
	}

}
