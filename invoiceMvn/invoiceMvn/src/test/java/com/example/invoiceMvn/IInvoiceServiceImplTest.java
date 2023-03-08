package com.example.invoiceMvn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.invoiceMvn.Invoice;
import com.example.invoiceMvn.repository.InvoiceRepository;
import com.example.invoiceMvn.service.IInvoiceServiceImpl;

class IInvoiceServiceImplTest {

	@Mock
	private InvoiceRepository repository;

	@InjectMocks
	private IInvoiceServiceImpl service;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testGetAllInvoices() {
		List<Invoice> invoices = new ArrayList<>();
		invoices.add(new Invoice(1L, "Invoice 1"));
		invoices.add(new Invoice(2L, "Invoice 2"));

		when(repository.findAll()).thenReturn(invoices);

		List<Invoice> allInvoices = service.getAllInvoices();

		assertEquals(2, allInvoices.size());
	}

	@Test
	void testGetAllInvoices1() {
		List<Invoice> invoices = new ArrayList<>();
		invoices.add(new Invoice(1L, "Invoice 1"));
		invoices.add(new Invoice(2L, "Invoice 2"));

		when(repository.findAll()).thenReturn(invoices);

		List<Invoice> allInvoices = service.getAllInvoices();

		assertEquals(1L, allInvoices.get(0).getId());

	}

	@Test
	void testGetAllInvoices2() {
		List<Invoice> invoices = new ArrayList<>();
		invoices.add(new Invoice(1L, "Invoice 1"));
		invoices.add(new Invoice(2L, "Invoice 2"));

		when(repository.findAll()).thenReturn(invoices);

		List<Invoice> allInvoices = service.getAllInvoices();

		assertEquals("Invoice 1", allInvoices.get(0).getName());

	}

}
