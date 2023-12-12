package ma.xproce.inventoryservice.web;

import ma.xproce.inventoryservice.dtos.PersonDto;
import ma.xproce.inventoryservice.service.PersonManagerDependence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PersonGraphQlController {

    @Autowired
    private PersonManagerDependence personManagerDependence;
    // getPersonById(id: Float) : PersonDto

    @QueryMapping
    public PersonDto getPersonById(@Argument Long id) {
        return personManagerDependence.getPersonById(id);
    }

    // savePerson(personDto: PersonDtoInput ):PersonDto
    @MutationMapping
    public PersonDto savePerson(PersonDto personDto) {
        return personManagerDependence.savePerson(personDto);
    }
}