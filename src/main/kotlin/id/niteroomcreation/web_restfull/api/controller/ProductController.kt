package id.niteroomcreation.web_restfull.api.controller

import id.niteroomcreation.web_restfull.api.model.CreateProductRequest
import id.niteroomcreation.web_restfull.api.model.ProductResponse
import id.niteroomcreation.web_restfull.api.model.UpdateProductRequest
import id.niteroomcreation.web_restfull.api.model.WebResponse
import id.niteroomcreation.web_restfull.api.service.ProductService
import org.springframework.web.bind.annotation.*

@RestController //@Controller and @ResponseBody in single statement
class ProductController(val productService: ProductService) {

      @PostMapping(
              value = ["/api/product"],
              produces = ["application/json"], //format respond
              consumes = ["application/json"] //format request
      )
      fun createProduct(@RequestBody body: CreateProductRequest): WebResponse<ProductResponse> {
            val productResponse = productService.create(body)

            return WebResponse(
                    code = 200,
                    status = "OK",
                    data = productResponse
            )
      }

      @GetMapping(
              value = ["/api/product/{id_product}"]
      )
      fun getProduct(@PathVariable("id_product") id: String): WebResponse<ProductResponse> {
            val productResponse = productService.get(id)
            return WebResponse(code = 200,
                    status = "OK",
                    data = productResponse
            )
      }

      @PutMapping(
              value = ["/api/product/{id_product}"],
              consumes = ["application/json"],
              produces = ["application/json"]
      )
      fun updateProduct(@PathVariable("id_product") id: String,
                        @RequestBody updateProductRequest: UpdateProductRequest): WebResponse<ProductResponse> {

            val productResponse = productService.update(id, updateProductRequest)
            return WebResponse(
                    code = 200,
                    status = "OK",
                    data = productResponse
            )
      }
}