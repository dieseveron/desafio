package com.gestordoc.service;

import com.gestordoc.persistence.model.Document;

import java.util.List;
import java.util.Optional;

public interface DocumentService  {

    List<Document> getDocuments();

    Optional<Document> getDocumentById(long id);

    void createDocument(Document document);

    void delete(long id);

    Document update(Document document);
}
