package domain;

public class Customer
{
    private int ID;
    private boolean isNew;
    private double total;

    public Customer()
    {
        ID = 1;
        isNew = true;
        total = 1000.0;
    }

    public void displayCustomerInfo()
    {
        System.out.println("Customer ID: " + ID);
        System.out.println("New customer?: " + isNew);
        System.out.println("Total purchases are: " + total);
    }

    public boolean setID(int nID)
    {
        if (nID < 0) return false;

        ID = nID;
        return true;
    }

    public void setStatus(boolean nStatus)
    { isNew = nStatus; }

    public boolean setTotal(double nTotal)
    {
        if (nTotal < 0 ) return false;

        total = nTotal;
        return true;
    }
}