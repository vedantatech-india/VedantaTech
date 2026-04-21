package com.portfolio.VedantaTech.Controller;

import com.portfolio.VedantaTech.Entity.Contact;
import com.portfolio.VedantaTech.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactRepository repo;

    @GetMapping("/all")
    public List<Contact> getAllContacts() {
        return repo.findAll();
    }
    @PostMapping
    public String save(@RequestBody Contact contact) {
        System.out.println(contact); // 👈 add this
        repo.save(contact);
        return "Saved Successfully";
    }
}