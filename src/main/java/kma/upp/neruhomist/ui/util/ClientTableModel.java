package kma.upp.neruhomist.ui.util;

import kma.upp.neruhomist.model.Client;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class ClientTableModel extends AbstractTableModel {

    private static final String[] HEADERS = new String[]{"id", "Клієнт", "Тип особи", "Телефон"};

    private List<Client> clients;

    public ClientTableModel(List<Client> clients) {
        this.clients = clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public int getRowCount() {
        return clients.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0: return clients.get(row).getClientId();
            case 1: return clients.get(row).getSurname();
            case 2: return clients.get(row).getType();
            case 3: return clients.get(row).getPhone();
            default:return null;
        }
    }

    @Override
    public String getColumnName(int column) {
       return HEADERS[column];
    }

}
