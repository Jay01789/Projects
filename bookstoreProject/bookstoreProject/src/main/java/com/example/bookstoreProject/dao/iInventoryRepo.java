package com.example.bookstoreProject.dao;

import com.example.bookstoreProject.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface iInventoryRepo extends JpaRepository<Inventory,Integer> {
    Inventory findByTitle(String title);

    List<Inventory> findByAuthor(String author);

    @Modifying
    @Query(value = "update Inventory set author=:author where id=:id",nativeQuery = true)
    void update(String author, Integer id);
}
