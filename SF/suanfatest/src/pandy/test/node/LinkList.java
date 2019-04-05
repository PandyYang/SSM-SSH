package pandy.test.node;

import java.util.Scanner;

/**
 * ���������Լ�������в���
 * @author ASUS
 *
 */
public class LinkList {
	public Node head;//��������ͷָ��
	
	//���캯����ʼ��ͷ���
	public LinkList() {
		head = new Node();
	}
	
	//���캯�����쳤��Ϊn�ĵ�����
	public LinkList(int n,boolean Order) throws Exception {
		this();
		if(Order)
			create1(n);//ͷ�巨˳����������
		else
			create2(n);//β�巨������������
	}
	
	//ͷ�巨˳����������
	public void create1(int n) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ڵ������(ͷ�巨)");
		for(int i=0;i<n;i++) {
			insert(0,sc.next());
		}
	}
	//β�巨������������
	public void create2(int n) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ڵ������(β�巨)");
		for(int i=0;i<n;i++) {
			insert(length(),sc.next());
		}
	}
	
	//�������ÿ�
	public void clear() {//�ڵ�����ֵ���� ָ������
		head.data=null;
		head.next=null;
	}
	
	//�ж������Ƿ�Ϊ��
	public boolean isEmpty() {
		return head.next==null;//ͷָ�뵱ǰ�ڵ�
	}
	
	//������������
	public int length() {
		Node p = head.next;
		int length=0;
		while(p!=null) {
			p=p.next;//ָ���ƶ�
			length++;
		}
		return length;
	}
	
	//��ȡ�����ص�i��λ�õ�Ԫ��
	public Object get(int i) throws Exception {
		Node p =head.next;
		int j;
		//���׽ڵ㿪ʼ������ ֱ��pָ���i���ڵ����pΪnull
		for(j=0;j<i&&p!=null;j++) {
			p=p.next;
		}
		if(j>i||p==null) {//i���Ϸ���ʱ���׳��쳣 ����i<=0
			throw new Exception("��"+i+"������Ԫ�ز�����");
		}
		return p.data;	
	}
	
	//����x��Ϊ��i��Ԫ��
	public void insert(int i,Object x) throws Exception {
		Node p = head;
		int j=-1;
		//Ѱ�ҵ�i���ڵ��ǰ��i-1
		while(p!=null&&j<i-1) {
			p=p.next;//ָ���ƶ� �����λ�� ��������ʲô ֻ�ǽ�λ�ü������ ���ڸ���������ж����� �Ǽ����Ҫ����λ�õ�ǰһ����˳��
			j++;
		}
		if(j>i-1||p==null) {//i<0��ʱ�� ��Ȼ���������еĺϷ������� ���ǵ���һ��
			throw new Exception("����λ�ò��Ϸ�");
		}else {
			Node s = new Node(x);//�¹���һ��Ҫ���������ݵĽڵ�
			s.next=p.next;//ָ��ָ��
			p.next=s;
		}
	}
	
	//ɾ����i��Ԫ��
	public void remove(int i) throws Exception {
		Node p = head;
		int j=-1;
		while(p!=null&&j<i-1) {//ɾ�������ж�������Ϊ�� �����ж�λ��
			p=p.next;
			j++;
		}
		if(j>i-1||p.next==null)
			throw new Exception("ɾ����λ�ò��Ϸ�");
		p.next=p.next.next;
	}
	
	//����Ԫ��x�״γ��ֵ�λ��
	public int indexOf(Object x) {
		Node p = head.next;
		int j=0;
		while(p!=null&&!p.data.equals(x)) {
			p=p.next;
			j++;
		}
		if(p!=null)
			return j;
		else
			return -1;
	}
	
	public void display() {
		Node p = head.next;
		while(p!=null) {
			if(p.next==null)
				System.out.println(p.data);
			else
				System.out.println(p.data+"->");
			p=p.next;
		}
	}
}