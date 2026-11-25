public class RoadPart {

    protected char _symbol;

    private RoadPart _prev;

    public RoadPart(RoadPart prev) {
        this._symbol = '_';
        this._prev = prev;
    }

    protected char getSymbol() {
        return this._symbol;
    }

    public String show() {
        String previousParts = this._prev.show();
        return getSymbol() + previousParts;
    }
}
