public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher quietWash;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        quietWash = new DishWasher();
        iceBox = new Refrigerator();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getQuietWash() {
        return quietWash;
    }

    ///////////////////////////////////////////
    //setKitchenState and doKitchenWork alternatives are used to hide functionality in main method
    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag){
        brewMaster.setHasWorkToDo(coffeeFlag);
        quietWash.setHasWorkToDo(dishWasherFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        quietWash.doDishes();
        iceBox.orderFood();
    }
    ////////////////////////////////////////////

    public Refrigerator getIceBox() {
        return iceBox;
    }

    class Refrigerator {
        boolean hasWorkToDo;

        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }
        public void orderFood() {
            if (hasWorkToDo){
                System.out.println("Ordering Food");
                hasWorkToDo = false;
            }
        }

    }

    class DishWasher {
        boolean hasWorkToDo;

        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }
        public void doDishes() {
            if (hasWorkToDo){
                System.out.println("Doing Dishes");
                hasWorkToDo = false;
            }

        }
    }

    class CoffeeMaker {
        boolean hasWorkToDo;

        public void setHasWorkToDo(boolean hasWorkToDo) {
            this.hasWorkToDo = hasWorkToDo;
        }

        public void brewCoffee() {
            if (hasWorkToDo){
                System.out.println("Brewing Coffee");
                hasWorkToDo = false;
            }
        }
    }

}

