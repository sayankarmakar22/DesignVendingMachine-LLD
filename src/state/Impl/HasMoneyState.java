package state.Impl;

import Models.VendingMachine;
import state.State;

public class HasMoneyState implements State {

    public HasMoneyState() {
        System.out.println("currently in has money state");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, int coin) {
        vendingMachine.setTotalMoneyPaidByUser(vendingMachine.getTotalMoneyPaidByUser() + coin);
        System.out.println("coin inserted " + coin + "\n" + "Total Money : " + vendingMachine.getTotalMoneyPaidByUser());
    }

    @Override
    public void productSelectionButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new SelectionState());
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
