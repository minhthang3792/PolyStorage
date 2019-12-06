package com.polystorage.view;

import com.polystorage.dao.NhaCungCapDAOImpl;
import com.polystorage.entity.NhaCungCap;
import com.polystorage.helper.DialogHelper;
import com.polystorage.helper.RemoveButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author xPeter
 */
public class PanelDanhSachNhaCungCap extends javax.swing.JPanel {

    public static PanelDanhSachNhaCungCap reload;
    private boolean isNhanVien;

    /**
     * Creates new form NewJPanel
     */
    public PanelDanhSachNhaCungCap(boolean isNhanVien) {
        reload = this;
        this.isNhanVien = isNhanVien;
        initComponents();
        this.setTableUI();
        fillToTable(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlControl = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        pnlTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnThemMoi = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhaCungCap = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlControl.setBackground(new java.awt.Color(255, 255, 255));

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtTimKiem.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        pnlTitle.setBackground(new java.awt.Color(35, 124, 196));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("     Nhà Cung Cấp");

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 92, Short.MAX_VALUE))
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        btnThemMoi.setText("Thêm Mới");
        btnThemMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlControlLayout = new javax.swing.GroupLayout(pnlControl);
        pnlControl.setLayout(pnlControlLayout);
        pnlControlLayout.setHorizontalGroup(
            pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemMoi)
                .addContainerGap())
            .addComponent(pnlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlControlLayout.setVerticalGroup(
            pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlControlLayout.createSequentialGroup()
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemMoi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tblNhaCungCap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Nhà Cung Cấp", "Tên Nhà Cung Cấp", "SĐT", "Email", "Đia Chỉ", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhaCungCap.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblNhaCungCap.setFocusable(false);
        tblNhaCungCap.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblNhaCungCap.setRowHeight(25);
        tblNhaCungCap.setSelectionBackground(new java.awt.Color(130, 168, 212));
        tblNhaCungCap.setShowVerticalLines(false);
        tblNhaCungCap.getTableHeader().setReorderingAllowed(false);
        tblNhaCungCap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhaCungCapMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhaCungCap);

        jPanel9.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlControl, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblNhaCungCapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhaCungCapMouseClicked
        if (evt.getClickCount() == 2) {
            int index = tblNhaCungCap.getSelectedRow();
            String maNCC = (String) tblNhaCungCap.getValueAt(index, 0);
            NhaCungCap nhaCungCap = nhaCungCapDAOImpl.getInfoNhaCungCap(maNCC);
            new FrameThemNhaCungCap(nhaCungCap).setVisible(true);
        }
    }//GEN-LAST:event_tblNhaCungCapMouseClicked

    private void btnThemMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemMoiActionPerformed
        new FrameThemNhaCungCap(null).setVisible(true);
    }//GEN-LAST:event_btnThemMoiActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        String hoTen = txtTimKiem.getText();
        this.fillToTable(hoTen);
    }//GEN-LAST:event_txtTimKiemKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThemMoi;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlControl;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JTable tblNhaCungCap;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    List<NhaCungCap> list;
    int index = 0;
    NhaCungCapDAOImpl nhaCungCapDAOImpl = new NhaCungCapDAOImpl();

    private void setTableUI() {
        tblNhaCungCap.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 13));
        tblNhaCungCap.getTableHeader().setOpaque(false);
//        tblNhanVien.getTableHeader().setBackground(new Color(32, 136, 203));
//        tblNhanVien.getTableHeader().setForeground(new Color(255, 255, 255));
        tblNhaCungCap.getTableHeader().setBackground(new Color(255, 255, 255));
        tblNhaCungCap.getTableHeader().setForeground(new Color(0, 0, 0));
        tblNhaCungCap.setRowHeight(25);
    }

    public void fillToTable(String tenNCC) {
        list = nhaCungCapDAOImpl.getListNhaCungCap(tenNCC);
        if (list != null) {
            DefaultTableModel model = (DefaultTableModel) tblNhaCungCap.getModel();
            ActionListener actionListener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    removeNhaCungCap();
                }
            };
            tblNhaCungCap.getColumnModel().getColumn(5).setCellRenderer(new RemoveButton(tblNhaCungCap, 5, actionListener));
            model.setRowCount(0);
            for (NhaCungCap x : list) {
                Object[] row = new Object[]{x.getMaNCC(), x.getTenNCC(), x.getSdt(), x.getEmail(), x.getDiaChi()};
                model.addRow(row);
            }
        }

    }

    public void removeNhaCungCap() {
        if (isNhanVien) {
            DialogHelper.showMessageDialog(null, "Nhân viên không có quyền xóa");
        } else {
            int index = tblNhaCungCap.getSelectedRow();
            String maNCC = (String) tblNhaCungCap.getValueAt(index, 0);
            int ok = JOptionPane.showConfirmDialog(null, "Xác nhận xóa nhà cung cấp " + maNCC, "Bạn muốn xóa?", JOptionPane.YES_NO_OPTION);
            if (ok == 0) {
                if (nhaCungCapDAOImpl.deleteNhaCungCap(maNCC)) {
                    PanelDanhSachNhaCungCap.reload.fillToTable(null);
                    DialogHelper.showMessageDialog(null, "Xóa nhà cung cấp " + maNCC + " thành công");
                } else {
                    DialogHelper.showMessageDialog(null, "Xóa nhà cung cấp " + maNCC + " thất bại");
                }
            }
        }
    }

}
