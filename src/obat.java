
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class obat extends javax.swing.JFrame {
    
    String [] judul = {"kode Identitas","Nama Obat","Nama Merek","Kategori","Harga Beli","Jumlah Barang","Harga Jual","Kadaluarsa","Catatan"};
    DefaultTableModel model = new DefaultTableModel(judul,0);
    
    public obat() {
        initComponents();          
        setTitle("Mangemen Pengololaan Apotek");
        table_obat.setModel(model);
        tampilkan();
    }
 
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_obat = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        kolom_kode_identitas = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kolom_nama_obat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        kolom_nama_merek = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pilihan = new javax.swing.JComboBox<>();
        kolom_harga_beli = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kolom_jumlah_barang = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kolom_harga_jual = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        kolom_kadaluarsa = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        kolom_catatan = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        tombol_tambah = new javax.swing.JButton();
        tombol_edit = new javax.swing.JButton();
        tombol_hapus = new javax.swing.JButton();
        tombol_reset = new javax.swing.JButton();
        tombol_keluar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 204));

        table_obat.setBackground(new java.awt.Color(153, 153, 255));
        table_obat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        table_obat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode Identitas", "Nama Obat", "Nama Merek", "Kategori", "Harga Beli", "Jumlah Barang", "Harga Jual", "Kadaluarsa", "Catatan"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
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

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Kode Identitas");
        jLabel6.setToolTipText("");

        kolom_kode_identitas.setEditable(false);
        kolom_kode_identitas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kolom_kode_identitas.setText("\n");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Nama Obat");
        jLabel2.setToolTipText("");

        kolom_nama_obat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kolom_nama_obat.setText("\n");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nama Merek");
        jLabel3.setToolTipText("");

        kolom_nama_merek.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kolom_nama_merek.setText("\n");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Kategori");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Catatan");
        jLabel5.setToolTipText("");

        pilihan.setBackground(new java.awt.Color(204, 204, 255));
        pilihan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pilihan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cair", "Tablet", "Kapsul" }));
        pilihan.setBorder(null);

        kolom_harga_beli.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kolom_harga_beli.setText("\n");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Rp");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Harga Beli");
        jLabel8.setToolTipText("");

        kolom_jumlah_barang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kolom_jumlah_barang.setText("\n");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Rp");
        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Jumlah Barang");
        jLabel10.setToolTipText("");

        kolom_harga_jual.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kolom_harga_jual.setText("\n");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Harga Jual");
        jLabel11.setToolTipText("");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Rp");
        jLabel12.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Kadaluarsa");
        jLabel13.setToolTipText("");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 255, 204));
        jLabel14.setText("Apotekers");

        kolom_catatan.setColumns(20);
        kolom_catatan.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        kolom_catatan.setRows(5);
        jScrollPane2.setViewportView(kolom_catatan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addComponent(jLabel2)
                        .addComponent(kolom_nama_obat)
                        .addComponent(jLabel3)
                        .addComponent(kolom_nama_merek)
                        .addComponent(kolom_kode_identitas)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel8)
                        .addComponent(pilihan, 0, 154, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(jLabel13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(kolom_kadaluarsa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(kolom_harga_jual, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(kolom_harga_beli, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(kolom_jumlah_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kolom_kode_identitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kolom_nama_obat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kolom_nama_merek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pilihan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(kolom_harga_beli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(kolom_jumlah_barang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(kolom_harga_jual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kolom_kadaluarsa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 0, 102));

        tombol_tambah.setBackground(new java.awt.Color(0, 255, 0));
        tombol_tambah.setText("Tambah");
        tombol_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_tambahActionPerformed(evt);
            }
        });

        tombol_edit.setBackground(new java.awt.Color(255, 255, 0));
        tombol_edit.setText("Edit");
        tombol_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_editActionPerformed(evt);
            }
        });

        tombol_hapus.setBackground(new java.awt.Color(204, 0, 0));
        tombol_hapus.setText("Hapus");
        tombol_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_hapusActionPerformed(evt);
            }
        });

        tombol_reset.setBackground(new java.awt.Color(102, 255, 255));
        tombol_reset.setText("Bersihkan");
        tombol_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_resetActionPerformed(evt);
            }
        });

        tombol_keluar.setBackground(new java.awt.Color(153, 255, 204));
        tombol_keluar.setText("Keluar");
        tombol_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombol_keluarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 204));
        jLabel1.setText("Barang");

        jLabel15.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 255, 204));
        jLabel15.setText("Input");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel1))
                    .addComponent(jLabel15)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tombol_tambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tombol_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tombol_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombol_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tombol_keluar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(tombol_tambah)
                .addGap(18, 18, 18)
                .addComponent(tombol_edit)
                .addGap(18, 18, 18)
                .addComponent(tombol_hapus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tombol_reset)
                .addGap(18, 18, 18)
                .addComponent(tombol_keluar)
                .addContainerGap(333, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Tekton Pro Cond", 0, 16)); // NOI18N
        jButton1.setText("Penjualan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 153));
        jButton2.setFont(new java.awt.Font("Tekton Pro Cond", 0, 16)); // NOI18N
        jButton2.setText("Riwayat  Tranksaksi");

        jLabel16.setFont(new java.awt.Font("Tekton Pro Cond", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 255, 204));
        jLabel16.setText("Menu");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tombol_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_tambahActionPerformed
    String namaObat = kolom_nama_obat.getText();
    String namaMerek = kolom_nama_merek.getText();
    String kategori = "kategori";
         
    switch(pilihan.getSelectedIndex()){
            case 0:
                kategori = "cair";
                break;
            case 1:                
                kategori = "tablet";
                break;
            case 2:                
                kategori = "kapsul";
                break; 
    }   
    
    int hargaBeli = Integer.parseInt(kolom_harga_beli.getText());
    int jumlahBarang = Integer.parseInt(kolom_jumlah_barang.getText());
    int hargaJual = Integer.parseInt(kolom_harga_jual.getText());
    
    //merubah dari kolom kadaluarsa ke database
    String tgl = "yyyy-MM-dd";
    SimpleDateFormat fm = new SimpleDateFormat(tgl);
    String tanggal = String.valueOf(fm.format(kolom_kadaluarsa.getDate()));
    
    String catatan = kolom_catatan.getText();
    
    try {          
         Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/apotek","root","");
         cn.createStatement().executeUpdate("INSERT INTO `obat` (`id`, `nama_obat`, `nama_merek`, `kategori`, `harga_beli`, `jumlah_barang`, `harga_jual`, `expire`, `catatan`) VALUES (NULL, '"+namaObat+"', '"+namaMerek+"', '"+kategori+"', '"+hargaBeli+"', '"+jumlahBarang+"', '"+hargaJual+"', '"+tanggal+"', '"+catatan+"')");           
         bersihkan();
         tampilkan();
       } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null,ex);
       }
    }//GEN-LAST:event_tombol_tambahActionPerformed

    private void tombol_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_editActionPerformed
        try {
            String kodeIdentitas = kolom_kode_identitas.getText();
            String namaObat = kolom_nama_obat.getText();
            String namaMerek = kolom_nama_merek.getText();
            String kategori = "kategori";
            
            switch(pilihan.getSelectedIndex()){
            case 0:
                kategori = "cair";
                break;
            case 1:                
                kategori = "tablet";
                break;
            case 2:                
                kategori = "kapsul";
                break;
            }
            
            int hargaBeli = Integer.parseInt(kolom_harga_beli.getText());
            int jumlahBarang = Integer.parseInt(kolom_jumlah_barang.getText());
            int hargaJual = Integer.parseInt(kolom_harga_jual.getText());
            //merubah dari kolom kadaluarsa ke database
            String tgl = "yyyy-MM-dd";
            SimpleDateFormat fm = new SimpleDateFormat(tgl);
            String tanggal = String.valueOf(fm.format(kolom_kadaluarsa.getDate()));
            String catatan = kolom_catatan.getText();
      
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/apotek","root","");
            cn.createStatement().executeUpdate("UPDATE `obat` SET `nama_obat` = '"+namaObat+"', `nama_merek` = '"+namaMerek+"', `kategori` = '"+kategori+"', `harga_beli` = '"+hargaBeli+"', `jumlah_barang` = '"+jumlahBarang+"', `harga_jual` = '"+hargaJual+"', `expire` = '"+tanggal+"', `catatan` = '"+ catatan +"' WHERE `obat`.`id` = '"+kodeIdentitas+"'");
            bersihkan();
            tampilkan();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_tombol_editActionPerformed

    private void tombol_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_hapusActionPerformed
        try {
            String id = kolom_kode_identitas.getText();
            
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/apotek","root","");
            cn.createStatement().executeUpdate("DELETE FROM `obat` WHERE `obat`.`id` = '" +id+ "'");
            tampilkan();
            bersihkan();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_tombol_hapusActionPerformed

    private void tombol_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_resetActionPerformed
       bersihkan();
    }//GEN-LAST:event_tombol_resetActionPerformed

    private void table_obatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_obatMouseClicked
        int i = table_obat.getSelectedRow();

        if (i>-1) {
            kolom_kode_identitas.setText(model.getValueAt(i, 0).toString());
            kolom_nama_obat.setText(model.getValueAt(i, 1).toString());
            kolom_nama_merek.setText(model.getValueAt(i, 2).toString());
            String opsi = model.getValueAt(i, 3).toString();
            
            switch(opsi){
            case "cair":               
                pilihan.setSelectedIndex(0); 
                break;
            case "tablet":
                pilihan.setSelectedIndex(1);
                break;
            case "kapsul":
                pilihan.setSelectedIndex(2);
                break;           
            }
            kolom_harga_beli.setText(model.getValueAt(i, 4).toString());
            kolom_jumlah_barang.setText(model.getValueAt(i, 5).toString());
            kolom_harga_jual.setText(model.getValueAt(i, 6).toString());
            
            //merubah database/table ke kalom_kadaluarsa           
            Date tanggal = Date.valueOf(model.getValueAt(i, 7).toString());
            kolom_kadaluarsa.setDate(tanggal);
            kolom_catatan.setText(model.getValueAt(i, 8).toString());
        }
    }//GEN-LAST:event_table_obatMouseClicked

    private void tombol_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombol_keluarActionPerformed
        // keluar
        System.exit(0);
    }//GEN-LAST:event_tombol_keluarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new obat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea kolom_catatan;
    private javax.swing.JTextField kolom_harga_beli;
    private javax.swing.JTextField kolom_harga_jual;
    private javax.swing.JTextField kolom_jumlah_barang;
    private com.toedter.calendar.JDateChooser kolom_kadaluarsa;
    private javax.swing.JTextField kolom_kode_identitas;
    private javax.swing.JTextField kolom_nama_merek;
    private javax.swing.JTextField kolom_nama_obat;
    private javax.swing.JComboBox<String> pilihan;
    private javax.swing.JTable table_obat;
    private javax.swing.JButton tombol_edit;
    private javax.swing.JButton tombol_hapus;
    private javax.swing.JButton tombol_keluar;
    private javax.swing.JButton tombol_reset;
    private javax.swing.JButton tombol_tambah;
    // End of variables declaration//GEN-END:variables

    private void tampilkan() {
 
        int row = table_obat.getRowCount();
        for (int i = 0; i < row; i++) {
            model.removeRow(0);
        }
        
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/apotek","root","");
            ResultSet rs = cn.createStatement().executeQuery("Select * From obat");
            while(rs.next() ){
                String data [] = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9) };
                model.addRow(data);
            }
        } catch (SQLException ex){
            System.out.print("" + ex);
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    private void bersihkan(){
        kolom_kode_identitas.setText("");
        kolom_nama_obat.setText("");
        kolom_nama_merek.setText("");             
        kolom_harga_beli.setText("");
        kolom_jumlah_barang.setText("");
        kolom_harga_jual.setText("");
        kolom_kadaluarsa.setDateFormatString("");
        kolom_catatan.setText("");
    }
}