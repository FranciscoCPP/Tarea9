package clases.tarea9;

public class Coche {

private String patente;
private String marca;
private String modelo;


public Coche(){

}
public Coche(String ptnt,String mrc,String mdl){

    this.patente = ptnt;
    this.marca = mrc;
    this.modelo = mdl;

}

public String getPatente(){
    return this.patente;
}

public String getMarca(){
    return this.marca;
}

public String getModelo(){
    return this.modelo;
}


}
