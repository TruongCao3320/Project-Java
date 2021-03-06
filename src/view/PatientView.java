/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JYearChooser;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.scripts.JO;
import model.Patient;

/**
 *
 * @author conme
 */
public class PatientView extends javax.swing.JFrame {

    ArrayList<Patient> p = new ArrayList<>();
    DefaultTableModel model = new DefaultTableModel();
    Scanner sc = new Scanner(System.in);

    /**
     * Creates new form PatientView
     */
    public PatientView() {
        initComponents();
        initTable();
        fillTable();
        txtID.setEditable(false);
        showComboData();
    }

    private void showComboData() {
        List<String> cbl = new ArrayList<>();
        cbl.add("A-Z");
        cbl.add("Z-A");
        for (String s : cbl) {
            cbbSort.addItem(s);
        }
    }

    public void fillTable() {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        model.setRowCount(0);
        String s="";
        for (Patient patient : p) {
            String date = df.format(patient.getBirthday());
            if(patient.isGender()==true){
                s="Male"; 
            }else{
                s="Female";
            }
            model.addRow(new String[]{patient.getPatientID(), patient.getPatientName(), date,s, patient.getPhone(), patient.getAddress()});
        }
        model.fireTableDataChanged();
    }

    public void initTable() {
        String[] columns = new String[]{"ID", "Full Name", "Age", "Gender", "Phone", "Address"};
        model.setColumnIdentifiers(columns);
        tblPatient.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jFrame1 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        cbbSort = new javax.swing.JComboBox<>();
        btnSearchByName = new javax.swing.JButton();
        btnGetAllData = new javax.swing.JButton();
        txtSearchByName = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblOccupation = new javax.swing.JLabel();
        lblBirthday = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblHIN = new javax.swing.JLabel();
        lblSymptom = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        txtOccupation = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtHIN = new javax.swing.JTextField();
        lblWorkplace = new javax.swing.JLabel();
        txtWorkplace = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtSymptom = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        rbtnMale = new javax.swing.JRadioButton();
        rbtnFemale = new javax.swing.JRadioButton();
        btnSearch = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel4.setText("Patient Name");

        txtSearch.setText("jTextField1");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(27, 27, 27)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(51, 51, 255)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36), new java.awt.Color(51, 153, 255)), "Main part", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(102, 204, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(102, 102, 255));

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Full Name", "Age", "Gender", "Phone", "Address"
            }
        ));
        tblPatient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatient);

        jLabel3.setText("Sort by name");

        cbbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None" }));
        cbbSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbSortActionPerformed(evt);
            }
        });

        btnSearchByName.setText("Search by name");
        btnSearchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByNameActionPerformed(evt);
            }
        });

        btnGetAllData.setText("Get all data");
        btnGetAllData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetAllDataActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGetAllData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSearchByName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbbSort, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearchByName, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchByName)
                    .addComponent(txtSearchByName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGetAllData)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detailed part", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(102, 204, 255))); // NOI18N

        lblID.setText("PatientID:");

        lblName.setText("PatientName:");

        lblOccupation.setText("Occupation:");

        lblBirthday.setText("Birthday:");

        lblPhone.setText("Phone:");

        lblAddress.setText("Address:");

        lblHIN.setText("Health insurance number:");

        lblSymptom.setText("Symptom:");

        lblWorkplace.setText("Workplace");

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane2.setViewportView(txtAddress);

        txtSymptom.setColumns(20);
        txtSymptom.setRows(5);
        jScrollPane3.setViewportView(txtSymptom);

        jLabel1.setText("Gender");

        buttonGroup1.add(rbtnMale);
        rbtnMale.setText("Male");

        buttonGroup1.add(rbtnFemale);
        rbtnFemale.setText("Female");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnAdd.setText("Add new");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblID)
                            .addComponent(lblName)
                            .addComponent(lblBirthday))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(btnSearch))
                                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(lblWorkplace)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtWorkplace, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnMale)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnFemale))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblAddress)
                        .addGap(101, 101, 101)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHIN)
                            .addComponent(lblSymptom))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHIN, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnAdd)
                        .addGap(90, 90, 90)
                        .addComponent(btnSave)
                        .addGap(86, 86, 86)
                        .addComponent(btnDelete))
                    .addComponent(lblPhone)
                    .addComponent(lblOccupation))
                .addGap(0, 58, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBirthday)
                        .addComponent(jLabel1)
                        .addComponent(rbtnMale)
                        .addComponent(rbtnFemale))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOccupation)
                    .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWorkplace)
                    .addComponent(txtWorkplace, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblAddress)
                        .addGap(57, 57, 57)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHIN)
                            .addComponent(txtHIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblSymptom)))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnSave)
                    .addComponent(btnDelete))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 204, 255));
        jLabel2.setText("Patient Information Management Software");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        jPanel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        //Date date = new SimpleDateFormat("dd-MM-yyyy").parse(jDateChooser1.getDate());
        //controller.PatientController.pattern(txtID);
        StringBuilder sb = new StringBuilder();
        if (txtID.getText().equals("")) {
            controller.PatientController.checkEmpty(txtID, "Patient ID shoudn't be empty.");
        } else if (txtPatientName.getText().equals("")) {
            controller.PatientController.checkEmpty(txtPatientName, "Patient name shoudn't be empty.");
        } else if (txtOccupation.getText().equals("")) {
            controller.PatientController.checkEmpty(txtOccupation, "Occupation shoudn't be empty.");
        } else if (txtWorkplace.getText().equals("")) {
            controller.PatientController.checkEmpty(txtWorkplace, "Workplace shoudn't be empty.");
        } else if (txtPhone.getText().equals("")) {
            controller.PatientController.checkEmpty(txtPhone, "Phone shoudn't be empty.");
        } else if (txtAddress.getText().equals("")) {
            controller.PatientController.checkEmpty(txtAddress, "Address ID shoudn't be empty.");
        } else if (txtHIN.getText().equals("")) {
            controller.PatientController.checkEmpty(txtHIN, "Health insurance number shoudn't be empty.");
        } else if (txtSymptom.getText().equals("")) {
            controller.PatientController.checkEmpty(txtSymptom, "Symptom shoudn't be empty.");
        } else {
            if (!txtID.isEditable()) {
                controller.PatientController.update(this, p, txtID, txtPatientName, jDateChooser1, rbtnFemale, txtOccupation, txtWorkplace, txtPhone, txtAddress, txtHIN, txtSymptom);
                fillTable();
            }
            if (txtID.isEditable()) {
                controller.PatientController.add(this, p, txtID, txtPatientName, jDateChooser1, rbtnFemale, txtOccupation, txtWorkplace, txtPhone, txtAddress, txtHIN, txtSymptom);
                fillTable();
            }

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        txtID.setEditable(true);
        txtID.setText("");
        txtPatientName.setText("");
        rbtnFemale.setSelected(false);
        rbtnMale.setSelected(false);
        txtOccupation.setText("");
        txtWorkplace.setText("");
        txtPhone.setText("");
        txtAddress.setText("");
        txtHIN.setText("");
        txtSymptom.setText("");


    }//GEN-LAST:event_btnAddActionPerformed

    private void tblPatientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientMouseClicked

        controller.PatientController.showDetail(p, tblPatient, txtID, txtPatientName, jDateChooser1, rbtnFemale, rbtnMale, txtOccupation,
                txtWorkplace, txtPhone, txtAddress, txtHIN, txtSymptom);
        txtID.setEditable(false);
    }//GEN-LAST:event_tblPatientMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        controller.PatientController.delete(this, p, tblPatient, txtID);
        fillTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        controller.PatientController.searchByID(this, p, txtID, txtPatientName, jDateChooser1, rbtnFemale, rbtnMale, txtOccupation, txtWorkplace, txtPhone, txtAddress, txtHIN, txtSymptom);

    }//GEN-LAST:event_btnSearchActionPerformed

    private void cbbSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbSortActionPerformed

        controller.PatientController.sort(cbbSort, p);
        fillTable();
    }//GEN-LAST:event_cbbSortActionPerformed

    private void btnSearchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByNameActionPerformed

        controller.PatientController.search(model, p, txtSearchByName);
        model.fireTableDataChanged();

    }//GEN-LAST:event_btnSearchByNameActionPerformed

    private void btnGetAllDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetAllDataActionPerformed
        // TODO add your handling code here:
        fillTable();
    }//GEN-LAST:event_btnGetAllDataActionPerformed

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PatientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGetAllData;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearchByName;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbSort;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblHIN;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOccupation;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSymptom;
    private javax.swing.JLabel lblWorkplace;
    private javax.swing.JRadioButton rbtnFemale;
    private javax.swing.JRadioButton rbtnMale;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtHIN;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSearchByName;
    private javax.swing.JTextArea txtSymptom;
    private javax.swing.JTextField txtWorkplace;
    // End of variables declaration//GEN-END:variables
}
