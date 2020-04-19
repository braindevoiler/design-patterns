package com.braindevoiler.designpattern.behavioral.chainofresponsibility;

public class ChainOfResponsibilityTest {
    /*
     * With the Chain of Responsibility Pattern, you create a chain of objects that examine a request. Each object in
     * turn examines the request and handles it, or passes it on to the next object in the chain.
     *
     * Use the Chain of Responsibility Pattern when you want to give more than one object a chance to handle a request.
     *
     * Each object in the chain acts as a handler and has a successor object. If it can handle the request, it does;
     * otherwise, it forwards the request to its successor.
     *
     * It allows you to add or remove responsibilities dynamically by changing the members or order of the chain.
     *
     * Example: Spam filter rules in mailing application.
     *
     */
    public static void main(String[] args) {

    }
}
