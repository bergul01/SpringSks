package SKS.SKS.mapper;

import SKS.SKS.dto.ShipDto;
import SKS.SKS.entities.Ship;

public class ShipMapper {
	
	public static ShipDto mapToShipDto(Ship ship) {
		
		return new ShipDto(
				ship.getId(),
				ship.getShipName(),
				ship.getExporter(),
				ship.getDeparturePort(),
				ship.getDestinationPort()
				);
	}
	
	public static Ship mapToShip(ShipDto shipDto) {
		
		return new Ship(
				shipDto.getId(),
				shipDto.getShipName(),
				shipDto.getExporter(),
				shipDto.getDeparturePort(),
				shipDto.getDestinationPort()
				);
	}
	
}
