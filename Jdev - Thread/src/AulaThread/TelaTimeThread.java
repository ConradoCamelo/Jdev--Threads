package AulaThread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaTimeThread extends JDialog {
	
	private JPanel jPanel = new JPanel(new GridBagLayout()); //para criação do painel dentro da caixinha vazia (Painel de Componentes)
	
	private JLabel descricaoHora = new JLabel("Time da Thread 1	");
	private JTextField mostraTempo = new JTextField();
	
	private JLabel descricaoHora2 = new JLabel("Time da Thread 2	");
	private JTextField mostraTempo2 = new JTextField();
	

	public TelaTimeThread() {/* Executa oque estiver dentro do momento da Abertura ou Execução, Tudo que escrevermos daqui para 
	baixo ele vai excutar nessa tela do método SetVisible */
	
		setTitle("Minha Tela de Time com Thread");//Titulo da Tela 
		setSize(new Dimension(240, 240)); //Tamanho da Tela
		setLocationRelativeTo(null);//Centralizando a Tela 
		setResizable(false);//Travar para Ninguém mudar o tamnho da tela 
		//Primeira Parte Concluida
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); // Controlador de posicionamento de botões na tela 
		
		gridBagConstraints.gridx = 0;// quer dizer que você quer iniciar na primeira linha (Pensar em um plano cartesiano)
		gridBagConstraints.gridy = 0;// quer dizer que vai iniciar na primeira coluna  
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));//Um bloco
		jPanel.add (descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo, gridBagConstraints);//Fim bloco
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));//segundo bloco
		gridBagConstraints.gridy ++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		jPanel.add(mostraTempo2, gridBagConstraints);//fim segundo bloco
		
		
		add(jPanel,BorderLayout.WEST);
		/*Sempre Será o Ultimo Comando*/
		setVisible(true); //Torna a Tela visível para o usuário. 
	}
	
}
