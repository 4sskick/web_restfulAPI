package id.niteroomcreation.web_restfull.api.model

data class WebResponse<T>(val code: Int, val status: String, val data: T)