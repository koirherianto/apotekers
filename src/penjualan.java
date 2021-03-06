import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.sql.Date;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class penjualan extends apotek {
    
    String [] judul = {"kode Identitas","Nama Obat","Nama Merek","Kategori","Harga Jual","Expire"};
    DefaultTableModel model = new DefaultTableModel(judul,0);
    
    public penjualan() {
        initComponents();
        setTitle("Mangemen Pengololaan Apotek");
        table_obat.setModel(model);
        tampilkanTableObat("");
        tampilkanTablePenjualan();
        bersihkanKolomPencarian();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tombol_hapus = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        kolom_nama_obat = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_cari = new javax.swing.JButton();
        btn_bersihkan_pencarian = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_obat = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        menu_input_obat = new javax.swing.JButton();
        menu_riwayat_transaksi = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_tambah = new javax.swing.JButton();
        btn_jual = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_penjualan = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        tampil_jumlah = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_kurang = new javax.swing.JButton();
        btn_bersihkan_table_penjualan = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        tombol_hapus.setBackground(new java.awt.Color(204, 0, 0));
        tombol_hapus.setText("Hapus");
        tombol_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_hapusActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nama Obat");
        jLabel2.setToolTipText("");

        kolom_nama_obat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kolom_nama_obat.setText("\n");

        jLabel16.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 255, 204));
        jLabel16.setText("Pencarian");

        jLabel5.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 204));
        jLabel5.setText("Barang");

        btn_cari.setBackground(new java.awt.Color(0, 255, 0));
        btn_cari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        btn_bersihkan_pencarian.setBackground(new java.awt.Color(102, 255, 255));
        btn_bersihkan_pencarian.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_bersihkan_pencarian.setText("Bersihkan");
        btn_bersihkan_pencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bersihkan_pencarianActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel16)
                    .addComponent(kolom_nama_obat, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bersihkan_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kolom_nama_obat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_cari, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_bersihkan_pencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(431, Short.MAX_VALUE))
        );

        table_obat.setBackground(new java.awt.Color(153, 153, 255));
        table_obat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table_obat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Identitas", "Nama Obat", "Nama Merek", "Kategori", "Harga Jual", "Expire"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_obat.setGridColor(new java.awt.Color(255, 102, 102));
        table_obat.setSelectionBackground(new java.awt.Color(102, 0, 102));
        table_obat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_obatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table_obat);

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        menu_input_obat.setBackground(new java.awt.Color(0, 153, 153));
        menu_input_obat.setFont(new java.awt.Font("Tekton Pro Cond", 0, 16)); // NOI18N
        menu_input_obat.setText("Pembelian");
        menu_input_obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_input_obatActionPerformed(evt);
            }
        });

        menu_riwayat_transaksi.setBackground(new java.awt.Color(0, 153, 153));
        menu_riwayat_transaksi.setFont(new java.awt.Font("Tekton Pro Cond", 0, 16)); // NOI18N
        menu_riwayat_transaksi.setText("Riwayat  Tranksaksi");
        menu_riwayat_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_riwayat_transaksiActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 255, 204));
        jLabel17.setText("Menu");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menu_input_obat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(menu_riwayat_transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menu_input_obat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu_riwayat_transaksi)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        btn_tambah.setBackground(new java.awt.Color(0, 255, 0));
        btn_tambah.setText("Tambah +");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_jual.setBackground(new java.awt.Color(0, 204, 255));
        btn_jual.setText("Jual");
        btn_jual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jualActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(204, 102, 0));
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_keluar.setBackground(new java.awt.Color(153, 255, 204));
        btn_keluar.setText("Keluar");
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 204));
        jLabel15.setText("Penjualan");

        table_penjualan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Obat", "Jml", "Harga"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_penjualan);
        if (table_penjualan.getColumnModel().getColumnCount() > 0) {
            table_penjualan.getColumnModel().getColumn(0).setMaxWidth(30);
            table_penjualan.getColumnModel().getColumn(2).setMaxWidth(30);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Total Belanja :");

        tampil_jumlah.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tampil_jumlah.setForeground(new java.awt.Color(204, 255, 204));
        tampil_jumlah.setText("0");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 255, 204));
        jLabel7.setText("Rp");

        btn_kurang.setBackground(new java.awt.Color(255, 0, 0));
        btn_kurang.setText("Kurang -");
        btn_kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kurangActionPerformed(evt);
            }
        });

        btn_bersihkan_table_penjualan.setBackground(new java.awt.Color(102, 255, 255));
        btn_bersihkan_table_penjualan.setText("Bersihkan");
        btn_bersihkan_table_penjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bersihkan_table_penjualanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_bersihkan_table_penjualan, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_keluar, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_jual, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(tampil_jumlah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_kurang, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tampil_jumlah)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_kurang)
                    .addComponent(btn_tambah))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_jual, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_bersihkan_table_penjualan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 255, 204));
        jLabel14.setText("Apotekers");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void table_obatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_obatMouseClicked
        int i = table_obat.getSelectedRow();

        if (i>-1) {
            int id = Integer.parseInt(model.getValueAt(i, 0).toString());
            String namaObat = model.getValueAt(i, 1).toString();
            int jml = 1;
            int hargaJual = Integer.parseInt(model.getValueAt(i, 4).toString());         
            
            query("INSERT INTO `penjualan` (`id`, `obat`, `jumlah`, `harga`) VALUES ('"+id+"', '"+namaObat+"', '"+jml+"', '"+hargaJual+"')","Yang Anda klik sudah Ada di dalam daftar cuy");
        }         
    }//GEN-LAST:event_table_obatMouseClicked

    private void tombol_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_hapusActionPerformed

    }//GEN-LAST:event_tombol_hapusActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        int baris = table_penjualan.getSelectedRow();           
        int id = Integer.parseInt(table_penjualan.getValueAt(baris, 0).toString());
        
        query("DELETE FROM `penjualan` WHERE `penjualan`.`id` = '"+id+"'","");
        
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // keluar
        System.exit(0);
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void menu_input_obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_input_obatActionPerformed
        new pembelian().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menu_input_obatActionPerformed

    private void btn_bersihkan_table_penjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bersihkan_table_penjualanActionPerformed
        hapusIsiTablePenjualan();
    }//GEN-LAST:event_btn_bersihkan_table_penjualanActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        int baris = table_penjualan.getSelectedRow();           
        int id = Integer.parseInt(table_penjualan.getValueAt(baris, 0).toString());
        int jml = Integer.parseInt(table_penjualan.getValueAt(baris, 2).toString()) + 1;
              
        query("UPDATE `penjualan` SET `jumlah` = '"+jml+"' WHERE `penjualan`.`id` = '"+id+"' ","");
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kurangActionPerformed
        int baris = table_penjualan.getSelectedRow();           
        int id = Integer.parseInt(table_penjualan.getValueAt(baris, 0).toString());
        int jumlah = Integer.parseInt(table_penjualan.getValueAt(baris, 2).toString());
        
        if (jumlah > 1) {
            jumlah--;          
            query("UPDATE `penjualan` SET `jumlah` = '"+jumlah+"' WHERE `penjualan`.`id` = '"+id+"' ","");
        }else{
            query("DELETE FROM `penjualan` WHERE `penjualan`.`id` = '"+id+"' ","");
        } 
    }//GEN-LAST:event_btn_kurangActionPerformed

    private void btn_jualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jualActionPerformed
        int id, penguranganBarang,jumlahBarang,hargaJual,totalHarga,hargaBeli;
        String namaObat,namaMerek,kategori,tanggalBeli;
        try {       
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/apotek","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM penjualan INNER JOIN obat ON obat.id = penjualan.id");
            while(rs.next() ){
                id = rs.getInt(1);
                penguranganBarang = rs.getInt(10) - rs.getInt(3);
                //query apotek
                namaObat = rs.getString(6);
                namaMerek = rs.getString(7);
                kategori = rs.getString(8);
                //
                jumlahBarang = rs.getInt(3);
                hargaJual = rs.getInt(4);
                totalHarga = jumlahBarang * hargaJual;
                hargaBeli = rs.getInt(9);
                
                //tangggal beli
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                LocalDateTime now = LocalDateTime.now();
                tanggalBeli = dtf.format(now);
                query("UPDATE `obat` SET `jumlah_barang` = '"+penguranganBarang+"' WHERE `id` = '"+id+"' ","");
                query("INSERT INTO `transaksi` (`id`, `nama_obat`, `nama_merek`, `kategori`, `jumlah_barang`, `harga_jual`, `total_harga`, `tanggal_beli`, `harga_beli`) VALUES (NULL, '"+namaObat+"', '"+namaMerek+"', '"+kategori+"', '"+jumlahBarang+"', '"+hargaJual+"', '"+totalHarga+"', '"+tanggalBeli+"','"+hargaBeli+"')","");
            }
            hapusIsiTablePenjualan();
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_btn_jualActionPerformed

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        String namaObat = kolom_nama_obat.getText();
        namaObat = namaObat.trim().replaceAll("\\s+", " ");
        
        cari("SELECT * FROM obat WHERE nama_obat like '%"+namaObat+"%'");
        
    }//GEN-LAST:event_btn_cariActionPerformed

    private void btn_bersihkan_pencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bersihkan_pencarianActionPerformed
        bersihkanKolomPencarian();
        tampilkanTableObat("");
    }//GEN-LAST:event_btn_bersihkan_pencarianActionPerformed

    private void menu_riwayat_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_riwayat_transaksiActionPerformed
        new transaksi().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menu_riwayat_transaksiActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new penjualan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bersihkan_pencarian;
    private javax.swing.JButton btn_bersihkan_table_penjualan;
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_jual;
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_kurang;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField kolom_nama_obat;
    private javax.swing.JButton menu_input_obat;
    private javax.swing.JButton menu_riwayat_transaksi;
    private javax.swing.JTable table_obat;
    private javax.swing.JTable table_penjualan;
    private javax.swing.JLabel tampil_jumlah;
    private javax.swing.JButton tombol_hapus;
    // End of variables declaration//GEN-END:variables

    private void tampilkanTableObat(String stmt) {
 
        if (stmt.isEmpty()) {
           stmt = "SELECT * FROM obat";
        }   
        
        int row = table_obat.getRowCount();
        for (int i = 0; i < row; i++) {
            model.removeRow(0);
        }
        
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/apotek","root","");
            ResultSet rs = cn.createStatement().executeQuery(stmt);
            while(rs.next() ){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(7),rs.getString(8) };
                model.addRow(data);
            }
        } catch (SQLException ex){
            System.out.print("" + ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    }
       
    private void tampilkanTablePenjualan() {
        int row = table_penjualan.getRowCount();      
        tampil_jumlah.setText("0");
        
        for (int i = 0; i < 50; i++) {
            table_penjualan.setValueAt("", i, 0);          
            table_penjualan.setValueAt("", i, 1);            
            table_penjualan.setValueAt("", i, 2);          
            table_penjualan.setValueAt("", i, 3);                  
        }
        
        try {
            int i = 0;
            int tampil_harga = 0;
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/apotek","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM penjualan");
            while(rs.next() ){
                
                tampil_harga += Integer.parseInt(rs.getString(4)) * Integer.parseInt(rs.getString(3));
                tampil_jumlah.setText("" + tampil_harga);
                       
                table_penjualan.setValueAt(rs.getString(1), i, 0);          
                table_penjualan.setValueAt(rs.getString(2), i, 1);            
                table_penjualan.setValueAt(rs.getString(3), i, 2);          
                table_penjualan.setValueAt(rs.getString(4), i, 3);
             i++;
            }
        } catch (SQLException ex){
            System.out.print("" + ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    private void hapusIsiTablePenjualan(){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/apotek","root","");
            cn.createStatement().executeUpdate("DELETE FROM `penjualan`");
            tampilkanTableObat("");
            tampilkanTablePenjualan();         
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }  
    }
    
    @Override
    public void query(String stmt,String error){
        super.query(stmt,error); 
        tampilkanTableObat("");
        tampilkanTablePenjualan(); 
    }
    
    private void bersihkanKolomPencarian(){
        kolom_nama_obat.setText("");
    }

    @Override
    public void cari(String stmt) {
        tampilkanTableObat(stmt);
        bersihkanKolomPencarian();
    }
}