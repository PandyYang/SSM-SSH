package pandy.test.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author ASUS
 *Lock��ʵ����Ҫ�� ReentrantLock ReadLock��writeLock
 *ReentrantLockλ�ڲ�������е�locks�Ӱ��� ��ʵ����lock�Ľӿ� ���ǿ����л���  ���е���˼���ǽ��ַ���ת���ɿ������ɴ�����ֽ���
 *�����л���ʵ�����Ϲ��̿��� ������һ��AbstractQueuedSynchronizer������ Ĭ��֧������ģʽ һ���ǹ�ƽ�� һ���Ƿǹ�ƽ�� Ĭ���Ƿǹ�
 *�����lock���������interrupt�������쳣
 */
public class Test {
	public static void main(String[] args) throws InterruptedException {
		final Lock lock = new ReentrantLock();
		lock.lock();
		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					lock.lockInterruptibly();
				}catch(InterruptedException e) {
					System.out.println("interrupted");
				}
			}
			
		});
		t1.start();
		t1.interrupt();
		Thread.sleep(1);
	}
}