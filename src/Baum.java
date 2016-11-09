/**
 * Created by doetken on 09.11.2016.
 */
public class Baum {

    private Knoten wurzel;

    public boolean isEmpty() {
        return wurzel == null;
    }

    public void add(int pos) {
        if (wurzel == null) {
            wurzel = new Knoten();
            wurzel.wert = pos;
        } else {
            Knoten k = wurzel;
            while (k != null) {
                if (pos < k.wert) {
                    k = k.links;
                } else {
                    if (pos > k.wert) {
                        if (k.rechts == null) {
                            k.rechts = new Knoten();
                            k.rechts.wert = pos;
                        }

                        k = k.rechts;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public int size() {
        int groesse = 0;

        return groesse;
    }

    private class Knoten {
        private int wert;
        private Knoten rechts;
        private Knoten links;

    }
}
