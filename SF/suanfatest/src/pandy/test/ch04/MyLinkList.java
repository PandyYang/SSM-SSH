package pandy.test.ch04;
/*
 * ���� �൱�ڻ�
 * */
public class MyLinkList {
	//ͷ���
	private Node first;
	
	public MyLinkList() {
		first=null;
	}
	
	/*
	 * ����һ���ڵ� ��ͷ���֮�����
	 * ֻ��Ҫ�ı����ڵ��ָ���� ͷһ���ڵ��ָ��
	 */
	public void insertFirst(long value) {
		Node node = new Node(value);//����һ���µĽڵ�
		node.next=first;//first�������Ѿ������� ָ����һ����ָ��
		first=node;//Ȼ�󽫽ڵ��ֵ����
	}
	/*
	 * ɾ��һ���ڵ� ��ͷ���֮�����ɾ��
	 * ��ͷ�ڵ��ָ��ֱ��ָ������һ��node
	 */
	public Node deleteFirst() {
		//����ɾ���Ľڵ�
		Node tmp = first;
		first=tmp.next;//���м�Ҫɾ���Ĳ���ֱ������
		return tmp;
	}
	/*
	 * ��ʾ���� ������ʾ�ڵ��е�����
	 */
	public void display() {
		Node current = first;
		while(current!=null) {//�������滹�����ݵĻ�
			current.display();
			current=current.next;//������һ���ڵ�
		}
		
	}
	/*
	 * ���ҷ���
	 */
	public Node find(long value) {
		Node current=first;
		while(current.data!=value) {
			if(current.next==null) {
				return null;
			}
			current = current.next;//��ǰ�ڵ��ָ����һ���ڵ��ָ��  next�Ķ����Ѿ���������Ϊ�˱�ʾ���
		}
		return current;
	}
	/*
	 * ɾ������ �������ݽ���ɾ��
	 */
	public Node delete(long value) {
		Node current = first;
		Node previous = first;
		while(current.data!=value) {
			if(current.next==null) {
				return null;
			}
			previous = current;
			current = current.next;
		}
		if(current==first) {//���ɾ�����ǵ�һ���ڵ� ֱ������һ���ڵ㸲�ǵ�ǰ�ڵ��ָ�� ��ɾ��
			first = first.next;
		}else {
			previous.next=current.next;//ǰһ���ڵ��ָ�� ����ǰ�Ľڵ� �����ǰɾ��
		}
		return current;
	}
}