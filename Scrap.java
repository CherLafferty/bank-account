if(account == "checking")
        setCheckingBalance(getCheckingBalance() + deposit);
        if(account == "savings")
        setSavingsBalance(getSavingsBalance() + deposit);
        totalAmount += deposit;
        System.out.println("Your account balance is " + totalAmount)


        if(account == "checking" && withdrawal < getCheckingBalance())
        setCheckingBalance(getCheckingBalance() - withdrawal);
        if(account == "savings" && withdrawal < getSavingsBalance)
        setSavingsBalance(getSavingsBalance() = withdrawal);
        totalAmount -= withdrawal;
        System.out.println("Your account balance is " + totalAmount);