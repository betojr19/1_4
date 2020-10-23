
import javax.swing.*;

/**
 *
 * @author Beto Jr
 */
public class AplicacionGrafica extends JFrame {

    /**
     * panel de aplicacion
     */
    private JPanel contentPane;

    public AplicacionGrafica() {

        //Añade un titulo, no es estrictamente necesario
        setTitle("Titulo de la ventana");
        /*
            * Coordenadas x y y de la aplicacion y su altura y longitud,
            *si no lo indicamo aparecera una ventana muy pequeña
         */
        setBounds(400, 200, 607, 448);
        /*
        *Indica que cuando se cierre la ventana se acaba la aplicacion,
        *si no lo indicamos cuando cerremos la ventana la aplicacion seguira funcionando
         */

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        //Hace visible la ventana, si no lo hacemos no veremos la aplicacion 
        setVisible(true);

        //Creamos el panel  
        contentPane = new JPanel();
        JLabel etiqueta = new JLabel("¡Hola mundo!");
        etiqueta.setBounds(60, 20, 100, 20);
        contentPane.add(etiqueta);

        //Campo de texto
        JTextField textField = new JTextField();
        textField.setBounds(43, 67, 86, 26);
        contentPane.add(textField);

        //JBoton
        JButton btnPulsame = new JButton("Pulsame");
        btnPulsame.setBounds(43, 133, 89, 23);
        contentPane.add(btnPulsame);

        //JRadio
        JRadioButton rdbtnOpcion = new JRadioButton("Opcion1", true);
        rdbtnOpcion.setBounds(43, 194, 109, 23);
        contentPane.add(rdbtnOpcion);

        JRadioButton rdbtnOpcion_1 = new JRadioButton("Opcion 2", false);
        rdbtnOpcion_1.setBounds(43, 220, 109, 23);
        contentPane.add(rdbtnOpcion_1);

        JRadioButton rdbtnOpcion_2 = new JRadioButton("Opcion 3", false);
        rdbtnOpcion_2.setBounds(43, 246, 109, 23);
        contentPane.add(rdbtnOpcion_2);

        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(rdbtnOpcion);
        bgroup.add(rdbtnOpcion_1);
        bgroup.add(rdbtnOpcion_2);

        //Boton checkbox
        JCheckBox chckbxOpcion = new JCheckBox("Opcion 1", true);
        chckbxOpcion.setBounds(43, 305, 97, 23);
        contentPane.add(chckbxOpcion);

        JCheckBox chckbxNewCheckBox = new JCheckBox("Opcion 2", true);
        chckbxNewCheckBox.setBounds(43, 325, 97, 23);
        contentPane.add(chckbxNewCheckBox);

        JCheckBox chckbxOpcion_1 = new JCheckBox("Opcion 3", false);
        chckbxOpcion_1.setBounds(43, 346, 97, 23);
        contentPane.add(chckbxOpcion_1);

        //Texto de Area
        JTextArea textArea = new JTextArea("Prueba");
        textArea.setBounds(189, 18, 141, 117);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        contentPane.add(textArea);

        //Scroll
        JScrollPane scroll = new JScrollPane(textArea); //Objeto
        scroll.setBounds(189, 18, 141, 117); // Misma coordenadas y tamaño que el objeto
        contentPane.add(scroll);

        //Campo de Password
        JPasswordField pwd = new JPasswordField("Beto");
        pwd.setBounds(189, 171, 139, 20);
        contentPane.add(pwd);

        //Menu de seleccion
        JComboBox comboBox = new JComboBox<>();
        comboBox.setBounds(189, 221, 141, 22);
        contentPane.add(comboBox);

        comboBox.addItem("Ella ");
        comboBox.addItem("No Te");
        comboBox.addItem("Ama");
        
        //Interruptor
        JToggleButton tglbtnNewToggleButton = new JToggleButton("Interruptor", true);
        tglbtnNewToggleButton.setBounds(189, 291, 121, 23);
        contentPane.add(tglbtnNewToggleButton);
        
        //JSpinner
        JSpinner spinner = new JSpinner();
        spinner.setBounds(371, 20, 29, 20);
        contentPane.add(spinner);
        
        
        //Indicamos su diseño
        contentPane.setLayout(null);

        //asigno el panel a la venta 
        setContentPane(contentPane);

    }

    public static void main(String[] args) {
        AplicacionGrafica ventana = new AplicacionGrafica();
    }
}
