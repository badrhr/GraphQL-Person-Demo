package ma.xproce.inventoryservice.service;

import ma.xproce.inventoryservice.dtos.PersonDto;

public interface PersonManagerDependence {
    public PersonDto getPersonById(Long id);
    public PersonDto savePerson(PersonDto personDto);
}
