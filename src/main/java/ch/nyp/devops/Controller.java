package ch.nyp.devops;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class Controller {

  @GetMapping
  public ResponseEntity<String> hello() {
    String hello = "HelloWorld";
    return new ResponseEntity<String>(hello, HttpStatus.OK);
  }
}
