/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.todolist;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.util.EventObject;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author aluno
 */
public class ButtonRenderer extends AbstractCellEditor implements TableCellEditor, TableCellRenderer {
    

   @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JButton b = new JButton("Delete");
        return b;
    }
        
   @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, final int row, int column) {
        JButton b = new JButton("Delete");
        b.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                ((DefaultTableModel)table.getModel()).removeRow(row);
            }
        });
        return b;
    }
      @Override
    public Object getCellEditorValue() {
        return null;
    }

    @Override
    public boolean isCellEditable(EventObject anEvent) {
        return true;
    }

    @Override
    public boolean shouldSelectCell(EventObject anEvent) {
        return true;
    }
}
