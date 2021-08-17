package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Data //Insere Getters e Setters automaticamente
@Builder //Padrão de projetos para construção de objetos
@AllArgsConstructor //Insere construtores com argumentos
@NoArgsConstructor //Insere construtores sem argumentos
public class PersonDTO {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String lastName;

    @NotEmpty
    @CPF
    private String cpf;

    private LocalDate birthDate;

    @Valid //Validação atraves da anotações da classe PhoneDTO
    @NotEmpty
    private List<PhoneDTO> phones;
}
