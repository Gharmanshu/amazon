package com.amazon.khataApp.repository;

import com.amazon.khataApp.model.BusinessEvent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository used is JpaRepository
 * It will have methods to create, read, update and delete model
 * model passed is BusinessEvent with Long type primary key
 *All the methods can be seen in controller class
 */
public interface BusinessEventRepository extends JpaRepository<BusinessEvent, Long> {

}
