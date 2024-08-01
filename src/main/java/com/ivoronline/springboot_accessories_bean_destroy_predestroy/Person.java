package com.ivoronline.springboot_accessories_bean_destroy_predestroy;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Person {

  //PROPERTIES
  public String name;
  
  //CONSTRUCTOR
  Person() {
    System.out.println("Person Created");
  }
  
  //DESTROY
  @PreDestroy
  public void destroy() {
    System.out.println("Person Destroyed");
  }

}
