package com.example.mouri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mouri.entity.Village;
import com.example.mouri.service.VillageService;

@RestController
@RequestMapping("api/village")
public class VillageController {
	
	@Autowired
	private VillageService service;
	
	//http://localhost:9999/api/village/
	@PostMapping
	public ResponseEntity<Village> saveVillage(@RequestBody Village village) {
		return new ResponseEntity<Village>(service.saveVillage(village),HttpStatus.CREATED);
	}
	
	//http://localhost:9999/api/village/
	@GetMapping
	public List<Village>getAllVillage()	{
		return service.getAllVillages();
		
	}
		
	//http://localhost:9999/api/village/4
	@GetMapping("{idd}")	
	public ResponseEntity<Village> getVillageById(@PathVariable ("idd") long id) {
		Village village1=service.getVillageById(id);
		return ResponseEntity.ok(village1);
	}
	
	//http://localhost:9999/api/village/4
	@PutMapping("{idd}")
	public ResponseEntity<Village> updatedetails(@PathVariable("idd") long id, @RequestBody Village village) {
		Village UpdateStudentValue = service.updateVillage(village, id);
		return new ResponseEntity<Village>(UpdateStudentValue, HttpStatus.OK);

	}
	
	//http://localhost:9999/api/village/4
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteValue(@PathVariable("id") long id) {
                    service.deleteVillage(id);
		return new ResponseEntity<String>("Village Details Successfully Deleted", HttpStatus.OK);
	}



}
