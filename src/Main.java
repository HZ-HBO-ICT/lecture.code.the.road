//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to the road!");

        RoadBuilder builder = new RoadBuilder();
        
        builder.buildRoadPart()
            .buildRoadPart()
            .buildBarrier()
            .buildBridge()
            .buildRoadPart()
            .buildRoadPart();

        BridgeFacade facade = builder.getRoad();

        System.out.println(facade.getRoad().show());

        facade.openBridge();

        System.out.println(facade.getRoad().show());
    }
}