package pandy.test;

/**
 * ��1!+2!+3!+...15!
 * @author ASUS
 *
 */
public class AddFactorial {
	int result=1;
	int maxResult;
	private void addFactorial() {//��̬������в���Ӧ��֮��ķǾ�̬����
		for(int i=1;i<16;i++) {//���ѭ�������ۼ�
			for(int j=1;j<=i;j++) {//�ڲ��ѭ�������۳� �۳���Ҫi��ֵ �����۳˵ı߽�
				result*=j;//��ʼֵ��Ϊ0 ���޴�����Ϊ
			}
			maxResult +=result;
		}
		System.out.println(maxResult);
	}
	public static void main(String[] args) {
		AddFactorial af = new AddFactorial();
		af.addFactorial();
	}
}