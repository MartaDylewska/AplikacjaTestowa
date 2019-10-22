package bssdfbds;

import java.util.ArrayList;
import java.util.Arrays;

    public class Ekstencja {

        static class Samochod{

            static ArrayList<Samochod> ekstencja = new ArrayList<>();
            private String marka;

            Samochod(String marka){
                this.marka = marka;
                dodajDoEkstencji();
            }

            private void dodajDoEkstencji(){
                ekstencja.add(this);
            }

            @Override
            public String toString(){
                return "Samochód " + marka;
            }
        }

        public static void main(String[] args) {

            Samochod samochod1 = new Samochod("Audi");
            Samochod samochod2 = new Samochod("Toyota");
            Samochod samochod3 = new Samochod("Opel");

            System.out.println(Arrays.toString(Samochod.ekstencja.toArray()));
        }
}
