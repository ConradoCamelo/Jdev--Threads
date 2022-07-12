package AulaThread;

import javax.swing.JOptionPane;

public class ClasseThread {

	public static void main(String[] args) throws InterruptedException {
		
		new Thread() {
			
			public void run() {;//Aqui executa oque nós queremos
			
				for (int i = 0; i < 5; i++) {
					
					try {
						Thread.sleep(1000);//Isso vai fazer com que o programa demore um 1 segundo para imprimir de um laço para o outro. 
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println("Executando alguma rotina para trabalho e Envio de E-mail ");
				}
			}
			
		}.start(); //Start é o que liga a Thread pra ficar processando paralelamente 
		
		
		
		System.out.println("Chegando ao Fim do código");
		JOptionPane.showMessageDialog(null, "Código chegando ao fim");

	}

}
