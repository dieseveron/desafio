CREATE TABLE IF NOT EXISTS DOCUMENT(
  DOCUMENT_ID INT NOT NULL,
  NAME_DOCU VARCHAR(50),
  DATE_UPLOAD DATE,
  TYPE_DOC INT,
  OWNER VARCHAR(50),
  DOCUMENT VARCHAR(50)
  PRIMARY KEY (DOCUMENT_ID)

)

INSERT INTO DOCUMENT VALUES('DOCUMENTO1', '2018-08-01', 1, 'diego', '/image/documento1.docx');
INSERT INTO DOCUMENT VALUES('DOCUMENTO2', '2018-08-01', 1, 'diego', '/image/documento2.docx');
INSERT INTO DOCUMENT VALUES('DOCUMENTO3', '2018-08-01', 1, 'diego', '/image/documento3.docx');
INSERT INTO DOCUMENT VALUES('DOCUMENTO4', '2018-08-01', 1, 'diego', '/image/documento4.docx');
INSERT INTO DOCUMENT VALUES('DOCUMENTO5', '2018-08-01', 1, 'diego', '/image/documento5.docx');

ENGINE = InnoDB;
