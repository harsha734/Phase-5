//package com.sim.DeployOnCloud.controller;
package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class controller {

  @RequestMapping("/")
  public String index() {
    return "index.html";
  }
}