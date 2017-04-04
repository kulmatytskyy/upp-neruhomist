package kma.upp.neruhomist.ui.util;

import kma.upp.neruhomist.model.Client;
import kma.upp.neruhomist.model.Contract;

import javax.swing.table.AbstractTableModel;
import java.util.Date;
import java.util.List;

public class ContractsTableModel extends AbstractTableModel {

    private static final String[] HEADERS = new String[]{"id", "Адреса", "Стан"};

    private List<Contract> data;

    public ContractsTableModel(List<Contract> data) {
        this.data = data;
    }

    public void setData(List<Contract> data) {
        this.data = data;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0: return data.get(row).getContractId();
            case 1: return data.get(row).getObject().getAddress();
            case 2: return data.get(row).getEndDate().before(new Date()) ? "активний" : "неактивний";
            default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
       return HEADERS[column];
    }

}
