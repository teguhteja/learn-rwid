package com.example.demo.controller;

import com.example.demo.entity.Inventory;
import com.example.demo.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class InventoryController {

    @Autowired
    private InventoryRepository inventoryRepository;

    @GetMapping("/")
    public String show(Model model){
        model.addAttribute("data", inventoryRepository.findAll());
        return "index";
    }

    @GetMapping("/tambah")
    public String tambah(){
        return "add";
    }

    @PostMapping("/save")
    public String simpan(Inventory inventory){
        inventoryRepository.save(inventory);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String hapus(Integer id){
        inventoryRepository.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/findInventory")
    public String findInventory(Integer id, Model model){
        model.addAttribute("data", inventoryRepository.findById(id).orElse(null));
        return "edit";
    }
}
