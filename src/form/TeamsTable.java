package form;

import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import model.TeamsTableModel;
import nba.City;
import nba.NBATeam;
import repository.TeamsRepository;

public class TeamsTable extends javax.swing.JFrame {

    public TeamsTable() {
        initComponents();
        prepareTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTeams = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tblTeams.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "City", "Conference", "No of championships", "Is in playoffs"
            }
        ));
        jScrollPane1.setViewportView(tblTeams);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        TeamsRepository studentRepository = new TeamsRepository();
        ArrayList<NBATeam> teams = studentRepository.getTeams();

        TableModel tm = tblTeams.getModel();
        DefaultTableModel dtm = (DefaultTableModel) tm;
//        uopste nece da konvertuje u moj model
//        TeamsTableModel ttm = (TeamsTableModel)tblTeams.getModel();
        for (NBATeam team : teams) {
            Object[] row = new Object[6];
            row[0] = team.getName();
            row[1] = team.getCity();
            row[2] = team.getConference();
            row[3] = team.getNumberOfTitles();
            row[4] = team.isInPlayOffs();
//            ttm.addRow(row);
            dtm.addRow(row);
        }
    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTeams;
    // End of variables declaration//GEN-END:variables

    private void prepareTable() {
        TeamsRepository tr = new TeamsRepository();
        //ka uradim ovo dle odma mi samo inicijalizuje tabelu
//        tblTeams.setModel(new TeamsTableModel(tr.getTeams()));
//       ni ovaj kod mi nista nije radio
//        TeamsTableModel ttm = new TeamsTableModel(tr.getTeams());
        TableColumnModel tcm = tblTeams.getColumnModel();
        TableColumn tc = tcm.getColumn(1);
        TableCellEditor tce = new DefaultCellEditor(getComboBox());
        tc.setCellEditor(tce);
    }

    private JComboBox getComboBox() {
        JComboBox<City> cb = new JComboBox();
        cb.addItem(City.NYC);
        cb.addItem(City.BOSTON);
        cb.addItem(City.BROOKLYN);
        cb.addItem(City.CHICAGO);
        cb.addItem(City.LA);
        cb.addItem(City.PHILADELPHIA);
        cb.addItem(City.SAN_ANTONIO);
        cb.addItem(City.SACRAMENTO);
        return cb;
    }

}
