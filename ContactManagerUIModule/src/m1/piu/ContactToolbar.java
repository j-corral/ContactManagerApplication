/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractAction;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.NbBundle.Messages;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "File",
        id = "m1.piu.ContactToolbar"
)
@ActionRegistration(
        iconBase = "m1/piu/logo-ceri.png",
        displayName = "#CTL_ContactToolbar",
        lazy = false
)
@ActionReference(path = "Toolbars/File", position = 300)
@Messages("CTL_ContactToolbar=Contact")
public final class ContactToolbar extends AbstractAction implements Presenter.Toolbar {

    
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body
    }

    @Override
    public Component getToolbarPresenter() {
        //return new ContactToolbarPanel();
        return new ContactToolbarPanelfxTopComponent();
    }
}
