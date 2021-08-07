package id.niteroomcreation.web_restfull.api.service

import id.niteroomcreation.web_restfull.api.model.CreateProductRequest
import id.niteroomcreation.web_restfull.api.model.ProductResponse
import id.niteroomcreation.web_restfull.api.model.UpdateProductRequest

interface ProductService {

      fun create(createProductRequest: CreateProductRequest): ProductResponse

      fun get(id: String): ProductResponse

      fun update(id: String, updateProductRequest: UpdateProductRequest): ProductResponse
}