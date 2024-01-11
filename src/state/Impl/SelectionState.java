package state.Impl;

import Models.VendingMachine;
import state.State;

public class SelectionState implements State {
    public SelectionState() {
        System.out.println("currently in Selection State");
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
        // I have made hard code that if id is 100 and amount is 20
        // then only product will be dispensed otherwise error handling will occur
        // this process can be handled by managing an inventory and product class
        // which includes the information of product and quantity
        if(id == 100 && vendingMachine.getTotalMoneyPaidByUser() == 20){
            System.out.println("dispensing the product ...");
            //basically call the dispenseState with vendingMachine, id to automate the dispensing process
            vendingMachine.setVendingMachineState( new DispensedState(vendingMachine,id));
        }
        else if (vendingMachine.getTotalMoneyPaidByUser() < 20){
            System.out.println("insufficient amount ");
        }
        else {
            System.out.println("please collect your extra money");
            getChangeOrRefund(Math.abs(vendingMachine.getTotalMoneyPaidByUser() - 20));
            vendingMachine.setTotalMoneyPaidByUser(0);
        }
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine, int id) {

    }

    @Override
    public void getChangeOrRefund(int money) {
        System.out.println("please collect your money " + money);
    }
}
