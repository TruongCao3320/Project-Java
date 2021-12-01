/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import com.toedter.calendar.JDateChooser;
import java.awt.Component;
import java.awt.List;
import java.awt.TextField;
import static java.awt.image.ImageObserver.WIDTH;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Patient;

/**
 *
 * @author conme
 */
public class PatientController {
    public static void checkEmpty(JTextField txtField, String msg) {
        if (txtField.getText().equals("")) {
            JOptionPane.showMessageDialog(txtField, msg, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void checkEmpty(JTextArea txtArea, String msg) {
        if (txtArea.getText().equals("")) {
            JOptionPane.showMessageDialog(txtArea, msg, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static boolean pattern(JTextField txtName) {
        //String s=txtName.getText();
        //txtName.matches("[^A-Za-z0-9]+");
        String s = txtName.getText();
        if (s.matches("[[A-Z][0-9]]+[^\\W]") & s.length() < 11) {
            return true;
        }
        return false;
    }

    public static boolean patternPhone(JTextField txtPhone) {
        //String s=txtName.getText();
        //txtName.matches("[^A-Za-z0-9]+");
        String s = txtPhone.getText();
        if (s.matches("[0-9]+[^\\W]") & s.length() < 16) {
            return true;
        }
        return false;
    }

    public static boolean checkDuplicate(ArrayList<Patient> p, JTextField txtID) {
        for (Patient patient : p) {
            if (txtID.getText().equals(patient.getPatientID())) {
                return false;
            }
        }
        return true;
    }
    
      public static boolean findID(ArrayList<Patient> p, String m) {
        for (Patient patient : p) {
            if (m.equals(patient.getPatientID())) {
                return false;
            }
        }
        return true;
    }

    public static void update(Component cmpt, ArrayList<Patient> p, JTextField txtID, JTextField txtPatientName, JDateChooser jDateChooser1,
            JRadioButton rbtnFemale, JTextField txtOccupation, JTextField txtWorkplace,
            JTextField txtPhone, JTextArea txtAddress, JTextField txtHIN, JTextArea txtSymptom) {
        for (int i = 0; i < p.size(); i++) {
            if (txtID.getText().equals(p.get(i).getPatientID())) {

                p.get(i).setPatientName(txtPatientName.getText());
                p.get(i).setBirthday(jDateChooser1.getDate());
                if (rbtnFemale.isSelected()) {
                    p.get(i).setGender(false);
                } else {
                    p.get(i).setGender(true);
                }
                p.get(i).setOccupation(txtOccupation.getText());
                p.get(i).setWorkplace(txtWorkplace.getText());
                if (controller.PatientController.patternPhone(txtPhone) == false) {
                    JOptionPane.showMessageDialog(cmpt, "Just number & Max length is 15.", "Phone error format!", 0);
                } else {
                    p.get(i).setPhone(txtPhone.getText());
                    p.get(i).setAddress(txtAddress.getText());
                    p.get(i).setHealthInsuranceNumber(txtHIN.getText());
                    p.get(i).setSymptom(txtSymptom.getText());
                    JOptionPane.showMessageDialog(cmpt, "Update successfully.");
                }
            }
        }
    }

    public static void showDetail(ArrayList<Patient> p, JTable tblPatient, JTextField txtID, JTextField txtPatientName, JDateChooser jDateChooser1,
            JRadioButton rbtnFemale, JRadioButton rbtnMale, JTextField txtOccupation, JTextField txtWorkplace,
            JTextField txtPhone, JTextArea txtAddress, JTextField txtHIN, JTextArea txtSymptom) {
        int selectedRow = tblPatient.getSelectedRow();
        if (selectedRow >= 0) {
            String patientID = (String) tblPatient.getValueAt(selectedRow, 0);
            for (Patient patient : p) {
                if (patientID.equals(patient.getPatientID())) {
                    txtID.setText(patient.getPatientID());
                    txtPatientName.setText(patient.getPatientName());
                    jDateChooser1.setDate(patient.getBirthday());
                    if (patient.isGender() == true) {
                        rbtnMale.setSelected(true);
                    } else {
                        rbtnFemale.setSelected(true);
                    }
                    txtPhone.setText(patient.getPhone());
                    txtOccupation.setText(patient.getOccupation());
                    txtWorkplace.setText(patient.getWorkplace());
                    txtAddress.setText(patient.getAddress());
                    txtHIN.setText(patient.getHealthInsuranceNumber());
                    txtSymptom.setText(patient.getSymptom());
                }
            }
        }

    }

    public static void add(Component cmpt, ArrayList<Patient> p, JTextField txtID, JTextField txtPatientName, JDateChooser jDateChooser1,
            JRadioButton rbtnFemale, JTextField txtOccupation, JTextField txtWorkplace,
            JTextField txtPhone, JTextArea txtAddress, JTextField txtHIN, JTextArea txtSymptom) {

        Patient newP = new Patient();
        if (controller.PatientController.pattern(txtID) == false) {

            JOptionPane.showMessageDialog(cmpt, "[A-Z]+[0-9] & Max length is 10.", "ID error format!", 0);
        } else {
            if (checkDuplicate(p, txtID) == false) {
                JOptionPane.showMessageDialog(cmpt, "This ID is existed.");
            } else {
                newP.patientID = txtID.getText();
                newP.patientName = txtPatientName.getText();
                newP.birthday = jDateChooser1.getDate();
                if (rbtnFemale.isSelected()) {
                    newP.gender = false;
                } else {
                    newP.gender = true;
                }
                newP.occupation = txtOccupation.getText();
                newP.workplace = txtWorkplace.getText();
                if (controller.PatientController.patternPhone(txtPhone) == false) {

                    JOptionPane.showMessageDialog(cmpt, "Just number & Max length is 15.", "Phone error format!", 0);
                } else {
                    newP.phone = txtPhone.getText();
                    newP.address = txtAddress.getText();
                    newP.healthInsuranceNumber = txtHIN.getText();
                    newP.symptom = txtSymptom.getText();
                    p.add(newP);
                    JOptionPane.showMessageDialog(cmpt, "Add successfully");
                    txtID.setEditable(false);
                }
            }
        }
    }

    public static void searchByID(Component cmpt, ArrayList<Patient> p, JTextField txtID, JTextField txtPatientName, JDateChooser jDateChooser1,
            JRadioButton rbtnFemale, JRadioButton rbtnMale, JTextField txtOccupation, JTextField txtWorkplace,
            JTextField txtPhone, JTextArea txtAddress, JTextField txtHIN, JTextArea txtSymptom) {
        if (p.isEmpty()) {
            JOptionPane.showMessageDialog(cmpt, "List patient is empty.");
        } else {
            String m = JOptionPane.showInputDialog(cmpt, "Search", "");
            if (findID(p,m) == false) {
                for (Patient patient : p) {
                    if(m.equals(patient.getPatientID())){
                    txtID.setText(patient.getPatientID());
                    txtPatientName.setText(patient.getPatientName());
                    jDateChooser1.setDate(patient.getBirthday());
                    if (patient.isGender() == true) {
                        rbtnMale.setSelected(true);
                    } else {
                        rbtnFemale.setSelected(true);
                    }
                    txtPhone.setText(patient.getPhone());
                    txtOccupation.setText(patient.getOccupation());
                    txtWorkplace.setText(patient.getWorkplace());
                    txtAddress.setText(patient.getAddress());
                    txtHIN.setText(patient.getHealthInsuranceNumber());
                    txtSymptom.setText(patient.getSymptom());
                }
                }
            } else {
                JOptionPane.showMessageDialog(cmpt, "This ID is not existed.");
            }

        }
    }
    
    public static void delete(Component cmpt,ArrayList<Patient> p,JTable tblPatient,JTextField txtID){
         int selectedRow = tblPatient.getSelectedRow();
        if (selectedRow >= 0) {
            try {
                for (Patient patient : p) {
                    if (patient.getPatientID().equals(txtID.getText())) {
                        int choice = JOptionPane.showConfirmDialog(cmpt, "Select an Option", "Do you want to delete", JOptionPane.YES_NO_OPTION);
                        if (choice == JOptionPane.YES_OPTION) {
                            p.remove(patient);
                            JOptionPane.showMessageDialog(cmpt, "Delete successfully.");
                        } else {
                            return;
                        }
                    }
                }
            } catch (Exception e) {
            }
        } else {
            JOptionPane.showMessageDialog(cmpt, "Choose object want to delete", "Error!", WIDTH);
        }
    }
    public static void search(DefaultTableModel model,ArrayList<Patient> p,JTextField txtSearchByName){
          ArrayList<Patient> pSearch = new ArrayList<>();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        model.setRowCount(0);
        for (Patient patient : p) {
            if (txtSearchByName.getText().equals(patient.getPatientName())) {
                pSearch.add(patient);
            }
        }
        for (Patient patient : pSearch) {
            String date = df.format(patient.getBirthday());
            model.addRow(new String[]{patient.getPatientID(), patient.getPatientName(), date, "" + patient.isGender(), patient.getPhone(), patient.getAddress()});
        }
    }
    public static void sort(JComboBox cbbSort,ArrayList<Patient> p){
      //  Patient t,t1;
          if (cbbSort.getSelectedItem().equals("A-Z")) {
            Collections.sort(p, new Comparator<Patient>() {
                @Override
                public int compare(Patient t, Patient t1) {
                    return t.getPatientName().compareTo(t1.getPatientName());
                }
            });
          //  fillTable();
        }
        if (cbbSort.getSelectedItem().equals("Z-A")) {
            Collections.sort(p, new Comparator<Patient>() {
                @Override
                public int compare(Patient t1, Patient t) {
                    return t.getPatientName().compareTo(t1.getPatientName());
                }
            });
            //fillTable();
        }
    }
}
