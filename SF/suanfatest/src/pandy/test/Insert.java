package pandy.test;

public class Insert {
	public static void main(String[] args) {
		Insert sf = new Insert();
		Integer in[] = {3,55,2,3323,56,88,64,3,0,423,555};
		sf.insertArray(in);
	}
	
	public void insertArray(Integer []in) {
		int tem=0;
		int num =0;
		int upnum=0;
		//���е�Ԫ�ض�������ѭ��һ��
		for(int i=1;i<in.length;i++) {
			//��������ѭ���Ĵ���
			for(int j=i-1;j>=0;j--) {//����Ĵ��������𽥵ݼ��� ����Ѿ��ź���Ͳ������� 
				num++;
				//���մ�С�󵽴��˳������ ��¼�ƶ��Ĵ��� ��������Ԫ��֮�����ν��бȽ�
				//�Լ��źõĲ��ֲ����ٽ��бȽ�
				//ÿ��ѭ���ж���ƶ� 
				if(in[j+1]<in[j]) {
					tem=in[j+1];
					in[j+1]=in[j];
					in[j]=tem;
					upnum++;
				}
				//һ�α������� �����ź�һ��Ԫ�� ���� �ҳ���С��ֵ  �ڶ�С��ֵ  ֱ������ֵ�ȵ�
				//ÿ�����ѭ�������ҵ�һ��ֵ
				//ÿ���ڲ�ѭ�����ǽ����ֵ�ŵ���Ӧ��λ��֮��
				else {
					break;
				}
			}
		}
		//������ɺ� ��Ԫ������ȡ��
		for(int i=0;i<in.length;i++) {
			System.out.print(in[i]);
			if(i<in.length-1) {
				System.out.print(",");
			}
		}
		System.out.println();
		System.out.println("��������ѭ���Ĵ���"+ num);
		System.out.println("�ƶ��Ĵ���"+upnum);
		System.out.println("\n\n\n");
	}
}