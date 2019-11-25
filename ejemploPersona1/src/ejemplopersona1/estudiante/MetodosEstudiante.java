package ejemplopersona1.estudiante;

import java.sql.Statement;
import java.util.Vector;
import java.util.ArrayList;

public class MetodosEstudiante {

    public Vector listaEstudiantes = new Vector();
    //Conexion enlazar = new Conexion();

    public void ingresar(Object x) {
        listaEstudiantes.add(x);
    }

   /* public void ingresaPersonaDB(DatosEstudiante dp) {
        String consulta = "";
        consulta = "INSERT INTO persona(identificador, nombre, appaterno, apmaterno)"
                + "values('12','" + dp.getNombre() + "' ,'" + dp.getApPaterno() + "','" + dp.getApMaterno() + "') ";

        try {

            Statement st = enlazar.Conectar().createStatement();
            st.executeUpdate(consulta);
            st.close();
            enlazar.Conectar().close();
            System.out.println("Llamada agregada con éxito a la base de datos.");
        } catch (Exception e) {
            System.out.println("Error!, la llamada no pudo ser.");
            System.out.println("" + e.getMessage());
        }
    }*/
}
