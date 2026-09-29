package secao10_arrays_listas.exercicios_arrays.desafio_pensionato.entities;

public class Rent {
    private String name;
    private String email;
    private int room;

    public Rent(String name, String email,int room){
        this.name = name;
        this.email = email;
        this.room = room;
    }

    @Override
    public String toString(){
        return name + ", " + email;
    }

}
