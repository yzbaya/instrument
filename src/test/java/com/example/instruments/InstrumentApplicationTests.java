package com.example.instruments;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.instrument.entities.Categorie;
import com.example.instrument.entities.Instrument;
import com.example.instrument.repos.InstrumentRepository;


@SpringBootTest
class InstrumentsApplicationTests {

	@Autowired
	private InstrumentRepository instrumentRepository;
	
	@Test
	public void testCreateProduit() {
	Instrument Inst1 = new Instrument("Violon",220.000,new Date());
	instrumentRepository.save(Inst1);
	}
	
	@Test
	public void testFindinstrument()
	{
	Instrument p = instrumentRepository.findById(1L).get();
	System.out.println(p);
	}
	
	@Test
	public void testUpdateProduit()
	{
	Instrument p = instrumentRepository.findById(1L).get();
	p.setPrixProduit(2000.0);
	instrumentRepository.save(p);
	
	System.out.println(p);
	}
	
	@Test
	public void testDeleteInstrument()
	{
		instrumentRepository.deleteById(1L);
	}
	
	@Test
	public void testFindAllProduits()
	{
		List<Instrument> prods = instrumentRepository.findAll();
		
		for (Instrument p:prods)
			 System.out.println(p);
		
	}
	
	
	@Test
	public void testFindProduitByNom()
	{
	List<Instrument> prods = instrumentRepository.findByNomInstrument("PS 4");
	
	for (Instrument p:prods)
		 System.out.println(p);
	
	}
	
	@Test
	public void testFindProduitByNomContains()
	{
	List<Instrument> prods = instrumentRepository.findByNomInstrumentContains("P");
	
	for (Instrument p:prods)
		 System.out.println(p);
	
	}
	
	@Test
	public void testfindByNomPrix()
	{
	List<Instrument> prods = instrumentRepository.findByNomPrix("PS 4", 1000.0);
		for (Instrument p : prods)
			{
				System.out.println(p);
			}
	}
	
	
	@Test
	public void testfindByCategorie()
	{
	Categorie cat = new Categorie();
	cat.setIdCat(1L);
	
	List<Instrument> prods = instrumentRepository.findByCategorie(cat);
	for (Instrument p : prods)
	{
		System.out.println(p);
	}
	}
	
	@Test
	public void findByCategorieIdCat()
	{
	List<Instrument> prods = instrumentRepository.findByCategorieIdCat(1L);
	for (Instrument p : prods)
	{
		System.out.println(p);
	}
	}
	
	
	@Test
	public void testfindByOrderByNomProduitAsc()
	{
	List<Instrument> prods =  instrumentRepository.findByOrderByNomInstrumentAsc();
	for (Instrument p : prods)
		{
			System.out.println(p);
		}
	}
	
	@Test
	public void testTrierProduitsNomsPrix()
	{
	List<Instrument> prods = instrumentRepository.trierInstrumentsNomsPrix();
	for (Instrument p : prods)
	{
	System.out.println(p);
	}
	}
	
	
}
