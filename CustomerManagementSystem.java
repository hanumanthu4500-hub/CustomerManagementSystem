package com.java.weeklytasks.cms;

public class CustomerManagementSystem {

	public static void main(String[] args) {
		
		CustomerOperations operations = new CustomerOperations();

        // 1. Display initial customers
        System.out.println("1. Initial Customers:");
        for (Customer customer : operations.getCustomers()) {
            System.out.println(customer);
        }

        // 2. Add a new customer
        System.out.println("\n2. Adding Customer 106:");
        boolean added = operations.addCustomer(106, "Ananya", "Verma", 'F');

        System.out.println("Customer added: " + added);

        // 3. Attempt to add the same customer again
        System.out.println("\n3. Adding Duplicate Customer:");
        boolean duplicateAdded = operations.addCustomer(106, "Ananya", "Verma", 'F');

        System.out.println("Customer added: " + duplicateAdded);

        // 4. Update customer with ID 103
        System.out.println("\n4. Updating Customer 103:");
        boolean updated = operations.updateCustomer(103, "Arjun", "Reddy", 'M');

        System.out.println("Customer updated: " + updated);
        System.out.println(operations.findCustomerById(103));

        // 5. Delete customer with ID 104
        System.out.println("\n5. Deleting Customer 104:");
        boolean deleted = operations.deleteCustomer(104);

        System.out.println("Customer deleted: " + deleted);

        // 6. Find customer with ID 102
        System.out.println("\n6. Find Customer with ID 102:");
        Customer customerById = operations.findCustomerById(102);

        if (customerById != null) {
            System.out.println(customerById);
        } else {
            System.out.println("Customer not found.");
        }

        // 7. Find customer with first name Kiran
        System.out.println("\n7. Find Customer named Kiran:");
        Customer customerByName = operations.findCustomerByFirstname("Kiran");

        if (customerByName != null) {
            System.out.println(customerByName);
        } else {
            System.out.println("Customer not found.");
        }

        // 8. Find a nonexistent customer
        System.out.println("\n8. Find Customer with ID 999:");
        Customer missingCustomer = operations.findCustomerById(999);

        if (missingCustomer != null) {
            System.out.println(missingCustomer);
        } else {
            System.out.println("Customer with ID 999 does not exist.");
        }

        // 9. Display all customers after operations
        System.out.println("\n9. Final Customer List:");
        for (Customer customer : operations.getCustomers()) {
            System.out.println(customer);
        }
	}

}