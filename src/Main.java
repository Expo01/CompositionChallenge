public class Main {
    public static void main(String[] args) {

        SmartKitchen kitchen  = new SmartKitchen();

        kitchen.getQuietWash().setHasWorkToDo(true);
        kitchen.getQuietWash().doDishes();

        kitchen.getIceBox().setHasWorkToDo(true);
        kitchen.getIceBox().orderFood();

        kitchen.getBrewMaster().setHasWorkToDo(true);
        kitchen.getBrewMaster().brewCoffee();

        System.out.println("============");
//////////////////
        // below is using hidden methods
        kitchen.setKitchenState(true,false,true);
        kitchen.doKitchenWork();
    }
}