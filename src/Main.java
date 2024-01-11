import Models.VendingMachine;
import state.State;

public class Main {
    public static void main(String[] args) throws Exception {
        VendingMachine vendingMachine = new VendingMachine();

        State vendingMachineState = vendingMachine.getVendingMachineState();

                vendingMachineState.clickOnInsertCoinButton(vendingMachine);

        vendingMachineState = vendingMachine.getVendingMachineState();

                vendingMachineState.insertCoin(vendingMachine,21);

        vendingMachineState = vendingMachine.getVendingMachineState();

                vendingMachineState.productSelectionButton(vendingMachine);

        vendingMachineState = vendingMachine.getVendingMachineState();

                vendingMachineState.chooseProductById(vendingMachine,100 );



    }
}