




// class modul

    public class Modulen {
        public String modul;               // attribut modul
        public String Verantwortlicher;   // attribut verantwortlicher
        public int SWS;                  // attribut SWS
        public int Credits;

        public Modulen(String modul, String Verantwortlicher , int SWS , int Credits ){
            this.modul = modul;
            this.Verantwortlicher = Verantwortlicher;
            this.SWS = SWS;
            this.Credits = Credits;

        }

        // Formatierung der Class Modulen
        public String toString()
        {
            return "Modulname : " + modul + "\n"  +
                    "Verantwortlicher : "  + Verantwortlicher + "\n" +
                    "SWS : " + SWS +  "\n" +
                    "Credits : " + Credits +
                    "                       " + "\n"
                    ;

        }

    }

