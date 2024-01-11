package state.Impl;

import Models.VendingMachine;
import state.State;

public class IdleState implements State {
    VendingMachine vendingMachine;

    public IdleState() {
        System.out.println("currently in idle state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        vendingMachine.setVendingMachineState(new HasMoneyState());

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int coin) {

    }

    @Override
    public void productSelectionButton(VendingMachine vendingMachine) {

    }

    @Override
    public void chooseProductById(VendingMachine vendingMachine, int id) {

    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine, int id) {

    }

    @Override
    public void getChangeOrRefund(int money) {

    }
}
