package pandy.test.binarysearch;

import java.util.Scanner;

/**���ֲ��ҷ�
 * @author ASUS
 *
 */
//ʹ�õݹ�ķ���ʵ��
public class BinarySearch {
	public static int recursionBinarySearch(int arr[],int key,int low,int high) {
		if(key<arr[0]||key>arr[high]||low>high) {
			return -1;
		}
		int middle = (low+high)/2;//��ʼʱ���м�λ��
		if(arr[middle]>key) {
			return recursionBinarySearch(arr,key,low,middle-1);//����Ǵ�С������� ��ô���½��в���
		}else if(arr[middle]<key) {
			return recursionBinarySearch(arr,key,middle+1,high);//���Ͻ��в���
		}else {
			return middle;
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int low = 0;
		int high =arr.length-1;
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ���ҵ�Ԫ������,�������"+0+"��"+String.valueOf(arr.length-1)+"֮�����");
		int key = sc.nextInt();
		int result = recursionBinarySearch(arr, key, low, high)+1;
		System.out.println("��������ֵ���ҵ���Ԫ����:"+result);
	}
}