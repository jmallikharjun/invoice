package com.example.invoiceMvn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.invoiceMvn.service.IInvoiceService;

@Controller
@RequestMapping("/invoice")
public class InvoiceController {

	@Autowired
	IInvoiceService invoiceService;

	@GetMapping("/")
	public String getHome() {
		return "homePage";
	}

	@GetMapping("/addInvoice")
	public String addInvoice() {
		return "addInvoice";
	}

	@GetMapping("/getAllInvoices")
	public String getAllInvoice(Model model) {
		List<Invoice> invoiceList = invoiceService.getAllInvoices();
		model.addAttribute("list", invoiceList);
		return "listInvoice";

	}

	@PostMapping("/save")
	public String saveInvoice(@ModelAttribute Invoice invoice, Model model) {
		Long id = invoiceService.saveInvoice(invoice).getId();

		String message = "Record with id : '" + id + "' is saved successfully !";
		model.addAttribute("message", message);
		return "addInvoice";

	}

	@GetMapping("/delete")
	public String deleteInvoice(@RequestParam Long id, Model model) {
		invoiceService.deleteInvoiceById(id);

		List<Invoice> invoiceList = invoiceService.getAllInvoices();
		model.addAttribute("list", invoiceList);
		return "listInvoice";
	}

	@GetMapping("/edit")
	public String editInvoice(@RequestParam Long id, Model model) {
		Invoice invoiceObj = invoiceService.getInvoiceById(id);
		model.addAttribute("invoice", invoiceObj);
		return "editInvoice";
	}

	@PostMapping("/update")
	public String updateInvoice(@ModelAttribute Invoice invoice, Model model) {
		Long id = invoiceService.saveInvoice(invoice).getId();

		List<Invoice> invoiceList = invoiceService.getAllInvoices();
		model.addAttribute("list", invoiceList);
		return "listInvoice";

	}

	

}