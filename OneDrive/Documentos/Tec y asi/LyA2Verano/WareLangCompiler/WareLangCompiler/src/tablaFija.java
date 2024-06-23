
import compilerTools.Functions;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */

/**
 *
 * @author Amir Praiz
 */
public class tablaFija extends javax.swing.JDialog {
    DefaultTableModel tablaFija = new DefaultTableModel();

    /**
     * Creates new form tablaFija
     */
    public tablaFija(java.awt.Frame parent, boolean modal) {
        super(parent,"Tabla de Simbolos Fija", modal);
        initComponents();
        setLocationRelativeTo(parent); 
    }
    
    public void setSimbolos(DefaultTableModel fija){
        this.tablaFija = fija;
    }
    
    public void llenarTabla(){
        
        String columnas [] = {"Lexema", "Componente Léxico"};
        tablaFija.setColumnIdentifiers(columnas);
        
        String frec [] = {"FREC", "FREC"};
        tablaFija.addRow(frec);
        
        String ent [] = {"ENT", "ENT"};
        tablaFija.addRow(ent);
        
        String color [] = {"COLOR", "COLOR"};
        tablaFija.addRow(color);
        
        String dec [] = {"DEC", "DEC"};
        tablaFija.addRow(dec);
        
        String bool [] = {"BOOL", "BOOL"};
        tablaFija.addRow(bool);
        
        String cad [] = {"CAD", "CAD"};
        tablaFija.addRow(cad);
        
        String mini [] = {"MINI", "MINI"};
        tablaFija.addRow(mini);
        
        String verdadero [] = {"VERDADERO", "Verdadero"};
        tablaFija.addRow(verdadero);
        
        String falso [] = {"FALSO", "Falso"};
        tablaFija.addRow(falso);
        
        String si [] = {"SI", "Est_SI"};
        tablaFija.addRow(si);
        
        String sino [] = {"SINO", "Est_SINO"};
        tablaFija.addRow(sino);
        
        String mientras [] = {"MIENTRAS", "Est_MIENTRAS"};
        tablaFija.addRow(mientras);
        
        String consol [] = {"CONSOL", "CONSOL"};
        tablaFija.addRow(consol);
        
        String leer [] = {"LEER", "Est_LEER"};
        tablaFija.addRow(leer);
        
        String apagar [] = {"APAGAR", "APAGAR"};
        tablaFija.addRow(apagar);
        
        String lcd [] = {"LCD", "LCD"};
        tablaFija.addRow(lcd);
        
        String prender [] = {"SI", "Est_SI"};
        tablaFija.addRow(prender);
        
        String repetir [] = {"REPETIR", "Est_REPETIR"};
        tablaFija.addRow(repetir);
        
        String retorna [] = {"RETORNA", "PbC_RETORNA"};
        tablaFija.addRow(retorna);
        
        String clase [] = {"CLASE", "CLASE"};
        tablaFija.addRow(clase);
        
        String def [] = {"DEF", "DEF"};
        tablaFija.addRow(def);
        
        String principal [] = {"PRINCIPAL", "PRINCIPAL"};
        tablaFija.addRow(principal);
        
        String tomar [] = {"TOMAR", "F_TOMAR"};
        tablaFija.addRow(tomar);
        
        String conf [] = {"CONF", "CONF"};
        tablaFija.addRow(conf);
        
        String lista [] = {"LISTA", "LISTA"};
        tablaFija.addRow(lista);
        
        String matriz [] = {"MATRIZ", "MATRIZ"};
        tablaFija.addRow(matriz);
        
        String impr [] = {"IMPR", "F_IMPR"};
        tablaFija.addRow(impr);
        
        String adelante [] = {"ADELANTE", "F_ADELANTE"};
        tablaFija.addRow(adelante);
        
        String atras [] = {"ATRAS", "F_ATRAS"};
        tablaFija.addRow(atras);
        
        String izquierda [] = {"IZQUIERDA", "F_IZQUIERDA"};
        tablaFija.addRow(izquierda);
       
        String derecha [] = {"DERECHA", "F_DERECHA"};
        tablaFija.addRow(derecha);
        
        String revisar [] = {"REVISAR", "F_REVISAR"};
        tablaFija.addRow(revisar);
        
        String alarma [] = {"ALARMA", "F_ALARMA"};
        tablaFija.addRow(alarma);
        
        String caja [] = {"CAJA", "F_CAJA"};
        tablaFija.addRow(caja);
        
        String bajar [] = {"BAJAR", "F_BAJAR"};
        tablaFija.addRow(bajar);
        
        String subir [] = {"SUBIR", "F_SUBIR"};
        tablaFija.addRow(subir);
        
        String soltar [] = {"SOLTAR", "F_SOLTAR"};
        tablaFija.addRow(soltar);
        
        String parar [] = {"PARAR", "F_PARAR"};
        tablaFija.addRow(parar);
        
        String limpiar [] = {"LIMPIAR", "F_LIMPIAR"};
        tablaFija.addRow(limpiar);
        
        String agregar [] = {"AGREGAR", "F_AGREGAR"};
        tablaFija.addRow(agregar);
        
        String cantidad [] = {"CANTIDAD", "F_CANTIDAD"};
        tablaFija.addRow(cantidad);
        
        String sacar [] = {"SACAR", "F_Sacar"};
        tablaFija.addRow(sacar);
        
        String mas [] = {"+", "Op_Sum"};
        tablaFija.addRow(mas);
        
        String menos [] = {"-", "Op_Res"};
        tablaFija.addRow(menos);
        
        String div [] = {"/", "Op_Div"};
        tablaFija.addRow(div);
        
        String mul [] = {"*", "Op_Mul"};
        tablaFija.addRow(mul);
        
        String mod [] = {"%", "Op_Mod"};
        tablaFija.addRow(mod);
        
        String masIg [] = {"+=", "Op_MasIgual"};
        tablaFija.addRow(masIg);
        
        String menosIg [] = {"-=", "Op_MenosIgual"};
        tablaFija.addRow(menosIg);
        
        String pot [] = {"^", "Op_Potencia"};
        tablaFija.addRow(pot);
        
        String parA [] = {"(", "Par_abr"};
        tablaFija.addRow(parA);
        
        String parC [] = {")", "Par_cer"};
        tablaFija.addRow(parC);
        
        String corA [] = {"[", "Corch_abr"};
        tablaFija.addRow(corA);
        
        String corC [] = {"]", "Corch_cer"};
        tablaFija.addRow(corC);
        
        String llavA [] = {"{", "Llav_abr"};
        tablaFija.addRow(llavA);
        
        String llavC [] = {"}", "Llav_cer"};
        tablaFija.addRow(llavC);
        
        String punto [] = {".", "Punto"};
        tablaFija.addRow(punto);
        
        String coma [] = {",", "Coma"};
        tablaFija.addRow(coma);
        
        String dospuntos [] = {":", "DosPuntos"};
        tablaFija.addRow(dospuntos);
        
        String puntocoma [] = {";", "Punto_coma"};
        tablaFija.addRow(puntocoma);
        
        String ylog [] = {"&&", "OpLog_Y"};
        tablaFija.addRow(ylog);
        
        String olog [] = {"||", "OpLog_O"};
        tablaFija.addRow(olog);
        
        String nolog [] = {"!", "OpLog_NO"};
        tablaFija.addRow(nolog);
        
        String igual [] = {"==", "OpRel_Igual"};
        tablaFija.addRow(igual);
        
        String noigual [] = {"!=", "OpRel_NoIgual"};
        tablaFija.addRow(noigual);
        
        String Omenor [] = {"<", "OpRel_Menor"};
        tablaFija.addRow(Omenor);
        
        String Omayor [] = {">", "OpRel_Mayor"};
        tablaFija.addRow(Omayor);
        
        String OmenorI [] = {"<=", "OpRel_MenorIgual"};
        tablaFija.addRow(OmenorI);
        
        String OmayorI [] = {">=", "OpRel_MayorIgual"};
        tablaFija.addRow(OmayorI);
        
        
        tablaF.setModel(tablaFija);

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaF = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaF.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaF);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tablaFija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablaFija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablaFija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablaFija.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tablaFija dialog = new tablaFija(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaF;
    // End of variables declaration//GEN-END:variables
}
