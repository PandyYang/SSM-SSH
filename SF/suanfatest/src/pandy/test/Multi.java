package pandy.test;


public class Multi {
	public void printMulti() {
		for(int j=1;j<10;j++) {
			for(int i=1;i<=j;i++) {
				System.out.print(i+"*" +j+"="+i*j+"\t");
			}
			System.out.print("\t\n");//1�˵���һ�� ��ӡһ�� ����
		}
		System.out.print("\n\n\n");//1 2 3 4 5 ...9���������εݼ� �м��������ո�
	}
	public static void main(String[] args) {
		Multi m = new Multi();
		m.printMulti();
	}
}