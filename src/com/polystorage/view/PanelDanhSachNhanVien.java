package com.polystorage.view;

import com.polystorage.dao.NhanVienDAOImpl;
import com.polystorage.entity.NhanVien;
import com.polystorage.helper.DialogHelper;
import com.polystorage.helper.RemoveButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.ImageIcon;
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
public class PanelDanhSachNhanVien extends javax.swing.JPanel {

    public static PanelDanhSachNhanVien reload;
    private boolean isNhanVien;

    /**
     * Creates new form NewJPanel
     */
    public PanelDanhSachNhanVien(boolean isNhanVien) {
        reload = this;
        this.isNhanVien = isNhanVien;
        initComponents();
        this.setTableUI();
        this.fillToTable(null);
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
        btnThemNhanVien = new javax.swing.JLabel();
        pnlTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        pnlControl.setBackground(new java.awt.Color(255, 255, 255));

        txtTimKiem.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtTimKiem.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        btnThemNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/button_them-nhan-vien.png"))); // NOI18N
        btnThemNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThemNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThemNhanVienMouseExited(evt);
            }
        });

        pnlTitle.setBackground(new java.awt.Color(35, 124, 196));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("     NHÂN VIÊN");

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlControlLayout = new javax.swing.GroupLayout(pnlControl);
        pnlControl.setLayout(pnlControlLayout);
        pnlControlLayout.setHorizontalGroup(
            pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlControlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThemNhanVien)
                .addContainerGap())
            .addComponent(pnlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlControlLayout.setVerticalGroup(
            pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlControlLayout.createSequentialGroup()
                .addGroup(pnlControlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemNhanVien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Họ Tên", "SĐT", "Email", "Giới Tính", "Mật Khẩu", "Vai Trò", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.setFocusable(false);
        tblNhanVien.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tblNhanVien.setRowHeight(25);
        tblNhanVien.setSelectionBackground(new java.awt.Color(130, 168, 212));
        tblNhanVien.setShowVerticalLines(false);
        tblNhanVien.getTableHeader().setReorderingAllowed(false);
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        jPanel4.setBackground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlControl, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemNhanVienMouseExited
        btnThemNhanVien.setIcon(new ImageIcon(getClass().getResource("/icon/button_them-nhan-vien.png")));
    }//GEN-LAST:event_btnThemNhanVienMouseExited

    private void btnThemNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemNhanVienMouseEntered
        btnThemNhanVien.setIcon(new ImageIcon(getClass().getResource("/icon/button_them-nhan-vien(1).png")));
        btnThemNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btnThemNhanVienMouseEntered

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        if (evt.getClickCount() == 2) {
            int row = tblNhanVien.getSelectedRow();
            String maNV = (String) tblNhanVien.getValueAt(row, 0);
            NhanVien nv = nhanVienDAOImpl.getInfoNhanVien(maNV);
            new FrameThemNhanVien(nv).setVisible(true);
        }
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void btnThemNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemNhanVienMouseClicked
        new FrameThemNhanVien(null).setVisible(true);
    }//GEN-LAST:event_btnThemNhanVienMouseClicked

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        String hoTen = txtTimKiem.getText();
        this.fillToTable(hoTen);
    }//GEN-LAST:event_txtTimKiemKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnThemNhanVien;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlControl;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables

    List<NhanVien> list;
    int index = 0;
    NhanVienDAOImpl nhanVienDAOImpl = new NhanVienDAOImpl();

    public void fillToTable(String hoten) {
        list = nhanVienDAOImpl.getListNhanVien(hoten);
        if (list != null) {
            DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
            ActionListener actionListener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    removeNhanVien();
                }
            };
            tblNhanVien.getColumnModel().getColumn(7).setCellRenderer(new RemoveButton(tblNhanVien, 7, actionListener));
            model.setRowCount(0);
            for (NhanVien x : list) {
                String gioiTinh = "";
                if (x.isGioiTinh()) {
                    gioiTinh = "Nam";
                } else {
                    gioiTinh = "Nữ";
                }
                Object[] row = new Object[]{x.getMaNv(), x.getHoTen(), x.getSdt(),
                    x.getEmail(), gioiTinh, x.getMatKhau(), x.getVaiTro()};
                model.addRow(row);
            }
        }
    }

    private void setTableUI() {
        tblNhanVien.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 13));
        tblNhanVien.getTableHeader().setOpaque(false);
//        tblNhanVien.getTableHeader().setBackground(new Color(32, 136, 203));
//        tblNhanVien.getTableHeader().setForeground(new Color(255, 255, 255));
        tblNhanVien.getTableHeader().setBackground(new Color(255, 255, 255));
        tblNhanVien.getTableHeader().setForeground(new Color(0, 0, 0));
        tblNhanVien.setRowHeight(25);
    }

    private void removeNhanVien() {
        if (isNhanVien) {
            DialogHelper.showMessageDialog(null, "Nhân viên không có quyền xóa");
        } else {
            int index = tblNhanVien.getSelectedRow();
            String maNV = (String) tblNhanVien.getValueAt(index, 0);
            int ok = JOptionPane.showConfirmDialog(null, "Xác nhận xóa nhân viên " + maNV, "Bạn muốn xóa?", JOptionPane.YES_NO_OPTION);
            if (ok == 0) {
                if (nhanVienDAOImpl.deleteNhanVien(maNV)) {
                    PanelDanhSachNhanVien.reload.fillToTable(null);
                    DialogHelper.showMessageDialog(null, "Xóa nhân viên " + maNV + " thành công");
                } else {
                    DialogHelper.showMessageDialog(null, "Xóa nhân viên " + maNV + " thất bại");
                }
            }
        }
    }
}