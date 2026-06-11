package test;

import domain.Customer;

public class CustomerTest
{
    public static void main(String[] args)
    {
        Customer customer = new Customer();

        System.out.println("---Start data---");
        customer.displayCustomerInfo();

        System.out.println("\n-!-Changing data-!-");
        
        if (customer.setID(42))
        { System.out.println("ID updated"); }
        
        customer.setStatus(false);
        System.out.println("Status updated");

        if (customer.setTotal(5430.50))
        { System.out.println("Total updated"); }

        System.out.println("\n---Current data---");
        customer.displayCustomerInfo();

        System.out.println("\n-!-Unaccepted values test-!-");
        
        if (!customer.setID(-10))
        { System.out.println("Unaccepted value detected! (ID)"); }
        
        if (!customer.setTotal(-500.0))
        { System.out.println("Unaccepted value detected! (total)"); }

        System.out.println("\n---Final data---");
        customer.displayCustomerInfo();
    }
}