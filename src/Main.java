
    /*
     * In Diesem Programm handelt sich um eine Studentenverwaltung und die folgende Auswertungeg
     * müssen durchgeführt werden
     * 1) Liste aller Studierenden
     * 2) Liste der erbrachten Leistungen eines Studierenden
     *
     *  3) pro Studierenden soll eine tabellarische Leistungsübersicht mit folgenden Angaben
     *  generiert werden können
     *    Durchschnittsleistung in Prozent (mit den Credit Points gewichtet) aller
     *  bestandenen Prüfungsleistungen
     * Anzahl der erreichten Credit Points aller bestandenen Prüfungsleistungen
     * Anzahl der nicht bestandenen Prüfungsleistungen
     * Pro Modul soll der Durchschnitt aller Leistungen (bestandene und nichtbestandene) ausgegeben werden.
     *   Die Auswertungen sollen nach Auswahl des Benutzers auf der Konsole in
     *  formatierter Form ausgegeben werden.
     *
     * @author: Herr noumi lionel ulrich
     *
     * @version: 1.0
     */

import java.util.ArrayList;
import java.util.Scanner;

// die Main methode

    public class Main {


        public static void main(String[] args) {


            // Ertsellung einer List von Student
            ArrayList<Student> list_von_Student = new ArrayList<>();
            // konstruktur von den 4 Modulen

            Modulen modul1 = new Modulen("math", "frau  just", 40, 6);
            Modulen modul2 = new Modulen("oop", "herr überall", 50, 6);
            Modulen modul3 = new Modulen("rnvs", "herr meyer", 40, 6);
            Modulen modul4 = new Modulen("NTG", "herr Batch", 50, 6);

            // Leistung von Student 1

            Leistung leistung1_1 = new Leistung(modul1, "herr bolsch", 45.98);
            Leistung leistung1_2 = new Leistung(modul2, "herr Herzberg", 46.45);
            Leistung leistung1_3 = new Leistung(modul3, "herr felix", 67.98);
            Leistung leistung1_4 = new Leistung(modul4, "herr moyo", 90.45);

            // Leistung von Student 2

            Leistung leistung2_1 = new Leistung(modul1, "herr bolsch", 67.98);
            Leistung leistung2_2 = new Leistung(modul2, "herr Herzberg", 86.45);
            Leistung leistung2_3 = new Leistung(modul3, "herr felix", 67.98);
            Leistung leistung2_4 = new Leistung(modul4, "herr moyo", 42.45);

            // Leistung von Student 3

            Leistung leistung3_1 = new Leistung(modul1, "herr bolsch", 94.98);
            Leistung leistung3_2 = new Leistung(modul2, "herr Herzberg", 66.45);
            Leistung leistung3_3 = new Leistung(modul3, "herr felix", 45.98);
            Leistung leistung3_4 = new Leistung(modul4, "herr moyo", 76.45);

            // Leistung von Student 4

            Leistung leistung4_1 = new Leistung(modul1, "herr bolsch", 50.98);
            Leistung leistung4_2 = new Leistung(modul2, "herr Herzberg", 34.45);
            Leistung leistung4_3 = new Leistung(modul3, "herr felix", 65.98);
            Leistung leistung4_4 = new Leistung(modul4, "herr moyo", 89.45);

            // Leistung von Student 5

            Leistung leistung5_1 = new Leistung(modul1, "herr bolsch", 23.98);
            Leistung leistung5_2 = new Leistung(modul2, "herr Herzberg", 43.45);
            Leistung leistung5_3 = new Leistung(modul3, "herr felix", 25.98);
            Leistung leistung5_4 = new Leistung(modul4, "herr moyo", 45.45);

            // Leistung von Student 6

            Leistung leistung6_1 = new Leistung(modul1, "herr bolsch", 84.98);
            Leistung leistung6_2 = new Leistung(modul2, "herr Herzberg", 56.45);
            Leistung leistung6_3 = new Leistung(modul3, "herr felix", 69.98);
            Leistung leistung6_4 = new Leistung(modul4, "herr moyo", 52.45);


            // konstruktor ein Student mit seinen eigaben Parameter
            Student student1 = new Student(11111, "noumi", "lionel", new ArrayList<Leistung>());
            Student student2 = new Student(22222, "munir", "ulrich", new ArrayList<Leistung>());
            Student student3 = new Student(33333, "adja", "felix", new ArrayList<Leistung>());
            Student student4 = new Student(44444, "nina", "hamsi", new ArrayList<Leistung>());
            Student student5 = new Student(55555, "mounie", "david", new ArrayList<Leistung>());
            Student student6 = new Student(66666, "eroku", "fally", new ArrayList<Leistung>());

            // Hinzufugent von student in der studenden list
            list_von_Student.add(student1);
            list_von_Student.add(student2);
            list_von_Student.add(student3);
            list_von_Student.add(student4);
            list_von_Student.add(student5);
            list_von_Student.add(student6);


            //jeder student bekommt seine Leistungen
            //Liste Leistungen von Student 1

            student1.Liste_der_Prüfungleistungen.add(leistung1_1);
            student1.Liste_der_Prüfungleistungen.add(leistung1_2);
            student1.Liste_der_Prüfungleistungen.add(leistung1_3);
            student1.Liste_der_Prüfungleistungen.add(leistung1_4);

            //Liste Leistungen von Student 2
            student2.Liste_der_Prüfungleistungen.add(leistung2_1);
            student2.Liste_der_Prüfungleistungen.add(leistung2_2);
            student2.Liste_der_Prüfungleistungen.add(leistung2_3);
            student2.Liste_der_Prüfungleistungen.add(leistung2_4);

            //Liste Leistungen von Student 3
            student3.Liste_der_Prüfungleistungen.add(leistung3_1);
            student3.Liste_der_Prüfungleistungen.add(leistung3_2);
            student3.Liste_der_Prüfungleistungen.add(leistung3_3);
            student3.Liste_der_Prüfungleistungen.add(leistung3_4);

            //Liste Leistungen von Student 4
            student4.Liste_der_Prüfungleistungen.add(leistung4_1);
            student4.Liste_der_Prüfungleistungen.add(leistung4_2);
            student4.Liste_der_Prüfungleistungen.add(leistung4_3);
            student4.Liste_der_Prüfungleistungen.add(leistung4_4);

            //Liste Leistungen von Student 5
            student5.Liste_der_Prüfungleistungen.add(leistung5_1);
            student5.Liste_der_Prüfungleistungen.add(leistung5_2);
            student5.Liste_der_Prüfungleistungen.add(leistung5_3);
            student5.Liste_der_Prüfungleistungen.add(leistung5_4);

            //Liste Leistungen von Student 6
            student6.Liste_der_Prüfungleistungen.add(leistung6_1);
            student6.Liste_der_Prüfungleistungen.add(leistung6_2);
            student6.Liste_der_Prüfungleistungen.add(leistung6_3);
            student6.Liste_der_Prüfungleistungen.add(leistung6_4);




            Scanner scan = new Scanner(System.in);
            int eingabe_von_benutzer = 0;
            int a = 1, b = 1;
            while (eingabe_von_benutzer != 5) {

                // die Startseite auf dem Konsol
                if (a > 0) {
                    System.out.println();
                    System.out.println(" Wilkommen bei der Studentenverwaltung von der THM Giessen ");
                    System.out.println(" ***** Wir freuen uns Sie zu sehen ******");
                    a--;
                }
                System.out.println();
                if (b > 0) {
                    System.out.println(" was kann ich für Sie tun ?");
                    b--;
                } else System.out.println(" kann ich noch was für Sie tun ?");
                System.out.println();
                System.out.println("  wählen Sie bitte eine den folgenden optionen");
                System.out.println(" 1) die liste aller Studierenden ausgeben");
                System.out.println(" 2) Liste der erbrachten Leistungen eines Studierenden ");
                System.out.println(" 3) möchten Sie eine tabellarische Leistungübersicht ");
                System.out.println(" 4) möchten Sie pro Modul der Durschnitt erhalten");
                System.out.println(" 5) möchten Sie der Programm beenden");

                eingabe_von_benutzer = scan.nextInt();

                if (eingabe_von_benutzer == 1) {
                    System.out.println(list_von_Student);
                }
                if (eingabe_von_benutzer == 2) {
                    System.out.println(" für welchen Student möchten Sie Leistung haben ?");
                    System.out.println(" es gibt 6 Studentent    wählen Sie bitte eine Zahl zwischen 1 und 6 ");
                    eingabe_von_benutzer = scan.nextInt();
                    eingabe_von_benutzer--;
                    System.out.println(list_von_Student.get(eingabe_von_benutzer).Liste_der_Prüfungleistungen);

                }

                if (eingabe_von_benutzer == 3) {
                    System.out.println(" -----------------------------------------------------------------------------------------------------------------------------");
                    System.out.println(" Matrnrm  " + "\t" + "\t" + " Durchschnittsleistung " + "\t" + "\t" + "Anzahl der erreichen Credit Points" + "\t" + "\t" + "Anzahl der nicht Bestandene ");

                    for (Student student : list_von_Student) {
                        double summ = 0;
                        int countB = 0;
                        int countNB = 0;
                        double[] array = new double[4];
                        for (int i = 0; i < 4; i++) {

                            double a1 = student.Liste_der_Prüfungleistungen.get(i).ergebnis_in_Prozent;
                            if (a1 > 50.00) {
                                countB++;
                            } else countNB++;
                            array[i] = a1;

                        }
                        for (int j = 0; j < array.length; j++) {

                            summ = summ + array[j];
                        }
                        double durchschnit = summ / 4;

                        System.out.println("   " + student.MatrNr + "\t" + "\t" + "\t" + "\t" + "\t" + durchschnit + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + countB + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + "\t" + countNB);
                    }
                }

                if(eingabe_von_benutzer == 4) {

                    System.out.println(" Anbei erhalten Sie den Durchschnitt aller Leistungen pro Modul ");
                    System.out.println(" -----------------------------------------------------------------------------------");
                    System.out.println(" Modulen " + "\t" + "\t" + "\t" + " Durchschnit des Modules ");
                    System.out.println();
                    for (int i = 0; i < 4; i++) {
                        double summ = 0;
                        for (Student student : list_von_Student) {
                            summ = student.Liste_der_Prüfungleistungen.get(i).ergebnis_in_Prozent + summ;

                        }
                        System.out.println(student1.Liste_der_Prüfungleistungen.get(i).modul.modul + "\t" + "\t" + "\t" + "\t" + "\t" + summ / 6 + " ½ ");
                    }
                }
            }
        }
    }


