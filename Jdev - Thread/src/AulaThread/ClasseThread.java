package AulaThread;

import javax.swing.JOptionPane;

public class ClasseThread {

	public static void main(String[] args) throws InterruptedException {
		
		//Instanciando um objeto de forma diferente - Prestar atenção porque muda da forma padrão um pouco. 
		Thread threadEmail = new Thread(thread1);
		threadEmail.start();
		
		//Instanciando um objeto de forma diferente - Prestar atenção porque muda da forma padrão um pouco. 
		Thread threadNotaFiscal = new Thread(thread2);
		threadNotaFiscal.start();

		System.out.println("Chegando ao Fim de fluxo antes de finalizar a Thread inteira, Observe!");
		JOptionPane.showMessageDialog(null, "Código chegando ao fim");

	}

	private static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {

				try {
					Thread.sleep(1000);// Isso vai fazer com que o programa demore um 1 segundo para imprimir de um
										// laço para o outro.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Executando alguma rotina para trabalho e Envio de E-mail ");
			}

		}
	};
	
	private static Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {

				try {
					Thread.sleep(2000);// Isso vai fazer com que o programa demore um 1 segundo para imprimir de um
										// laço para o outro.
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				System.out.println("Executando alguma rotina para trabalho de NOta fiscal ");
			}
		}
	};
}
