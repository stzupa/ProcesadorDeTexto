import javax.swing.*;

/**
 * PACKAGE_NAME
 *
 * @author Sergio Teran on 26-12-2022
 */
public class MarcoProcesador  extends JFrame {

    public MarcoProcesador(){
        setSize(800, 600);
        setLocationRelativeTo(null);
        setTitle("Procesador de texto");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new PanelProcesador());
    }
}
