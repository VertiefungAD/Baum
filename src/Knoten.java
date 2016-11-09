/**
 * Created by doetken on 09.11.2016.
 */
public class Knoten {
    private int wert;
    private Knoten rechts;
    private Knoten links;

    public int getWert() {
        return wert;
    }

    public Knoten getRechts() {
        return rechts;
    }

    public Knoten getLinks() {
        return links;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }

    public void setRechts(Knoten rechts) {
        this.rechts = rechts;
    }

    public void setLinks(Knoten links) {
        this.links = links;
    }
}
