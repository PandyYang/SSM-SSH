package pandy.test;

import java.util.Arrays;

/**
 * @author ASUS
 *	��������
 *ȷ�����������ͬʱ���� �ͱ���ȷ��
 *1.����ĳ��Ȳ��ܷ����仯
 *2.��һ��ѭ����������� Ȼ�����ұ� ���������������whileѭ���д���ͬһ���ȼ���
 *3.����ͬʱ���м�ƽ� ���һ������ �϶��ᱻ��߻����ұ����� Ҫô���ǲ����� ���ǳ�������һ������Ҫ���������жϵ�
 */
public class CockTail {
	public static void main(String[] args) {
		int[] arr = {5,34,88,2,344,999,746,35,3,43,4,36};
		CockTail.cockTail_sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void cockTail_sort(int[] arr) {
		int i,left=0;
		int right = arr.length-1;
		int temp;
		while(left<right) {
			//����ߵ�����ʼ ֻҪ���С���ұ� i+ Ȼ���жϴ�С��ϵ ������ź�
			for(i=left;i<right;i++) 
				if(arr[i]>arr[i+1]) {
					temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
				//ѭ��������ۼӵ�ʱ�� Ҫ���ұ��ۼ�  ȷ������ĳ��Ȳ���
			right--;
			for(i=right;i>left;i--) 
				if(arr[i-1]>arr[i]) {
					temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
				}
			left++;
		}
	}
}