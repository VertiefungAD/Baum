/**
 * Created by doetken on 09.11.2016.
 */
public class Baum {

    private Knoten wurzel;

    public boolean isEmpty() {
        return wurzel == null;
    }


    public void add(int neu) {
        if (this.wurzel == null) {
            this.wurzel = new Knoten();
            this.wurzel.wert = neu;
        } else {
            Knoten k = this.wurzel;
            while (k != null) {
                if (neu < k.wert) {
                    if (k.links == null) {
                        k.links = new Knoten();
                        k.links.wert = neu;
                        return;
                    }
                    k = k.links;
                } else if (neu > k.wert) {
                    if (k.rechts == null) {
                        k.rechts = new Knoten();
                        k.rechts.wert = neu;
                        return;
                    }
                    k = k.rechts;
                } else {
                    return;
                }
            }
        }
    }

    public boolean contains(int suchwert) {
        boolean beinhaltet = false;

        Knoten kc = this.wurzel;

        int i = kc.wert;
        while (i != suchwert) {
            if (suchwert < kc.wert) {
                kc = kc.links;
                if (kc.links.wert == suchwert) {
                    beinhaltet = true;
                    i = suchwert;
                }
            } else {
                if (suchwert > kc.wert) {
                    kc = kc.rechts;
                    if (kc.rechts.wert == suchwert) {
                        beinhaltet = true;
                        i = suchwert;
                    } else {
                        i = suchwert;
                    }
                }
            }
        }

        return beinhaltet;
    }

//                                                               NullPointerException:

//    public int size() {
//        int groesse = 0;
//
//        Knoten ks = this.wurzel;
//        int s = ks.wert;
//        if (this.wurzel == null) groesse = 0;
//
//        while (!this.wurzel.kruemel) {
//
//            while (!ks.kruemel) {
//                ks = ks.links;
//            }
//            ks.kruemel = true;
//        }
//        return groesse;
//    }

//                                                              Sehr großer Aufwand:

//    public int size() {
//        int groesse = 0;
//
//        while (wurzel.kruemel) {
//            if (wurzel == null) return 0;
//            while (true) {
//                Knoten temp = wurzel;
//                while (true) {
//                    if (temp != null && !temp.links.kruemel) temp = temp.links;
//                    else if (temp.rechts != null && !temp.rechts.kruemel) temp = temp.rechts;
//                    else {
//                        temp.kruemel = true;
//                        groesse++;
//                        break;
//                    }
//                }
//            }
//        }
//
////        Krümel einsammeln
//
//        while (wurzel.kruemel) {
//            if (wurzel == null) return 0;
//            while (true) {
//                Knoten temp = wurzel;
//                while (true) {
//                    if (temp != null && temp.links.kruemel) temp = temp.links;
//                    else if (temp.rechts != null && temp.rechts.kruemel) temp = temp.rechts;
//                    else {
//                        temp.kruemel = false;
//                        break;
//                    }
//                }
//            }
//        }
//
//        return groesse;
//    }

    public int size() {
        int groesse = 0;
        if (wurzel == null) return 0;

        List<Knoten> liste = new List<>();

        liste.add(wurzel);
        while (!liste.isEmpty()) {
            Knoten knoten = liste.remove(0);
            groesse++;
            if (knoten.links != null) {
                liste.add(0, knoten.links);
            }
            if (knoten.rechts != null) {
                liste.add(0, knoten.rechts);
            }
        }

        return groesse;
    }

    private class Knoten {
        private int wert;
        private Knoten rechts = null;
        private Knoten links = null;
        private boolean kruemel = false;
    }

}