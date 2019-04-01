package sample;

import java.util.ArrayList;

public class Artikal {

    private String sifra;
    private String naziv;
    private Double cijena;

    public String toString() {
        return sifra + ", " + naziv + ", " + cijena;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
        if (sifra == null){
            throw new IllegalArgumentException();
        }
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
        if (naziv == null){
            throw new IllegalArgumentException();
        }
    }

    public void setCijena(Double cijena) {
        this.cijena = cijena;
        if (cijena <= 0){
            throw new IllegalArgumentException();
        }
    }

    public String getSifra() {
        return sifra;

    }

    public String getNaziv() {
        return naziv;
    }

    public Double getCijena() {
        return cijena;
    }

    public boolean equals(Object o){
        Artikal artikal = (Artikal)o;
        int i, j, temp = 0;

        for (i = 0; i < size(); i++){
            if (j = 0; j < size(); j++{
                if (j = i){
                    continue;
                }
                else if (cijena[j] == cijena[i]){
                    return false;
                }
            }
        }
        return true;

    }


    public static ArrayList izbaciDuplikate(ArrayList object){
        object.equals(object);
        return object;
        )

    }
}
