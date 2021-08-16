package one.digitalinnovation.personapi.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinnovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity //Indica que ela é uma entidade
@Data //Insere Getters e Setters automaticamente
@Builder //Padrão de projetos para construção de objetos
@AllArgsConstructor //Insere construtores com argumentos
@NoArgsConstructor //Insere construtores sem argumentos
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private PhoneType type;

    @Column(nullable = false)
    private String number;
}
