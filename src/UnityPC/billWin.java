package UnityPC;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.ScrollPane;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HafNi
 */
public class billWin extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs = null;
    PreparedStatement pst =null;
    Statement st=null;
    int Bill_no=0;
    int B_ID=0;
    int tot=0;
    ScrollPane s; 
    int i_no=0;
    
     private static class JasperDesign {

        public JasperDesign() {
        }
    }

        private Vector<Vector<String>> data;
        private Vector<Vector<String>> data1;
        private Vector<String> header;
   
    
    private  Vector<String> header1=null;
        
    
    /**
     * Creates new form billWin
     */
    public billWin() {
        
        initComponents();
         
        try{
                   conn=DBconn.getConn();
                   st= conn.createStatement();
            }
         catch(Exception e)
            {
            JOptionPane.showMessageDialog(null, e);
            }
        try{
            DCEngin2 dce = new DCEngin2("select * from addproduct");
        
       data = dce.getData();
       
       header = new Vector<String>();
       header.add("P_ID");
       header.add("Serial No");
       header.add("Catageroy");
       header.add("Model");
       header.add("Name");
       
        }
        catch(Exception e)
            {
            JOptionPane.showMessageDialog(null, e);
            }
        
         try{
                DummyData dce1 = new DummyData("select * from dummy");
                data1 = dce1.getData();
                header1 = new Vector<String>();
                header1.add("Product No");
                header1.add("Name");
                header1.add("SerialNo");
                header1.add("Unitprice");
                header1.add("Quantity");
                header1.add("Total");
            }
         catch(Exception e)
            {
            JOptionPane.showMessageDialog(null, e);
            }
         try {
              st=conn.createStatement();
              rs=st.executeQuery("select max(BillNo)from billing");
           
              rs.next();
              if(rs!=null)
              {
                  Bill_no=rs.getInt(1);
              Bill_no++;
              } 
              
              else
                    Bill_no=1;
              
             BillNo.setText("" + Bill_no);
             
             
        } catch (Exception ex) {
            Logger.getLogger(addWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BillNo = new javax.swing.JTextField();
        CustomerName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CustomerAddress = new javax.swing.JTextField();
        Purchase = new javax.swing.JComboBox<>();
        addButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        subtotal = new javax.swing.JTextField();
        Discount = new javax.swing.JTextField();
        GrandTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        datechooser = new com.toedter.calendar.JDateChooser();
        P_ID = new javax.swing.JTextField();
        P_Name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        SerialNo = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        UnitPrice = new javax.swing.JTextField();
        Total = new javax.swing.JTextField();
        dateget = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        TaxPer = new javax.swing.JTextField();
        SearchBox = new javax.swing.JComboBox<>();
        Valuebox = new javax.swing.JTextField();
        searchbutton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Tax = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setMaximumSize(new java.awt.Dimension(3147, 2147));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jButton2.setFont(new java.awt.Font("Arno Pro Smbd SmText", 0, 20)); // NOI18N
        jButton2.setText("Home");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(905, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 110));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Purchas Type :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 130, 30));

        jLabel3.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TAX:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 350, 60, 30));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bill date:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 80, 30));

        jLabel5.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Customer Address:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 180, 30));

        BillNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillNoActionPerformed(evt);
            }
        });
        jPanel1.add(BillNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 150, 30));

        CustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerNameActionPerformed(evt);
            }
        });
        jPanel1.add(CustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, 210, 30));

        jLabel6.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Customer Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 160, 30));
        jPanel1.add(CustomerAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 460, 30));

        Purchase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Cheque", " " }));
        jPanel1.add(Purchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 90, 30));

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 70, 30));

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 460, 270));
        jPanel1.add(subtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 270, 120, 30));
        jPanel1.add(Discount, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 310, 120, 30));
        jPanel1.add(GrandTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 390, 120, 30));

        jLabel10.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bill No:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 70, 30));

        jLabel11.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Grand Total");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 110, 30));

        jLabel12.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Discount:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 310, 90, 30));

        datechooser.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(datechooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 150, 30));

        P_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        P_ID.setToolTipText("Item ID");
        P_ID.setName(""); // NOI18N
        jPanel1.add(P_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 50, 30));

        P_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P_NameActionPerformed(evt);
            }
        });
        jPanel1.add(P_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 150, 30));

        jLabel7.setText("Product ID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 60, 30));

        jLabel1.setText("Product Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 90, 30));

        jLabel8.setText("Serial No");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 70, 30));

        jLabel14.setText(" Quantity");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 50, 30));

        jLabel9.setText("Unit price");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 60, 30));

        jLabel13.setText("Total");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 30, 30));
        jPanel1.add(SerialNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, 110, 30));

        Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                QuantityKeyReleased(evt);
            }
        });
        jPanel1.add(Quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 50, 30));

        UnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnitPriceActionPerformed(evt);
            }
        });
        UnitPrice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                UnitPriceKeyReleased(evt);
            }
        });
        jPanel1.add(UnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 270, 50, 30));

        Total.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TotalFocusGained(evt);
            }
        });
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });
        jPanel1.add(Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 70, 30));

        dateget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dategetActionPerformed(evt);
            }
        });
        jPanel1.add(dateget, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 140, 30));

        jButton3.setFont(new java.awt.Font("Centaur", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 430, 110, 110));

        jLabel15.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("PRINT");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 550, 80, 30));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Delete");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 110, 30));

        jLabel16.setFont(new java.awt.Font("Corbel", 1, 20)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Sub Total:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 90, 30));

        TaxPer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TaxPerKeyReleased(evt);
            }
        });
        jPanel1.add(TaxPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 350, 40, 30));

        SearchBox.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        SearchBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Serial NO", "Category Name", "Model Name", " " }));
        SearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBoxActionPerformed(evt);
            }
        });
        jPanel1.add(SearchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 110, 40));

        Valuebox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValueboxActionPerformed(evt);
            }
        });
        jPanel1.add(Valuebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 90, 40));

        searchbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchbutton.setText("Search");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });
        jPanel1.add(searchbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 70, 40));

        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 270, 230));
        jPanel1.add(Tax, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 350, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1059, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BillNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BillNoActionPerformed

    private void CustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerNameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        close();
        homeWin h= new homeWin();
        h.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        try{
                    
        int tot=0;
               conn= DBconn.getConn();      
            st=conn.createStatement();

            pst=conn.prepareStatement("insert into dummy values(?,?,?,?,?,?,?)");
            pst.setInt(1,Integer.parseInt(BillNo.getText()));
            pst.setInt(2,Integer.parseInt(P_ID.getText()));
            pst.setString(3,""+P_Name.getText());
            pst.setString(4,""+SerialNo.getText());
            pst.setInt(5,Integer.parseInt(UnitPrice.getText()));
            pst.setInt(6,Integer.parseInt(Quantity.getText()));
            pst.setInt(7,Integer.parseInt(Total.getText()));
            pst.executeUpdate();
 
 
                    rs=st.executeQuery("select Total from dummy");
                    while(rs.next())
                        {
                            tot=tot+rs.getInt(1);
                        }
                      subtotal.setText(""+tot);
                    //TaxPer.setFocusable(true);
       
     
      try{
          DummyData dce1 = new DummyData("select P_No,Name,SerialNo,UnitPrice,Quantity,Total from dummy where");
          data1 = dce1.getData();
            header1 = new Vector<String>();
                header1.add("Product No");
                header1.add("Name");
                header1.add("SerialNo");
                header1.add("Unitprice");
                header1.add("Quantity");
                header1.add("Total");
          
         jTable1.setModel(new javax.swing.table.DefaultTableModel(data,header));           
                            } catch (Exception ex) {
                                Logger.getLogger(billWin.class.getName()).log(Level.SEVERE, null, ex);
                            }
      
      
    
    
    Quantity.setText("");
    SerialNo.setText("");
    Total.setText("");
    P_ID.setText("");
    P_Name.setText("");
    UnitPrice.setText("");
    
     } 
           
   catch(Exception ex)
   {
       System.out.println("Error = "+ex);
   } 
    }//GEN-LAST:event_addButtonActionPerformed

    private void P_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_P_NameActionPerformed

    private void UnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnitPriceActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalActionPerformed

    private void dategetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dategetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dategetActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void UnitPriceKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UnitPriceKeyReleased
        // TODO add your handling code here:
                 int f=0; 
    String s=UnitPrice.getText();
    String s1=null;
    for(int i=0;i<s.length();i++)
    {
      char a=s.charAt(i);  
       Character chr=new Character(a);
       
      if(chr.isLetter(a))
      {
           f=1;
        s1=s.substring(0, i);   
      }
    }
    if(f==1)
    {
        JOptionPane.showMessageDialog(null,"character not allowed");
     UnitPrice.setText(null);
    }
    }//GEN-LAST:event_UnitPriceKeyReleased

    private void QuantityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_QuantityKeyReleased
        // TODO add your handling code here:
//        int f=0; 
//    String s=Quantity.getText();
//    String s1=null;
//    for(int i=0;i<s.length();i++)
//    {
//      char a=s.charAt(i);  
//       Character chr=new Character(a);
//       
//      if(chr.isLetter(a))
//      {
//           f=1;
//        s1=s.substring(0, i);   
//      }
//    }
//    if(f==1)
//    {
//        JOptionPane.showMessageDialog(null,"character not allowed");
//     Quantity.setText(null);
//    }
    
    int st=Integer.parseInt(Quantity.getText());
         int st2=Integer.parseInt(UnitPrice.getText());
            
           
           
            int total3=st*st2;
            Total.setText(""+total3);
    }//GEN-LAST:event_QuantityKeyReleased

    private void TotalFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TotalFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalFocusGained

    private void SearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBoxActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_SearchBoxActionPerformed

    private void ValueboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValueboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValueboxActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        // TODO add your handling code here:
        try
        {
            String value1=SearchBox.getSelectedItem().toString(); ;
            String value2=Valuebox.getText();
            if(value1.equals("Serial NO"))
            {
                try {

                    DCEngin2 dce = new DCEngin2("select * from addproduct where P_SerialNo  like '"+value2+"%'");
                    data = dce.getData();
                    header = new Vector<String>();
                    header.add("P_ID");
                    header.add("Serial No");
                    header.add("Catageroy");
                    header.add("Model");
                    header.add("Name");
                    

                    jTable2.setModel(new javax.swing.table.DefaultTableModel(data,header));
                } catch (Exception ex) {
                    Logger.getLogger(SearchProduct.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(value1.equals("Category Name"))
            {
                try {

                    DCEngin2 dce = new DCEngin2("select * from addproduct where P_Category  like '"+value2+"%'");
                    data = dce.getData();
                    header = new Vector<String>();
                    header.add("P_ID");
                    header.add("Serial No");
                    header.add("Catageroy");
                    header.add("Model");
                    header.add("Name");
                    

                    jTable2.setModel(new javax.swing.table.DefaultTableModel(data,header));
                } catch (Exception ex) {
                    Logger.getLogger(SearchProduct.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(value1.equals("Model Name"))
            {
                try {

                    DCEngin2 dce = new DCEngin2("select * from addproduct where P_ModelName  like '"+value2+"%'");
                    data = dce.getData();
                    header = new Vector<String>();
                    header.add("P_ID");
                    header.add("Serial No");
                    header.add("Catageroy");
                    header.add("Model");
                    header.add("Name");
                    
                    jTable2.setModel(new javax.swing.table.DefaultTableModel(data,header));
                } catch (Exception ex) {
                    Logger.getLogger(SearchProduct.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_searchbuttonActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        
        try {
            
           
            int r=jTable2.getSelectedRow();
            int c=jTable2.getSelectedColumn();
                     Object s=jTable2.getValueAt(r, 0);
            String NameVal = s.toString(); 
            rs = st.executeQuery("select * from addproduct where P_ID='"+NameVal+"'");
                rs.next();
                     P_ID.setText(""+rs.getInt(1));
                     P_Name.setText(""+rs.getString(4));
                     SerialNo.setText(""+rs.getString(2));
                     UnitPrice.setText(""+rs.getString(5));
                     
         
                   conn= DBconn.getConn();      
                   st=conn.createStatement();
        } catch (SQLException ex) {

           ex.printStackTrace();
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void TaxPerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TaxPerKeyReleased
        // TODO add your handling code here:
        int st=Integer.parseInt(subtotal.getText());
         int taxVal=Integer.parseInt(TaxPer.getText());
             int perVal=0;
            perVal=((st*taxVal)/100);
            Tax.setText(""+perVal);
            int total3=st+perVal;
            GrandTotal.setText(""+total3);
    }//GEN-LAST:event_TaxPerKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        try {
      
                  conn= DBconn.getConn();      
                 st=conn.createStatement();
                 
      
            int r= jTable1.getSelectedRow();
            int c=jTable1.getSelectedColumn();
            Object s=jTable1.getValueAt(r, 0);
            String NameVal = s.toString(); 
           pst=conn.prepareStatement("delete from dummy where Item_Name='"+NameVal+"'");
                     pst.executeUpdate();
       } catch (SQLException ex) {
         ex.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(billWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billWin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BillNo;
    private javax.swing.JTextField CustomerAddress;
    private javax.swing.JTextField CustomerName;
    private javax.swing.JTextField Discount;
    private javax.swing.JTextField GrandTotal;
    private javax.swing.JTextField P_ID;
    private javax.swing.JTextField P_Name;
    private javax.swing.JComboBox<String> Purchase;
    private javax.swing.JTextField Quantity;
    private javax.swing.JComboBox<String> SearchBox;
    private javax.swing.JTextField SerialNo;
    private javax.swing.JTextField Tax;
    private javax.swing.JTextField TaxPer;
    private javax.swing.JTextField Total;
    private javax.swing.JTextField UnitPrice;
    private javax.swing.JTextField Valuebox;
    private javax.swing.JButton addButton;
    private com.toedter.calendar.JDateChooser datechooser;
    private javax.swing.JTextField dateget;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton searchbutton;
    private javax.swing.JTextField subtotal;
    // End of variables declaration//GEN-END:variables
private void close(){
    WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
}
}
