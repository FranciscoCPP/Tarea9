package principal.tarea9;

import clases.tarea9.Coche;
import clases.tarea9.CocheCRUDImpl;
import interfaz.tarea9.CocheCRUD;
import java.util.Objects;

import java.util.stream.Collectors;

public class Tarea9 {


    public static void main(String[] args) {




        Coche c1 = new Coche("ZXCD456-1","Toyota","Yaris");
        Coche c2 = new Coche("AXDF900-4","Ferrari","Jaguar");
        Coche c3 = new Coche("WWVXZ999-7","Tesla","NiIdea");

        CocheCRUD cc = new CocheCRUDImpl();

        cc.save(c1);
        cc.save(c2);
        cc.save(c3);


        System.out.println("Lista de coches");
        cc.findAll();

        System.out.println("eliminamos uno");
        cc.delete(c2);

        System.out.println("Nueva lista de coches");
        cc.findAll();

    }


}
