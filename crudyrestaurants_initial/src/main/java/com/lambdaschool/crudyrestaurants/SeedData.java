//package com.lambdaschool.crudyrestaurants;
//
//import com.github.javafaker.Faker;
//import com.lambdaschool.crudyrestaurants.models.Menu;
//import com.lambdaschool.crudyrestaurants.models.Payment;
//import com.lambdaschool.crudyrestaurants.models.Restaurant;
//import com.lambdaschool.crudyrestaurants.services.PaymentService;
//import com.lambdaschool.crudyrestaurants.services.RestaurantService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import javax.transaction.Transactional;
//import java.util.*;
//
///**
// * SeedData puts both known and random data into the database. It implements CommandLineRunner.
// * <p>
// * CoomandLineRunner: Spring Boot automatically runs the run method once and only once
// * after the application context has been loaded.
// */
//@Transactional
//@Component
//public class SeedData implements CommandLineRunner
//{
//    /**
//     * Connects the Restaurant Service to this process
//     */
//    @Autowired
//    private RestaurantService restaurantService;
//
//    /**
//     * Connects the Payment Service to this process
//     */
//    @Autowired
//    private PaymentService paymentService;
//
//    /**
//     * Generates test, seed data for our application
//     * First a set of known data is seeded into our database.
//     * Second a random set of data using Java Faker is seeded into our database.
//     * Note this process does not remove data from the database. So if data exists in the database
//     * prior to running this process, that data remains in the database.
//     *
//     * @param args The parameter is required by the parent interface but is not used in this process.
//     */
//    @Transactional
//    @Override
//    public void run(String[] args)
//    {
//        Payment pay1 = new Payment("Cash");
//        pay1 = paymentService.save(pay1);
//        Payment pay2 = new Payment("Credit Card");
//        pay2 = paymentService.save(pay2);
//        Payment pay3 = new Payment("Mobile Pay");
//        pay3 = paymentService.save(pay3);
//
//        // Restaurant String name, String address, String city, String state, String telephone
//        // scope of r variables
//        {
//            Restaurant r1 = new Restaurant("Apple",
//                                           "123 Main Street",
//                                           "City",
//                                           "ST",
//                                           "555-555-1234",
//                                           15);
//            r1.getMenus()
//                    .add(new Menu("Mac and Cheese",
//                                  6.95,
//                                  r1));
//            r1.getMenus()
//                    .add(new Menu("Lasagna",
//                                  8.50,
//                                  r1));
//            r1.getMenus()
//                    .add(new Menu("Meatloaf",
//                                  7.77,
//                                  r1));
//            r1.getMenus()
//                    .add(new Menu("Tacos",
//                                  8.49,
//                                  r1));
//            r1.getMenus()
//                    .add(new Menu("Chef Salad",
//                                  12.50,
//                                  r1));
//
//            r1.getPayments()
//                    .add(pay1);
//            r1.getPayments()
//                    .add(pay2);
//            r1.getPayments()
//                    .add(pay3);
//            restaurantService.save(r1);
//        }
//
//        Restaurant r2 = new Restaurant("Eagle Cafe",
//                                       "321 Uptown Drive",
//                                       "Town",
//                                       "ST",
//                                       "555-555-5555",
//                                       25);
//        r2.getMenus()
//                .add(new Menu("Tacos",
//                              10.49,
//                              r2));
//        r2.getMenus()
//                .add(new Menu("Barbacoa",
//                              12.75,
//                              r2));
//
//        r2.getPayments()
//                .add(pay3);
//        restaurantService.save(r2);
//
//        Restaurant r3 = new Restaurant("Number 1 Eats",
//                                       "565 Side Avenue",
//                                       "Village",
//                                       "ST",
//                                       "555-123-1555",
//                                       110);
//        r3.getMenus()
//                .add(new Menu("Pizza",
//                              15.15,
//                              r3));
//
//        r3.getPayments()
//                .add(pay2);
//        r3.getPayments()
//                .add(pay3);
//        restaurantService.save(r3);
//
//    }
//}
