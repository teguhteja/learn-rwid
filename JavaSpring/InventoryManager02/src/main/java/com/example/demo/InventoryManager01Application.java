package com.example.demo;

import com.example.demo.entity.Inventory;
import com.example.demo.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InventoryManager01Application implements CommandLineRunner {
	@Autowired
	private InventoryRepository inventoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(InventoryManager01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		inventoryRepository.save(new Inventory("sabun", 5));
//		inventoryRepository.save(new Inventory("shampoo", 3));
//		inventoryRepository.save(new Inventory("pasta gigi", 1));
	}
}
