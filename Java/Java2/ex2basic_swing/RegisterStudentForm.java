import javax.swing.JLabel;

public class RegisterStudentForm extends javax.swing.JFrame {
    public RegisterStudentForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    private void initComponents(){
        JLabel jLabell = new javax.swing.JLabel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabell.setFont(new java.awt.Font("Tahoma", 1, 10));
        jLabell.setText("Register Student");
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGap(171, 171, 171).addComponent(jLabell).addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addContainerGap().addComponent(jLabell).addContainerGap(342, Short.MAX_VALUE))
            );
            pack();
    }
}