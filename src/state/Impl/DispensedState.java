package state.Impl;

import Models.VendingMachine;
import state.State;

public class DispensedState implements State {
    public DispensedState(VendingMachine vendingMachine ,int id) {
        System.out.println("currently in Dispensed State");
        dispenseProduct(vendingMachine,id);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int coin) {

    }

    @Override
    public void productSelectionButton(VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void chooseProductById(VendingMachine vendingMachine, int id) {

    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine, int id) {
        System.out.println("product with the id of " + id + " has been dispensed");
        vendingMachine.setVendingMachineState(new IdleState());
    }

    @Override
    public void getChangeOrRefund(int money) {

    }
}
