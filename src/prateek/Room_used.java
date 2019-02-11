/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Room_used.java
 *
 * Created on Dec 16, 2017, 7:14:05 PM
 */

package prateek;

import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author intel
 */
public class Room_used extends javax.swing.JFrame {

    /** Creates new form Room_used */
    public Room_used() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        l1 = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        r6 = new javax.swing.JRadioButton();
        r8 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l1.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Customer", "Ph_No", "Address", "Room_type", "Bill" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(l1);

        jLabel1.setText("Column list");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Sorting Criteria"));

        buttonGroup1.add(r1);
        r1.setText("Descending");

        buttonGroup1.add(r2);
        r2.setText("Ascending");

        jLabel2.setText("Order by");

        jLabel3.setText("Column name");

        r3.setText("Customer");

        r4.setText("Ph_No");

        r5.setText("Room_type");

        r6.setText("Address");

        r8.setText("Bill");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r8)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(r6)
                                .addComponent(r5))
                            .addContainerGap())
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(r3)
                                    .addComponent(r4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(r1)
                                    .addComponent(r2))
                                .addGap(21, 21, 21))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(r3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(r4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(r6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(r5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(r8)
                .addContainerGap())
        );

        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(t1);

        jButton1.setText("Display");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(46, 46, 46)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
DefaultTableModel m=(DefaultTableModel)t1.getModel();
m.setColumnCount(0);
String querry="Select ";
int i=0,cu=0,p=0,b=0,a=0,rt=0;
try
{
  int c[]=l1.getSelectedIndices();
  int l=c.length;
    for(int x=0;x<l;x++)
    {if(c[x]==0)
     {m.addColumn("Customer");
     querry+="Customer";cu++;
     i++;}
     else if(c[x]==1)
     { m.addColumn("Ph_No");
       if(i!=0)
       {querry+=",Ph_No";i++;p++;}
       else
     querry+="Ph_No";}
     else if(c[x]==2)
     { m.addColumn("Address");
       if(i!=0)
       {querry+=",Address";i++;a++;}
       else
     querry+="Address";
     }
     else if(c[x]==3)
     {m.addColumn("Room_Type");
       if(i!=0)
       {querry+=",Room_Type";i++;rt++;}
       else
     querry+="Room_Type";}
     else if(c[x]==4)
     {m.addColumn("Bill");
       if(i!=0)
       {querry+=",Bill";i++;b++;}
       else
     querry+="Bill";}
    } 
 querry+=" from room ";
 i=0;
 if(r3.isSelected())
     querry+="order by customer";
 else if(r4.isSelected())
     querry+="order by Ph_No";
 else if(r5.isSelected())
     querry+="order by Address";
 else if(r6.isSelected())
     querry+="order by Room_type";
 else if(r3.isSelected())
     querry+="order by Bill";
if(i!=0)
{if(r2.isSelected())
 querry+=" desc";
 else if(r3.isSelected()==false)
 JOptionPane.showMessageDialog(null,"Please select sorting order");
}
 querry+=";";
 int q=m.getRowCount();
   for(int x=0;x<q;x++)
        m.removeRow(0);
Class.forName("java.sql.DriverManager");
Connection co=(Connection)
        DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","hello");
Statement s=(Statement)co.createStatement();
 ResultSet r=s.executeQuery(querry);
 while(r.next())
 {String cus=r.getString(1);
  String pn=r.getString(2);
  String add=r.getString(3);
  String rm=r.getString(4);
  String bl=r.getString(5);
 }
}
catch(Exception e)
{System.out.println(e);
}
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room_used().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList l1;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JRadioButton r6;
    private javax.swing.JRadioButton r8;
    private javax.swing.JTable t1;
    // End of variables declaration//GEN-END:variables

}
