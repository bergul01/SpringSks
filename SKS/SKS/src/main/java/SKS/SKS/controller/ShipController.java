package SKS.SKS.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SKS.SKS.service.ShipService;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/ship")
public class ShipController {

	private ShipService shipService;
	
	
	
}
