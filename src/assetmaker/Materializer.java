/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package assetmaker;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.ScrollPaneLayout;
import javax.swing.SwingUtilities;

/**
 *
 * @author samue
 */
public class Materializer extends javax.swing.JPanel {

    /**
     * Creates new form Materializer
     */
    
    int maxEntryCount = 8;
    int selectedEntry = 0;
    int buttonH = 20;
    int buttonW = 80;
    int delbuttonW = 20;
    JButton[] btnName = new JButton[maxEntryCount];
    JButton[] btnDelete = new JButton[maxEntryCount];
    
    ArrayList<Material> materials = new ArrayList<>();
    public Materializer() {
        initComponents();
        materials.add(new Material("default"));
        
        refreshList();
        
        matList.setSelectedIndex(0);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        matList = new javax.swing.JList<>();
        btnNewMat = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        txfName = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfImage = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        scrList = new javax.swing.JScrollPane();
        pnlList = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        matList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                matListMouseClicked(evt);
            }
        });
        matList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                matListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(matList);

        btnNewMat.setText("new Material");
        btnNewMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewMatActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));

        txfName.setText("name");
        txfName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txfNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txfNameKeyTyped(evt);
            }
        });

        jLabel1.setText("name");

        jLabel2.setText("jLabel2");

        txfImage.setText("null");

        jLabel3.setText("image");

        jLabel4.setText("reflectionmap");

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                    .addComponent(txfName)
                    .addComponent(txfImage)
                    .addComponent(jSpinner1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txfImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(253, Short.MAX_VALUE))
        );

        jButton1.setText("read");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        scrList.setAutoscrolls(true);

        pnlList.setBackground(new java.awt.Color(255, 102, 255));
        pnlList.setAutoscrolls(true);
        pnlList.setPreferredSize(null);
        pnlList.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pnlListKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                pnlListKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlListLayout = new javax.swing.GroupLayout(pnlList);
        pnlList.setLayout(pnlListLayout);
        pnlListLayout.setHorizontalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        pnlListLayout.setVerticalGroup(
            pnlListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
        );

        scrList.setViewportView(pnlList);

        jButton2.setText("jButton2");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 14, 1, 1, new java.awt.Color(204, 0, 0)));
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jButton2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrList)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addComponent(jButton2)))
                        .addGap(143, 143, 143))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnNewMat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNewMat)
                    .addComponent(jButton1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(scrList, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void matListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_matListValueChanged
        if (!evt.getValueIsAdjusting()) { //removes doublefiring
            //System.out.println("different" + matList.getSelectedValue());
        }
    }//GEN-LAST:event_matListValueChanged

    private void btnNewMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewMatActionPerformed
        materials.add(new Material("material " + (materials.size())));
        refreshList();
        matList.setSelectedIndex(materials.size()-1);
        selectedEntry = materials.size()-1;
        //btnName[selectedEntry].setSelected(true);
        createButtons();
    }//GEN-LAST:event_btnNewMatActionPerformed

    private void matListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_matListMouseClicked
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem popRemove = new JMenuItem("Remove");
        popupMenu.add(popRemove);
        if(evt.getButton() != 3) return;
        int index = matList.locationToIndex(evt.getPoint());
        matList.setSelectedIndex(index);
        selectedEntry = index;
        if(index == 0) return;
        popupMenu.show(matList, evt.getX(), evt.getY());
        popRemove.addActionListener((e) -> {
            System.out.println("removed " + index);
            materials.remove(index);
            refreshList();
            createButtons();
        });
                
    }//GEN-LAST:event_matListMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ReadMaterials.start(null);
        materials = ReadMaterials.getMaterialsAL();
        refreshList();
        matList.setSelectedIndex(0);
        selectedEntry = 0;
       
        createButtons();
        btnName[selectedEntry].setSelected(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pnlListKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlListKeyReleased
        
    }//GEN-LAST:event_pnlListKeyReleased

    private void jButton2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyTyped
       
    }//GEN-LAST:event_jButton2KeyTyped

    private void txfNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNameKeyTyped
       
    }//GEN-LAST:event_txfNameKeyTyped

    private void txfNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txfNameKeyPressed
        
    }//GEN-LAST:event_txfNameKeyPressed

    private void pnlListKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pnlListKeyPressed
       
    }//GEN-LAST:event_pnlListKeyPressed

    private void panelKeyControl(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_UP -> {
                if(selectedEntry > 0) selectedEntry--; 
                btnName[selectedEntry].setSelected(true);
            }
            case KeyEvent.VK_DOWN -> {
                if(selectedEntry+1 < materials.size()) selectedEntry++; 
                btnName[selectedEntry].setSelected(true);
            }
            case KeyEvent.VK_DELETE -> {
                
            }
        }
      
        System.out.println("selected " + selectedEntry);
        paintSelected();
        
    }
    private void refreshList() {
        int s = materials.size();
        String[] names = new String[s];
        for (int i = 0; i < names.length; i++) {
            names[i] = materials.get(i).getName();
        }
        matList.setListData(names);
    }
    
    
    boolean deleteActive = false;
    public void createButtons() {
        
        expandList();
        
        
        for (int i = 0; i < maxEntryCount; i++) {
            
            if(i < materials.size()) {
                final int iF = i;
                
                if(btnName[i] == null) {
                    btnName[i] = new JButton(materials.get(i).getName());        
                    btnName[i].addActionListener(e -> {
                        selectedEntry = iF;
                        paintSelected();
                    });
                    
                    btnName[i].addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                            panelKeyControl(evt);
                        } 
                    });
                    
                    btnName[i].setMargin(new Insets(0, 0, 0, 0));
                    //btnName[i].setBorderPainted(false);
                    btnName[i].setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
                } else {
                    btnName[i].setText(materials.get(i).getName());
                }
              
                if(i == 0) btnName[i].setSize(new Dimension(buttonW+delbuttonW, buttonH));
                else btnName[i].setSize(new Dimension(buttonW, buttonH));

                btnName[i].setLocation(0, i*buttonH);
    
                pnlList.add(btnName[i]);
                
            } else if(btnName[i] != null) {
                pnlList.remove(btnName[i]);
                btnName[i] = null;
            }
        }
        
        for (int i = 1; i < maxEntryCount; i++) {
            
            if(i < materials.size()) {

                final int iF = i;
                
                if(btnDelete[i] == null) {

                    btnDelete[i] = new JButton("❌");
                    btnDelete[i].addActionListener(e -> {
                        if(deleteActive) {
                            deleteActive = false;
                            deleteEntry(iF);
                            createButtons();
                        } else {
                            btnDelete[iF].setText("💀");
                            deleteActive = true;
                        }
                    });
                btnDelete[i].addMouseListener(new MouseAdapter() { 
                    @Override
                    public void mouseExited(MouseEvent e) {
                        btnDelete[iF].setText("❌");
                       deleteActive = false;
                    }
                     @Override
                    public void mouseEntered(MouseEvent e) {
                        btnDelete[iF].setText("❌");
                        deleteActive = false;
                    }
                });
                
                
                
                } else {
                    btnDelete[i].setText("❌");
                }
                
                btnDelete[i].setSize(new Dimension(delbuttonW, buttonH));
                btnDelete[i].setLocation(buttonW, i*buttonH);
                btnDelete[i].setMargin(new Insets(0, 0, 0, 0));
                
                btnDelete[i].setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 1, 0, new java.awt.Color(0, 0, 0)));
                pnlList.add(btnDelete[i]);
                
            } else if(btnDelete[i] != null) {
                pnlList.remove(btnDelete[i]);
                btnDelete[i] = null;

            }
        }
        paintSelected();
        pnlList.repaint();
        pnlList.setPreferredSize(new Dimension(pnlList.getWidth(), materials.size()*buttonH));
        scrList.revalidate();

    }
    
    public void deleteEntry(int tbd) {
        materials.remove(tbd);
        if(selectedEntry >= materials.size()) {
            selectedEntry = materials.size()-1;
        }
    }
    
    public void paintSelected() {
        for (int i = 0; i < materials.size(); i++) {
            if(i == selectedEntry) {
                btnName[i].setBackground(Color.red);
                if(i != 0) btnDelete[i].setBackground(Color.red);
            } else {
                btnName[i].setBackground(Color.white);
                if(i != 0) btnDelete[i].setBackground(Color.white);
            }
        }
        pnlList.repaint();
    }
    
    public void expandList() {
        int expandsize = 4;
        
        boolean condition1 = maxEntryCount - expandsize > materials.size();
        boolean condition2 = maxEntryCount < materials.size();
        
        if(!(condition1 || condition2)) return;
        
        JButton[] tempBtnName;
        JButton[] tempBtnDelete;
       
        if(condition1) {
            System.out.println("trying shrink " + materials.size());
            
            int fitsize = maxEntryCount;
            while(fitsize - expandsize > materials.size()) {
                fitsize -= expandsize; 
            }
            
            tempBtnName = new JButton[fitsize];
            tempBtnDelete = new JButton[fitsize];
            
            for (int i = 0; i < btnName.length; i++) {
                if(i < fitsize) {//todo does work?
                    tempBtnName[i] = btnName[i];
                    tempBtnDelete[i] = btnDelete[i];
                } else if(btnName[i] != null) {
                    pnlList.remove(btnName[i]);
                    pnlList.remove(btnDelete[i]);
                    btnName[i] = null;
                    btnDelete[i] = null;
                }
                
            }
            
            maxEntryCount = fitsize;
            
        } else {
            System.out.println("trying expand " + materials.size());
            
            int fitsize = maxEntryCount;
            while(fitsize < materials.size()) {
                fitsize += expandsize; 
            }
            
            tempBtnName = new JButton[fitsize];
            tempBtnDelete = new JButton[fitsize];
            
            for (int i = 0; i < maxEntryCount; i++) {
                tempBtnName[i]  = btnName[i];
                tempBtnDelete[i] = btnDelete[i];
            }
            
            maxEntryCount = fitsize;
           
        }
        
        btnName = tempBtnName;
        btnDelete = tempBtnDelete;
        System.out.println("new button count " + btnName.length);
    }
    
    public ArrayList<Material> getMat() {
        return materials;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNewMat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JList<String> matList;
    private javax.swing.JPanel pnlList;
    private javax.swing.JScrollPane scrList;
    private javax.swing.JTextField txfImage;
    private javax.swing.JTextField txfName;
    // End of variables declaration//GEN-END:variables
}
