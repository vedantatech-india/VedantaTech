package com.portfolio.VedantaTech.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.portfolio.VedantaTech.Entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}