package com.crm.controller;

import com.crm.Utils.SortUtils;
import com.crm.entity.Customer;
import org.springframework.ui.Model;
import com.crm.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomer(Model themodel, @RequestParam(name = "sort", required = false) String sort){
        List<Customer> theCustomers = null;
        int theSortField = SortUtils.LAST_NAME;
        if(sort != null){
            theSortField = Integer.parseInt(sort);
        }
        theCustomers = customerService.getCustomers(theSortField);
        themodel.addAttribute("customers", theCustomers);
        return "list-customers";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model themodel){
//        System.out.println("in addCustomer ");
        Customer theCustomer = new Customer();

        themodel.addAttribute("customer", theCustomer);

        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer theCustomer){
        customerService.saveCustomer(theCustomer);

//        System.out.println("in process form");
        return "redirect:/customer/list";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("customerId") int theId, Model theModel){
        Customer theCustomer = customerService.getCustomer(theId);
        theModel.addAttribute("customer", theCustomer);
        return "customer-form";
    }

    @GetMapping("/delete")
    public String deleteCustomer(Model themodel, @RequestParam("customerId") int theId){
        customerService.deleteCustomer(theId);

        return "redirect:/customer/list";
    }

    @GetMapping("/search")
    public String searchCustomer(@RequestParam("theSearchName") String theSearchName, Model theModel){
        List<Customer> theCustomer = customerService.searchCustomer(theSearchName);

        theModel.addAttribute(("customers"), theCustomer);
        return "list-customers";
    }
}
