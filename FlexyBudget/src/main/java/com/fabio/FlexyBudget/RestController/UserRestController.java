package com.fabio.FlexyBudget.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.fabio.FlexyBudget.Service.UserService;



@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class UserRestController {

		
		@Autowired
		private UserService userService;
		
//---------------------------- CREATE --------------------------------------------//
//---------------------------- FIN CREATE ----------------------------------------//
		
//---------------------------- READ ----------------------------------------------//
//---------------------------- FIN READ ------------------------------------------//
		
//---------------------------- UPDATE --------------------------------------------//
//---------------------------- FIN UPDATE ----------------------------------------//
		
//---------------------------- DELETE --------------------------------------------//
//---------------------------- FIN DELETE ----------------------------------------//
		
}
