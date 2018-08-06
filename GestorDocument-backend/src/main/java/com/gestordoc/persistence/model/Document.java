package com.gestordoc.persistence.model;


import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "document")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "NAME_DOCUMENT")
    private String nameDocument;

    @Column(name = "DATE_UPLOAD")
    private Date dateUpload;

    @Column(name = "TYPE_DOC")
    private String typeDoc;

    @Column(name = "OWNER")
    private String owner;

    @Column(name = "DOCUMENT")
    private String document;

    public Document(String nameDocument, Date dateUpload, String typeDoc, String owner, String document) {
        this.nameDocument = nameDocument;
        this.dateUpload = dateUpload;
        this.typeDoc = typeDoc;
        this.owner = owner;
        this.document = document;
    }

    public Document() {
    }


    public String getNameDocument() {
        return nameDocument;
    }

    public void setNameDocument(String nameDocument) {
        this.nameDocument = nameDocument;
    }

    public Date getDateUpload() {
        return dateUpload;
    }

    public void setDateUpload(Date dateUpload) {
        this.dateUpload = dateUpload;
    }

    public String getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(String typeDoc) {
        this.typeDoc = typeDoc;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
