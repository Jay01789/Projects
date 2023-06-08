package com.example.bookstoreProject.service;

import com.example.bookstoreProject.dao.iInventoryRepo;
import com.example.bookstoreProject.model.Inventory;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;

@Service
public class InventoryService {
    @Autowired
    private iInventoryRepo inventoryRepo ;

    public void addBook(Inventory inventory) {
        inventoryRepo.save(inventory);
    }

    public List<Inventory> getAll() {
        return inventoryRepo.findAll();
    }


    public Inventory findByTitle(String title) {
        return  inventoryRepo.findByTitle(title);
    }

    public List<Inventory> FindByAuthor(String author) {
        return inventoryRepo.findByAuthor(author);
    }

    public void delete(Integer id) {
        inventoryRepo.deleteById(id);
    }

    @Transactional
    public void update(String author, Integer id) {
        inventoryRepo.update(author,id);
    }
}
