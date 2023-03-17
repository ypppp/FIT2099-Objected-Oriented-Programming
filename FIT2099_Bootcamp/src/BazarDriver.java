public class BazarDriver {
    public static void main(String args[]){
        Store store = new Store();
//      store.runBazar();
        store.initStore();



        int selection;
        do {
            selection = MenuInput.menuItem();
            switch (selection) {
                case 1:
                    store.createComputers();
                    break;
                case 2:
                    store.createPrinters();
                    break;
                case 3:
                    store.printComputers();
                    break;
                case 4:
                    store.printPrinters();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (selection != 5);
    }
}
