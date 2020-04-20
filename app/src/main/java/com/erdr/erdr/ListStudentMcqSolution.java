package com.erdr.erdr;

import com.google.firebase.firestore.DocumentSnapshot;

public class ListStudentMcqSolution {

    DocumentSnapshot document;

    public ListStudentMcqSolution(DocumentSnapshot document) {
        this.document = document;
    }

    public DocumentSnapshot getDocument() {
        return document;
    }

    public void setDocument(DocumentSnapshot document) {
        this.document = document;
    }
}