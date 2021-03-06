package id.niteroomcreation.web_restfull.api.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity //telling to the application that this class is an representation of DB table
@Table(name = "products") //with name . . .
data class Product(

        @Id
        val id: String,

        @Column(name = "name")
        var name: String,

        @Column(name = "price")
        var price: Long,

        @Column(name = "quantity")
        var quantity: Int,

        @Column(name = "created_at")
        var createdAt: Date,

        //`?` this field is nullable
        @Column(name = "updated_at")
        var updatedAt: Date?

)