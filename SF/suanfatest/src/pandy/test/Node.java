package pandy.test;

/**
 * �ȸ����������ڵ���
 * @author ASUS
 *
 */
public class Node {
	public Object data;//��Žڵ�����ֵ
	public Node next;//��ź�̽ڵ�
	
	//�޲ι��캯��
	public Node() {
		
	}
	
	//ֻ�нڵ�ֵ�Ĺ��캯��
	public Node(Object data) {
		this.data=data;
	}
	
	
	//���нڵ�ֵ�ͺ�̽ڵ�Ĺ��캯��
	public Node(Object data,Node next) {
		this.data=data;
		this.next=next;
	}
	
	//
}