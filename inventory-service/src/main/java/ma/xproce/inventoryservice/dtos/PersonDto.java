package ma.xproce.inventoryservice.dtos;


import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PersonDto {

    private String email;
    private String name;

}
