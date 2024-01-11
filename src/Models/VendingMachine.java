package Models;
import state.Impl.IdleState;
import state.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State vendingMachineState;
    private int totalMoneyPaidByUser;


    public VendingMachine() {
        this.vendingMachineState = new IdleState();
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public int getTotalMoneyPaidByUser() {
        return totalMoneyPaidByUser;
    }

    public void setTotalMoneyPaidByUser(int totalMoneyPaidByUser) {
        this.totalMoneyPaidByUser = totalMoneyPaidByUser;
    }

}
