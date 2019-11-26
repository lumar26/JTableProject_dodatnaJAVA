
package model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import nba.City;
import nba.NBATeam;


public  class TeamsTableModel extends AbstractTableModel{
    private ArrayList<NBATeam> teams;

    public TeamsTableModel(ArrayList<NBATeam> teams) {
        this.teams = teams;
    }
    
    
    @Override
    public int getRowCount() {
       return teams == null ? 0 : this.teams.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        NBATeam team = teams.get(rowIndex);
        switch (columnIndex){
            case 0: return team.getName();
            case 1: return team.getCity();
            case 2: return team.getConference();
            case 3: return team.getNumberOfTitles();
            case 4: return team.isInPlayOffs();
            default: return "You entered field that does not exist";
        }
    }
    
    public void addRow(Object[] o){
        
    }
    
}
