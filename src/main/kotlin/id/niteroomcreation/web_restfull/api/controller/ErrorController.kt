package id.niteroomcreation.web_restfull.api.controller

import id.niteroomcreation.web_restfull.api.model.WebResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.validation.ConstraintViolationException

@RestControllerAdvice
class ErrorController {

      @ExceptionHandler(value = [ConstraintViolationException::class])
      fun validationHandler(constraintViolationException: ConstraintViolationException):WebResponse<String>{
            return WebResponse(
                    code = 400,
                    status = "BAD REQUEST",
                    data = constraintViolationException.message!!
            )
      }
}