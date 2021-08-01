package id.niteroomcreation.web_restfull.api.validation

import org.springframework.stereotype.Component
import javax.validation.ConstraintViolationException
import javax.validation.Validator

@Component
class ValidationUtil(val validator: Validator) {

      fun validate(any: Any) {
            val result = validator.validate(any)

            //if result.size is 0 then it `valid`
            //else result.size is not 0 then `not valid` there would be 1 or more not valid
            if (result.size != 0) {
                  throw ConstraintViolationException(result)//this need to handle, to prevent response code 500 on backend
            }
      }
}