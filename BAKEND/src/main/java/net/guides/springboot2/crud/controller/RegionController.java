package net.guides.springboot2.crud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.crud.exception.ResourceNotFoundException;
import net.guides.springboot2.crud.model.Region;
import net.guides.springboot2.crud.repository.RegionRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping("/api")
public class RegionController {
	@Autowired
	private RegionRepository regionRepository;

	@GetMapping("/Region")
        @CrossOrigin
	public List<Region> getAllRegion() {
		return regionRepository.findAll();
	}

	@GetMapping("/Region/{id}")
	public ResponseEntity<Region> getRegionById(@PathVariable(value = "id") Long regionId)
			throws ResourceNotFoundException {
		Region employee = regionRepository.findById(regionId)
				.orElseThrow(() -> new ResourceNotFoundException("Region not found for this id :: " + regionId));
		return ResponseEntity.ok().body(employee);
	}

//	@PostMapping("/employees")
//	public Employee createEmployee(@Valid @RequestBody Employee employee) {
//		return employeeRepository.save(employee);
//	}
//
//	@PutMapping("/employees/{id}")
//	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
//			@Valid @RequestBody Employee employeeDetails) throws ResourceNotFoundException {
//		Employee employee = employeeRepository.findById(employeeId)
//				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
//
//		employee.setEmailId(employeeDetails.getEmailId());
//		employee.setLastName(employeeDetails.getLastName());
//		employee.setFirstName(employeeDetails.getFirstName());
//		final Employee updatedEmployee = employeeRepository.save(employee);
//		return ResponseEntity.ok(updatedEmployee);
//	}
//
//	@DeleteMapping("/employees/{id}")
//	public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
//			throws ResourceNotFoundException {
//		Employee employee = employeeRepository.findById(employeeId)
//				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
//
//		employeeRepository.delete(employee);
//		Map<String, Boolean> response = new HashMap<>();
//		response.put("deleted", Boolean.TRUE);
//		return response;
//	}
}
