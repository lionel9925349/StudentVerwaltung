



    // class Leistung
    public class Leistung {
        public  Modulen modul;               // attribut modul
        public String prüfer;                // attribut prüfer
        public double ergebnis_in_Prozent;   // attribut ergebnis_in_Prozent

        //  Konstruktor einer Leistung
        public Leistung(Modulen modul , String Prüfer , double Ergebnis_in_Prozent ){
            this.modul = modul;
            this.prüfer = Prüfer;
            this.ergebnis_in_Prozent = Ergebnis_in_Prozent;
        }
        // Formatierung der Class Leistung
        public String toString(){
            return "   " + modul + "\n" +
                    "Prüfer : " + prüfer + "\n" +
                    "ergebnis in Prozent : " + ergebnis_in_Prozent +
                    "                       " + "\n"
                    ;

        }


    }

