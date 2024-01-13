package es.upm.dit.apsv.transportationorderserver;

import es.upm.dit.apsv.transportationorderserver.repository.TransportationOrderRepository;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.PutMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

public class TransportationOrderServerApplication {

        public static final Logger log = LoggerFactory.getLogger(TransportationOrderServerApplication.class);

        private TransportationOrderRepository torderRepository;

        public static void main(String[] args) {

                SpringApplication.run(TransportationOrderServerApplication.class, args);

        }

}