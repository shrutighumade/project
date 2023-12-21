package com.Anudip.DomesticHelpManagementSystem;

import java.time.LocalDate;
import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.Anudip.DomesticHelpManagementSystem.entity.Address;
import com.Anudip.DomesticHelpManagementSystem.entity.Booking;
import com.Anudip.DomesticHelpManagementSystem.entity.BookingStatus;
import com.Anudip.DomesticHelpManagementSystem.entity.Client;
import com.Anudip.DomesticHelpManagementSystem.entity.Maid;
import com.Anudip.DomesticHelpManagementSystem.entity.Rating;

import com.mysql.cj.Session;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Configuration conf = new Configuration().configure().addAnnotatedClass(Address.class).addAnnotatedClass(Maid.class).addAnnotatedClass(Client.class).addAnnotatedClass(Booking.class).addAnnotatedClass(Rating.class);
        SessionFactory ss = conf.buildSessionFactory();
        org.hibernate.Session s = ss.openSession();
        Transaction t = s.beginTransaction();

        try {
            // Create sample data
            Address address = new Address("123 Main St", "City", "State", "Country", "123456");

            Maid maid = new Maid("MaidName", "F", "25", "Location", "FullTime", address, null, null, null, null, null, null, null, 2, 100.0, "NativePlace", "PreferredCity", "Married", "Religion", "Education", "English", "Yes", true, "FullTime", "Cleaning", 10.0, address, null, null);

            // Save objects to the database
            
            s.save(address);
           
            s.save(maid);

            // Commit the transaction
           
            t.commit();
        } catch (Exception e) {
            // Handle exceptions and rollback the transaction
            if (t != null) {
                t.rollback();
            }
            e.printStackTrace();
        } finally {
            // Close the session and session factory
            if (s != null) {
                s.close();
            }
            ss.close();
        }

        System.out.println("Hello World!");
    }
}
