package tech.clovy.clovyapp.api.auth.dto.request

import jakarta.validation.constraints.NotBlank

data class AuthenticateRequestDto(
    @field:NotBlank
    val credential: String,
    @field:NotBlank
    val password: String
)
