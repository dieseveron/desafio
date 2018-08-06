package com.gestordoc.persistence.repository;


import com.gestordoc.persistence.model.Document;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DocumentRepository extends CrudRepository<Document, Long> {
    List<Document> findAll();

}
