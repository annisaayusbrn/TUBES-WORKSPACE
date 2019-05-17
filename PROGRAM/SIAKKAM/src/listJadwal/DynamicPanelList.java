package listJadwal;

        import javax.swing.*;
        import java.awt.*;
public class DynamicPanelList {

    public static void main(String[] args) {
        new DynamicPanelList();
    }

    public DynamicPanelList() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ex) {
                }

                JFrame frame = new JFrame("Test");
                frame.setSize(500, 800);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new TestPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}