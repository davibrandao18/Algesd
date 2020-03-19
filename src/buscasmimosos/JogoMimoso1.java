package buscasmimosos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JogoMimoso1 extends JFrame implements ActionListener
{
    JButton botao;
    JLabel rotulo;
    JTextField texto;
    int numeroSorteado;
    int contador;
// Metodo Construtor
    public JogoMimoso1()
    {
        Container caixa = getContentPane();
        caixa.setLayout(new FlowLayout());
    // Instanciacao de objetos
        botao = new JButton("Tente!");
        rotulo = new JLabel("Adivinhe o número que pensei (de 1 a 100):");
        texto = new JTextField(10);
    // Inclusao ao container
        caixa.add(rotulo);
        caixa.add(texto);
        caixa.add(botao);
    // Registro no listener dos objetos controlados
        botao.addActionListener(this);
    // Ajustes finais do frame
        setTitle("Joguinho Mimoso");
        setSize(500,104);
        setVisible(true);
        numeroSorteado = aleatorio();
        contador = 0;
    }
// Metodo do Listener
    public void actionPerformed(ActionEvent evento)
    {
        if(evento.getSource() == botao)
        {
        int valor = Integer.parseInt(texto.getText());
        contador = contador + 1;
        if(valor == numeroSorteado)
        {
                rotulo.setText("Parabéns! Você acertou em "+contador+" tentativas");
                botao.setEnabled(false);
                }
            else if (valor < numeroSorteado)
        {
            rotulo.setText("Chutou muito baixo... " + contador + " tentativa(s)");
            texto.setText("");
        }
        else
        {
            rotulo.setText("Chutou muito alto... " + contador + " tentativa(s)");
            texto.setText("");
        }
        }
    } // Fecha o metodo actionPerformed
// Metodo main (poderia ser externo)
    public static void main(String args[])
    {
        JogoMimoso1 prog = new JogoMimoso1();
        prog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } // Fecha o metodo main()
    
    public static int aleatorio()
    {
        return (int)(Math.random()*100 + 1);
    }
    
} // Fecha a classe JogoMimoso1