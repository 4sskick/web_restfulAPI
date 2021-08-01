package id.niteroomcreation.web_restfull.api.controller

import id.niteroomcreation.web_restfull.api.model.CreateProductRequest
import id.niteroomcreation.web_restfull.api.model.ProductResponse
import id.niteroomcreation.web_restfull.api.model.WebResponse
import id.niteroomcreation.web_restfull.api.service.ProductService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController //@Controller and @ResponseBody in single statement
class ProductController(val productService: ProductService) {

      @PostMapping(
              value = ["/api/products"],
              produces = ["application/json"],
              consumes = ["application/json"]
      )
      fun createProduct(@RequestBody body: CreateProductRequest): WebResponse<ProductResponse> {
            val productResponse = productService.create(body)

            return WebResponse(
                    code = 200,
                    status = "OK",
                    data = productResponse
            )
      }
}