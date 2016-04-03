package sample.plugin

import grails.transaction.Transactional

@Transactional
class TestService {

    def helloWorld(String message){

        println "Hello world ${message}"
    }
}
