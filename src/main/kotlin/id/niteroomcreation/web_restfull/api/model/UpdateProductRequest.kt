package id.niteroomcreation.web_restfull.api.model

import javax.validation.constraints.Min
import javax.validation.constraints.NotBlank

data class UpdateProductRequest(

        @field:NotBlank
        val name: String?,

        @field:NotBlank
        @field:Min(1)
        val price: Long?,

        @field:NotBlank
        @field:Min(0)
        val quantity: Int?
) {
}