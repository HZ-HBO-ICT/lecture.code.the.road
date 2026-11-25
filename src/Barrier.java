public class Barrier extends RoadPart{

    private char _closedSymbol;
    private boolean _isOpen;

    public Barrier(RoadPart next) {
        super(next);
        _isOpen = true;
        _closedSymbol = '=';
    }

    public void close() {
        _isOpen = ! true;
    }

    @Override
    protected char getSymbol() {
        return (this._isOpen)
                ? this._symbol
                : this._closedSymbol;
    }
}
