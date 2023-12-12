package ma.xproce.inventoryservice.service;

import ma.xproce.inventoryservice.dao.entities.Person;
import ma.xproce.inventoryservice.dao.repositories.PersonRepository;
import ma.xproce.inventoryservice.dtos.PersonDto;
import ma.xproce.inventoryservice.mappers.PersonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonManager implements PersonManagerDependence {


    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PersonMapper personMapper;

    @Override
    public PersonDto getPersonById(Long id) {
        return personMapper.fromPersonToPersonDto(personRepository.findById(id).get());
    }

    @Override
    public PersonDto savePerson(PersonDto personDto) {
        return personMapper.fromPersonToPersonDto(personRepository.save(personMapper.fromPersonDtoToPerson(personDto)));

    }


}
