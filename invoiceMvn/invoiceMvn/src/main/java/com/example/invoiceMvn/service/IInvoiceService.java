package com.example.invoiceMvn.service;

import java.util.List;

import com.example.invoiceMvn.Invoice;

public interface IInvoiceService {

	public Invoice saveInvoice(Invoice invoice);

	public List<Invoice> getAllInvoices();

	public Invoice getInvoiceById(Long id);

	public void deleteInvoiceById(Long id);

	public void updateInvoice(Invoice invoice);
}