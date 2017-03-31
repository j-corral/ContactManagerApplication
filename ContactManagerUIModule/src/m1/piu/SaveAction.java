/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ProgressMonitor;
import org.netbeans.api.progress.*;
import org.openide.DialogDisplayer;
import org.openide.NotifyDescriptor;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionRegistration;
import org.openide.util.Exceptions;
import org.openide.util.NbBundle.Messages;
import org.openide.util.RequestProcessor;

@ActionID(
        category = "File",
        id = "m1.piu.SaveAction"
)
@ActionRegistration(
        displayName = "#CTL_SaveAction"
)
@ActionReference(path = "Menu/File", position = 1550)
@Messages("CTL_SaveAction=Save")
public final class SaveAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
        this.notifyProgress();
        
    }

     public void notifyProgress() {

        Runnable myRunnable = new Runnable() {

            public void run() {

                ProgressHandle myProgressHandle = ProgressHandleFactory.createHandle("Saving file...");

                myProgressHandle.start(100);

                myProgressHandle.progress(1);

                //DO TASK HERE
                int workers = 100;

                for (int i = 1; i < workers; ++i) {

                    myProgressHandle.progress("progress...", i);
                    
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException ex) {
                        Exceptions.printStackTrace(ex);
                    }

                }
                
                myProgressHandle.progress(100);

                myProgressHandle.finish();

            }

        };

        RequestProcessor.Task myTask = RequestProcessor.getDefault().post(myRunnable);

    }


}
