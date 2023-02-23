package com.example.invoiceMvn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.invoiceMvn.Invoice;
import com.example.invoiceMvn.repository.InvoiceRepository;

@Service
public class IInvoiceServiceImpl implements IInvoiceService {

	@Autowired
	InvoiceRepository repository;

	@Override
	public Invoice saveInvoice(Invoice invoice) {
		// TODO Auto-generated method stub
		return repository.save(invoice);

	}

	@Override
	public List<Invoice> getAllInvoices() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Invoice getInvoiceById(Long id) {
		// TODO Auto-generated method stub
		java.util.Optional<Invoice> opt = repository.findById(id);

		if (opt.isPresent()) {
			return opt.get();
		}
		return opt.orElse(new Invoice());
	}

	@Override
	public void deleteInvoiceById(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public void updateInvoice(Invoice invoice) {
		// TODO Auto-generated method stub

	}

}