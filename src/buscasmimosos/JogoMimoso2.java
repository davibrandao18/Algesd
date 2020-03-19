package buscasmimosos;
import javax.swing.*;
   import java.awt.*;
   import java.awt.event.*;
   public class JogoMimoso2 extends JFrame implements ActionListener
   {
      JButton botaoAlto, botaoBaixo, botaoAcertou;
      JLabel rotulo;
      int contador, inicio, fim, meio;
   // Metodo Construtor
      public JogoMimoso2()
      {
         inicio=1;
         fim=100;
         meio=50;
         Container caixa = getContentPane();
         caixa.setLayout(new FlowLayout());
      // Instanciacao de objetos
         botaoBaixo = new JButton("Está baixo!");
         botaoAlto = new JButton("Está alto!");
         botaoAcertou = new JButton("Acertou!");
         rotulo = new JLabel("Acho que você pensou no número :"+meio);
      // Inclusao ao container
         caixa.add(rotulo);
         caixa.add(botaoBaixo);
         caixa.add(botaoAlto);
         caixa.add(botaoAcertou);
      // Registro no listener dos objetos controlados
         botaoBaixo.addActionListener(this);
         botaoAlto.addActionListener(this);
         botaoAcertou.addActionListener(this);
      // Ajustes finais do frame
         setTitle("Pense num número entre 1 e 100");
         setSize(300,104);
         setVisible(true);
         contador = 1;
      }
   // Metodo do Listener
      public void actionPerformed(ActionEvent evento)
      {
         if(evento.getSource() == botaoBaixo)
         {
            contador = contador + 1;
            inicio = meio+1;
            meio = (inicio+fim)/2;       
            rotulo.setText("Agora acho que você pensou no "+meio);
         }
         if(evento.getSource() == botaoAlto)
         {
            contador = contador + 1;
            fim = meio-1;
            meio = (inicio+fim)/2;       
            rotulo.setText("Agora acho que você pensou no "+meio);
         }
         if(evento.getSource() == botaoAcertou)
         {
            rotulo.setText("Acertei em "+contador+" tentativas!! Viu como sou bom?!?");
            botaoAlto.setEnabled(false);
            botaoBaixo.setEnabled(false);
            botaoAcertou.setEnabled(false);
         }
     
     
      } // Fecha o metodo actionPerformed
   // Metodo main (poderia ser externo)
      public static void main(String args[])
      {
         JogoMimoso2 prog = new JogoMimoso2();
         prog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      } // Fecha o metodo main()
             
   } // Fecha a classe JogoMimoso2