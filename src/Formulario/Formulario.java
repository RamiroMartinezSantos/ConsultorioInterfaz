package Formulario;

import Pojo.Cita;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Formulario extends JFrame implements ChangeListener, ActionListener {
    private ButtonGroup buttonGroup,buttonGroup2,buttonGroup3,buttonGroup4;
    private JPanel panel1,panel2,panel3,panel4,panelForm,panelContainer,panelRadio,panelButton,panelRadio2,panelRadio3;
    private JLabel blanco2,blanco3,blanco4,blanco5,blanco6,blanco7,blanco8,blanco9,blanco10,sexo,pCita,datosPersonales,nombrePaciente,apellidoPaterno,apellidoMaterno,edad,motivo,nombreMedico,horaCita,fechaCita,telefono,correo;
    private JTextField text0,text1,text2,text3,text4,text5,text6,text7,text8,text9;
    private JButton aceptar,consultar;
    private JRadioButton cSi,cNo, hombre,mujer,dSi,dNo,tSi,tNo,coSi,coNo;

    private static ArrayList<Cita> lista = new ArrayList<>();
    EventClick eventClick = new EventClick();

    public Formulario() {
        initControl();
        configFrame();
        setControl();
        configPanel();
        query();


        cSi.addChangeListener(this);
        cNo.addChangeListener(this);
        tSi.addChangeListener(this);
        tNo.addChangeListener(this);
        coSi.addChangeListener(this);
        coNo.addChangeListener(this);
    }

    private void query(){
        consultar.addActionListener(e -> {
            FormList formList = new FormList();
            formList.setVisible(true);
            this.setVisible(false);
        });
    }

    private void initControl(){
        buttonGroup = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        buttonGroup3 = new ButtonGroup();
        buttonGroup4 = new ButtonGroup();

        panelButton = new JPanel();

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel4 = new JPanel();
        panelForm = new JPanel();
        panelContainer = new JPanel();
        panelRadio = new JPanel();
        panelRadio2 = new JPanel();
        panelRadio3 = new JPanel();

        blanco2 = new JLabel("");
        blanco3 = new JLabel("");
        blanco4 = new JLabel("");
        blanco5 = new JLabel("");
        blanco6 = new JLabel("");
        blanco7 = new JLabel("");
        blanco8 = new JLabel("");
        blanco9 = new JLabel("");
        blanco10 = new JLabel("");
        sexo = new JLabel();
        pCita = new JLabel();
        datosPersonales = new JLabel();
        nombrePaciente = new JLabel();
        apellidoPaterno = new JLabel();
        apellidoMaterno = new JLabel();
        edad = new JLabel();
        motivo = new JLabel();
        nombreMedico = new JLabel();
        horaCita = new JLabel();
        fechaCita = new JLabel();
        telefono = new JLabel();
        correo = new JLabel();

        text0 = new JTextField();
        text1 = new JTextField();
        text2 = new JTextField();
        text3 = new JTextField();
        text4 = new JTextField();
        text5 = new JTextField();
        text6 = new JTextField();
        text7 = new JTextField();
        text8 = new JTextField();
        text9 = new JTextField();

        aceptar = new JButton();
        consultar = new JButton();

        cSi = new JRadioButton();
        cNo = new JRadioButton();
        hombre = new JRadioButton();
        mujer = new JRadioButton();
        dSi = new JRadioButton();
        dNo = new JRadioButton();
        tSi = new JRadioButton();
        tNo = new JRadioButton();
        coSi = new JRadioButton();
        coNo = new JRadioButton();
    }

    public void configFrame(){
        setTitle("Agendar cita");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);
        setSize(600, 550);
    }

    public void setControl(){
        sexo.setText("Sexo");
        pCita.setText("¿Primera cita?");
        cSi.setText("Si");
        cNo.setText("No");
        datosPersonales.setText("Datos personales");
        nombrePaciente.setText("Nombre del paciente");
        apellidoPaterno.setText("Apellido paterno");
        apellidoMaterno.setText("Apellido materno");
        edad.setText("Edad");
        motivo.setText("Motivo de la cita");
        nombreMedico.setText("Nombre del medico");
        horaCita.setText("Hora de la cita");
        fechaCita.setText("Fecha de la cita");
        telefono.setText("Telefono");
        correo.setText("Correo");
        aceptar.setText("Guardar");
        consultar.setText("Consultar");
        hombre.setText("Hombre");
        mujer.setText("Mujer");
        dSi.setText("Si");
        dNo.setText("No");
        tSi.setText("Si");
        tNo.setText("No");
        coSi.setText("Si");
        coNo.setText("No");
    }

    public void configPanel(){
        panel1.setLayout(new GridLayout(22,2));
        panel1.add(pCita);
        panel1.add(panelButton);
        buttonGroup.add(cSi);
        buttonGroup.add(cNo);
        panel1.add(cSi);
        panel1.add(cNo);

        panel1.add(datosPersonales);
        panel1.add(nombrePaciente);
        panel1.add(apellidoPaterno);
        panel1.add(apellidoMaterno);
        panel1.add(edad);

        panel1.add(sexo);
        buttonGroup3.add(hombre);
        buttonGroup3.add(mujer);
        panel1.add(hombre);
        panel1.add(mujer);
        panel1.add(motivo);

        panel1.add(nombreMedico);
        panel1.add(horaCita);
        panel1.add(fechaCita);

        panel1.add(telefono);

        panel1.add(tSi);
        panel1.add(tNo);
        buttonGroup2.add(tSi);
        buttonGroup2.add(tNo);

        panel1.add(correo);
        buttonGroup4.add(coSi);
        buttonGroup4.add(coNo);
        panel1.add(coSi);
        panel1.add(coNo);

        panel2.setLayout(new GridLayout(22,4));

        panel2.add(blanco2);
        panel2.add(blanco3);
        panel2.add(blanco4);
        panel2.add(blanco5);
        panel2.add(text0);
        panel2.add(text1);
        panel2.add(text2);
        panel2.add(text3);

        panel2.add(blanco6);
        panel2.add(blanco7);
        panel2.add(blanco8);
        panel2.add(text4);
        panel2.add(text5);
        panel2.add(text6);
        panel2.add(text7);
        panel2.add(text8);

        panel2.add(blanco9);
        panel2.add(blanco10);
        panel2.add(text9);

        panelButton.setLayout(new FlowLayout());
        panelButton.setPreferredSize(new Dimension(60, 40));
        panelButton.add(aceptar);
        aceptar.addActionListener(eventClick);
        panelButton.add(consultar);

        panelForm.setLayout(new GridLayout(1, 1));
        panelForm.setPreferredSize(new Dimension(500, 400));
        panelForm.add(panel1);
        panelForm.add(panel2);
        panelForm.add(panel3);

        panelContainer.setLayout(new BoxLayout(panelContainer, BoxLayout.Y_AXIS));
        panelContainer.add(panelRadio);
        panelContainer.add(panelForm);
        panelContainer.add(panelRadio2);
        panelContainer.add(panelRadio3);
        panelContainer.add(panelButton);

        add(panelContainer);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if(cNo.isSelected()){
            text0.setEnabled(false);
            text1.setEnabled(false);
            text2.setEnabled(false);
            text3.setEnabled(false);
            text8.setEnabled(false);
            text9.setEnabled(false);
        }
        if(cSi.isSelected()){
            text0.setEnabled(true);
            text1.setEnabled(true);
            text2.setEnabled(true);
            text3.setEnabled(true);
            text8.setEnabled(true);
            text9.setEnabled(true);
        }

        if(tNo.isSelected()){
            text8.setEnabled(false);
        }
        if(tSi.isSelected()){
            text8.setEnabled(true);
        }

        if(coNo.isSelected()){
            text9.setEnabled(false);
        }
        if(coSi.isSelected()){
            text9.setEnabled(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public class EventClick implements ActionListener {
        public EventClick(){
            lista = new ArrayList<>();
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombrePaciente = text0.getText();
            String apellidoPaterno = text1.getText();
            String apellidoMaterno = text2.getText();
            String edad = text3.getText();
            String motivo = text4.getText();
            String nombreMedico = text5.getText();
            String horaCita = text6.getText();
            String fechaCita = text7.getText();
            String telefono = text8.getText();
            String correo = text9.getText();
            String sexo = String.valueOf(buttonGroup3.getSelection());

            lista.add((new Cita(nombrePaciente,apellidoPaterno,apellidoMaterno,edad,motivo,nombreMedico,horaCita,fechaCita,telefono,correo,sexo)));

            text0.setText(" ");
            text1.setText(" ");
            text2.setText(" ");
            text3.setText(" ");
            text4.setText(" ");
            text5.setText(" ");
            text6.setText(" ");
            text7.setText(" ");
            text8.setText(" ");
            text9.setText(" ");
        }
    }

    public static ArrayList<Cita> getElemento(){
        return lista;
    }
}
