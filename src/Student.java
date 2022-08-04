




import java.util.ArrayList;
// die class Student mit seinen Attributen

    public class Student {
        public int MatrNr;   // attribut Matrikul nummer
        public String Name;   // attribut Name
        public String Vorname;  // attribut Vorname
        public ArrayList<Leistung> Liste_der_Prüfungleistungen = new ArrayList<>() ; // eine Liste von Leistung




        // konstructor von class Student
        public Student(int MatrNr , String Name , String vorname , ArrayList<Leistung> Liste_der_Prüfungleistung){
            this.MatrNr = MatrNr;
            this.Name = Name;
            this.Vorname = vorname;
            this.Liste_der_Prüfungleistungen = Liste_der_Prüfungleistung;
            // ArrayList <Liste_der_Prüfungleistungen> liste_leistung = new ArrayList<Liste_der_Prüfungleistungen>();
        }

        // Formatierung der Class Student

        public String toString()
        {
            return "MatrNr : " + MatrNr + "\n" +
                    "Name : " + Name + "\n" +
                    "Vorname : " + Vorname + "\n" +
                    "Liste der Prüfungleistung : " + Liste_der_Prüfungleistungen + "\n" +
                    " +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++" + "\n"
                    ;

        }
        public void addLeistung(Leistung leistung1, Leistung leistung2, Leistung leistung3, Leistung neuLeistung){
            this.Liste_der_Prüfungleistungen.add(neuLeistung);
        }









    }


