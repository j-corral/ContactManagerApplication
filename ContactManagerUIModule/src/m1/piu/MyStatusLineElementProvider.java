/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.Component;
import org.openide.awt.StatusLineElementProvider;
import org.openide.util.lookup.ServiceProvider;

/**
 *
 * @author jonathan
 */
@ServiceProvider(service = org.openide.awt.StatusLineElementProvider.class)
public class MyStatusLineElementProvider implements StatusLineElementProvider {
    
    @Override
    public Component getStatusLineElement() {
        MyStatusBar bar = new MyStatusBar();
        bar.setText(" : Status");
        return bar;
    }
    
}
