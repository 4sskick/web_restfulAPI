package id.niteroomcreation.web_restfull.api.model

import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

/**
{
"id": "string, unique",
"name": "string",
"price": "long",
"quantity": "integer"
}
 */
data class CreateProductRequest(

        //`?` set the field to nullable
        @field:NotBlank //only for String
        val id: String?,

        @field:NotBlank
        val name: String?,

        @field:NotNull
        @field:Min(value = 1)
        val price: Long?,

        @field:NotNull
        @field:Min(value = 0)
        val quantity: Int?

)