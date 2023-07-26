package com.example.crud.domain.product;

import jakarta.persistence.*;
import lombok.*;

//é uma entidade JPA e que corresponde a uma tabela chamada "product", no banco de dados.
// O @Table especifica o nome da tabela e o @Entity define o nome da entidade.
@Table(name = "product")
@Entity(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Product {

    //Define a estratégia de geração de valor para a chave primária.
    // Neste caso, está configurado para usar uma estratégia de identidade,
    // o que significa que o valor do "id" será gerado automaticamente pelo banco de dados.
     @Id @GeneratedValue(strategy = GenerationType.UUID)
     private String id;


     private String name;
     private Integer price_in_cents;
     private boolean active;

     public  Product(ResquestProduct requestProduct){
         this.name = requestProduct.name();
         this.price_in_cents = requestProduct.price_in_cents();
         this.active = true;
     }

}
