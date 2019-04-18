package br.com.sassine.restclassify.api.adress.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.sassine.restclassify.api.adress.usecase.DeleteAdressUseCase;
import br.com.sassine.restclassify.api.adress.usecase.FindAdressUseCase;
import br.com.sassine.restclassify.api.adress.usecase.SaveAdressUseCase;
import br.com.sassine.restclassify.api.adress.usecase.UpdateAdressUseCase;

@RestController
@RequestMapping("/api/v1/adress")
public class AdressController {

	@Autowired
	private FindAdressUseCase findAdress;
	@Autowired
	private SaveAdressUseCase saveAdress;
	@Autowired
	private UpdateAdressUseCase updateAdress;
	@Autowired
	private DeleteAdressUseCase deleteAdress;

	@GetMapping
	public Map<String, Object> retrieve(@RequestParam(value = "id", required = false) Long id) {
		return this.findAdress.execute(id);
	}

	@PostMapping
	public Map<String, Object> save(@RequestBody Map<String, Object> adressMap) {
		return this.saveAdress.execute(adressMap);
	}

	@PutMapping
	public void update(@RequestParam("id") Long id, @RequestBody Map<String, Object> adressMap) {
		this.updateAdress.update(id, adressMap);
	}

	@DeleteMapping
	public void delete(@RequestParam("id") Long id) {
		this.deleteAdress.delete(id);
	}
}
