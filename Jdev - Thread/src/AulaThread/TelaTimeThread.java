package AulaThread;

import java.awt.Dimension;

import javax.swing.JDialog;

public class TelaTimeThread extends JDialog {

	public TelaTimeThread() {/* Executa oque estiver dentro do momento da Abertura ou Execução, Tudo que escrevermos daqui para 
	baixo ele vai excutar nessa tela do método SetVisible */
	
		setTitle("Minha Tela de Time com Thread");//Titulo da Tela 
		setSize(new Dimension(240, 240)); //Tamanho da Tela
		setLocationRelativeTo(null);//Centralizando a Tela 
		setResizable(false);//Travar para Ninguém mudar o tamnho da tela 
		//Primeira Parte Concluida
		
		
		/*Sempre Será o Ultimo Comando*/
		setVisible(true); //Torna a Tela visível para o usuário. 
	}
	
}
