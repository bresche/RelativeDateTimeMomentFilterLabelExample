package de.balvi.rdtmfle.screen.customer;

import io.jmix.ui.screen.*;
import de.balvi.rdtmfle.entity.Customer;

@UiController("rdtmfle_Customer.browse")
@UiDescriptor("customer-browse.xml")
@LookupComponent("customersTable")
public class CustomerBrowse extends StandardLookup<Customer> {
}