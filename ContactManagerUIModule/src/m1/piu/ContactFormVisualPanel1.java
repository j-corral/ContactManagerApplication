/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.BorderLayout;
import java.io.IOException;
import java.net.URL;
import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javax.swing.JPanel;
import org.openide.util.Exceptions;

public final class ContactFormVisualPanel1 extends JPanel {

    private static JFXPanel fxPanel;
    
    /**
     * Creates new form ContactFormVisualPanel1
     */
    public ContactFormVisualPanel1() {
        initComponents();
        setName(Bundle.CTL_ContactToolbarPanelfxTopComponent());
        setToolTipText(Bundle.HINT_ContactToolbarPanelfxTopComponent());

        setLayout(new BorderLayout());
 
        init();
    }
    
    private void init() {
        fxPanel = new JFXPanel();
        add(fxPanel, BorderLayout.CENTER);
        Platform.setImplicitExit(false);
        Platform.runLater(() -> createScene());
    }
 
    private void createScene() {
        try {
            URL location = getClass().getResource("partials/FXMLContactIdentity.fxml");
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(location);
            fxmlLoader.setBuilderFactory(new JavaFXBuilderFactory());
 
            Parent root = (Parent) fxmlLoader.load(location.openStream());
            Scene scene = new Scene(root);
            fxPanel.setScene(scene);
            //controller = (MyFXController) fxmlLoader.getController();
 
        } catch (IOException ex) {
            Exceptions.printStackTrace(ex);
        }
    }

    @Override
    public String getName() {
        return "Identity";
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
