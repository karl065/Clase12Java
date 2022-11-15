package componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class Componentes extends JFrame {

    private JPanel contentPane;
    private JTextField txtCajaDeTexto;
    private JPasswordField passwordField;
    static Componentes frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
    }
        
      public Componentes(){
            setTitle("JavaSwing: Componentes basicos");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 458, 363);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);
            
            //Etiqueta
            JLabel lblEtiqueta = new JLabel("Etiqueta");
            lblEtiqueta.setBounds(10, 11, 67, 14);
            contentPane.add(lblEtiqueta);
            
            //Caja de texto
            txtCajaDeTexto =new JTextField();
            txtCajaDeTexto.setText("Caja de texto");
            txtCajaDeTexto.setBounds(10, 36, 152, 20);
            contentPane.add(txtCajaDeTexto);
            
            //Cuadro Combinado
            JComboBox comboBox = new JComboBox();
            comboBox.setModel(new DefaultComboBoxModel(new String[]{
                "Elemento 1", "Elemento 2", "Elemento 3"}));
            comboBox.setSelectedIndex(0);
            comboBox.setBounds(10, 67, 191, 20);
            contentPane.add(comboBox);
            
            //Boton
            
            JButton btnBotn = new JButton("Boton");
            btnBotn.addActionListener(new ActionListener());
            
        }


}
