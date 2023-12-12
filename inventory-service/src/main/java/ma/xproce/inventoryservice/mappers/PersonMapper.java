package ma.xproce.inventoryservice.mappers;

import ma.xproce.inventoryservice.dao.entities.Person;
import ma.xproce.inventoryservice.dtos.PersonDto;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class PersonMapper {

    private ModelMapper modelMapper = new ModelMapper();

    public PersonDto fromPersonToPersonDto(Person person) {
        return this.modelMapper.map(person, PersonDto.class);
    }

    public Person fromPersonDtoToPerson(PersonDto personDto) {
        return this.modelMapper.map(personDto, Person.class);
    }
}
