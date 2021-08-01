package id.niteroomcreation.web_restfull.api.service.impl

import id.niteroomcreation.web_restfull.api.entity.Product
import id.niteroomcreation.web_restfull.api.model.CreateProductRequest
import id.niteroomcreation.web_restfull.api.model.ProductResponse
import id.niteroomcreation.web_restfull.api.repository.ProductRepository
import id.niteroomcreation.web_restfull.api.service.ProductService
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductServiceImpl(val productRepository: ProductRepository) : ProductService {

      override fun create(createProductRequest: CreateProductRequest): ProductResponse {
            val product = Product(
                    id = createProductRequest.id,
                    name = createProductRequest.name,
                    price = createProductRequest.price,
                    quantity = createProductRequest.quantity,
                    createdAt = Date(),
                    updatedAt = null
            )

            productRepository.save(product)

            return ProductResponse(
                    id = product.id,
                    name = product.name,
                    price = product.price,
                    quantity = product.quantity,
                    createdAt = product.createdAt,
                    updatedAt = product.updatedAt
            )
      }
}