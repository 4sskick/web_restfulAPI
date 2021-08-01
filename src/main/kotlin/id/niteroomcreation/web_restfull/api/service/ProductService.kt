package id.niteroomcreation.web_restfull.api.service

import id.niteroomcreation.web_restfull.api.model.CreateProductRequest
import id.niteroomcreation.web_restfull.api.model.ProductResponse

interface ProductService {

      fun create(createProductRequest: CreateProductRequest):ProductResponse
}