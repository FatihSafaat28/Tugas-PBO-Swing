/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
import java.awt.*;
import javax.swing.*;
public class Gui extends JFrame {
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenu1Item1;
    private javax.swing.JMenuItem jMenu1Item2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    
    final JTextField fnama = new JTextField(10);
    final JTextField fnik = new JTextField(10);
    final JTextField fkota = new JTextField(10);
    JLabel ljudul = new JLabel("Formulir Pendaftaran");
    JLabel lnik = new JLabel(" NIK ");
    JLabel lnama = new JLabel(" Nama Lengkap ");
    JLabel ljeniskelamin = new JLabel(" Jenis Kelamin ");

    JRadioButton rbPria = new JRadioButton(" Pria ");
    JRadioButton rbWanita = new JRadioButton("Perempuan ");

    JLabel lagama = new JLabel(" Agama ");
    String[] namaAgama =
             {"Islam","Kristen","Katolik","Hindu","Budha"};
    JComboBox cmbAgama = new JComboBox(namaAgama);

    JLabel lkota = new JLabel(" Kota ");
    JLabel lTglLahir = new JLabel(" Tgl-Lahir ");
    
    JLabel lskill = new JLabel (" Kemampuan Anda ");
    JCheckBox cbJava = new JCheckBox (" Bahasa Java ");
    JCheckBox cbCplus = new JCheckBox (" Bahasa C++ ");
    JCheckBox cbC = new JCheckBox (" Bahasa C ");
    JCheckBox cbPhyton = new JCheckBox (" Bahasa Phyton ");
    JCheckBox cbJavaScript = new JCheckBox (" Bahasa JavaScript ");
    JCheckBox cbHTML = new JCheckBox (" Bahasa HTML ");
    
    JButton btnSave = new JButton(" Simpan Pendaftaran ");
    
    public Gui() {
        jDateChooser = new com.toedter.calendar.JDateChooser();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu1Item1 = new javax.swing.JMenuItem();
        jMenu1Item2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        
        setTitle("Fomulir Pendaftaran");
	setDefaultCloseOperation(3);
        setSize(335,500);
	ButtonGroup group = new ButtonGroup();
	group.add(rbPria);
	group.add(rbWanita);
        
        jMenu.setText("File");
        jMenuBar.add(jMenu);
        jMenu1.setText("New");
        jMenu.add(jMenu1);
        jMenu1Item1.setText("Formulir Pendaftaran");
        jMenu1.add(jMenu1Item1);
        jMenu1Item2.setText("Formulir Izin Kerja");
        jMenu1.add(jMenu1Item2);
        jMenuItem1.setText("Open...");
        jMenu.add(jMenuItem1);
        jMenuItem2.setText("Save");
        jMenu.add(jMenuItem2);
        jMenuItem3.setText("Save As...");
        jMenu.add(jMenuItem3);
	
        setJMenuBar(jMenuBar);
        setLayout(null);
        add(ljudul);
        add(lnik);
        add(fnik);
	add(lnama);
	add(fnama);
	add(ljeniskelamin);
	add(rbPria);
	add(rbWanita);
	add(lagama);
	add(cmbAgama);
        add(lkota);
        add(fkota);
        add(lTglLahir);
        add(jDateChooser);
        add(lskill);
        add(cbJava);
        add(cbCplus);
        add(cbC);
        add(cbPhyton);
        add(cbJavaScript);
        add(cbHTML);
        
	
	//add(btnSave,"South");
        setLayout(new BorderLayout());
        add(btnSave,"South");
	// setBounds(m,n,o,p)
	// m = posisi x; n = posisi y
	// o = panjang komponen; p = tinggi komponen
        ljudul.setBounds(100,10,120,20);
	lnik.setBounds(10,45,120,20);
	fnik.setBounds(130,45,150,20);
	lnama.setBounds(10,75,120,20);
        fnama.setBounds(130,75,150,20);
        ljeniskelamin.setBounds(10,105,120,20);
	rbPria.setBounds(125,105,55,20);
	rbWanita.setBounds(190,105,100,20);
	lagama.setBounds(10,135,120,20);
	cmbAgama.setBounds(130,135,150,20);
        lkota.setBounds(10,165,120,20);
	fkota.setBounds(130,165,150,20);
        lTglLahir.setBounds(10,195,120,20);
        jDateChooser.setBounds(130,195,150,20);
        lskill.setBounds(100,250,120,20);
        cbPhyton.setBounds(25,280,120,20);
        cbHTML.setBounds(175,280,120,20);
        cbJava.setBounds(25,310,120,20);
        cbJavaScript.setBounds(175,310,155,20);
        cbC.setBounds(25,340,120,20);
        cbCplus.setBounds(175,340,120,20);
	
	//btnSave.setBounds(190,420,120,20);
	setVisible(true);
   }

}
