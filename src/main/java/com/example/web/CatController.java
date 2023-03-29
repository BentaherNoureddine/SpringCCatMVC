package com.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.dao.ProduitRepository;
import com.example.entities.Produit;

@Controller
public class CatController {
	@Autowired
	ProduitRepository ProduitRepository;
	@GetMapping(value = "/")
	@ResponseBody public String home() { return "Hello Spring Boot"; }
	
	
	@GetMapping(value = "/products")
	public String index(Model model)
	{
	return "pages/index";
	}
	
	
	
	@GetMapping(value="/search") public String search(Model model,
    @RequestParam(name="page",defaultValue="0") int page,
	@RequestParam(name="motCle",defaultValue="") String mc) {
	Page<Produit> pageProduits =	ProduitRepository.findByDesignationContains(mc,PageRequest.of(page,2));

	int pageCount = pageProduits.getTotalPages();
	int[] pages = new int[pageCount];
	for(int i=0;i<pageCount;i++)
	pages[i]=i;
	model.addAttribute("pages",pages);
	model.addAttribute("motCle",mc);
	model.addAttribute("pagecourante",page);
	model.addAttribute("pageproduits", pageProduits);
	return "pages/produit";
			}
	@GetMapping("/delete")
	public String delete(String id,int page, String motCle) {
	ProduitRepository.deleteById(id);
	return "redirect:/search?page="+page+"&motCle="+motCle;
			}
}


