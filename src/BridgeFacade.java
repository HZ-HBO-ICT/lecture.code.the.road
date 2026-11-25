public class BridgeFacade {

    private Bridge _bridge;
    private Barrier _barrier;
    private RoadPart _begin;

    public BridgeFacade(Bridge bridge, Barrier barrier, RoadPart begin) {
        this._bridge = bridge;
        this._barrier = barrier;
        this._begin = begin;
    }

    public void openBridge() {
        this._barrier.close();
        this._bridge.open();
    }

    public RoadPart getRoad() {
        return this._begin;
    }
}
