/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

/**
 *
 * @author rohanjauhari
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Business.Business;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.OrderManagement.OrderItem;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;

public class Pricing extends javax.swing.JFrame {
ProductCatalog products1, products2, products3, products4, products5;
String selectedSupplier,selectedSeller;
int supplierFlag=0;
int salesFlag=0;
Product s1p1;
Product s1p2;
Product s1p3;
Product s1p4;
Product s1p5;
Product s1p6;
Product s1p7;
Product s1p8;
Product s1p9;
Product s1p10;

Product s2p1;
Product s2p2;
Product s2p3;
Product s2p4;
Product
s2p5;
Product
s2p6;
Product
s2p7;
Product
s2p8;
Product
s2p9;
Product s2p10;

Product s3p1;
Product
s3p2;
Product s3p3;
Product
s3p4;
Product
s3p5;
Product
s3p6;
Product s3p7;
Product s3p8;
Product
s3p9;
Product
s3p10;

Product s4p1;
Product s4p2;
Product s4p3;
Product s4p4;
Product s4p5;
Product s4p6;
Product s4p7;
Product s4p8;
Product s4p9;
Product s4p10;

Product s5p1;
Product s5p2;
Product s5p3;
Product s5p4;
Product s5p5;
Product s5p6;
Product s5p7;
Product s5p8;
Product s5p9;
Product s5p10;
        
ArrayList<Product> intersection;
Map<Product, Integer> prod_actual_price = new HashMap<>();
Map<String, ArrayList<Product>>report = new HashMap<>();
    /**
     * Creates new form Pricing
     */
    public Pricing() {

        SupplierDirectory suppliers = new SupplierDirectory();

            products1 = new ProductCatalog();
            s1p1 = products1.newProduct("s1p1",10, 25, 15);      // fp = 10, tp = 15, cp = 25
            s1p2 = products1.newProduct("s1p2",20, 35, 25);      // fp = 20, tp = 25, cp = 35
            s1p3 = products1.newProduct("s1p3",30, 45, 35);      // fp = 30, tp = 35, cp = 45
            s1p4 = products1.newProduct("s1p4",40, 55, 45);      // fp = 40, tp = 45, cp = 55
            s1p5 = products1.newProduct("s1p5",50, 65, 55);      // fp = 50, tp = 55, cp = 65
            s1p6 = products1.newProduct("s1p6",60, 75, 65);      // fp = 60, tp = 65, cp = 75
            s1p7 = products1.newProduct("s1p7",70, 85, 75);      // fp = 70, tp = 75, cp = 85
            s1p8 = products1.newProduct("s1p8",80, 95, 85);      // fp = 80, tp = 85, cp = 95
            s1p9 = products1.newProduct("s1p9",90, 105, 95);     // fp = 90, tp = 95, cp = 105
            s1p10 = products1.newProduct("s1p10",100, 115, 105); // fp = 100, tp = 105, cp = 115
            
            products2 = new ProductCatalog();
             s2p1 = products2.newProduct("s2p1", 5, 20, 10);      // fp = 5, cp = 20, tp = 10
             s2p2 = products2.newProduct("s2p2", 15, 30, 20);     // fp = 15, cp = 30, tp = 20
            s2p3 = products2.newProduct("s2p3", 25, 40, 30);      // fp = 25, cp = 40, tp = 30
             s2p4 = products2.newProduct("s2p4", 35, 50, 40);     // fp = 35, cp = 50, tp = 40
             s2p5 = products2.newProduct("s2p5", 45, 60, 50);     // fp = 45, cp = 60, tp = 50
             s2p6 = products2.newProduct("s2p6", 55, 70, 60);     // fp = 55, cp = 70, tp = 60
             s2p7 = products2.newProduct("s2p7", 65, 80, 70);     // fp = 65, cp = 80, tp = 70
             s2p8 = products2.newProduct("s2p8", 75, 90, 80);     // fp = 75, cp = 90, tp = 80
             s2p9 = products2.newProduct("s2p9", 85, 100, 90);    // fp = 85, cp = 100, tp = 90
             s2p10 = products2.newProduct("s2p10", 95, 110, 100); // fp = 95, cp = 110, tp = 100
             
             products3 = new ProductCatalog();
             s3p1 = products3.newProduct("s3p1", 8, 22, 14);     // fp = 8, tp = 14, cp = 22
             s3p2 = products3.newProduct("s3p2", 18, 32, 24);    // fp = 18, tp = 24, cp = 32
             s3p3 = products3.newProduct("s3p3", 28, 42, 34);    // fp = 28, tp = 34, cp = 42
             s3p4 = products3.newProduct("s3p4", 38, 52, 44);    // fp = 38, tp = 44, cp = 52
             s3p5 = products3.newProduct("s3p5", 48, 62, 54);    // fp = 48, tp = 54, cp = 62
             s3p6 = products3.newProduct("s3p6", 58, 72, 64);    // fp = 58, tp = 64, cp = 72
             s3p7 = products3.newProduct("s3p7", 68, 82, 74);    // fp = 68, tp = 74, cp = 82
             s3p8 = products3.newProduct("s3p8", 78, 92, 84);    // fp = 78, tp = 84, cp = 92
             s3p9 = products3.newProduct("s3p9", 88, 102, 94);   // fp = 88, tp = 94, cp = 102
             s3p10 = products3.newProduct("s3p10", 98, 112, 104); // fp = 98, tp = 104, cp = 112
             
             products4 = new ProductCatalog();
             s4p1 = products4.newProduct("s4p1", 12, 28, 18);     // fp = 12, tp = 18, cp = 28
             s4p2 = products4.newProduct("s4p2", 22, 38, 28);     // fp = 22, tp = 28, cp = 38
             s4p3 = products4.newProduct("s4p3", 32, 48, 38);     // fp = 32, tp = 38, cp = 48
             s4p4 = products4.newProduct("s4p4", 42, 58, 48);     // fp = 42, tp = 48, cp = 58
             s4p5 = products4.newProduct("s4p5", 52, 68, 58);     // fp = 52, tp = 58, cp = 68
             s4p6 = products4.newProduct("s4p6", 62, 78, 68);     // fp = 62, tp = 68, cp = 78
             s4p7 = products4.newProduct("s4p7", 72, 88, 78);     // fp = 72, tp = 78, cp = 88
             s4p8 = products4.newProduct("s4p8", 82, 98, 88);     // fp = 82, tp = 88, cp = 98
             s4p9 = products4.newProduct("s4p9", 92, 108, 98);    // fp = 92, tp = 98, cp = 108
             s4p10 = products4.newProduct("s4p10", 102, 118, 108); // fp = 102, tp = 108, cp = 118
             
             products5 = new ProductCatalog();
             s5p1 = products5.newProduct("s5p1",10, 25, 15);  // fp = 10, tp = 15, cp = 25
             s5p2 = products5.newProduct("s5p2",20, 35, 25);  // fp = 20, tp = 25, cp = 35
             s5p3 = products5.newProduct("s5p3",30, 45, 35);  // fp = 30, tp = 35, cp = 45
             s5p4 = products5.newProduct("s5p4",40, 55, 45);  // fp = 40, tp = 45, cp = 55
             s5p5 = products5.newProduct("s5p5",50, 65, 55);  // fp = 50, tp = 55, cp = 65
             s5p6 = products5.newProduct("s5p6",60, 75, 65);  // fp = 60, tp = 65, cp = 75
             s5p7 = products5.newProduct("s5p7",70, 85, 75);  // fp = 70, tp = 75, cp = 85
             s5p8 = products5.newProduct("s5p8",80, 95, 85);  // fp = 80, tp = 85, cp = 95
             s5p9 = products5.newProduct("s5p9",90, 105, 95); // fp = 90, tp = 95, cp = 105
             s5p10 = products5.newProduct("s5p10",100, 115, 105); // fp = 100, tp = 105, cp = 115
        
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProduct = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblOrders = new javax.swing.JTable();
        cmbSupplier = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnRunExecution = new javax.swing.JButton();
        btnAdjustTarget = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        cmbSalesPerson = new javax.swing.JComboBox<>();
        btnClear = new javax.swing.JButton();
        btnSupplierReport = new javax.swing.JButton();
        btnSalesReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Suppliers");

        jLabel3.setText("Sales person");

        jLabel4.setText("Product");

        tblCustomers.setBackground(new java.awt.Color(204, 255, 255));
        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Customers"
            }
        ));
        tblCustomers.setEnabled(false);
        jScrollPane1.setViewportView(tblCustomers);

        tblProduct.setBackground(new java.awt.Color(204, 255, 204));
        tblProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Floor", "Ceiling", "Target"
            }
        ));
        jScrollPane2.setViewportView(tblProduct);

        jLabel5.setText("Order Items");

        tblOrders.setBackground(new java.awt.Color(153, 255, 204));
        tblOrders.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Actual price", "Quantity", "Item total", "Price Performance", "Target"
            }
        ));
        tblOrders.setEnabled(false);
        jScrollPane3.setViewportView(tblOrders);

        cmbSupplier.setBackground(new java.awt.Color(204, 204, 255));
        cmbSupplier.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Supplier 1", "Supplier 2", "Supplier 3", "Supplier 4", "Supplier 5" }));
        cmbSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSupplierActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(51, 255, 204));
        btnAdd.setText("Add");
        btnAdd.setEnabled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRunExecution.setBackground(new java.awt.Color(204, 204, 255));
        btnRunExecution.setText("Run Simulation & Generate Order Report");
        btnRunExecution.setEnabled(false);
        btnRunExecution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunExecutionActionPerformed(evt);
            }
        });

        btnAdjustTarget.setBackground(new java.awt.Color(204, 204, 255));
        btnAdjustTarget.setText("Adjust");
        btnAdjustTarget.setEnabled(false);
        btnAdjustTarget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdjustTargetActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.setEnabled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        cmbSalesPerson.setBackground(new java.awt.Color(204, 204, 255));
        cmbSalesPerson.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Sales Person 1", "Sales Person 2" }));
        cmbSalesPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSalesPersonActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(204, 204, 255));
        btnClear.setText("Clear Tables");
        btnClear.setEnabled(false);
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSupplierReport.setBackground(new java.awt.Color(204, 204, 255));
        btnSupplierReport.setText("Generate Supplier Report");
        btnSupplierReport.setEnabled(false);
        btnSupplierReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierReportActionPerformed(evt);
            }
        });

        btnSalesReport.setText("Generate Sales Person Report");
        btnSalesReport.setEnabled(false);
        btnSalesReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(326, 326, 326)
                                .addComponent(btnClear))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(cmbSalesPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(btnAdd))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRunExecution)
                            .addComponent(btnSalesReport)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(btnSupplierReport)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdjustTarget)
                        .addGap(74, 74, 74)
                        .addComponent(btnSave)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSalesPerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnClear))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(130, 130, 130)
                                .addComponent(btnSupplierReport)
                                .addGap(33, 33, 33)
                                .addComponent(btnSalesReport)
                                .addGap(28, 28, 28)
                                .addComponent(btnRunExecution))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAdd)
                                .addGap(89, 89, 89)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAdjustTarget)
                            .addComponent(btnSave))))
                .addGap(91, 91, 91))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
            
//            txtSales.setText("Sales person 2");
               
    
    private void cmbSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSupplierActionPerformed
        // TODO add your handling code here:
        supplierFlag=1;       
        
        btnClear.setEnabled(true);
        Business b = new Business("Business");
        selectedSupplier = cmbSupplier.getSelectedItem().toString();
        if (selectedSupplier == "Supplier 1"){
            cmbSupplier.setEnabled(false);

            
            PersonDirectory pd = new PersonDirectory();
            Person p1=pd.newPerson("s1c1");
            Person p2=pd.newPerson("s1c2");
            Person p3=pd.newPerson("s1c3");
            Person p4=pd.newPerson("s1c4");
            Person p5=pd.newPerson("s1c5");
            Person p6=pd.newPerson("s1c6");
            Person p7=pd.newPerson("s1c7");
            Person p8=pd.newPerson("s1c8");
            Person p9=pd.newPerson("s1c9");
            Person p10=pd.newPerson("s1c10");
            
            CustomerDirectory cs1 = new CustomerDirectory(b);
            cs1.newCustomerProfile(p1);
            cs1.newCustomerProfile(p2);
            cs1.newCustomerProfile(p3);
            cs1.newCustomerProfile(p4);
            cs1.newCustomerProfile(p5);
            cs1.newCustomerProfile(p6);
            cs1.newCustomerProfile(p7);
            cs1.newCustomerProfile(p8);
            cs1.newCustomerProfile(p9);
            cs1.newCustomerProfile(p10);
            populateCustomerTable(cs1);
            if (salesFlag==1){
                products1.getProductList().retainAll(intersection);
                populateProductTable(products1);
            }
//            else
                intersection = new ArrayList<Product>(products1.getProductList());
            System.out.println(products1.getProductList());
            populateProductTable(products1);
        }
        else if (selectedSupplier == "Supplier 2"){
            cmbSupplier.setEnabled(false);
            if (salesFlag==1){
                products2.getProductList().retainAll(intersection);
                populateProductTable(products2);
            }
//            else
                intersection = new ArrayList<Product>(products2.getProductList());
            populateProductTable(products2);
//            txtSales.setText("Sales person 2");
            
            PersonDirectory pd = new PersonDirectory();
            Person p1=pd.newPerson("s2c1");
            Person p2=pd.newPerson("s2c2");
            Person p3=pd.newPerson("s2c3");
            Person p4=pd.newPerson("s2c4");
            Person p5=pd.newPerson("s2c5");
            Person p6=pd.newPerson("s2c6");
            Person p7=pd.newPerson("s2c7");
            Person p8=pd.newPerson("s2c8");
            Person p9=pd.newPerson("s2c9");
            Person p10=pd.newPerson("s2c10");
            
            CustomerDirectory cs2 = new CustomerDirectory(b);
            cs2.newCustomerProfile(p1);
            cs2.newCustomerProfile(p2);
            cs2.newCustomerProfile(p3);
            cs2.newCustomerProfile(p4);
            cs2.newCustomerProfile(p5);
            cs2.newCustomerProfile(p6);
            cs2.newCustomerProfile(p7);
            cs2.newCustomerProfile(p8);
            cs2.newCustomerProfile(p9);
            cs2.newCustomerProfile(p10);
            populateCustomerTable(cs2);
        }
        else if (selectedSupplier == "Supplier 3"){
            cmbSupplier.setEnabled(false);
            if (salesFlag==1){
                products3.getProductList().retainAll(intersection);
                populateProductTable(products3);
            }
//            else
                intersection = new ArrayList<Product>(products3.getProductList());
            populateProductTable(products3);
//            txtSales.setText("Sales person 3");
            
            PersonDirectory pd = new PersonDirectory();
            Person p1=pd.newPerson("s3c1");
            Person p2=pd.newPerson("s3c2");
            Person p3=pd.newPerson("s3c3");
            Person p4=pd.newPerson("s3c4");
            Person p5=pd.newPerson("s3c5");
            Person p6=pd.newPerson("s3c6");
            Person p7=pd.newPerson("s3c7");
            Person p8=pd.newPerson("s3c8");
            Person p9=pd.newPerson("s3c9");
            Person p10=pd.newPerson("s3c10");
            
            CustomerDirectory cs3 = new CustomerDirectory(b);
            cs3.newCustomerProfile(p1);
            cs3.newCustomerProfile(p2);
            cs3.newCustomerProfile(p3);
            cs3.newCustomerProfile(p4);
            cs3.newCustomerProfile(p5);
            cs3.newCustomerProfile(p6);
            cs3.newCustomerProfile(p7);
            cs3.newCustomerProfile(p8);
            cs3.newCustomerProfile(p9);
            cs3.newCustomerProfile(p10);
            populateCustomerTable(cs3);
            
        }
        else if (selectedSupplier == "Supplier 4"){
            cmbSupplier.setEnabled(false);
            if (salesFlag==1){
                products4.getProductList().retainAll(intersection);
                populateProductTable(products4);
            }
//            else
                intersection = new ArrayList<Product>(products4.getProductList());
            populateProductTable(products4);
//            txtSales.setText("Sales person 4");
            
            PersonDirectory pd = new PersonDirectory();
            Person p1=pd.newPerson("s4c1");
            Person p2=pd.newPerson("s4c2");
            Person p3=pd.newPerson("s4c3");
            Person p4=pd.newPerson("s4c4");
            Person p5=pd.newPerson("s4c5");
            Person p6=pd.newPerson("s4c6");
            Person p7=pd.newPerson("s4c7");
            Person p8=pd.newPerson("s4c8");
            Person p9=pd.newPerson("s4c9");
            Person p10=pd.newPerson("s4c10");
            
            CustomerDirectory cs4 = new CustomerDirectory(b);
            cs4.newCustomerProfile(p1);
            cs4.newCustomerProfile(p2);
            cs4.newCustomerProfile(p3);
            cs4.newCustomerProfile(p4);
            cs4.newCustomerProfile(p5);
            cs4.newCustomerProfile(p6);
            cs4.newCustomerProfile(p7);
            cs4.newCustomerProfile(p8);
            cs4.newCustomerProfile(p9);
            cs4.newCustomerProfile(p10);
            populateCustomerTable(cs4);
            
        }
        else if (selectedSupplier=="Supplier 5"){
            cmbSupplier.setEnabled(false);
            if (salesFlag==1){
                products5.getProductList().retainAll(intersection);
                populateProductTable(products5);
            }
//            else
                intersection = new ArrayList<Product>(products5.getProductList());
            populateProductTable(products5);
//            txtSales.setText("Sales person 5");
            
            PersonDirectory pd = new PersonDirectory();
            Person p1=pd.newPerson("s5c1");
            Person p2=pd.newPerson("s5c2");
            Person p3=pd.newPerson("s5c3");
            Person p4=pd.newPerson("s5c4");
            Person p5=pd.newPerson("s5c5");
            Person p6=pd.newPerson("s5c6");
            Person p7=pd.newPerson("s5c7");
            Person p8=pd.newPerson("s5c8");
            Person p9=pd.newPerson("s5c9");
            Person p10=pd.newPerson("s5c10");
            
            CustomerDirectory cs5 = new CustomerDirectory(b);
            cs5.newCustomerProfile(p1);
            cs5.newCustomerProfile(p2);
            cs5.newCustomerProfile(p3);
            cs5.newCustomerProfile(p4);
            cs5.newCustomerProfile(p5);
            cs5.newCustomerProfile(p6);
            cs5.newCustomerProfile(p7);
            cs5.newCustomerProfile(p8);
            cs5.newCustomerProfile(p9);
            cs5.newCustomerProfile(p10);
            populateCustomerTable(cs5);
        }
        else{
            supplierFlag=0;
            salesFlag=0;
            ProductCatalog products6 = new ProductCatalog();
            CustomerDirectory cs6 = new CustomerDirectory(b);
            populateProductTable(products6);
            populateCustomerTable(cs6);
            cmbSupplier.setSelectedIndex(0);
            intersection.clear();
        }
        
    }//GEN-LAST:event_cmbSupplierActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        btnSalesReport.setEnabled(true);
        btnSupplierReport.setEnabled(true);
        btnRunExecution.setEnabled(true);
        System.out.println(selectedSupplier);
        System.out.println(selectedSeller);
        int selectedRowIndex = tblProduct.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select the product first.");
            return;
        }
        Product product = (Product) tblProduct.getValueAt (selectedRowIndex, 0);
        ArrayList<Product> ps = new ArrayList<>();
        if (selectedSeller!="None"){
            report.put(selectedSeller,ps);
            report.get(selectedSeller).add(product);
            
        }
        if (selectedSupplier!="None"){
            report.put(selectedSupplier, ps);
            report.get(selectedSupplier).add(product);
        }
        Random random = new Random();
        OrderItem o = new OrderItem(product, random.nextInt(100) + 1,10);
        btnAdjustTarget.setEnabled(true);
        
        DefaultTableModel model = (DefaultTableModel) tblOrders.getModel();
        Object[] row = new Object[6];
        row[0] = product;
        row[1] = o.getActualPrice();
        row[2] = o.getQuantity();
        row[3] = o.getOrderItemTotal();
        row[4] = o.calculatePricePerformance();
        row[5] = product.getTargetPrice();
        product.setActualPrice(o.getActualPrice());
        prod_actual_price.put(product, o.getActualPrice());
        model.addRow(row);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRunExecutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunExecutionActionPerformed
        // TODO add your handling code here:
        
        Simulation r;
        
            r = new Simulation(prod_actual_price);
        
        r.setVisible(true);
    }//GEN-LAST:event_btnRunExecutionActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        // Assuming 'table' is your JTable instance
        TableModel model = tblOrders.getModel();
        for (int row = 0; row < model.getRowCount(); row++) {
                Product p=(Product) model.getValueAt(row, 0);
                p.setFinalTargetPrice((int)model.getValueAt(row, 5));
            //}
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnAdjustTargetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdjustTargetActionPerformed
        // TODO add your handling code here:
        btnSave.setEnabled(true);
        tblOrders.setEnabled(true);
    }//GEN-LAST:event_btnAdjustTargetActionPerformed

    private void cmbSalesPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSalesPersonActionPerformed
        // TODO add your handling code here:
        salesFlag=1;
        btnClear.setEnabled(true);
        
        Business b = new Business("Business");
        selectedSeller = cmbSalesPerson.getSelectedItem().toString();
        if (selectedSeller == "Sales Person 1"){
            cmbSalesPerson.setEnabled(false);
            ProductCatalog sproducts1 = new ProductCatalog();
            
            sproducts1.addProduct(s1p1);
            sproducts1.addProduct(s1p2);//",20, 35, 25);  // fp = 20, tp = 25, cp = 35
            sproducts1.addProduct(s1p3);//",30, 45, 35);  // fp = 30, tp = 35, cp = 45
            sproducts1.addProduct(s4p4);//",40, 55, 45);  // fp = 40, tp = 45, cp = 55
            sproducts1.addProduct(s4p5);//",50, 65, 55);  // fp = 50, tp = 55, cp = 65
            sproducts1.addProduct(s3p6);//",60, 75, 65);  // fp = 60, tp = 65, cp = 75
            sproducts1.addProduct(s2p7);//",70, 85, 75);  // fp = 70, tp = 75, cp = 85
            sproducts1.addProduct(s1p8);//",80, 95, 85);  // fp = 80, tp = 85, cp = 95
            sproducts1.addProduct(s1p9);//",90, 105, 95); // fp = 90, tp = 95, cp = 105
            sproducts1.addProduct(s1p10);//",100, 115, 105); // fp = 100, tp = 105, cp = 115
            
            
            if (supplierFlag==1){

                intersection.retainAll(sproducts1.getProductList());
                sproducts1.getProductList().retainAll(intersection);
            }
                intersection = new ArrayList<Product>(sproducts1.getProductList());
            
                populateProductTable(sproducts1);
        }
        else if (selectedSeller == "Sales Person 2"){
            cmbSalesPerson.setEnabled(false);
            ProductCatalog sproducts2 = new ProductCatalog();
            sproducts2.addProduct(s2p1);
            sproducts2.addProduct(s1p2);
            sproducts2.addProduct(s1p3);//", 25, 40, 30);   // fp = 25, cp = 40, tp = 30
            sproducts2.addProduct(s2p4);//", 35, 50, 40);   // fp = 35, cp = 50, tp = 40
            sproducts2.addProduct(s3p5);//", 45, 60, 50);   // fp = 45, cp = 60, tp = 50
            sproducts2.addProduct(s4p6);//", 55, 70, 60);   // fp = 55, cp = 70, tp = 60
            sproducts2.addProduct(s5p7);//", 65, 80, 70);   // fp = 65, cp = 80, tp = 70
            sproducts2.addProduct(s5p8);//", 75, 90, 80);   // fp = 75, cp = 90, tp = 80
            sproducts2.addProduct(s4p9);//", 85, 100, 90);  // fp = 85, cp = 100, tp = 90
            sproducts2.addProduct(s3p10);//", 95, 110, 100); // fp = 95, cp = 110, tp = 100
            sproducts2.addProduct(s1p1);//", 5, 20, 10);    // fp = 5, cp = 20, tp = 10
            sproducts2.addProduct(s2p2);//", 15, 30, 20);   // fp = 15, cp = 30, tp = 20
            sproducts2.addProduct(s1p3);//", 25, 40, 30);   // fp = 25, cp = 40, tp = 30
            sproducts2.addProduct(s1p4);//", 35, 50, 40);   // fp = 35, cp = 50, tp = 40
            if (supplierFlag==1){
                sproducts2.getProductList().retainAll(intersection);
            }
//            else
                intersection = new ArrayList<Product>(sproducts2.getProductList());
            populateProductTable(sproducts2);
        }
        else{
            intersection.clear();
            salesFlag=0;
            supplierFlag=0;
            ProductCatalog sproducts3 = new ProductCatalog();
            populateProductTable(sproducts3);
            cmbSalesPerson.setSelectedIndex(0);
        }
    }//GEN-LAST:event_cmbSalesPersonActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        cmbSupplier.setEnabled(true);
        cmbSalesPerson.setEnabled(true);
        cmbSupplier.setSelectedIndex(0);
        cmbSalesPerson.setSelectedIndex(0);
        intersection.clear();
        salesFlag=0;
        supplierFlag=0;
        btnClear.setEnabled(false);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSupplierReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierReportActionPerformed
        // TODO add your handling code here:
        Report r = new Report(selectedSupplier,report.get(selectedSupplier));
        r.setVisible(true);
    }//GEN-LAST:event_btnSupplierReportActionPerformed

    private void btnSalesReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesReportActionPerformed
        // TODO add your handling code here:
        Report r = new Report(selectedSeller,report.get(selectedSeller));
        r.setVisible(true);
    }//GEN-LAST:event_btnSalesReportActionPerformed
      
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
            java.util.logging.Logger.getLogger(Pricing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pricing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pricing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pricing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pricing().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdjustTarget;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRunExecution;
    private javax.swing.JButton btnSalesReport;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSupplierReport;
    private javax.swing.JComboBox<String> cmbSalesPerson;
    private javax.swing.JComboBox<String> cmbSupplier;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblCustomers;
    private javax.swing.JTable tblOrders;
    private javax.swing.JTable tblProduct;
    // End of variables declaration//GEN-END:variables
    
    private void populateProductTable(ProductCatalog products) {
        btnAdd.setEnabled(true);
        DefaultTableModel model = (DefaultTableModel) tblProduct.getModel();
        model.setRowCount(0);
        
        for (Product p: products.getProductList()){
            Object[] row = new Object[5];
            row[0] = p;
            row[1] = p.getFloorPrice();
            row[2] = p.getCeilingPrice();
            row[3] = p.getTargetPrice();
            
            model.addRow(row);
        }
    }

    private void populateCustomerTable(CustomerDirectory cd) {
        DefaultTableModel model = (DefaultTableModel) tblCustomers.getModel();
        model.setRowCount(0);
        
        for (CustomerProfile c: cd.getCustomers()){
            Object[] row = new Object[1];
            row[0] = c.getCustomerId();
            model.addRow(row);
        }
    }

   
    
}
