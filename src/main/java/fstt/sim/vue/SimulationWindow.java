

package fstt.sim.vue;

import fstt.sim.controleur.Simulation;

import javax.swing.*;
import java.awt.*;

public class SimulationWindow extends Canvas {
    public SimulationWindow(int width, int height, String title, Simulation simulation) {
        JFrame frame = new JFrame(title);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        // Central Panel
        JPanel centralPanel = new JPanel(new BorderLayout());
        centralPanel.add(simulation, BorderLayout.CENTER);

        // Control Panel
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new BoxLayout(controlPanel, BoxLayout.Y_AXIS));

        JButton startButton = new JButton("Start");
        startButton.addActionListener(e -> simulation.startMatch());
        startButton.setFont(new Font("Arial", Font.BOLD, 12));
        startButton.setForeground(Color.GREEN);

        JButton endButton = new JButton("End");
        endButton.addActionListener(e -> simulation.endMatch());
        endButton.setFont(new Font("Arial", Font.BOLD, 12));
        endButton.setForeground(Color.BLACK);

        controlPanel.add(startButton);
        controlPanel.add(endButton);

        // Add panels to frame
        frame.add(centralPanel, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.PAGE_END);

        frame.setVisible(true);
        simulation.start();
    }
}
