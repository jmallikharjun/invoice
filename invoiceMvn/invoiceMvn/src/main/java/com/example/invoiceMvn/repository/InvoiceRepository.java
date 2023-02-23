package com.example.invoiceMvn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.invoiceMvn.Invoice;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {

}
