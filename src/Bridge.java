public class Bridge extends RoadPart {

    private char _openSymbol;
    private boolean _isOpen;

    public Bridge(RoadPart next) {
        super(next);
        _isOpen = false;
        _openSymbol = '/';
    }

    public void open() {
        _isOpen = true;
    }

    @Override
    protected char getSymbol() {
        return (this._isOpen)
                ? this._openSymbol
                : this._symbol;
    }
}
