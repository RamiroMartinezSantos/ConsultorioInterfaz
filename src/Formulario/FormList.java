package Formulario;

import Pojo.Cita;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;

public class FormList extends JFrame {
    private JTable jTable;
    private DefaultTableModel modelo;
    private JPanel panelContainer, panelButton;
    private JButton btnQuery;


    public FormList (){
        initControl();
        configTable();
        configFrame();
        setControl();
        configPanel();
        query();
    }

    private void query(){
        btnQuery.addActionListener(e -> {
            Formulario formulario = new Formulario();
            formulario.setVisible(true);
            this.setVisible(false);
        });
    }

    private void initControl(){
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(Titulos.titulos);
        String [] fila = new String[11];
        ArrayList<Cita> lista = Formulario.getElemento();
        for (Cita userTable : lista) {
            fila[0] = userTable.getNombrePaciente();
            fila[1] = userTable.getApellidoPaterno();
            fila[2] = userTable.getApellidoMaterno();
            fila[3] = userTable.getEdad();
            fila[4] = userTable.getMotivo();
            fila[5] = userTable.getNombreMedico();
            fila[6] = userTable.getHoraCita();
            fila[7] = userTable.getFechaCita();
            fila[8] = userTable.getTelefono();
            fila[9] = userTable.getCorreo();
            fila[10] = userTable.getSexo();

            modelo.addRow(fila);
        }
        panelButton = new JPanel();
        panelContainer = new JPanel();
        btnQuery = new JButton();
        jTable = new JTable(modelo);
    }

    private void setControl(){
        btnQuery.setText("Regresar");
    }
    private void configPanel(){

        panelButton.setLayout(new FlowLayout());
        panelButton.setPreferredSize(new Dimension(150, 50));
        panelButton.add(btnQuery);

        panelContainer.setLayout(new GridLayout(4, 0));
        panelContainer.add(panelButton);

        add(panelContainer);
    }

    private void configFrame(){
        setTitle("Tabla de usuarios");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(850, 200);
    }

    private void configTable(){
        jTable.setGridColor(new Color(88, 214, 141));
        jTable.setPreferredScrollableViewportSize(new Dimension(800, 70));
        JScrollPane scrollPane = new JScrollPane(jTable);
        getContentPane().add(scrollPane, BorderLayout.CENTER);
    }
}