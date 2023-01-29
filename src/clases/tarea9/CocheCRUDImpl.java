package clases.tarea9;

import interfaz.tarea9.CocheCRUD;


import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD {


    List<Coche> coches = new ArrayList<Coche>();



    public void save(Coche c){

        this.coches.add(c);


    }

    public void findAll(){

        for (Coche c : this.coches){

            System.out.println(c.getPatente() + " " + c.getMarca() + " " + c.getModelo());
        }


    }

    public void delete(Coche c){

        this.coches.remove(c);

    }


}
