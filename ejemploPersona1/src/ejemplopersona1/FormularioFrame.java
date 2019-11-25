package ejemplopersona1;

import Carros.MetodosDocente;
import Carros.DatosDocente;
import Cursos.DatosCursos;
import Cursos.MetodosCursos;
import ejemplopersona1.estudiante.DatosEstudiante;
import ejemplopersona1.estudiante.MetodosEstudiante;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Vector;

public class FormularioFrame extends JFrame {

    MetodosEstudiante captura = new MetodosEstudiante();
    MetodosCursos capturaCursos = new MetodosCursos();
    MetodosDocente capturaDocente = new MetodosDocente();
    

    JLabel lb_nombreCurso    = new JLabel("Nombre Curso: ");
    JLabel lb_Horas          = new JLabel("Num. Horas: ");
    JLabel lb_Creditos       = new JLabel("Num. Creditos: ");
    JLabel lb_Nota           = new JLabel("Nota: ");
    JLabel lb_Docente        = new JLabel("Docente: ");
    JLabel lb_numUnidades    = new JLabel("Num. Unidades: ");

    JTextField txt_nombreCurso = new JTextField();
    JTextField txt_numHoras    = new JTextField();
    JTextField txt_numCreditos = new JTextField();
    JTextField txt_nota        = new JTextField();
    JTextField txt_docente     = new JTextField();
    JTextField txt_numUnidades = new JTextField();

    JLabel lb_nombre              = new JLabel("Nombre: ");
    JLabel lb_apPaterno           = new JLabel("Ap. Paterno: ");
    JLabel lb_apMaterno           = new JLabel("Ap. Materno: ");
    JLabel lb_codigo              = new JLabel("codigo: ");
    JLabel lb_direccion           = new JLabel("Direccion: ");
    JLabel lb_estadoCivil         = new JLabel("Estado Civil: ");
    JLabel lb_nacionalidad        = new JLabel("Nacionalidad: ");   
    JLabel lb_LugardeNacimiento   = new JLabel("Lugar de Nacimiento: ");
    JLabel lb_FechaNacimiento     = new JLabel("Fecha de Nacimiento: ");

    JTextField txt_apPaterno = new JTextField();
    JTextField txt_apMaterno = new JTextField();
    JTextField txt_direccion = new JTextField();
    String estado[]= {"Solter@","Casad@","Divorciad@","Viud@"};
    JComboBox txt_estadoCivil    = new JComboBox(estado);
    JTextField txt_nacionalidad  = new JTextField();
    JTextField txt_codigo        = new JTextField();
    JTextField txt_LugarNacimiento= new JTextField();
    JTextField txt_FechaNacimiento= new JTextField();
    
    JLabel lb_Nombre              = new JLabel("Nombre: ");
    JLabel lb_IDdocente           = new JLabel("IDdocente: ");
    JLabel lb_edad                = new JLabel("edad: ");
    JLabel lb_sexo                = new JLabel("Sexo: ");
    JLabel lb_EstadoCivil         = new JLabel("Estado Civil: ");
    JLabel lb_Email               = new JLabel("Email: ");
    JLabel lb_NumCelular          = new JLabel("Num. Celular: ");
    JLabel lb_lugardeNacimiento   = new JLabel("Lugar de Nacimiento: ");
    JLabel lb_fechaNacimiento     = new JLabel("Fecha de Nacimiento: ");
    
    JTextField txt_Nombre         = new JTextField();
    JTextField txt_IDdocente      = new JTextField();
    String genero[]= {"Masculino","Femenino"};
    JComboBox txt_sexo            = new JComboBox(genero);
    String estado1[]= {"Solter@","Casad@","Divorciad@","Viud@"};
    JComboBox txt_EstadoCivil    = new JComboBox(estado1);
    JTextField txt_Email          = new JTextField();
    JTextField txt_NumCelular     = new JTextField();
    JTextField txt_lugarNacimiento= new JTextField();
    JTextField txt_fechaNacimiento= new JTextField();
    JTextField txt_edad           = new JTextField();
    


    public FormularioFrame() {

        JMenuBar menuBar = new JMenuBar();

        JMenu menufile = new JMenu();
        JMenu menumant = new JMenu();
        JMenu menureporte = new JMenu();

        JMenuItem menureportevisualizar = new JMenuItem();
        JMenuItem menuFileExit = new JMenuItem();
        JMenuItem menumantingresar = new JMenuItem("");
        JMenuItem menumantingresarCurso = new JMenuItem("");
        JMenuItem menumantingresarDocente = new JMenuItem("");
        JMenuItem menuReporteCurso = new JMenuItem("");
        JMenuItem menuReporteEstudiantes = new JMenuItem("");
        JMenuItem menuReporteDocente = new JMenuItem("");

        JMenuItem menumanteliminar = new JMenuItem();

        menufile.setText("File");
        menuFileExit.setText("Exit");

        menureporte.setText("Reporte");
        menuReporteCurso.setText("Curso");
        menuReporteEstudiantes.setText("Estudiantes");
        menuReporteDocente.setText("Docente");
        

        menumant.setText("Mantenimiento");
        menumantingresar.setText("Registrar Estudiante");
        menumantingresarCurso.setText("Registrar Curso");
        menumantingresarDocente.setText("Registrar Docente");
        

        menumantingresar.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                
                JPanel pn1 = new JPanel(new GridLayout(1, 2));
                pn1.add(lb_Nombre);
                pn1.add(txt_Nombre);

                
                JPanel pn2 = new JPanel(new GridLayout(1, 2));
                pn2.add(lb_apPaterno);
                pn2.add(txt_apPaterno);

                JPanel pn3 = new JPanel(new GridLayout(1, 2));
                pn3.add(lb_apMaterno);
                pn3.add(txt_apMaterno);

                JPanel pn4 = new JPanel(new GridLayout(1, 2));
                pn4.add(lb_sexo);
                pn4.add(txt_sexo);

                JPanel pn5 = new JPanel(new GridLayout(1, 2));
                pn5.add(lb_codigo);
                pn5.add(txt_codigo);
                
                JPanel pn6 = new JPanel(new GridLayout(1, 2));
                pn6.add(lb_direccion);
                pn6.add(txt_direccion);
                
                JPanel pn7 = new JPanel(new GridLayout(1, 2));
                pn7.add(lb_estadoCivil);
                pn7.add(txt_estadoCivil);
                
                JPanel pn8 = new JPanel(new GridLayout(1, 2));
                pn8.add(lb_nacionalidad);
                pn8.add(txt_nacionalidad);
                
                JPanel pn9 = new JPanel(new GridLayout(1, 2));
                pn9.add(lb_LugardeNacimiento);
                pn9.add(txt_LugarNacimiento);
                
                JPanel pn10 = new JPanel(new GridLayout(1, 2));
                pn10.add(lb_FechaNacimiento);
                pn10.add(txt_FechaNacimiento);

                Object msg[] = {pn1, pn2, pn3, pn4, pn5, pn6, pn7, pn8, pn9, pn10};

                if (JOptionPane.showOptionDialog(null, msg, "ingresar Estudiante", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null) == JOptionPane.OK_OPTION) {

                    DatosEstudiante v = new DatosEstudiante();
                    v.setNombre(txt_Nombre.getText());
                    v.setApPaterno(txt_apPaterno.getText());
                    v.setApMaterno(txt_apMaterno.getText());
                    v.setCodigo(txt_codigo.getText());
                    v.setDireccion(txt_direccion.getText());                  
                    v.setEstadoCivil(""+txt_estadoCivil.getSelectedItem());
                    v.setNacionalidad(txt_nacionalidad.getText());  
                    v.setLugardeNacimiento(txt_LugarNacimiento.getText());
                    v.setFechaNacimiento(txt_FechaNacimiento.getText());
                    captura.ingresar(v);

                    JOptionPane.showMessageDialog(null, "Se Agrego Estudiante Con Exito !!", "Ingreso de Estudiantes", JOptionPane.INFORMATION_MESSAGE);

                }

            }
        }
        );

        menumantingresarCurso.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JPanel pn1 = new JPanel(new GridLayout(1, 2));
                pn1.add(lb_nombreCurso);
                pn1.add(txt_nombreCurso);

                JPanel pn2 = new JPanel(new GridLayout(1, 2));
                pn2.add(lb_Creditos);
                pn2.add(txt_numCreditos);

                JPanel pn3 = new JPanel(new GridLayout(1, 2));
                pn3.add(lb_Horas);
                pn3.add(txt_numHoras);
                
                JPanel pn4 = new JPanel(new GridLayout(1, 2));
                pn4.add(lb_Nota);
                pn4.add(txt_nota);
                
                JPanel pn5 = new JPanel(new GridLayout(1, 2));
                pn5.add(lb_Docente);
                pn5.add(txt_docente);
                
                JPanel pn6 = new JPanel(new GridLayout(1, 2));
                pn6.add(lb_numUnidades);
                pn6.add(txt_numUnidades);

                Object msg[] = {pn1, pn2, pn3, pn4, pn5, pn6};

                if (JOptionPane.showOptionDialog(null, msg, "ingresar Curso", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null) == JOptionPane.OK_OPTION) {

                    DatosCursos v = new DatosCursos();
                    v.setNombreCurso(txt_nombreCurso.getText());
                    v.setNumCreditos(Integer.parseInt(txt_numCreditos.getText()));
                    v.setNumHoras(Integer.parseInt(txt_numHoras.getText()));
                    v.setNota(Integer.parseInt(txt_nota.getText()));
                    v.setDocente(txt_docente.getText());
                    v.setNumUnidades(Integer.parseInt(txt_numUnidades.getText()));
                    capturaCursos.ingresarCursos(v);
                    

                    
                    JOptionPane.showMessageDialog(null, "Se Agrego Curso Con Exito !!", "Ingreso de Cursos", JOptionPane.INFORMATION_MESSAGE);

                }

            }
        }
        );
        menumantingresarDocente.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JPanel pn1 = new JPanel(new GridLayout(1, 2));
                pn1.add(lb_Nombre);
                pn1.add(txt_Nombre);

                JPanel pn2 = new JPanel(new GridLayout(1, 2));
                pn2.add(lb_IDdocente);
                pn2.add(txt_IDdocente);

                JPanel pn3 = new JPanel(new GridLayout(1, 2));
                pn3.add(lb_edad);
                pn3.add(txt_edad);
                
                JPanel pn4 = new JPanel(new GridLayout(1, 2));
                pn4.add(lb_sexo);
                pn4.add(txt_sexo);
                
                JPanel pn5 = new JPanel(new GridLayout(1, 2));
                pn5.add(lb_Email);
                pn5.add(txt_Email);
                
                JPanel pn6 = new JPanel(new GridLayout(1, 2));
                pn6.add(lb_NumCelular);
                pn6.add(txt_NumCelular);
                
                JPanel pn7 = new JPanel(new GridLayout(1, 2));
                pn7.add(lb_lugardeNacimiento);
                pn7.add(txt_lugarNacimiento);
                
                JPanel pn8 = new JPanel(new GridLayout(1, 2));
                pn8.add(lb_fechaNacimiento);
                pn8.add(txt_fechaNacimiento);
                
                JPanel pn9 = new JPanel(new GridLayout(1, 2));
                pn9.add(lb_EstadoCivil);
                pn9.add(txt_EstadoCivil);

                Object msg[] = {pn1, pn2, pn3, pn4, pn5, pn6, pn7, pn8, pn9};

                if (JOptionPane.showOptionDialog(null, msg, "ingresar Docente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null) == JOptionPane.OK_OPTION) {

                    DatosDocente v = new DatosDocente();
                    v.setNombre(txt_Nombre.getText());
                    v.setIDdocente(txt_IDdocente.getText());
                    v.setEdad(txt_edad.getText());
                    v.setSexo(""+txt_sexo.getSelectedItem());
                    v.setEstadoCivil(""+txt_EstadoCivil.getSelectedItem());
                    v.setEmail(txt_Email.getText());
                    v.setNumCelular(txt_NumCelular.getText());
                    v.setLugardeNacimiento(txt_lugarNacimiento.getText());
                    v.setFechaNacimiento(txt_fechaNacimiento.getText());
                    capturaDocente.ingresarDocente(v);
                    

                    
                    JOptionPane.showMessageDialog(null, "Se Agrego Docente Con Exito !!", "Ingreso de Docente", JOptionPane.INFORMATION_MESSAGE);

                }

            }
        }
        );
        menuReporteDocente.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String columnas[] = {"Nombre", "IDdocente", "Edad","Sexo","Email","NumCelular","LugarNacimiento","FechaNacimiento"};

                Object filas[][] = new Object[capturaDocente.listaDocente.size()][9];

                Vector nuevoVector = capturaDocente.listaDocente;

                for (int i = 0; i < nuevoVector.size(); i++) {

                    DatosDocente v = (DatosDocente) capturaDocente.listaDocente.get(i);

                    filas[i][0] = v.getNombre();
                    filas[i][1] = v.getIDdocente();
                    filas[i][2] = v.getEdad();
                    filas[i][3] = v.getSexo();
                    filas[i][4] = v.getEstadoCivil();
                    filas[i][5] = v.getEmail();
                    filas[i][6] = v.getNumCelular();
                    filas[i][7] = v.getLugardeNacimiento();
                    filas[i][8] = v.getFechaNacimiento();

                }

                JTable tabla = new JTable(filas, columnas);
                JScrollPane tabla1 = new JScrollPane(tabla);

                JPanel reporte = new JPanel();
                reporte.add(tabla1);

                Object msg[] = {reporte};
                
                JOptionPane.showMessageDialog(null, msg, "Reporte de Carro", JOptionPane.QUESTION_MESSAGE);

            }
        }
        );
        
        menuReporteEstudiantes.addActionListener
	 (
            new ActionListener() { 
                public void actionPerformed(ActionEvent e) {
                	                	
                String columnas[] = {"Nombre","apPaterno","apMaterno ","Codigo","Direccion","EstadoCivil","Nacionalidad","Lugar de Nacimiento","Fecha de Nacimiento"};
                	
 				Object filas[][] = new Object[captura.listaEstudiantes.size()][9];
 				               
                	Vector nuevoVector = captura.listaEstudiantes;
                	
                	for(int i= 0 ; i<nuevoVector.size() ; i++){
                       
                       DatosEstudiante v = (DatosEstudiante)captura.listaEstudiantes.get(i);
                	
                	
                		filas[i][0] = v.getNombre();
                                filas[i][1] = v.getApPaterno();
                		filas[i][2] = v.getApMaterno();
                		filas[i][3] = v.getCodigo();
                                filas[i][4] = v.getDireccion();
                                filas[i][5] = v.getEstadoCivil();
                                filas[i][6] = v.getNacionalidad();           
                                filas[i][7] = v.getLugardeNacimiento();
                                filas[i][8] = v.getFechaNacimiento();

                	}
                	
                JTable tabla = new JTable(filas,columnas);
                JScrollPane tabla1 = new JScrollPane(tabla);
                
                JPanel reporte = new JPanel();
                reporte.add(tabla1);
                
                
                Object msg[] = {reporte};
                	
                JOptionPane.showMessageDialog(null,msg,"Reporte de Estudiantes",JOptionPane.QUESTION_MESSAGE);
                
                    
                }
            }
        );
        menuReporteCurso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                 String columnas[] = {"NombreCurso","NumHoras","NumCreditos","Nota","Docente","NumUnidades"};
                	
 				Object filas[][] = new Object[capturaCursos.listaCursos.size()][6];
 				               
                	Vector nuevoVector = capturaCursos.listaCursos;
                	
                	for(int i= 0 ; i<nuevoVector.size() ; i++){
                       
                       DatosCursos v = (DatosCursos)capturaCursos.listaCursos.get(i);
                	
                	
                		filas[i][0] = v.getNombreCurso();
                		filas[i][1] = v.getNumHoras();
                		filas[i][2] = v.getNumCreditos();
                		filas[i][3] = v.getNota();
                		filas[i][4] = v.getDocente();
                                filas[i][5] = v.getNumUnidades();
                                
                	}
                	
                JTable tabla = new JTable(filas,columnas);
                JScrollPane tabla1 = new JScrollPane(tabla);
                
                JPanel reporte = new JPanel();
                reporte.add(tabla1);
                
                
                Object msg[] = {reporte};
                	
                JOptionPane.showMessageDialog(null,msg,"Reporte de Cursos",JOptionPane.QUESTION_MESSAGE);
                
            }
        });
        
        menufile.add(menuFileExit);
        menumant.add(menumantingresar);
        menumant.add(menumantingresarCurso);
        menumant.add(menumantingresarDocente);

        menureporte.add(menureporte);
        menureporte.add(menuReporteCurso);
        menureporte.add(menuReporteEstudiantes);
        menureporte.add(menuReporteDocente);

        menuBar.add(menufile);
        menuBar.add(menumant);
        menuBar.add(menureporte);

        setTitle("PROYECTO X POO");
        setJMenuBar(menuBar);
        setSize(new Dimension(600, 500));

    }

}
