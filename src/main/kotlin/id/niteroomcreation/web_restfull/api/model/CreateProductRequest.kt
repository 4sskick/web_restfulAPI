package id.niteroomcreation.web_restfull.api.model

/**
{
"id": "string, unique",
"name": "string",
"price": "long",
"quantity": "integer"
}
 */
data class CreateProductRequest(

        val id: String,

        val name: String,

        val price: Long,

        val quantity: Int

)