package Day7;
public class Thread1Ex extends Thread {
	public void run() {
		try {
			for(int i=0;i<=5;i++) {
				System.out.println("Thread "+i+" has Started");
				Thread.sleep(2000);
			}
		}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		public static void main(String args[]) throws InterruptedException {
			Thread1Ex t=new Thread1Ex();
			System.out.println(Thread.currentThread().getName()+"----Started");
			t.start();
			t.join();
			//System.out.println(Thread.currentThread().getName()+"----Started");
			try {
				Thread.sleep(4000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
			//Thread.currentThread().join();
			System.out.println(Thread.currentThread().getName()+"----Stopped");
			
		}
	}


