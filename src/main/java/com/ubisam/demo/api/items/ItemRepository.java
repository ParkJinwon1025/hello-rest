package com.ubisam.demo.api.items;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ubisam.demo.domain.Item;

public interface ItemRepository extends JpaRepository<Item, UUID> {

}
