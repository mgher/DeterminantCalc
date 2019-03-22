import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame {

    static final String gapList[] = {"0", "10", "15", "20"};
    final static int maxGap = 20;
    public String result;
    JComboBox horGapComboBox;
    JComboBox verGapComboBox;
    GridLayout experimentLayout = new GridLayout(0,3);

    public Frame(String name) {
        super(name);
        setResizable(false);
    }

    public void initGaps() {
        horGapComboBox = new JComboBox(gapList);
        verGapComboBox = new JComboBox(gapList);
    }

    public void addComponentsToPane(final Container pane) {
        initGaps();
        final JPanel compsToExperiment = new JPanel();
        compsToExperiment.setLayout(experimentLayout);
        JPanel controls = new JPanel();
        controls.setLayout(new GridLayout(3,3));
        JButton calculate = new JButton("Calculate");
        JLabel result = new JLabel("Result:");

        JTextField a1 = new JTextField(5);
        JTextField a2 = new JTextField(5);
        JTextField a3 = new JTextField(5);
        JTextField a4 = new JTextField(5);
        JTextField a5 = new JTextField(5);
        JTextField a6 = new JTextField(5);
        JTextField a7 = new JTextField(5);
        JTextField a8 = new JTextField(5);
        JTextField a9 = new JTextField(5);
        JTextField i1 = new JTextField(5);
        JTextField i2 = new JTextField(5);
        JTextField i3 = new JTextField(5);
        JTextField i4 = new JTextField(5);
        JTextField i5 = new JTextField(5);
        JTextField i6 = new JTextField(5);
        JTextField i7 = new JTextField(5);
        JTextField i8 = new JTextField(5);
        JTextField i9 = new JTextField(5);

        i1.setEditable(false);
        i2.setEditable(false);
        i3.setEditable(false);
        i4.setEditable(false);
        i5.setEditable(false);
        i6.setEditable(false);
        i7.setEditable(false);
        i8.setEditable(false);
        i9.setEditable(false);

        i1.setText("yo");
        i2.setText("ye");
        //Set up components preferred size
        JButton b = new JButton("");
        Dimension buttonSize = b.getPreferredSize();
        compsToExperiment.setLayout(new GridLayout(3,6));
        compsToExperiment.setPreferredSize(new Dimension((int)(buttonSize.getWidth() * 10.5)+maxGap,
                (int)(buttonSize.getHeight() * 10.5)+maxGap * 2));

        //Add buttons to experiment with Grid Layout
        compsToExperiment.add(a1);
        compsToExperiment.add(a2);
        compsToExperiment.add(a3);
        compsToExperiment.add(a4);
        compsToExperiment.add(a5);
        compsToExperiment.add(a6);
        compsToExperiment.add(a7);
        compsToExperiment.add(a8);
        compsToExperiment.add(a9);
        compsToExperiment.add(i1);
        compsToExperiment.add(i2);
        compsToExperiment.add(i3);
        compsToExperiment.add(i4);
        compsToExperiment.add(i5);
        compsToExperiment.add(i6);
        compsToExperiment.add(i7);
        compsToExperiment.add(i8);
        compsToExperiment.add(i9);



        controls.add(calculate);
        controls.add(new JButton("Inverse"));
        controls.add(result);
        //controls.add(horGapComboBox);
        //controls.add(verGapComboBox);

        String horGap = "10";
        String verGap = "10";

        experimentLayout.setHgap(Integer.parseInt(horGap));
        experimentLayout.setVgap(Integer.parseInt(verGap));
        experimentLayout.layoutContainer(compsToExperiment);

        pane.add(compsToExperiment, BorderLayout.NORTH);
        pane.add(new JSeparator(), BorderLayout.CENTER);
        pane.add(controls, BorderLayout.SOUTH);

        calculate.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Pressed");
                int int1 = Integer.valueOf(a1.getText());
                int int2 = Integer.valueOf(a2.getText());
                int int3 = Integer.valueOf(a3.getText());
                int int4 = Integer.valueOf(a4.getText());
                int int5 = Integer.valueOf(a5.getText());
                int int6 = Integer.valueOf(a6.getText());
                int int7 = Integer.valueOf(a7.getText());
                int int8 = Integer.valueOf(a8.getText());
                int int9 = Integer.valueOf(a9.getText());

                DeterminantCalc calc = new DeterminantCalc();
                int result2 = 0;
                result2 = calc.determinantCalc(int1, int2, int3, int4, int5, int6, int7, int8, int9);
                System.out.println(result2);
                result.setText("Result: " + Integer.toString(result2));
            }
        });


    }
    public void displayDeterminant() {

    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method is invoked from the
     * event dispatch thread.
     */
    public static void createAndShowGUI() {
        //Create and set up the window.
        Frame frame = new Frame("Determinant of 3x3 Matrix Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        frame.addComponentsToPane(frame.getContentPane());
        //Display the window.
        frame.pack();
        frame.setVisible(true);

    }

}
