public class RoadBuilder {

    private RoadPart _road;
    private Bridge _bridge;
    private Barrier _barrier;


    private BridgeFacade _facade;

    public RoadBuilder() {
        _road = new FinalPart();
    }

    public RoadBuilder buildRoadPart() {
        RoadPart roadPart = new RoadPart(_road);
        _road = roadPart;

        return this;
    }

    public RoadBuilder buildBridge() {
        Bridge bridge = new Bridge(_road);
        this._road = bridge;
        this._bridge = bridge;

        return this;
    }

    public RoadBuilder buildBarrier() {
        Barrier barrier = new Barrier(_road);
        this._road = barrier;
        this._barrier = barrier;

        return this;
    }

    public BridgeFacade getRoad() {

        BridgeFacade facade =
                new BridgeFacade(
                        this._bridge,
                        this._barrier,
                        this._road);
        return facade;
    }
}
