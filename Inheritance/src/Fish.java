public class Fish extends Animal {
    private int fins;
    private int gills;

    public Fish(String type, double weight, int fins, int gills) {
        super(type, "small", weight);
        this.fins = fins;
        this.gills = gills;
    }
    private void moveMuscles(){
        System.out.print("muscles moving ");
    }

    private void moveBackfin(){
        System.out.print("Backfin moving ");
    }
    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscles();
        if(speed == "Fast"){
            moveBackfin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
