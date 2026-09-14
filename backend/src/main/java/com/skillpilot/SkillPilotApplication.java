package com.skillpilot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication( exclude = {DataSourceAutoConfiguration.class})
public class SkillPilotApplication {

  public static void main(String[] args) {
    SpringApplication.run(SkillPilotApplication.class, args);
  }

}