package com.gestordoc.service.serviceImpl;

import com.gestordoc.persistence.model.Document;
import com.gestordoc.persistence.repository.DocumentRepository;
import com.gestordoc.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentServiceImpl implements DocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    @Override
    public List<Document> getDocuments() {
        return documentRepository.findAll();
    }

    @Override
    public Optional<Document> getDocumentById(long id) {
        return documentRepository.findById(id);
    }

    @Override
    public void createDocument(Document document) {
        documentRepository.save(document);
    }

    @Override
    public void delete(long id) {
        documentRepository.deleteById(id);
    }

    @Override
    public Document update(Document document) {
        return documentRepository.save(document);
    }


}
