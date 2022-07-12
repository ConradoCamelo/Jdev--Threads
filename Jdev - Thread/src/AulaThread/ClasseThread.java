package AulaThread;

public class ClasseThread {

	public static void main(String[] args) throws InterruptedException {
		
		for (int i = 0; i < 5; i++) {
			
			Thread.sleep(1000);//Isso vai fazer com que o programa demore um 1 segundo para imprimir de um laço para o outro. 
			
			System.out.println("Executando alguma rotina para trabalho e Envio de E-mail ");
		}
		

	}

}
