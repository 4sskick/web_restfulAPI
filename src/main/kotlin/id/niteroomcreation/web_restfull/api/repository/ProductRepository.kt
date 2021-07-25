package id.niteroomcreation.web_restfull.api.repository

import id.niteroomcreation.web_restfull.api.entity.Product
import org.springframework.data.jpa.repository.JpaRepository

interface ProductRepository : JpaRepository<Product, String> {
}