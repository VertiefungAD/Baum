/**
 * Created by doetken on 09.11.2016.
 */
public class Baum {

    private Knoten wurzel;

    public boolean isEmpty() {
        return wurzel == null;
    }


    public void add(int neu) {
        if (wurzel == null) {
            this.wurzel = new Knoten();
            this.wurzel.wert = neu;
        } else {
            Knoten k = this.wurzel;
            while (k != null) {
                if (neu < k.wert) {
                    //todo
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

        Knoten k = this.wurzel;

        int i = k.wert;
        while (i != suchwert) {
            if (suchwert < k.wert) {
                k=k.links;
                if (k.links.wert == suchwert) {
                    beinhaltet = true;
                    i = suchwert;
                }
            } else {
                if (suchwert > k.wert) {
                    k=k.rechts;
                    if (k.rechts.wert == suchwert) {
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

    private class Knoten {
        private int wert;
        private Knoten rechts = null;
        private Knoten links = null;

    }

}