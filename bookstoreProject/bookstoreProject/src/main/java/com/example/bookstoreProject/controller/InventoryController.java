package com.example.bookstoreProject.controller;

import com.example.bookstoreProject.model.Inventory;
import com.example.bookstoreProject.service.InventoryService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

@RestController
@RequestMapping(value = "/books")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService ;

    //to Add books into Inventory
    @PostMapping(value = "/save")
    public void addBook(@RequestBody Inventory inventory)
    {
        inventoryService.addBook(inventory);
    }

    //to Fetch All the Books in Inventory

    @GetMapping(value = "/getAll")
    public List<Inventory> getall()
    {
        return inventoryService.getAll();
    }

    //to Fetch  the Books in Inventory according to there respective title
    @GetMapping(value = "/getByTitle/{title}")
    public Inventory getByTitle(@PathVariable String title)
    {
        return inventoryService.findByTitle(title) ;
    }

    //to Fetch  the Books in Inventory according to Author
    @GetMapping(value = "/getByAuthor/{author}")
    public List<Inventory> getByAuthor(@PathVariable String author)
    {
        return inventoryService.FindByAuthor(author);
    }

    //delete the Book from inventory using there Id

    @DeleteMapping(value = "/delete/{id}")
    public void deleteById(@PathVariable Integer id)
    {
        inventoryService.delete(id);
    }

    @PutMapping(value = "/update/author/{author}/{id}")
    public void updateById(@PathVariable String author ,@PathVariable Integer id)
    {
        inventoryService.update(author,id) ;
    }


}
