package com.gestordoc.controller;

import com.gestordoc.exception.DocumentMismatchException;
import com.gestordoc.exception.DocumentNotFoundException;
import com.gestordoc.persistence.model.Document;
import com.gestordoc.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    @Autowired
    private DocumentService documentService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Document> findAll() {
        return documentService.getDocuments();
    }

    @RequestMapping(path = "{id}",method = RequestMethod.GET)
    public Document findOne(@PathVariable(value = "id") Long id) {
        return documentService.getDocumentById(id)
                .orElseThrow(DocumentNotFoundException::new);
    }


    @RequestMapping(method = RequestMethod.POST, produces = "application/json")
    public void create(@RequestBody Document document) {
       documentService.createDocument(document);

    }

    @RequestMapping(path = "{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable(value = "id") Long id) {
        documentService.delete(id);
    }

    @PutMapping("/{id}")
    public Document updateDocument(@RequestBody Document document, @PathVariable long id) {
        if (document.getId() != id) {
            throw new DocumentMismatchException();
        }
        documentService.getDocumentById(id)
                .orElseThrow(DocumentNotFoundException::new);
        return documentService.update(document);
    }
}
