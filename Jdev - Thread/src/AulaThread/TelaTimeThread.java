package AulaThread;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JButton;
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
	
	private JButton jButton1 = new JButton("Start");
	private JButton jButton2 = new JButton("Stop");
	
	
	private Runnable thread1 = new Runnable() {
		
		@Override
		public void run() {
			
			while(true) {
			mostraTempo.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			}
		}
	};
	
	private Runnable thread2 = new Runnable() {
		
		@Override
		public void run() {
			
			while (true) {
				mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm.ss").format(Calendar.getInstance().getTime()));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
		}
	};
	
	private Thread thread1Time;
	private Thread thread2Time;
	
	/*-------------------------------------------------------------------------------------------------------------------*/

	public TelaTimeThread() {/* Executa oque estiver dentro do momento da Abertura ou Execução, Tudo que escrevermos daqui para 
	baixo ele vai excutar nessa tela do método SetVisible */
	
		setTitle("Minha Tela de Time com Thread");//Titulo da Tela 
		setSize(new Dimension(240, 240)); //Tamanho da Tela
		setLocationRelativeTo(null);//Centralizando a Tela 
		setResizable(false);//Travar para Ninguém mudar o tamnho da tela 
		
	/*------------------------------Primeira Parte Concluida-------------------------------------------------------------*/
		
		GridBagConstraints gridBagConstraints = new GridBagConstraints(); // Controlador de posicionamento de botões na tela 
		
		gridBagConstraints.gridx = 0;// quer dizer que você quer iniciar na primeira linha (Pensar em um plano cartesiano)
		gridBagConstraints.gridy = 0;// quer dizer que vai iniciar na primeira coluna  
		gridBagConstraints.gridwidth = 2;//vai ocupar duas posições de largura (Como se iniciasse com 2 centimetros "tabela")
		gridBagConstraints.insets = new Insets(5, 10, 5, 5);
		gridBagConstraints.anchor = GridBagConstraints.WEST; // Alinhamento a esquerda.
	/*-------------------------------------------------------------------------------------------------------------------*/
		
		descricaoHora.setPreferredSize(new Dimension(200, 25));//Primeiro bloco
		jPanel.add (descricaoHora, gridBagConstraints);
		
		mostraTempo.setPreferredSize(new Dimension(200, 25));
		gridBagConstraints.gridy ++;
		mostraTempo.setEditable(false);
		jPanel.add(mostraTempo, gridBagConstraints);//Fim bloco
		
		descricaoHora2.setPreferredSize(new Dimension(200, 25));//segundo bloco
		gridBagConstraints.gridy ++;
		jPanel.add(descricaoHora2, gridBagConstraints);
		
		mostraTempo2.setPreferredSize(new Dimension(200,25));
		gridBagConstraints.gridy ++;
		mostraTempo2.setEditable(false);
		jPanel.add(mostraTempo2, gridBagConstraints);//fim segundo bloco
		
		gridBagConstraints.gridwidth=1;//Aqui a largura passa a ser 1 centimetro
		
		jButton1.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridy ++;
		jPanel.add(jButton1, gridBagConstraints);
		
		jButton2.setPreferredSize(new Dimension(92, 25));
		gridBagConstraints.gridx ++;
		jPanel.add(jButton2, gridBagConstraints);
		
		jButton1.addActionListener(new ActionListener() {//Executa o Click no Botão
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				thread1Time = new Thread(thread1);
				thread1Time.start();
				
				thread2Time = new Thread(thread2);
				thread2Time.start();
				
				jButton1.setEnabled(false);
				jButton2.setEnabled(true);
			}
		});
		
		jButton2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				thread1Time.stop();
				thread2Time.stop(); 

				jButton1.setEnabled(true);
				jButton2.setEnabled(false);
				
			}
		});
	/*---------------------------------------------------------------------------------------------------------------------*/
		
		jButton2.setEnabled(false);
		
		add(jPanel,BorderLayout.WEST);
		/*Sempre Será o Ultimo Comando*/
		setVisible(true); //Torna a Tela visível para o usuário. 
	}
	
}
