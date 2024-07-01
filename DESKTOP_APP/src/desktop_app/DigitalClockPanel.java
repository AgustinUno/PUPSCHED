package desktop_app;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClockPanel extends JPanel {

    private JLabel clockLabel;

    public DigitalClockPanel() {
        // Initialize the clock label
        clockLabel = new JLabel();
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
        setLayout(new BorderLayout());
        add(clockLabel, BorderLayout.CENTER);

        // Create a timer to update the clock every second
        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();

        // Initial clock update
        updateClock();
    }

    // Method to update the clock
    private void updateClock() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        String currentTime = formatter.format(new Date());
        clockLabel.setText(currentTime);
    }

    @Override
    public void addNotify() {
        super.addNotify();
        // Set the font here to ensure it's applied
        clockLabel.setFont(new Font("Product Sans", Font.BOLD, 14));
          clockLabel.setForeground(new Color(51,51,51)); 
    }
}
