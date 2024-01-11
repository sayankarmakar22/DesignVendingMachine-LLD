package state;

import Models.VendingMachine;

public interface State {
    void clickOnInsertCoinButton(VendingMachine vendingMachine);
    void insertCoin(VendingMachine vendingMachine, int coin);
    void productSelectionButton(VendingMachine vendingMachine) throws Exception;
    void chooseProductById(VendingMachine vendingMachine,int id);

    void dispenseProduct(VendingMachine vendingMachine, int id);
    void getChangeOrRefund(int money);


}
