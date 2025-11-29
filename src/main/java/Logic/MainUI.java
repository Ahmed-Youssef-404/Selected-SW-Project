package Logic;

import Logic.TaskManger;
import Logic.UserFactory;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class MainUI extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MainUI.class.getName());

    private TaskManger taskManger;
    private DefaultTableModel tableModel;

    public MainUI() {
        initComponents();
        table.setRowHeight(45);

        taskManger = TaskManger.getInstance();

        setupTaskTable();
        activeCompleteButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HolderPanel = new javax.swing.JPanel();
        addUserPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userNameInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        userRoleSelect = new javax.swing.JComboBox<>();
        addUserButton1 = new javax.swing.JButton();
        addTaskPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        taskTitleInput = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        taskTypeSelect = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        assignToUserSelect = new javax.swing.JComboBox<>();
        addTaskButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        tablePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        completeTask = new javax.swing.JButton();
        notificatinosPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        notificationTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(270, 480));
        setResizable(false);
        setSize(new java.awt.Dimension(1280, 720));

        HolderPanel.setBackground(new java.awt.Color(210, 225, 241));

        addUserPanel.setBackground(new java.awt.Color(0, 0, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add New User");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        userNameInput.setBackground(new java.awt.Color(239, 248, 255));
        userNameInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userNameInput.setForeground(new java.awt.Color(0, 0, 0));
        userNameInput.addActionListener(this::userNameInputActionPerformed);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Role");

        userRoleSelect.setBackground(new java.awt.Color(239, 248, 255));
        userRoleSelect.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        userRoleSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Developer", "Tester", "Admin" }));
        userRoleSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        userRoleSelect.setPreferredSize(new java.awt.Dimension(81, 31));

        addUserButton1.setBackground(new java.awt.Color(153, 255, 153));
        addUserButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addUserButton1.setForeground(new java.awt.Color(0, 0, 51));
        addUserButton1.setText("Add User");
        addUserButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addUserButton1.addActionListener(this::addUserButton1ActionPerformed);

        javax.swing.GroupLayout addUserPanelLayout = new javax.swing.GroupLayout(addUserPanel);
        addUserPanel.setLayout(addUserPanelLayout);
        addUserPanelLayout.setHorizontalGroup(
            addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserPanelLayout.createSequentialGroup()
                .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userRoleSelect, 0, 396, Short.MAX_VALUE)
                            .addComponent(userNameInput)))
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(addUserPanelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(addUserButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addUserPanelLayout.setVerticalGroup(
            addUserPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addUserPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userRoleSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(addUserButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        addTaskPanel.setBackground(new java.awt.Color(3, 26, 60));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Title");

        taskTitleInput.setBackground(new java.awt.Color(239, 248, 255));
        taskTitleInput.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        taskTitleInput.setForeground(new java.awt.Color(0, 0, 0));
        taskTitleInput.addActionListener(this::taskTitleInputActionPerformed);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Type");

        taskTypeSelect.setBackground(new java.awt.Color(239, 248, 255));
        taskTypeSelect.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        taskTypeSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Feature", "Improvement", "Bug" }));
        taskTypeSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        taskTypeSelect.setPreferredSize(new java.awt.Dimension(81, 31));
        taskTypeSelect.addActionListener(this::taskTypeSelectActionPerformed);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Open Sans", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Assign to");

        assignToUserSelect.setBackground(new java.awt.Color(239, 248, 255));
        assignToUserSelect.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        assignToUserSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        assignToUserSelect.setPreferredSize(new java.awt.Dimension(81, 31));

        addTaskButton.setBackground(new java.awt.Color(153, 255, 153));
        addTaskButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addTaskButton.setForeground(new java.awt.Color(0, 0, 51));
        addTaskButton.setText("Add Task");
        addTaskButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addTaskButton.addActionListener(this::addTaskButtonActionPerformed);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Add New Task");

        javax.swing.GroupLayout addTaskPanelLayout = new javax.swing.GroupLayout(addTaskPanel);
        addTaskPanel.setLayout(addTaskPanelLayout);
        addTaskPanelLayout.setHorizontalGroup(
            addTaskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addTaskPanelLayout.createSequentialGroup()
                .addGroup(addTaskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addTaskPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(addTaskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taskTitleInput, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taskTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(assignToUserSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addTaskPanelLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(addTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(addTaskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addTaskPanelLayout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addComponent(jLabel8)
                    .addContainerGap(154, Short.MAX_VALUE)))
        );
        addTaskPanelLayout.setVerticalGroup(
            addTaskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addTaskPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taskTitleInput, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(taskTypeSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(assignToUserSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(addTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(addTaskPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(addTaskPanelLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(340, Short.MAX_VALUE)))
        );

        tablePanel.setBackground(new java.awt.Color(164, 174, 197));

        table.setBackground(new java.awt.Color(242, 237, 245));
        table.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Task ID", "Title", "Type", "Assigned To", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setGridColor(new java.awt.Color(232, 224, 255));
        jScrollPane1.setViewportView(table);

        completeTask.setBackground(new java.awt.Color(153, 255, 153));
        completeTask.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        completeTask.setForeground(new java.awt.Color(0, 0, 51));
        completeTask.setText("Assign as completed Task");
        completeTask.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        completeTask.setEnabled(false);
        completeTask.addActionListener(this::completeTaskActionPerformed);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(completeTask, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(completeTask, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        notificatinosPanel.setBackground(new java.awt.Color(211, 211, 245));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("Notifications");

        notificationTextField.setBackground(new java.awt.Color(211, 211, 245));
        notificationTextField.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        notificationTextField.setForeground(new java.awt.Color(0, 0, 51));
        notificationTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        notificationTextField.setDisabledTextColor(new java.awt.Color(0, 0, 51));
        notificationTextField.setEnabled(false);
        notificationTextField.addActionListener(this::notificationTextFieldActionPerformed);

        javax.swing.GroupLayout notificatinosPanelLayout = new javax.swing.GroupLayout(notificatinosPanel);
        notificatinosPanel.setLayout(notificatinosPanelLayout);
        notificatinosPanelLayout.setHorizontalGroup(
            notificatinosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notificatinosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(notificatinosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(notificatinosPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(notificationTextField))
                .addContainerGap())
        );
        notificatinosPanelLayout.setVerticalGroup(
            notificatinosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(notificatinosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notificationTextField)
                .addContainerGap())
        );

        javax.swing.GroupLayout HolderPanelLayout = new javax.swing.GroupLayout(HolderPanel);
        HolderPanel.setLayout(HolderPanelLayout);
        HolderPanelLayout.setHorizontalGroup(
            HolderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HolderPanelLayout.createSequentialGroup()
                .addGroup(HolderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(addUserPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addTaskPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HolderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(HolderPanelLayout.createSequentialGroup()
                        .addComponent(notificatinosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        HolderPanelLayout.setVerticalGroup(
            HolderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HolderPanelLayout.createSequentialGroup()
                .addComponent(tablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(notificatinosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(HolderPanelLayout.createSequentialGroup()
                .addComponent(addUserPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addTaskPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(HolderPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(HolderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameInputActionPerformed

    private void completeTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeTaskActionPerformed
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            List<Task> tasks = taskManger.getTasks();
            Task taskToComplete = tasks.get(selectedRow);
            taskToComplete.setStatus("Completed");
            tableModel.setValueAt("Completed", selectedRow, 3);
            completeTask.setEnabled(false);
            String notification = NotificationsService.getInstance().sendNotification(
                    "Task '" + taskToComplete.getTitle() + "' marked as Completed."
            );

            notificationTextField.setText(notification);
            clearNotification();
        }

    }//GEN-LAST:event_completeTaskActionPerformed

    private void taskTitleInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskTitleInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskTitleInputActionPerformed

    private void addTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskButtonActionPerformed
        String taskTitle = taskTitleInput.getText();
        String taskType = taskTypeSelect.getSelectedItem().toString();
        String assignedTo = (String) assignToUserSelect.getSelectedItem();

        System.out.println(assignedTo);

        if (taskTitle.isEmpty() || assignedTo == null) {
            JOptionPane.showMessageDialog(
                    null,
                    "Enter taks title and select a user to assign to",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        Task newTask = TaskFactory.createTask(taskType, taskTitle);
        newTask.setAssignedTo(assignedTo);
        taskManger.addTask(newTask);
        tableModel.addRow(newTask.toRow());

        String notification = NotificationsService.getInstance().sendNotification(
                "New " + taskType + " '" + taskTitle + "' assigned to " + assignedTo + "."
        );

        notificationTextField.setText(notification);

        clearNotification();
        taskTitleInput.setText("");

    }//GEN-LAST:event_addTaskButtonActionPerformed

    private void taskTypeSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskTypeSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taskTypeSelectActionPerformed

    private void notificationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_notificationTextFieldActionPerformed

    private void addUserButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButton1ActionPerformed
        String userName = userNameInput.getText();
        String userRole = userRoleSelect.getSelectedItem().toString();

        if (userName.isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Enter user name.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        User newUser = UserFactory.createUser(userName, userRole);
        taskManger.addUser(newUser);

        String notification = NotificationsService.getInstance().sendNotification(
                "User " + userName + " (" + userRole + ") Created "
        );
        clearNotification();
        notificationTextField.setText(notification);
        updateAssignToComboBox();

        userNameInput.setText("");
    }//GEN-LAST:event_addUserButton1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MainUI().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel HolderPanel;
    private javax.swing.JButton addTaskButton;
    private javax.swing.JPanel addTaskPanel;
    private javax.swing.JButton addUserButton1;
    private javax.swing.JPanel addUserPanel;
    private javax.swing.JComboBox<String> assignToUserSelect;
    private javax.swing.JButton completeTask;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel notificatinosPanel;
    private javax.swing.JTextField notificationTextField;
    private javax.swing.JTable table;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JTextField taskTitleInput;
    private javax.swing.JComboBox<String> taskTypeSelect;
    private javax.swing.JTextField userNameInput;
    private javax.swing.JComboBox<String> userRoleSelect;
    // End of variables declaration//GEN-END:variables

    private void setupTaskTable() {
        String[] columnNames = {"Title", "Type", "Assigned To", "Status"};
        tableModel = new DefaultTableModel(columnNames, 0); // ***هنا يتم إنشاء الكائن***
        table.setModel(tableModel);
    }

    private void updateAssignToComboBox() {
        assignToUserSelect.removeAllItems();
        for (User user : taskManger.getUsers()) {
            assignToUserSelect.addItem(user.getName());
        }
    }

    private void activeCompleteButton() {
        table.getSelectionModel().addListSelectionListener(e -> {
            completeTask.setEnabled(table.getSelectedRow() != -1);
        });
    }

    private void clearNotification() {
        Timer timer = new Timer(5000, e -> {
            notificationTextField.setText("");
        });
        timer.setRepeats(false);
        timer.start();
    }
}
