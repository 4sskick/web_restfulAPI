package id.niteroomcreation.web_restfull.api.model

import java.util.*
import javax.persistence.Column
import javax.persistence.Id

/**
{
"code": "number",
"status": "string",
"data": {object}
}
 */
data class ProductResponse(
//        val code: Number,
//        val status: String,

        val id: String,
        val name: String,

        val price: Long,

        val quantity: Int,

        val createdAt: Date,

        val updatedAt: Date?
)