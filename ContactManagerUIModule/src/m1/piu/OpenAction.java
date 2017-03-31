/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m1.piu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Double.max;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;
import java.util.Random;
import org.netbeans.api.progress.ProgressHandle;
import org.netbeans.api.progress.ProgressHandleFactory;
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
        id = "m1.piu.OpenAction"
)
@ActionRegistration(
        displayName = "#CTL_OpenAction"
)
@ActionReference(path = "Menu/File", position = 1650)
@Messages("CTL_OpenAction=Open")
public final class OpenAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO implement action body

        this.notifyProgress();

    }

    public void notifyProgress() {

        Runnable myRunnable = new Runnable() {

            public void run() {

                ProgressHandle myProgressHandle = ProgressHandleFactory.createHandle("Opening file...");

                myProgressHandle.start(100);

                myProgressHandle.progress(1);

                //DO TASK HERE
                int workers = 100;

                for (int i = 1; i < workers; ++i) {

                    myProgressHandle.progress("progress...", i);

                    try {
                        Thread.sleep(getRandomNumberInRange(0, 25));
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

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
