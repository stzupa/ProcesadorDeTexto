import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;

/**
 * PACKAGE_NAME
 *
 * @author Sergio Teran on 26-12-2022
 */
public class PanelProcesador extends JPanel {

    private String[] fuentes = {"Arial", "Courier", "Verdana", "Comic Sans MS", "Serif", "Microsoft Sans Serif"};
    private String[] estilos = {"Negrita", "Cursiva", "Subrayado"};
    private String[] tamagnos = {"8", "10", "12", "14", "16", "18", "20", "22", "24", "26", "28"};
    private String[] colores = {"Azul", "Verde", "Rojo", "Amarillo", "Púrpura", "Naranjo"};
    private Color[] coloresColor = {Color.BLUE, Color.GREEN, Color.RED, Color.YELLOW, new Color(125, 33, 129),
                                Color.ORANGE};
    private ImageIcon[] iconosBarra = {new ImageIcon("src/img/negrita.gif"),new ImageIcon("src/img/cursiva.gif"),
            new ImageIcon("src/img/subraya.gif"), new ImageIcon("src/img/azul.gif"),
            new ImageIcon("src/img/verde.gif"), new ImageIcon("src/img/rojo.gif"),
            new ImageIcon("src/img/amarillo.gif"), new ImageIcon("src/img/purple.gif"),
            new ImageIcon("src/img/orange.gif"), new ImageIcon("src/img/alIz.gif"),
            new ImageIcon("src/img/alCe.gif"),new ImageIcon("src/img/alDe.gif"),
            new ImageIcon("src/img/alJu.gif")};
    private JMenu fuente, estilo, color, tamagnoFuente;
    private JTextPane areaTexto;
    private JToolBar barraH;

    public PanelProcesador(){
        setLayout(new BorderLayout());
        JMenuBar barra = new JMenuBar();
        barraH = new JToolBar(SwingConstants.VERTICAL);
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilos");
        tamagnoFuente = new JMenu("Tamaño");
        color = new JMenu("Color");
        addPoblarBarras();
        barra.add(fuente);
        barra.add(estilo);
        barra.add(tamagnoFuente);
        barra.add(color);
        areaTexto = new JTextPane();
        JScrollPane scrollPane = new JScrollPane(areaTexto);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        add(barra, BorderLayout.NORTH);
        add(barraH, BorderLayout.WEST);
        add(scrollPane, BorderLayout.CENTER);
    }

    private void addPoblarBarras() {

        int j = 0;
        int k = 0;

        for (int i = 0; i < fuentes.length; i++){
            fuente.add(fuentes[i]).addActionListener(new StyledEditorKit.FontFamilyAction(null, fuentes[i]));
        }
        for (String string : estilos) {
            estilo.add(string);
            if (string.equals("Negrita")) estilo.getItem(0).addActionListener(new StyledEditorKit.BoldAction());
            else if (string.equals("Cursiva")) estilo.getItem(1).addActionListener(new StyledEditorKit.ItalicAction());
            else estilo.getItem(2).addActionListener(new StyledEditorKit.UnderlineAction());
        }
        for (int i = 0; i < tamagnos.length; i++){
            tamagnoFuente.add(tamagnos[i]).addActionListener(new StyledEditorKit.FontSizeAction(null,
                    Integer.parseInt(tamagnoFuente.getItem(i).getText())));
        }
        for (int i = 0; i < colores.length; i++){
            color.add(colores[i]).addActionListener(new StyledEditorKit.ForegroundAction(null, coloresColor[i]));
        }
        for (int i = 0; i < iconosBarra.length; i++){
            JButton boton = new JButton(iconosBarra[i]);
            if(i < 3){
                if(i == 0) boton.addActionListener(new StyledEditorKit.BoldAction());
                if(i == 1) boton.addActionListener(new StyledEditorKit.ItalicAction());
                if(i == 2) boton.addActionListener(new StyledEditorKit.UnderlineAction());
            }
            if(i > 2 && i < 9){
                boton.addActionListener(new StyledEditorKit.ForegroundAction(null, coloresColor[j]));
                j++;
            }
            if(i > 8 && i < 13){
                boton.addActionListener(new StyledEditorKit.AlignmentAction(null, k));
                k++;
            }
            barraH.add(boton);
        }
    }
}
