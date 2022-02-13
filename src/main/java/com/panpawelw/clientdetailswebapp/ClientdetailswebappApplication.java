package com.panpawelw.clientdetailswebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientdetailswebappApplication {

  public static void main(String[] args) {
    SpringApplication.run(ClientdetailswebappApplication.class, args);
    System.out.println("*****************************************************************");
    System.out.println("* Clientdetails Web Application has launched. Please head on to *");
    System.out.println("*  http://localhost:8081/clientdetailswebapp/ in your browser!  *");
    System.out.println("*****************************************************************");
  }

}
