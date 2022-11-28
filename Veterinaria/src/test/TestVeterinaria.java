package test;

import org.jpl7.Query;
import org.jpl7.Term;

public class TestVeterinaria {
    public static void main(String[] args) {
        String t1 = "consult('Dogtor.pl')";//aqui colocan el nombre de su archivo a compilar
        Query con = new Query(t1);
        System.out.println(t1 + " " + (con.hasSolution() ? "verdadero" : "fallo")); //mostrara mensaje  si hay o no conexion
        String t2 = "diagnostico(Z,sed,temblores,perdidadepeso,duermemucho,poliuria)";
        Query q2 = new Query(t2);
        String nikki = "";
        if(q2.hasSolution()){
            //System.out.println("Entro");
            nikki = String.valueOf(q2.oneSolution().get("Z").toString());
            System.out.println("nikki = " + nikki);
        }
//        System.out.println("q2 = " + q2.oneSolution().get("E".toString()));
//        System.out.println(q2.oneSolution().get("E"));
    }
}
