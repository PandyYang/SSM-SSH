package pandy.test;

public class Choose {
	public void chooseArray(Integer[] in) {
		int tem=0;
		int num =0;
		int upnum=0;
		int k = 0;
		for(int i=0;i<in.length;i++) {//�������������ó�ÿ��Ԫ��
			k = i;
			//��������ȡ��ÿ��Ԫ��  ���������ѭ����ȡ���ıȽ� 
			//�Ѿ�ȡ���Ĳ�����ȡ ����Ԫ��֮�������Ƚ� һ��ѭ��֮���Ʊػ�ѡ����ǰ���е�  �����е���С��Ԫ��
			for(int j=k+1;j<in.length-1;j++) {
				if(in[j]<in[k]){//ÿ������һ����������ߵ�ֵ��С��ֵ��ô����λ�� ֱ��ָ���ƶ���������ұ�
					k=j;
				} 
				num++;
				if(i!=k) {//Ҳ����˵��ʱ��k����i�ı�ֵ
					tem=in[i];
					in[i]=in[k];
					in[k]=tem;
					upnum++;
				}
			}
		}
		for(int i=0;i<in.length;i++) {
			System.out.print(in[i]);
			if(i<in.length-1) {
				System.out.print(",");
			}
		}
		//ѭ�����ƶ������ڴ�
	}
	public static void main(String[] args) {
		Choose ca = new Choose();
		Integer in[] = {1,3,7,120,9,44,2,323};
		ca.chooseArray(in);
	}
}